package com.epam.chef.main;

import com.epam.chef.entity.Salad;
import com.epam.chef.exception.FilterException;
import com.epam.chef.exception.InaccessibleFileException;
import com.epam.chef.exception.EmptySaladException;
import com.epam.chef.exception.IngredientParseException;
import com.epam.chef.filter.IngredientFilter;
import com.epam.chef.filter.impl.IngredientFilterImpl;
import com.epam.chef.parser.IngredientToRecipePositionParser;
import com.epam.chef.parser.RecipePositionToIngredientParser;
import com.epam.chef.printer.TextPrinter;
import com.epam.chef.reader.TextReader;
import com.epam.chef.validation.RecipePositionValidator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static final Logger log = LogManager.getLogger(Runner.class);

    public static void main(String[] args) throws EmptySaladException {
        TextReader textReader = new TextReader();
        List<String> recipePositions = new ArrayList<>();
        try {
            recipePositions = textReader.readAllLines("data/caesar_salad.txt");
        } catch (InaccessibleFileException e) {
            log.error(e.getMessage());
        }

        RecipePositionValidator validator = new RecipePositionValidator();
        recipePositions.removeIf(position -> !validator.isCorrect(position));
        if(recipePositions.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");}

        RecipePositionToIngredientParser ingredientParser = new RecipePositionToIngredientParser();
        Salad salad = new Salad();
        recipePositions.forEach(recipePosition -> {
            try {
                salad.addIngredient(ingredientParser.parse(recipePosition));
            } catch (IngredientParseException e) {
                log.error(e.getMessage());
            }
        });

        IngredientFilter ingredientFilter = new IngredientFilterImpl();
        try {
            ingredientFilter.filterByCalorieAmountRange(salad, 0, 200);
        } catch (FilterException e) {
            log.error(e.getMessage());
        }

        TextPrinter textPrinter = new TextPrinter();
        IngredientToRecipePositionParser ingredientToRecipePositionParser = new IngredientToRecipePositionParser();
        salad.getIngredients().forEach(ingredient -> {
            try {
                textPrinter.writeString("data/filtered_caesar_salad.txt", ingredientToRecipePositionParser.parse(ingredient) + "\n");
            } catch (InaccessibleFileException | IngredientParseException e) {
                log.error(e.getMessage());
            }
        });
    }
}
