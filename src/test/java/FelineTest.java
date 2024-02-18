import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    private Feline feline;

    @Before
    public void init(){
       feline = new Feline();
    }

    @Test
    public void getFamilyTest() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals("Ожидаем семейство \"Кошачьи\"", expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutParamTest() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals("Должно вернуться другое количество", expectedResult, actualResult);
    }

    @Test
    public void getKittensWithParam() {
        int expectedResult = 6;
        int actualResult = feline.getKittens(6);
        assertEquals("Должно вернуться другое количество", expectedResult, actualResult);
    }

    @Test
    public void getEatMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("Кошачьи должны есть другие типы еды", expectedResult, actualResult);

    }

}
