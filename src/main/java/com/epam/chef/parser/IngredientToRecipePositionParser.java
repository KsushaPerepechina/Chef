package com.epam.chef.parser;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.exception.IngredientParseException;

public class IngredientToRecipePositionParser {
    public String parse(Ingredient ingredient) throws IngredientParseException {
        if (ingredient == null) {
            throw new IngredientParseException("Ingredient doesn't exist.");
        }
        return ingredient.getName() + ": "
                + ingredient.getWeight() + "g|"
                + ingredient.getCalorieAmount() + " kcal|"
                + ingredient.getProteinAmount() + "g prot|"
                + ingredient.getFatAmount() + "g fat|"
                + ingredient.getCarbsAmount() + "g carbs";
    }
}
