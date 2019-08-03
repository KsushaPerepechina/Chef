package com.epam.chef.validation;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecipePositionValidatorTest {
    private RecipePositionValidator recipePositionValidator;
    private String position;

    @BeforeClass
    public void setUp() {
        recipePositionValidator = new RecipePositionValidator();
        position = "chia seeds: 100g|486 kcal|17g prot|31g fat|42g carbs";
    }

    @Test
    public void correctPositionTest() {
        Assert.assertTrue(recipePositionValidator.isCorrect(position));
    }

    @Test
    public void incorrectPositionTest() {
        Assert.assertFalse(recipePositionValidator.isCorrect(position + "|0.016g sodium"));
    }
}
