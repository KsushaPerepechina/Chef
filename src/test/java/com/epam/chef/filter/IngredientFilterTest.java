package com.epam.chef.filter;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;
import com.epam.chef.exception.FilterException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IngredientFilterTest {
    private IngredientFilter ingredientFilter;
    private Ingredient chicken;
    private Ingredient pineapple;
    private Salad tropicalChickenSalad;
    private Salad tropicalChickenSaladWithoutChicken;

    @BeforeClass
    public void setUp() {
        ingredientFilter = new IngredientFilter();
        chicken = new Ingredient("roasted chicken", 250, 525, 65, 30, 0);
        pineapple = new Ingredient("pineapple", 100, 49, 0.4, 0.2, 10.6);
        tropicalChickenSalad = new Salad();
        tropicalChickenSaladWithoutChicken = new Salad();
        tropicalChickenSalad.addIngredient(pineapple);
        tropicalChickenSaladWithoutChicken.addIngredient(pineapple);
    }

    @BeforeMethod
    public void saladIngredientSetUp() {
        tropicalChickenSalad.addIngredient(chicken);
    }

//    @Test
//    public void filterByCalorieAmountRangeTest() throws EmptySaladException, FilterException {
//        ingredientFilter.filterByCalorieAmountRange(tropicalChickenSalad, 0, 50);
//        Assert.assertEquals(tropicalChickenSalad, tropicalChickenSaladWithoutChicken);
//    }

}