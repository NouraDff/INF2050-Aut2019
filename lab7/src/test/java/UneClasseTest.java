import com.company.UneClasse;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UnClasseTest {

    @Test
    void testGetFileFromPath(){
        String trueValue = UneClasse.getFileNameFromPath("C:\\Users\\gg691013\\Desktop\\lab4\\allo.txt");
        assertEquals("allo.txt", trueValue);
    }

    @Test
    void testGetExtension(){
        String trueValue = UneClasse.getExtensionFromPath("C:\\Users\\gg691013\\Desktop\\lab4\\allo.txt");
        assertEquals("txt", trueValue);
    }

    @Test
    void testDateToString() throws ParseException{
        String trueValue =  UneClasse.getDateToString("2019-11-18");
        assertEquals("18 novembre 2019", trueValue);
    }

    @Test
    void testGetRandomNumber(){
        int value =  UneClasse.getRandomNumberMinMax(0,10);
        assert(value <= 10 && value >= 0);
    }

    @Test
    void testCesarChiffre(){
        String value =  UneClasse.cipher("Allo", 13);
        assertEquals("Nyyb", value);
    }

    @Test
    void testDecipher(){
        String value = UneClasse.deCipher("gbgb", 13);
        assertEquals("toto", value);
    }

    @Test
    void testGetAge() throws ParseException{
        int  value = UneClasse.getAge("1995-06-28", "2019-11-18");
        assertEquals(24, value);
    }


}