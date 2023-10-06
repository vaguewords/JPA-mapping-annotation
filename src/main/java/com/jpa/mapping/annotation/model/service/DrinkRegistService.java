package com.jpa.mapping.annotation.model.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DrinkRegistService {

    private DrinkRepository drinkRepository;

    @Autowired
    private DrinkRegistService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    protected DrinkRegistService() {}


    @Transactional
    public void registDrink(DrinkRegistDTO drinkRegistDTO) {
        Drink drink = new Drink(
                drinkRegistDTO.getDrinkCode(),
                drinkRegistDTO.getDrinkCode(),
                drinkRegistDTO.getDrinkName(),
                drinkRegistDTO.getDrinkPrice(),
                drinkRegistDTO.getDrinkType(),
                drinkRegistDTO.getDrinkSugar(),
                drinkRegistDTO.getDrinkFat(),
                drinkRegistDTO.getDrinkCalorie()
        );
        drinkRepository.save(drink);
    }

}
