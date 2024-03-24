package com.gallegos.bcnc.domain;

import com.gallegos.bcnc.domain.model.Price;
import com.gallegos.bcnc.domain.service.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    ProductServiceImpl productService;

    @Test
    void test1(){
        // Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
        // Given

        // When
        Price price = productService.getProductByConditions(LocalDateTime.parse("2020-06-14T10:00:00.000"), 35455, 1);

        // Then
        Assertions.assertNotNull(price, "Price should be not null.");
        Assertions.assertEquals(1, price.getPriceList(), "The value of price list should be 1.");

    }

    @Test
    void test2(){
        //Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
        // Given

        // When
        Price price = productService.getProductByConditions(LocalDateTime.parse("2020-06-14T16:00:00.000"), 35455, 1);

        // Then
        Assertions.assertNotNull(price, "Price should be not null.");
        Assertions.assertEquals(2, price.getPriceList(), "The value of price list should be 2.");

    }
    @Test
    void test3(){
        // Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
        // Given

        // When
        Price price = productService.getProductByConditions(LocalDateTime.parse("2020-06-14T21:00:00.000"), 35455, 1);

        // Then
        Assertions.assertNotNull(price, "Price should be not null.");
        Assertions.assertEquals(1, price.getPriceList(), "The value of price list should be 2.");

    }
    @Test
    void test4(){
        // Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
        // Given

        // When
        Price price = productService.getProductByConditions(LocalDateTime.parse("2020-06-15T10:00:00.000"), 35455, 1);

        // Then
        Assertions.assertNotNull(price, "Price should be not null.");
        Assertions.assertEquals(3, price.getPriceList(), "The value of price list should be 3.");

    }

    @Test
    void test5(){
        // Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
        // Given

        // When
        Price price = productService.getProductByConditions(LocalDateTime.parse("2020-06-16T21:00:00.000"), 35455, 1);

        // Then
        Assertions.assertNotNull(price, "Price should be not null.");
        Assertions.assertEquals(4, price.getPriceList(), "The value of price list should be 4.");

    }
}
