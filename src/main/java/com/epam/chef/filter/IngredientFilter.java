package com.epam.chef.filter;

import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;
import com.epam.chef.exception.FilterException;

public interface IngredientFilter {
    void filterByWeightRange(Salad salad, int minWeight, int maxWeight) throws EmptySaladException, FilterException;
    void filterByCalorieAmountRange(Salad salad, int minCalorieContent, int maxCalorieContent) throws EmptySaladException, FilterException;
    void filterByProteinAmountRange(Salad salad, double minProteinContent, double maxProteinContent) throws EmptySaladException, FilterException;
    void filterByFatAmountRange(Salad salad, double minFatContent, double maxFatContent) throws EmptySaladException, FilterException;
    void filterByCarbsAmountRange(Salad salad, double minCarbsContent, double maxCarbsContent) throws EmptySaladException, FilterException;
}
