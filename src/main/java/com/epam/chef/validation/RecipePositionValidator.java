package com.epam.chef.validation;

public class RecipePositionValidator {
    private static final String CORRECT_RECIPE_POSITION_REGEX = "[a-zA-Z ]+: \\d+g\\|\\d+ kcal\\|\\d+.?\\d*g prot\\|\\d+.?\\d*g fat\\|\\d+.?\\d*g carbs";

    public boolean isCorrect(String inputString) {
        return inputString.matches(CORRECT_RECIPE_POSITION_REGEX);
    }
}
