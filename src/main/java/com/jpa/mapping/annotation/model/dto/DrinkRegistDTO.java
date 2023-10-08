package com.jpa.mapping.annotation.model.dto;

public class DrinkRegistDTO {


    private String drinkName;

    private int drinkPrice;

    private String drinkType;

    private int drinkSugar;

    private int drinkFat;

    private int drinkCalorie;

    public DrinkRegistDTO(String drinkName, int drinkPrice, String drinkType, int drinkSugar, int drinkFat, int drinkCalorie) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkType = drinkType;
        this.drinkSugar = drinkSugar;
        this.drinkFat = drinkFat;
        this.drinkCalorie = drinkCalorie;
    }


    public String getDrinkName() {
        return drinkName;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public int getDrinkSugar() {
        return drinkSugar;
    }

    public int getDrinkFat() {
        return drinkFat;
    }

    public int getDrinkCalorie() {
        return drinkCalorie;
    }

    @Override
    public String toString() {
        return "DrinkRegistDTO{" +
                ", drinkName='" + drinkName + '\'' +
                ", drinkPrice=" + drinkPrice +
                ", drinkType=" + drinkType +
                ", drinkSugar=" + drinkSugar +
                ", drinkFat=" + drinkFat +
                ", drinkCalorie=" + drinkCalorie +
                '}';
    }
}
