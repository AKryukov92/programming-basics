import Lab15.task2033.Circle2033;
import org.junit.Assert;
import org.junit.Test;

import static common.Utils.*;
/**
 * @author akryukov
 *         14.11.2017
 */
public class Task2033PrepareSuite {
    @Test
    public void test1(){
        Circle2033 circle = new Circle2033(315, 100, 42);
        Assert.assertEquals(SCREEN_WIDTH-357, circle.maxStretchY(SCREEN_WIDTH, SCREEN_HEIGHT));
    }

    @Test
    public void test2() throws Exception {
        Circle2033 circle = new Circle2033(91, 120, 69);
        Assert.assertEquals(-69-69-1, circle.minStretchX());
        Assert.assertEquals(350-120-69, circle.maxStretchX(SCREEN_WIDTH, SCREEN_HEIGHT));
    }
}
