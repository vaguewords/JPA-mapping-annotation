package com.jpa.mapping.annotation.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryGenerator {

    private static EntityManagerFactory factory
            = Persistence.createEntityManagerFactory("ohgiraffers");

    private EntityManagerFactoryGenerator() {}

    public static EntityManagerFactory getInstance() {
        return factory;
    }

}