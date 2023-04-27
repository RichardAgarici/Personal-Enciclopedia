import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstJunitClass {  // "!>" suita de test. ( merg toate deodata )

    @Test
    public void myFirstJUnitTest() {
        System.out.println("this is a test");
    }

    // trebuie neaparat sa fie public + void
    // cuvantul la metoda sa fie mereu " Test " la final
    // testele unitare nu primesc nici un parametru () .
    // @ - adnotare

    @Test
    public void myFirstAssertEqualsTest() {
        int expected = 64;
        int firstNumber = 32;
        int secondNumber = 3;

        Assertions.assertEquals(expected, firstNumber * secondNumber); // metoda de verificare a unei expresii
        //API - Metoda. ( Application programming interface )
    }

    @Test
    public void myFirstAssertNotEqualsTest() {
        int expected = 64;
        int firstNumber = 32;
        int secondNumber = 3;

        Assertions.assertNotEquals(expected, firstNumber * secondNumber); // metoda de verificare a unei expresii
    } // Corner Case ( un caz rar )

    @Test
    public void myFristAssertTrueFalseTest() {
        boolean isWhite = true;
        Assertions.assertTrue(isWhite);
        Assertions.assertFalse("isWhite".equals("isBlack"));
    }
    @Test
    public void myFirstAssertNullTest(){
        String firstWord = "hello";
        String secontWord = null;

        Assertions.assertNotNull(firstWord);
        Assertions.assertNull(secontWord);
        //Assertion.assertSame() = compara primitivele intre ele.
    }
}
