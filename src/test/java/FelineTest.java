import static org.junit.Assert.assertEquals;
import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FelineTest {

    @Test
    public void getEatMeatFelineTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = feline.getFood("Хищник");
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void familyTest() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals(family, "Кошачьи");
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();
        assertEquals(kittens, 1);
    }

    @Test
    public void countKittensTest() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens(3);
        assertEquals(kittensCount, 3);
    }

}
