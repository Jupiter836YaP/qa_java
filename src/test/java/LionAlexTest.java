import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    private Feline felineMock;

    @Test
    public void getFriendsNameTest() throws Exception {
        LionAlex lionAlex = new LionAlex(felineMock);
        HashMap<String, String> expectedResult = new HashMap<>();
        expectedResult.put("Марти", "зебра");
        expectedResult.put("Глория", "бегемотиха");
        expectedResult.put("Мелман", "жираф");
        HashMap<String, String> actualResult = lionAlex.getFriends();
        assertEquals("Друзья у Алекса ожидаются другие", expectedResult, actualResult);
    }

    @Test
    public void getFriendsCountEqual3() throws Exception {
        LionAlex lionAlex = new LionAlex(felineMock);
        int expectedResult = 3;
        int actualResult = lionAlex.getFriends().size();
        assertEquals(" Алекса должно быть всего 3 друга", expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex lionAlex = new LionAlex(felineMock);
        String expectedResult = "Нью-Йоркский зоопарк";
        String actualResult = lionAlex.getPlaceOfLiving();
        assertEquals("Алекс живет в другом месте", expectedResult, actualResult);
    }

    @Test
    public void getKittensTest() throws Exception {
        LionAlex lionAlex = new LionAlex(felineMock);
        int expectedResult = 0;
        int actualResult = lionAlex.getKittens();
        assertEquals("У Алекса не должно быть котят", expectedResult, actualResult);
    }

    @Test
    public void doesHaveMane_lionMale_resultTrue() throws Exception {
        LionAlex lionAlex = new LionAlex(felineMock);
        boolean expectedResult = true;
        boolean actualResult = lionAlex.doesHaveMane();
        assertEquals("У Алекса должна быть грива", expectedResult, actualResult);
    }

    @Test
    public void getAlexFoodTest() throws Exception {
        LionAlex lionAlex = new LionAlex(felineMock);
        List<String> predatorExpectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(predatorExpectedFood);
        List<String> actualResult = lionAlex.getFood();
        assertEquals("Результат не совпадает с ожидаемым", predatorExpectedFood, actualResult);
    }


}
