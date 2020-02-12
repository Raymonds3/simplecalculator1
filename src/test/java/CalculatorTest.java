import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.concurrent.Callable;

public class CalculatorTest {
    @Test
    public void addTest() {

        Assert.assertEquals(Calculator.add(1,2),3);
        Assert.assertEquals(Calculator.add(-1,-1),-2);
        Assert.assertEquals(Calculator.add(1,2,3,4,5),15);
    }
    @Test
    public void mutilplyTest() {

        Assert.assertEquals(Calculator.mutilply(1,2,3,4,5),120);
        Assert.assertEquals(Calculator.mutilply(1,3),3);
        Assert.assertEquals(Calculator.mutilply(-1,3),15);
    }
}
