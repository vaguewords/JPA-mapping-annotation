package com.jpa.mapping.annotation.model;
import com.jpa.mapping.annotation.model.entity.Drink;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.jpa.mapping.annotation.manager.EntityManagerGenerator;
import com.jpa.mapping.annotation.model.entity.DrinkType;

public class EntityManagerCRUD {

    private EntityManager manager;

    public Drink findDrinkBydrinkCode(int drinkCode) {
        manager = EntityManagerGenerator.getManagerInstance();
        return manager.find(Drink.class, drinkCode);
    }

    public EntityManager getManagerInstance() {
        return manager;
    }

    public Long saveAndReturnAllCount(String drinkName, int drinkPrice, DrinkType drinkType, int drinkSugar, int drinkFat, int drinkCalorie) {
        manager = EntityManagerGenerator.getManagerInstance();

        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();
        manager.persist(new Drink(drinkName, drinkPrice, drinkType, drinkSugar, drinkFat, drinkCalorie));
        manager.flush();
        //transaction.commit();

        return getCount(manager);

    }

    private Long getCount(EntityManager manager) {
        return manager.createQuery("SELECT COUNT(*) FROM Drink", Long.class).getSingleResult();
    }

    public Drink modifyDrinkName(int drinkCode, String drinkName) {
        Drink drink = findDrinkBydrinkCode(drinkCode);

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        drink.setDrinkName(drinkName);
        manager.flush();

        return drink;
    }

    public Long removeAndReturnAllCount(int drinkCode) {
        Drink drink = findDrinkBydrinkCode(drinkCode);

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        manager.remove(drink);
        manager.flush();

        return getCount(manager);
    }

}