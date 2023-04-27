package com.example.testing;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTest {

    @Test
    @Order(1)
    void firstOne(){
        System.out.println("First one");
    }
    @Test
    @Order(2)
    void secondOne(){
        System.out.println("Second one");
    }
    @Test
    @Order(3)
    void thirdOne(){
        System.out.println("Third one");
    }

}
