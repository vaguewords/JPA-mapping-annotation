package com.jpa.mapping.annotation.model.entity;

import javax.persistence.Column;

public class DrinkRegistDTO {

    private int drinkCode;

    private String drinkName;

    private int drinkPrice;

    private DrinkType drinkType;

    private int drinkSugar;

    private int drinkFat;

    private int drinkCalorie;

    public DrinkRegistDTO(String drinkName, int drinkPrice, DrinkType drinkType, int drinkSugar, int drinkFat, int drinkCalorie) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkType = drinkType;
        this.drinkSugar = drinkSugar;
        this.drinkFat = drinkFat;
        this.drinkCalorie = drinkCalorie;
    }

    public int getDrinkCode() {
        return drinkCode;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public DrinkType getDrinkType() {
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
                "drinkCode=" + drinkCode +
                ", drinkName='" + drinkName + '\'' +
                ", drinkPrice=" + drinkPrice +
                ", drinkType=" + drinkType +
                ", drinkSugar=" + drinkSugar +
                ", drinkFat=" + drinkFat +
                ", drinkCalorie=" + drinkCalorie +
                '}';
    }
}
