package com.epam.chef.sorter;

import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;

public interface IngredientSorter {
    void sortByNameIncrease(Salad salad) throws EmptySaladException;
    void sortByNameDecrease(Salad salad) throws EmptySaladException;
    void sortByWeightIncrease(Salad salad) throws EmptySaladException;
    void sortByWeightDecrease(Salad salad) throws EmptySaladException;
    void sortByCalorieAmountIncrease(Salad salad) throws EmptySaladException;
    void sortByCalorieAmountDecrease(Salad salad) throws EmptySaladException;
    void sortByProteinAmountIncrease(Salad salad) throws EmptySaladException;
    void sortByProteinAmountDecrease(Salad salad) throws EmptySaladException;
    void sortByFatAmountIncrease(Salad salad) throws EmptySaladException;
    void sortByFatAmountDecrease(Salad salad) throws EmptySaladException;
    void sortByCarbsAmountIncrease(Salad salad) throws EmptySaladException;
    void sortByCarbsAmountDecrease(Salad salad) throws EmptySaladException;
}
