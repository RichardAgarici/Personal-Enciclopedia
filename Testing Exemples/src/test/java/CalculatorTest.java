import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("This prints before each test");
        calculator = new Calculator();
    }
    @AfterEach
    public void afterEachTest(){
        System.out.println("This prints after each test");
    }
    @BeforeAll
    public static void logTimeForTests(){
        System.out.println("Started tests at: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
    @AfterAll
    public static void logTimeWhenTestsEnded(){
        System.out.println("ended tests at " +LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @Test
    @DisplayName("This is an unit tests")
    public void addTest() {
        //given
        double firstNumber = 12;
        double secondNumber = 10;
        Double expectedResult = 22d;
        Double unexpectedResult = 918d;
        //when
        Double actualResult = calculator.add(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void substractTest() {  // Happy flow :) totul merge ok. -~
        //given
        Calculator calculator = new Calculator();
        double firstNumber = 13;
        double secondNumber = 10;
        Double expectedResult = 3d;
        Double unexpectedResult = 5d;
        //when
        Double actualResult = calculator.subtract(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);

    }

    @Test
    public void substractwithnegativeBTest() {
        //given
        Calculator calculator = new Calculator();
        double firstNumber = 10;
        double secondNumber = -10;
        Double expectedResult = null;
        Double unexpectedResult = 20d;
        //when
        Double actualResult = calculator.subtract(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNull(actualResult);
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        //given
        double firstNumber = 10;
        double secontNumber = 45;
        Double expectedResult = 450d;
        Double unexpectedResult = 0d;
        //when
        Double actualResult = calculator.multiply(firstNumber, secontNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNotNull(actualResult);
    }

    @Test
    public void divideTest() {
        //given
        Calculator calculator = new Calculator();
        double firstNumber = 45;
        double secondNumber = 0;
        Double expectedResult = null;
        Double unexpectedResult = 2d;

        //when
        Double actualResult = calculator.divide(firstNumber, secondNumber);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertNull(actualResult);
    }

    @Test
    public void reverseSingTest() {
        //given
        Calculator calculator = new Calculator();
        int number = 2;
        Integer expectedResult = -2;
        Integer unexpectedResult = 2;
        //when
        Integer actualResult = calculator.reverseSing(number);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
    }
}