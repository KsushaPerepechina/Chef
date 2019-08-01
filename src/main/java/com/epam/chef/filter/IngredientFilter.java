package com.epam.chef.filter;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;
import com.epam.chef.exception.FilterException;

import java.util.List;

public class IngredientFilter {
    public void filterByCalorieAmountRange(Salad salad, int minCalorieContent, int maxCalorieContent) throws EmptySaladException, FilterException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        if(minCalorieContent > maxCalorieContent) {
            throw new FilterException("The lower bound of the range can't exceed the upper.");
        }
        ingredients.removeIf(ingredient -> ingredient.getCalorieAmount() > maxCalorieContent ||
                ingredient.getCalorieAmount() < minCalorieContent);
    }

    public void filterByProteinAmountRange(Salad salad, int minProteinContent, int maxProteinContent) throws EmptySaladException, FilterException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        if(minProteinContent > maxProteinContent) {
            throw new FilterException("The lower bound of the range can't exceed the upper.");
        }
        ingredients.removeIf(ingredient -> ingredient.getProteinAmount() > maxProteinContent ||
                ingredient.getProteinAmount() < minProteinContent);
    }

    public void filterByFatAmountRange(Salad salad, int minFatContent, int maxFatContent) throws EmptySaladException, FilterException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        if(minFatContent > maxFatContent) {
            throw new FilterException("The lower bound of the range can't exceed the upper.");
        }
        ingredients.removeIf(ingredient -> ingredient.getFatAmount() > maxFatContent ||
                ingredient.getFatAmount() < minFatContent);
    }

    public void filterByCarbsAmountRange(Salad salad, int minCarbsContent, int maxCarbsContent) throws EmptySaladException, FilterException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        if(minCarbsContent > maxCarbsContent) {
            throw new FilterException("The lower bound of the range can't exceed the upper.");
        }
        ingredients.removeIf(ingredient -> ingredient.getCarbsAmount() > maxCarbsContent ||
                ingredient.getCarbsAmount() < minCarbsContent);
    }
}
