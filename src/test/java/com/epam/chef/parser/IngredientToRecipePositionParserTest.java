package com.epam.chef.parser;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.exception.IngredientParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IngredientToRecipePositionParserTest {
    private IngredientToRecipePositionParser ingredientToRecipePositionParser;
    private Ingredient ingredient;
    private String recipePosition;

    @BeforeClass
    public void setUp() {
        ingredientToRecipePositionParser = new IngredientToRecipePositionParser();
        ingredient = new Ingredient("chia seeds", 100, 486, 17, 31, 42);
        recipePosition = "chia seeds: 100.0g|486 kcal|17.0g prot|31.0g fat|42.0g carbs";
    }

    @Test
    public void parseTest() throws IngredientParseException {
        Assert.assertEquals(ingredientToRecipePositionParser.parse(ingredient), recipePosition);
    }

    @Test(expectedExceptions = IngredientParseException.class)
    public void parseUnmatchedPositionTest() throws IngredientParseException {
        Ingredient emptyIngredient = null;
        ingredientToRecipePositionParser.parse(emptyIngredient);
    }
}
