package com.jpa.mapping.annotation;

import com.jpa.mapping.annotation.model.EntityManagerCRUD;
import com.jpa.mapping.annotation.model.dto.DrinkRegistDTO;
import com.jpa.mapping.annotation.model.dao.DrinkRepository;
import com.jpa.mapping.annotation.model.service.DrinkRegistService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;
import java.util.stream.Stream;

@SpringBootTest
public class AnnotationTests {

    @Autowired
    private DrinkRegistService drinkRegistService;

    @Autowired
    private DrinkRepository drinkRepository;

    private EntityManagerCRUD manager;

    @BeforeEach
    void initManager() {
        this.manager = new EntityManagerCRUD();
    }

    /*@AfterEach
    void rollback() {
        EntityTransaction transaction = manager.getManagerInstance().getTransaction();
        transaction.rollback();
    }*/

    private static Stream<Arguments> newDrink() {
        return Stream.of(
                Arguments.of(
                        "카페모카",
                        5000,
                        "COFFEE",
                        25,
                        15,
                        250
                ),
                Arguments.of(
                        "카페라떼",
                        4000,
                        "COFFEE",
                        8,
                        10,
                        170
                )
        );
    }

    @DisplayName("음료 테이블 생성")
    @ParameterizedTest
    @MethodSource("newDrink")
    void testCreateDrinkTable(String drinkName, int drinkPrice, String drinkType, int drinkCalorie, int drinkSugar, int drinkFat) {

        DrinkRegistDTO drinkRegistDTO = new DrinkRegistDTO(
                drinkName,
                drinkPrice,
                drinkType,
                drinkSugar,
                drinkFat,
                drinkCalorie
        );

        Assertions.assertDoesNotThrow(
                () -> drinkRegistService.registDrink(drinkRegistDTO)
        );

    }

    /*

    @DisplayName("음료 삭제 테스트")
    @Transactional
    @ParameterizedTest
    @ValueSource(ints = {1})
    void testRemoveDrink(int drinkCode) {
        //when
        Long count = manager.removeAndReturnAllCount(drinkCode);

        //then
        Assertions.assertEquals(0, count);
    }*/

}