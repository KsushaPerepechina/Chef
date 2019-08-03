package com.epam.chef.entity;

import java.util.Objects;

public class Ingredient {
    private String name;
    private double weight;
    private int calorieAmount;
    private double proteinAmount;
    private double fatAmount;
    private double carbsAmount;

    public Ingredient() {
    }

    public Ingredient(String name, double weight, int calorieAmount,
                      double proteinAmount, double fatAmount, double carbsAmount) {
        this.name = name;
        this.weight = weight;
        this.calorieAmount = calorieAmount;
        this.proteinAmount = proteinAmount;
        this.fatAmount = fatAmount;
        this.carbsAmount = carbsAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorieAmount() {
        return calorieAmount;
    }

    public void setCalorieAmount(int calorieAmount) {
        this.calorieAmount = calorieAmount;
    }

    public double getProteinAmount() {
        return proteinAmount;
    }

    public void setProteinAmount(double proteinAmount) {
        this.proteinAmount = proteinAmount;
    }

    public double getFatAmount() {
        return fatAmount;
    }

    public void setFatAmount(double fatAmount) {
        this.fatAmount = fatAmount;
    }

    public double getCarbsAmount() {
        return carbsAmount;
    }

    public void setCarbsAmount(double carbsAmount) {
        this.carbsAmount = carbsAmount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ingredient [name=" + name
                + ", weight=" + weight
                + "g, calorie content=" + calorieAmount
                + "g, protein content=" + proteinAmount
                + "g, fat content=" + fatAmount
                + "g, carbs content=" + carbsAmount + "g]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Double.compare(that.weight, weight) == 0 &&
                calorieAmount == that.calorieAmount &&
                Double.compare(that.proteinAmount, proteinAmount) == 0 &&
                Double.compare(that.fatAmount, fatAmount) == 0 &&
                Double.compare(that.carbsAmount, carbsAmount) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, calorieAmount, proteinAmount, fatAmount, carbsAmount);
    }
}
