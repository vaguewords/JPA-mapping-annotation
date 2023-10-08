package com.jpa.mapping.annotation.model.entity;

import javax.persistence.*;

@Entity
public class Drink {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int drinkCode;
    @Column
    private String drinkName;
    @Column
    private int drinkPrice;
    @Column
    private DrinkType drinkType;
    @Column
    private int drinkSugar;
    @Column
    private int drinkFat;
    @Column
    private int drinkCalorie;

    public Drink() {}

    public Drink(String drinkName, int drinkPrice, DrinkType drinkType, int drinkSugar, int drinkFat, int drinkCalorie) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkType = drinkType;
        this.drinkSugar = drinkSugar;
        this.drinkFat = drinkFat;
        this.drinkCalorie = drinkCalorie;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public void setDrinkSugar(int drinkSugar) {
        this.drinkSugar = drinkSugar;
    }

    public void setDrinkFat(int drinkFat) {
        this.drinkFat = drinkFat;
    }

    public void setDrinkCalorie(int drinkCalorie) {
        this.drinkCalorie = drinkCalorie;
    }
}
