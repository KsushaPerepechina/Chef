package com.epam.chef.sorter;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;

import java.util.Comparator;
import java.util.List;

public class IngredientSorter {
    public void sortByCalorieAmountIncrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingInt(Ingredient::getCalorieAmount));
    }

    public void sortByCalorieAmountDecrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingInt(Ingredient::getCalorieAmount).reversed());
    }

    public void sortByProteinAmountIncrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingDouble(Ingredient::getProteinAmount));
    }

    public void sortByProteinAmountDecrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingDouble(Ingredient::getProteinAmount).reversed());
    }

    public void sortByFatAmountIncrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingDouble(Ingredient::getFatAmount));
    }

    public void sortByFatAmountDecrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingDouble(Ingredient::getFatAmount).reversed());
    }

    public void sortByCarbsAmountIncrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingDouble(Ingredient::getCarbsAmount));
    }

    public void sortByCarbsAmountDecrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingDouble(Ingredient::getCarbsAmount).reversed());
    }

    public void sortByWeightIncrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingDouble(Ingredient::getWeight));
    }

    public void sortByWeightDecrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparingDouble(Ingredient::getWeight).reversed());
    }

    public void sortByNameIncrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparing(Ingredient::getName));
    }

    public void sortByNameDecrease(Salad salad) throws EmptySaladException {
        List<Ingredient> ingredients = salad.getIngredients();
        if(ingredients == null || ingredients.isEmpty()) {
            throw new EmptySaladException("Empty ingredients list.");
        }
        ingredients.sort(Comparator.comparing(Ingredient::getName).reversed());
    }
}
