package TestClass;
import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class int_min_test {

    @Test
    public void intMinTest(){
        //given
        int max = 10;
        int min = 2;
        //when
        int result = Main.intMin(max,min);
        //then
        Assertions.assertEquals(min,result);
    }
}
