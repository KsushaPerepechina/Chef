package com.epam.chef.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Salad {
    private List<Ingredient> ingredients = new ArrayList<>();

    public Salad() {
    }

    public Salad(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void addAllIngredients(Ingredient... ingredients) {
        Arrays.stream(ingredients).forEach(this::addIngredient);
    }

    public void removeIngredient(Ingredient ingredient){
        ingredients.remove(ingredient);
    }

    public boolean containsIngredient(Ingredient ingredient){
        return getIngredients().contains(ingredient);
    }

    @Override
    public String toString(){
        return "Salad [ingredients=" + ingredients + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salad salad = (Salad) o;
        return Objects.equals(ingredients, salad.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients);
    }
}
