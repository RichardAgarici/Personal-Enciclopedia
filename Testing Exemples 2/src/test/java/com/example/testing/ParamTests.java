package com.example.testing;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class ParamTests {
    private Calculator calculator;


    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }
@ParameterizedTest
@ValueSource(strings = {"a","b","c"})
    void verifyNotNull(String word){
Assertions.assertNotNull(word);
    }
    @ParameterizedTest
    @MethodSource("provideNumbers")
    void isOddTest(int input, boolean expected){
        boolean result = calculator.isOdd(input);
        Assertions.assertEquals(expected,result);
    }

//    @TestFactory
//   void verifyDinamicTest(){
//        int[][] data=data();
//    Arrays.stream(data).map(element->{
//        int arg1=element[0];
//        int arg2=element[1];
//        int result=element[2];
//
//    }
//    }
    private static Stream<Arguments> provideNumbers(){
        return Stream.of(Arguments.of(5,true),
                Arguments.of(4,false),
                Arguments.of(Math.random(), false)); // trebuie sa fie definit concret parametrizarea.
    }

    private static int[][]data(){               //
return new int[][]{{1,2,2},{5,3,15},{4,4,16}};
    }
}
