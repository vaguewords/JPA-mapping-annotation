package com.jpa.mapping.annotation.model.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DrinkRepository {
    @PersistenceContext
    private EntityManager manager;
    public void save(Drink drink) {
        manager.persist(drink);
    }
}
