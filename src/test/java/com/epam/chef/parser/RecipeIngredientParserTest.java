package com.epam.chef.parser;

import com.epam.chef.entity.Ingredient;
import com.epam.chef.exception.IngredientParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecipeIngredientParserTest {
    private RecipeIngredientParser recipeIngredientParser;
    private String recipePosition;
    private Ingredient chiaSeeds;

    @BeforeClass
    public void setUp() {
        recipeIngredientParser = new RecipeIngredientParser();
        recipePosition = "chia seeds: 100g|486 kcal|17g prot|31g fat|42g carbs";
        chiaSeeds = new Ingredient("chia seeds", 100, 486, 17, 31, 42);
    }

    @Test
    public void parseTest() throws IngredientParseException {
        Assert.assertEquals(recipeIngredientParser.parse(recipePosition), chiaSeeds);
    }

    @Test(expectedExceptions = IngredientParseException.class)
    public void parseUnmatchedPositionTest() throws IngredientParseException {
        recipeIngredientParser.parse(recipePosition + "|0.016g sodium");
    }
}