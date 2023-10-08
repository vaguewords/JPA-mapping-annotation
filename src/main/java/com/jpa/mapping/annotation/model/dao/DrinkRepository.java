package com.jpa.mapping.annotation.model.dao;

import com.jpa.mapping.annotation.model.entity.Drink;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class DrinkRepository {
    @PersistenceContext
    private EntityManager manager;
    public void save(Drink drink) {
        manager.persist(drink);
    }

}
