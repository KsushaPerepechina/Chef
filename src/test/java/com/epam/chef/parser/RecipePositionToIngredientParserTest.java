package com.epam.chef.parser;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.exception.IngredientParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecipePositionToIngredientParserTest {
    private RecipePositionToIngredientParser recipePositionToIngredientParser;
    private String recipePosition;
    private Ingredient ingredient;

    @BeforeClass
    public void setUp() {
        recipePositionToIngredientParser = new RecipePositionToIngredientParser();
        recipePosition = "chia seeds: 100g|486 kcal|17g prot|31g fat|42g carbs";
        ingredient = new Ingredient("chia seeds", 100, 486, 17, 31, 42);
    }

    @Test
    public void parseTest() throws IngredientParseException {
        Assert.assertEquals(recipePositionToIngredientParser.parse(recipePosition), ingredient);
    }

    @Test(expectedExceptions = IngredientParseException.class)
    public void parseUnmatchedPositionTest() throws IngredientParseException {
        recipePositionToIngredientParser.parse(recipePosition + "|0.016g sodium");
    }
}