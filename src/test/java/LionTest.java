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
    private Feline felineMock;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(6);
        int expectedResult = 6;
        int actualResult = lion.getKittens();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

    @Test
    public void doesHaveMane_lionMale_resultTrue() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

    @Test
    public void doesHaveMane_lionFemale_resultFalse() throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        boolean expectedResult = false;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals("Результат не совпаает с ожидаемым", expectedResult, actualResult);
    }

    @Test
    public void checkingExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Неизвестно", new Feline()));
        System.out.println(exception.getMessage());
    }


}
