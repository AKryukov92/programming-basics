import org.junit.Assert;
import org.junit.Test;

/**
 * @author akryukov
 * 29.05.2018
 */
public class Lab02Suite {

    @Test
    public void task6497test(){
        double[] expected = {4.6250, 3.6250, 4.6250, 3.3750, 3.3750, 0.6250, 3.3750, 3.3750};
        Assert.assertArrayEquals(expected, Lab07.task6497("9 8 9 1 1 5 1 1"), 0.0001);
    }

    @Test
    public void task9271test(){
        double[] data1 = {5, 4, 6, 2, 3, 1};
        double[] expected1 = {4, 3, 5, 1, 2, 0};
        Lab07.task9271(data1);
        Assert.assertArrayEquals(expected1, data1, 0.0001);
    }
}
