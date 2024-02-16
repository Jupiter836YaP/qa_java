import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(6);
        int expectedResult = 6;
        int actualResult = lion.getKittens();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expectedResult = false;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

}
