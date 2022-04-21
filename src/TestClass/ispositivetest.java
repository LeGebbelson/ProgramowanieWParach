package TestClass;
import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class isPositiveTest {

    @Test
    public void isPositiveTestTrue(){
        int num = 10;
        boolean result = Main.isPositive(num);
        Assertions.assertTrue(result);
    }

    @Test
    public void isPositiveTestFalse(){
        int num = -1;
        boolean result = Main.isPositive(num);
        Assertions.assertFalse(result);
    }
}
