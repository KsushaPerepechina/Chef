package com.epam.chef.main;

import com.epam.chef.entity.Salad;
import com.epam.chef.exception.FilterException;
import com.epam.chef.exception.InaccessibleFileException;
import com.epam.chef.exception.EmptySaladException;
import com.epam.chef.exception.IngredientParseException;
import com.epam.chef.filter.IngredientFilter;
import com.epam.chef.parser.RecipeIngredientParser;
import com.epam.chef.reader.RecipeReader;
import com.epam.chef.validation.RecipePositionValidator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static final Logger log = LogManager.getLogger(Runner.class);

    public static void main(String[] args) throws EmptySaladException {
        RecipeReader recipeReader = new RecipeReader();
        List<String> recipePositions = new ArrayList<>();
        try {
            recipePositions = recipeReader.readAllLines("data/caesar_salad.txt");
        } catch (InaccessibleFileException e) {
            log.error(e.getMessage());
        }

        RecipePositionValidator validator = new RecipePositionValidator();
        recipePositions.removeIf(position -> !validator.isCorrect(position));
        if(recipePositions.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");}

        RecipeIngredientParser ingredientParser = new RecipeIngredientParser();
        Salad salad = new Salad();
        recipePositions.forEach(recipePosition -> {
            try {
                salad.addIngredient(ingredientParser.parse(recipePosition));
            } catch (IngredientParseException e) {
                log.error(e.getMessage());
            }
        });
        System.out.println(salad);

        IngredientFilter ingredientFilter = new IngredientFilter();
        try {
            ingredientFilter.filterByCalorieAmountRange(salad, 0, 200);
        } catch (FilterException e) {
            log.error(e.getMessage());
        }
        System.out.println(salad);
    }
}
