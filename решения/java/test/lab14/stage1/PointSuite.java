package lab14.stage1;

import Lab14.stage1.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author AKryukov
 * 05.06.2018
 */
public class PointSuite {
    @Test
    public void distanceBetweenIntsTest() {
        Assert.assertEquals(3.6056, Point.distanceBetween(1, 1, 3, 4), 0.001);
        Assert.assertEquals(17.2046, Point.distanceBetween(-2, 4, 8, -10), 0.001);
        Assert.assertEquals(8.6023, Point.distanceBetween(0, 0, -5, -7), 0.001);
        Assert.assertEquals(0, Point.distanceBetween(0, 0, 0, 0), 0.001);
        Assert.assertEquals(12.3693, Point.distanceBetween(-1, -3, 2, 9), 0.001);
    }

    @Test
    public void distanceBetweenPointsTest(){
        Point src, dest;
        src = new Point();
        dest = new Point();

        src.x = 1;
        src.y = 1;
        dest.x = 3;
        dest.y = 4;
        Assert.assertEquals(3.6056, Point.distanceBetween(src, dest), 0.001);

        src.x = -2;
        src.y = 4;
        dest.x = 8;
        dest.y = -10;
        Assert.assertEquals(17.2046, Point.distanceBetween(src, dest), 0.001);

        src = Point.zero();
        dest = Point.make(-5, -7);
        Assert.assertEquals(8.6023, Point.distanceBetween(src, dest), 0.001);

        src = Point.zero();
        dest = Point.zero();
        Assert.assertEquals(0, Point.distanceBetween(src, dest), 0.001);

        src = new Point(-1, -3);
        dest = new Point(2, 9);
        Assert.assertEquals(12.3693, Point.distanceBetween(src, dest), 0.001);
    }

    @Test
    public void distanceToIntsTest(){
        Point a = new Point();

        a.x = 1;
        a.y = 1;
        Assert.assertEquals(3.6056, a.distanceTo(3, 4), 0.001);

        a.x = -2;
        a.y = 4;
        Assert.assertEquals(17.2046, a.distanceTo(8, -10), 0.001);

        a.x = 0;
        a.y = 0;
        Assert.assertEquals(8.6023, a.distanceTo(-5, -7), 0.001);

        a.x = 0;
        a.y = 0;
        Assert.assertEquals(0, a.distanceTo(0, 0), 0.001);

        a.x = -1;
        a.y = -3;
        Assert.assertEquals(12.3693, a.distanceTo(2, 9), 0.001);
    }

    @Test
    public void distanceToPointTest(){
        Point a, b;
        a = new Point();
        b = new Point();

        a.x = 1;
        a.y = 1;
        b.x = 3;
        b.y = 4;
        Assert.assertEquals(3.6056, a.distanceTo(b), 0.001);

        a.x = -2;
        a.y = 4;
        b.x = 8;
        b.y = -10;
        Assert.assertEquals(17.2046, a.distanceTo(b), 0.001);

        a.x = 0;
        a.y = 0;
        b.x = -5;
        b.y = -7;
        Assert.assertEquals(8.6023, a.distanceTo(b), 0.001);

        a.x = 0;
        a.y = 0;
        b.x = 0;
        b.y = 0;
        Assert.assertEquals(0, a.distanceTo(b), 0.001);

        a.x = -1;
        a.y = -3;
        b.x = 2;
        b.y = 9;
        Assert.assertEquals(12.3693, a.distanceTo(b), 0.001);
    }
}
