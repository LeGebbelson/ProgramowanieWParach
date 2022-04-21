package TestClass;

import com.company.Main;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class int_max_test {

    @Test
    public void intMaxTest(){
        //given
        int max = 10;
        int min = 2;
        //when
        int result = Main.intMax(max,min);
        //then
        Assertions.assertEquals(max,result);
    }
}