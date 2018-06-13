import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author AKryukov
 * 13.06.2018
 */
public class Lab15Suite {
    @Test
    public void task8418test() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 6);
        Assert.assertEquals(expected, Lab06.task8418(6));

        expected = Arrays.asList(1, 5, 7, 11, 35, 55, 77, 385);
        Assert.assertEquals(expected, Lab06.task8418(385));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptNegativeArg(){
        Lab06.task8418(-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptZero(){
        Lab06.task8418(0);
    }
}
