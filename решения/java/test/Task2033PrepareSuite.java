import Lab14.task1953.Circle;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author akryukov
 *         14.11.2017
 */
public class Task2033PrepareSuite {
    private static int SCREEN_WIDTH = 500;
    private static int SCREEN_HEIGHT = 350;
    @Test
    public void test1(){
        Lab14.class2033 circle = new Lab14.class2033(315, 100, 42);
        Assert.assertEquals(SCREEN_WIDTH-357, circle.maxStretchY(SCREEN_WIDTH, SCREEN_HEIGHT));
    }

    @Test
    public void test2() throws Exception {
        Lab14.class2033 circle = new Lab14.class2033(91, 120, 69);
        Assert.assertEquals(-69-69-1, circle.minStretchX());
        Assert.assertEquals(350-120-69, circle.maxStretchX(SCREEN_WIDTH, SCREEN_HEIGHT));
    }
}
