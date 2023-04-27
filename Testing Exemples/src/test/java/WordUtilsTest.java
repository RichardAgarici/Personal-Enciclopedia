import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordUtilsTest {

    @Test
    public void getWordInCapitalLettersTest() {
        //given
        String givenWordInput = "java";
        String expetedResult = "JAVA";
        //When
        String actualResult = WordUtils.getWordInCapitalLettersd(givenWordInput);
        //then
        assertEquals(expetedResult, actualResult);
        assertNotNull(actualResult);
    }

    //    @Test
//    public void getWordInCapitalLettersNullTest(){
//    //given
//        //when
//        String actualResult=WordUtils.{
    @Test
    public void isNullOrBlankOrEmpty() {
        //given
        String name = "Daniel";
        boolean expectedResult = false;
        boolean unexpectedResult = true;
        //when
        boolean actualResult = WordUtils.isNullOrBlankOrEmpty(name);
        //then
        assertEquals(expectedResult, actualResult);
        assertNotEquals(unexpectedResult, actualResult);
        assertFalse(actualResult);
        // la booleane folosim assertFalse/assertTrue.
    }


    public void isNullOrBlankOrEmptyWhitNullStringTest() {
        //given
        String name = null;
        boolean expectedResult = true;
        boolean unexpectedResult = false;
        //when
        boolean actualResult = WordUtils.isNullOrBlankOrEmpty(name);
        //then
        assertEquals(expectedResult, actualResult);
    }
    public void concatWithEmptyArrayTest() {
    }
    }