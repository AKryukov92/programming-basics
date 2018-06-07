package lab14.stage2;

import Lab14.stage2.Point;
import Lab14.stage2.Range;
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
        Point a, b;
        a = new Point();
        b = new Point();

        a.setCoordinates(1, 1);
        b.setCoordinates(3, 4);
        Assert.assertEquals(3.6056, Point.distanceBetween(a, b), 0.001);

        a.setCoordinates(-2, 4);
        b.setCoordinates(8, -10);
        Assert.assertEquals(17.2046, Point.distanceBetween(a, b), 0.001);

        a.setCoordinates(0, 0);
        b.setCoordinates(-5, -7);
        Assert.assertEquals(8.6023, Point.distanceBetween(a, b), 0.001);

        a.setCoordinates(0, 0);
        b.setCoordinates(0, 0);
        Assert.assertEquals(0, Point.distanceBetween(a, b), 0.001);

        a.setCoordinates(-1, -3);
        b.setCoordinates(2, 9);
        Assert.assertEquals(12.3693, Point.distanceBetween(a, b), 0.001);
    }

    @Test
    public void distanceToIntsTest(){
        Point a = new Point();

        a.setCoordinates(1, 1);
        Assert.assertEquals(3.6056, a.distanceTo(3, 4), 0.001);

        a.setCoordinates(-2, 4);
        Assert.assertEquals(17.2046, a.distanceTo(8, -10), 0.001);

        a.setCoordinates(0, 0);
        Assert.assertEquals(8.6023, a.distanceTo(-5, -7), 0.001);

        a.setCoordinates(0, 0);
        Assert.assertEquals(0, a.distanceTo(0, 0), 0.001);

        a.setCoordinates(-1, -3);
        Assert.assertEquals(12.3693, a.distanceTo(2, 9), 0.001);
    }

    @Test
    public void distanceToPointTest(){
        Point a, b;
        a = new Point();
        b = new Point();

        a.setCoordinates(1, 1);
        b.setCoordinates(3, 4);
        Assert.assertEquals(3.6056, a.distanceTo(b), 0.001);

        a.setCoordinates(-2, 4);
        b.setCoordinates(8, -10);
        Assert.assertEquals(17.2046, a.distanceTo(b), 0.001);

        a.setCoordinates(0, 0);
        b.setCoordinates(-5, -7);
        Assert.assertEquals(8.6023, a.distanceTo(b), 0.001);

        a.setCoordinates(0, 0);
        b.setCoordinates(0, 0);
        Assert.assertEquals(0, a.distanceTo(b), 0.001);

        a.setCoordinates(-1, -3);
        b.setCoordinates(2, 9);
        Assert.assertEquals(12.3693, a.distanceTo(b), 0.001);
    }

    @Test
    public void pointEqualsItself(){
        Point p = new Point();
        Assert.assertTrue(p.equals(p));
    }

    @Test
    public void pointInstanceComparison() {
        Point a1 = new Point(), a2 = new Point();
        Point b1 = new Point(), b2 = new Point(), b3 = new Point();
        Point[] b = {b1, b2, b3};
        a1.setCoordinates(10, 15);
        a2.setCoordinates(10, 15);
        b1.setCoordinates(10, 3);
        b2.setCoordinates(1, 15);
        b3.setCoordinates(0, 0);
        Assert.assertTrue(a1.equals(a2));
        Assert.assertTrue(a2.equals(a1));
        for (Point bx : b){
            Assert.assertFalse(bx.equals(a1));
            Assert.assertFalse(a1.equals(bx));
            Assert.assertFalse(bx.equals(a2));
            Assert.assertFalse(a2.equals(bx));
        }
    }

    @Test
    public void pointNotEqualNull(){
        Point p = new Point();
        Assert.assertFalse(p.equals(null));
    }

    @Test
    public void pointNotEqualOther(){
        Point p = new Point();
        Range r = new Range();
        Assert.assertFalse(r.equals(p));
        Assert.assertFalse(p.equals(r));
    }
}
