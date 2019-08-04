package com.epam.chef.action;

import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;

public interface SaladAction {
    int countCalorieAmount(Salad salad) throws EmptySaladException;
    double countProteinAmount(Salad salad) throws EmptySaladException;
    double countFatAmount(Salad salad) throws EmptySaladException;
    double countCarbsAmount(Salad salad) throws EmptySaladException;
    double countWeight(Salad salad) throws EmptySaladException;
}
