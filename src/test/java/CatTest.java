import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    @Test
    public void getSoundTest () {
        Cat cat = new Cat(new Feline());
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals("Коты должны говорить \"Мяу\"", expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> predatorExpectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(predatorExpectedFood);
        List<String> actualResult = cat.getFood();
        assertEquals("Коты должны есть другие типы еды", predatorExpectedFood, actualResult);
    }
}
