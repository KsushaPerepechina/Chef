package com.epam.chef.action;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.entity.Salad;
import com.epam.chef.exception.EmptySaladException;
import com.sun.tools.javac.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SaladActionTest {
    private SaladAction saladAction;
    private Ingredient chicken;
    private Ingredient pineapple;
    private Salad tropicalChichenSalad;

    @BeforeClass
    public void setUp() {
        saladAction = new SaladAction();
        chicken = new Ingredient("roasted chicken", 250, 525, 65, 30, 0);
        pineapple = new Ingredient("pineapple", 100, 49, 0.4, 0.2, 10.6);
        tropicalChichenSalad = new Salad(List.of(chicken, pineapple));
    }

    @Test
    public void countWeightTest() throws EmptySaladException {
        Assert.assertEquals(saladAction.countWeight(tropicalChichenSalad), 250.0 + 100);
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void countWeightOfEmptySaladTest() throws EmptySaladException {
        saladAction.countWeight(new Salad());
    }

    @Test
    public void countCalorieAmountTest() throws EmptySaladException {
        Assert.assertEquals(saladAction.countCalorieAmount(tropicalChichenSalad), 525 + 49);
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void countCalorieAmountOfEmptySaladTest() throws EmptySaladException {
        saladAction.countCalorieAmount(new Salad());
    }

    @Test
    public void countProteinAmountTest() throws EmptySaladException {
        Assert.assertEquals(saladAction.countProteinAmount(tropicalChichenSalad), 65 + 0.4);
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void countProteinAmountOfEmptySaladTest() throws EmptySaladException {
        saladAction.countCalorieAmount(new Salad());
    }

    @Test
    public void countFatAmountTest() throws EmptySaladException {
        Assert.assertEquals(saladAction.countFatAmount(tropicalChichenSalad), 30 + 0.2);
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void countFatAmountOfEmptySaladTest() throws EmptySaladException {
        saladAction.countFatAmount(new Salad());
    }

    @Test
    public void countCarbsAmountTest() throws EmptySaladException {
        Assert.assertEquals(saladAction.countCarbsAmount(tropicalChichenSalad), 0 + 10.6);
    }

    @Test(expectedExceptions = EmptySaladException.class)
    public void countCarbsAmountOfEmptySaladTest() throws EmptySaladException {
        saladAction.countCarbsAmount(new Salad());
    }
}