import org.junit.Assert;
import org.junit.Test;

/**
 * @author akryukov
 * 29.05.2018
 */
public class Lab02Suite {
    @Test
    public void task9020test() {
        Assert.assertEquals(23.4307, Lab02.task9020(0), 0.001);
        Assert.assertEquals(25.0998, Lab02.task9020(-9), 0.001);
        Assert.assertEquals(0, Lab02.task9020(61), 0.001);
        Assert.assertEquals(3, Lab02.task9020(60), 0.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void task9020assertion1(){
        Lab02.task9020(62);
    }
    @Test(expected = IllegalArgumentException.class)
    public void task9020assertion2(){
        Lab02.task9020(7573);
    }
    @Test(expected = IllegalArgumentException.class)
    public void task9020assertion3(){
        Lab02.task9020(75);
    }
}
