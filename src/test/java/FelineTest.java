import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
//    @Spy
//    private Feline feline;
    Feline feline = new Feline();

    @Test
    public void getFamilyTest() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutParamTest() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);

//        feline.getKittens();
//        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensWithParam() {
        int expectedResult = 6;
        int actualResult = feline.getKittens(6);
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

    @Test
    public void getEatMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);

    }

}
