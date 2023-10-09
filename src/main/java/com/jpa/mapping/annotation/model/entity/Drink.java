package com.jpa.mapping.annotation.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "DRINK")
public class Drink {
    @Id
    @Column(name = "DRINK_CODE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int drinkCode;
    @Column(name = "DRINK_NAME", columnDefinition = "VARCHAR(50)")
    private String drinkName;
    @Column(name = "DRINK_PRICE")
    private int drinkPrice;
    @Column(name = "DRINK_TYPE")
    @Enumerated(EnumType.STRING)
    private DrinkType drinkType;
    @Column(name = "DRINK_SUGAR")
    private int drinkSugar;
    @Column(name = "DRINK_FAT")
    private int drinkFat;
    @Column(name = "DRINK_CALORIE")
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
