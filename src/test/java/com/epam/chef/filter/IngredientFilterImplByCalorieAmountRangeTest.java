package com.epam.chef.filter;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;
import com.epam.chef.exception.FilterException;
import com.epam.chef.filter.impl.IngredientFilterImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class IngredientFilterImplByCalorieAmountRangeTest {
    private IngredientFilter ingredientFilter;
    private Ingredient chicken;
    private Ingredient pineapple;
    private Salad tropicalChickenSalad;

    @BeforeClass
    public void setUp() {
        ingredientFilter = new IngredientFilterImpl();
        chicken = new Ingredient("roasted chicken", 250, 525, 65, 30, 0);
        pineapple = new Ingredient("pineapple", 100, 49, 0.4, 0.2, 10.6);
        tropicalChickenSalad = new Salad();
        tropicalChickenSalad.addAllIngredients(chicken, pineapple);
    }

    @Test
    public void filterByCalorieAmountRangeTest() throws EmptySaladException, FilterException {
        List<Ingredient> ingredientsWithoutChicken = tropicalChickenSalad.getIngredients();
        ingredientsWithoutChicken.remove(chicken);
        ingredientFilter.filterByCalorieAmountRange(tropicalChickenSalad, 0, 50);
        Assert.assertEquals(tropicalChickenSalad.getIngredients(), ingredientsWithoutChicken);
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void filterEmptyIngredientListByCalorieAmountRangeTest() throws EmptySaladException, FilterException {
        ingredientFilter.filterByCalorieAmountRange(new Salad(), 0, 50);
    }

    @Test(expectedExceptions = FilterException.class)
    public void filterByCalorieAmountRangeWithIncorrectBoundsTest() throws EmptySaladException, FilterException {
        ingredientFilter.filterByCalorieAmountRange(tropicalChickenSalad, 50, 0);
    }
}
