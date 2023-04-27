package com.example.testing;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    public Calculator calculator;

    @BeforeAll
    static void init() {

        System.out.println("First log Init");
    }

    @AfterAll
    static void finish() {
        System.out.println("last log init");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();

    }

    @AfterEach
    void endEach(){
        System.out.println("test method end");
    }
    @Test
    @DisplayName("Test multiply")
//    @RepeatedTest(5)
    void testMultiply() {
        Assertions.assertEquals(20, calculator.multiply(4, 5));
        System.out.println(" Test Multiply");
    }

    @Test
    void testDivide (){
//        calculator.divide(10,0);
        System.out.println(" Test Divide");
        Assertions.assertThrows(ArithmeticException.class, ()->calculator.divide(10,0));

    }




}


