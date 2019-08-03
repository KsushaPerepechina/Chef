package com.epam.chef.filter;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;
import com.epam.chef.exception.FilterException;

import java.util.List;

public class IngredientFilter {
    public void filterByWeightRange(Salad salad, int minWeight, int maxWeight) throws EmptySaladException, FilterException {
        List<Ingredient> ingredients = salad.getIngredients();
        filterArgumentsValidator(ingredients, minWeight, maxWeight);
        ingredients.removeIf(ingredient -> ingredient.getWeight() > maxWeight ||
                ingredient.getWeight() < minWeight);
    }

    public void filterByCalorieAmountRange(Salad salad, int minCalorieContent, int maxCalorieContent) throws EmptySaladException, FilterException {
        List<Ingredient> ingredients = salad.getIngredients();
        filterArgumentsValidator(ingredients, minCalorieContent, maxCalorieContent);
        ingredients.removeIf(ingredient -> ingredient.getCalorieAmount() > maxCalorieContent ||
                ingredient.getCalorieAmount() < minCalorieContent);
    }

    public void filterByProteinAmountRange(Salad salad, double minProteinContent, double maxProteinContent) throws EmptySaladException, FilterException {
        List<Ingredient> ingredients = salad.getIngredients();
        filterArgumentsValidator(ingredients, minProteinContent, maxProteinContent);
        ingredients.removeIf(ingredient -> ingredient.getProteinAmount() > maxProteinContent ||
                ingredient.getProteinAmount() < minProteinContent);
    }

    public void filterByFatAmountRange(Salad salad, double minFatContent, double maxFatContent) throws EmptySaladException, FilterException {
        List<Ingredient> ingredients = salad.getIngredients();
        filterArgumentsValidator(ingredients, minFatContent, maxFatContent);
        ingredients.removeIf(ingredient -> ingredient.getFatAmount() > maxFatContent ||
                ingredient.getFatAmount() < minFatContent);
    }

    public void filterByCarbsAmountRange(Salad salad, double minCarbsContent, double maxCarbsContent) throws EmptySaladException, FilterException {
        List<Ingredient> ingredients = salad.getIngredients();
        filterArgumentsValidator(ingredients, minCarbsContent, maxCarbsContent);
        ingredients.removeIf(ingredient -> ingredient.getCarbsAmount() > maxCarbsContent ||
                ingredient.getCarbsAmount() < minCarbsContent);
    }

    private void filterArgumentsValidator(List<Ingredient> ingredients, double lowerBound, double upperBound) throws EmptySaladException, FilterException {
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        if(lowerBound > upperBound) {
            throw new FilterException("The lower bound of the range can't exceed the upper.");
        }
    }
}
