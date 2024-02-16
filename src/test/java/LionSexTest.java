import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionSexTest {
    private final String sex;
    private final boolean hasExpectedMane;
    Feline feline;

    public LionSexTest(String sex, boolean hasExpectedMane) {
        this.sex = sex;
        this.hasExpectedMane = hasExpectedMane;
    }

    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Результат не совпаает с ожидаемым", hasExpectedMane, actualResult);
    }
}
