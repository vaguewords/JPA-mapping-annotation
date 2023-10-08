package com.jpa.mapping.annotation;

import com.jpa.mapping.annotation.model.entity.Drink;
import com.jpa.mapping.annotation.model.entity.DrinkRegistDTO;
import com.jpa.mapping.annotation.model.entity.DrinkType;
import com.jpa.mapping.annotation.model.service.DrinkRegistService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class AnnotationTests {

    @Autowired
    private DrinkRegistService drinkRegistService;

    private static Stream<Arguments> createMember() {
        return Stream.of(
                Arguments.of(1,
                        "카페모카",
                        5000,
                        "COFFEE",
                        25,
                        15,
                        250
                ),
                Arguments.of(2,
                        "카페라떼",
                        4000,
                        "COFFEE",
                        8,
                        10,
                        170
                )
        );
    }

    @DisplayName("테이블 만들기 테스트")
    @ParameterizedTest
    @MethodSource("createMember")
    void testCreateTable(String drinkName, int drinkPrice, DrinkType drinkType, int drinkSugar, int drinkFat, int drinkCalorie) {

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



}