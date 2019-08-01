package com.epam.chef.action;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;

import java.util.List;

public class SaladAction {
    public int countCalorieAmount(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        return ingredients.stream()
                .mapToInt(Ingredient::getCalorieAmount)
                .sum();
    }

    public double countProteinAmount(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        return ingredients.stream()
                .mapToDouble(Ingredient::getProteinAmount)
                .sum();
    }

    public double countFatAmount(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        return ingredients.stream()
                .mapToDouble(Ingredient::getFatAmount)
                .sum();
    }

    public double countCarbsAmount(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        return ingredients.stream()
                .mapToDouble(Ingredient::getCarbsAmount)
                .sum();
    }

    public double countWeight(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        return ingredients.stream()
                .mapToDouble(Ingredient::getWeight)
                .sum();
    }
}
