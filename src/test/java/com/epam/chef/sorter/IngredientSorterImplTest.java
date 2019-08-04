package com.epam.chef.sorter;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;

import com.epam.chef.sorter.impl.IngredientSorterImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IngredientSorterImplTest {
    private IngredientSorter ingredientSorter;
    private Salad salad;
    private Ingredient roastedChicken;
    private Ingredient pineapple;
    private Ingredient cashew;

    @BeforeClass
    public void setUp(){
        ingredientSorter = new IngredientSorterImpl();
        salad = new Salad();
        roastedChicken = new Ingredient("roasted chicken", 250, 525, 65, 30,0);
        pineapple = new Ingredient("pineapple", 100, 49, 0.4, 0.2, 10.6);
        cashew = new Ingredient("cashew", 50, 277, 18, 44, 30);
        salad.addAllIngredients(roastedChicken, pineapple, cashew);
    }

    @Test
    public void sortByNameIncreaseTest() throws EmptySaladException {
        ingredientSorter.sortByNameIncrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(cashew, pineapple, roastedChicken);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByNameDecreaseTest() throws EmptySaladException {
        ingredientSorter.sortByNameDecrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(roastedChicken, pineapple, cashew);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByWeightIncreaseTest() throws EmptySaladException {
        ingredientSorter.sortByWeightIncrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(cashew, pineapple, roastedChicken);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByWeightDecreaseTest() throws EmptySaladException {
        ingredientSorter.sortByWeightDecrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(roastedChicken, pineapple, cashew);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByCalorieAmountIncreaseTest() throws EmptySaladException {
        ingredientSorter.sortByCalorieAmountIncrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(pineapple, cashew, roastedChicken);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByCalorieAmountDecreaseTest() throws EmptySaladException {
        ingredientSorter.sortByCalorieAmountDecrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(roastedChicken, cashew, pineapple);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByProteinAmountIncreaseTest() throws EmptySaladException {
        ingredientSorter.sortByProteinAmountIncrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(pineapple, cashew, roastedChicken);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByProteinAmountDecreaseTest() throws EmptySaladException {
        ingredientSorter.sortByProteinAmountDecrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(roastedChicken, cashew, pineapple);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByFatAmountIncreaseTest() throws EmptySaladException {
        ingredientSorter.sortByFatAmountIncrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(pineapple, roastedChicken, cashew);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByFatAmountDecreaseTest() throws EmptySaladException {
        ingredientSorter.sortByFatAmountDecrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(cashew, roastedChicken, pineapple);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByCarbsAmountIncreaseTest() throws EmptySaladException {
        ingredientSorter.sortByCarbsAmountIncrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(roastedChicken, pineapple, cashew);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test
    public void sortByCarbsAmountDecreaseTest() throws EmptySaladException {
        ingredientSorter.sortByCarbsAmountDecrease(salad);
        Salad sortedSalad = new Salad();
        sortedSalad.addAllIngredients(cashew, pineapple, roastedChicken);
        Assert.assertEquals(salad, sortedSalad);
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByWeightIncreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByWeightIncrease(new Salad());
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByWeightDecreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByWeightDecrease(new Salad());
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByCalorieAmountIncreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByCalorieAmountIncrease(new Salad());
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByCalorieAmountDecreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByCalorieAmountDecrease(new Salad());
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByProteinAmountIncreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByProteinAmountIncrease(new Salad());
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByProteinAmountDecreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByProteinAmountDecrease(new Salad());
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByFatAmountIncreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByFatAmountIncrease(new Salad());
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByFatAmountDecreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByFatAmountDecrease(new Salad());
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByCarbsAmountIncreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByCarbsAmountIncrease(new Salad());
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void sortByCarbsAmountDecreaseEmptySaladTest() throws EmptySaladException {
        ingredientSorter.sortByCarbsAmountDecrease(new Salad());
    }
}
