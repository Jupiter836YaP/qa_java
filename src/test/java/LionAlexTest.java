import com.example.Feline;
import com.example.LionAlex;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class LionAlexTest {
    Feline feline;
    LionAlex lionAlex;
    @Before
    public void init() throws Exception {
        feline = new Feline();
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void getFriendsTest(){
        HashMap<String, String> expectedResult = new HashMap<>();
        expectedResult.put("Марти", "зебра");
        expectedResult.put("Глория", "бегемотиха");
        expectedResult.put("Мелман", "жираф");
        HashMap<String, String> actualResult = lionAlex.getFriends();
        assertEquals("Друзья у Алекса ожидаются другие", expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingTest(){
        String expectedResult = "Нью-Йоркский зоопарк";
        String actualResult = lionAlex.getPlaceOfLiving();
        assertEquals("Алекс живет в другом месте", expectedResult, actualResult);
    }

    @Test
    public void getKittensTest() {
        int expectedResult = 0;
        int actualResult = lionAlex.getKittens();
        assertEquals("У Алекса не должно быть котят", expectedResult, actualResult);
    }
}
