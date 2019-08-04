package com.epam.chef.parser;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.exception.IngredientParseException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecipePositionToIngredientParser {
    private static final String RECIPE_POSITION_REGEX = "([a-zA-Z ]+): (\\d+)g\\|(\\d+) kcal\\|(\\d+.?\\d*)g prot\\|(\\d+.?\\d*)g fat\\|(\\d+.?\\d*)g carbs";

    public Ingredient parse(String recipePosition) throws IngredientParseException {
        Pattern pattern = Pattern.compile(RECIPE_POSITION_REGEX);
        Matcher matcher = pattern.matcher(recipePosition);
        if (!matcher.matches()) {
            throw new IngredientParseException("Recipe position doesn't match the required pattern.");
        }
        return new Ingredient(matcher.group(1), Double.parseDouble(matcher.group(2)),
                    Integer.parseInt(matcher.group(3)), Double.parseDouble(matcher.group(4)),
                    Double.parseDouble(matcher.group(5)), Double.parseDouble(matcher.group(6)));
    }
}
