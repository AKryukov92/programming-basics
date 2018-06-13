package lab14.stage3;

import Lab14.stage3.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

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
    public void distanceBetweenPointsTest() {
        Point a, b;
        a = new Point(1, 1);
        b = new Point(3, 4);

        Assert.assertEquals(3.6056, Point.distanceBetween(a, b), 0.001);

        a = new Point(-2, 4);
        b = new Point(8, -10);
        Assert.assertEquals(17.2046, Point.distanceBetween(a, b), 0.001);

        a = new Point(0, 0);
        b = new Point(-5, -7);
        Assert.assertEquals(8.6023, Point.distanceBetween(a, b), 0.001);

        a = new Point(0, 0);
        b = new Point(0, 0);
        Assert.assertEquals(0, Point.distanceBetween(a, b), 0.001);

        a = new Point(-1, -3);
        b = new Point(2, 9);
        Assert.assertEquals(12.3693, Point.distanceBetween(a, b), 0.001);
    }

    @Test
    public void distanceToIntsTest() {
        Point a;

        a = new Point(1, 1);
        Assert.assertEquals(3.6056, a.distanceTo(3, 4), 0.001);

        a = new Point(-2, 4);
        Assert.assertEquals(17.2046, a.distanceTo(8, -10), 0.001);

        a = new Point(0, 0);
        Assert.assertEquals(8.6023, a.distanceTo(-5, -7), 0.001);

        a = new Point(0, 0);
        Assert.assertEquals(0, a.distanceTo(0, 0), 0.001);

        a = new Point(-1, -3);
        Assert.assertEquals(12.3693, a.distanceTo(2, 9), 0.001);
    }

    @Test
    public void distanceToPointTest() {
        Point a, b;

        a = new Point(1, 1);
        b = new Point(3, 4);
        Assert.assertEquals(3.6056, a.distanceTo(b), 0.001);

        a = new Point(-2, 4);
        b = new Point(8, -10);
        Assert.assertEquals(17.2046, a.distanceTo(b), 0.001);

        a = new Point(0, 0);
        b = new Point(-5, -7);
        Assert.assertEquals(8.6023, a.distanceTo(b), 0.001);

        a = new Point(0, 0);
        b = new Point(0, 0);
        Assert.assertEquals(0, a.distanceTo(b), 0.001);

        a = new Point(-1, -3);
        b = new Point(2, 9);
        Assert.assertEquals(12.3693, a.distanceTo(b), 0.001);
    }

    @Test
    public void pointEqualsItself() {
        Point p = new Point(0, 0);
        Assert.assertTrue(p.equals(p));
    }

    @Test
    public void pointInstanceComparison() {
        Point a1, a2, b1, b2, b3;
        a1 = new Point(10, 15);
        a2 = new Point(10, 15);
        b1 = new Point(10, 3);
        b2 = new Point(1, 15);
        b3 = new Point(0, 0);
        Point[] b = {b1, b2, b3};
        Assert.assertTrue(a1.equals(a2));
        Assert.assertTrue(a2.equals(a1));
        for (Point bx : b) {
            Assert.assertFalse(bx.equals(a1));
            Assert.assertFalse(a1.equals(bx));
            Assert.assertFalse(bx.equals(a2));
            Assert.assertFalse(a2.equals(bx));
        }
    }

    @Test
    public void pointNotEqualNull() {
        Point p = new Point(0, 0);
        Assert.assertFalse(p.equals(null));
    }

    @Test
    public void pointNotEqualOther() {
        Point p = new Point(0, 0);
        Assert.assertFalse(p.equals("not a point"));
    }

    @Test
    public void pointToString() {
        Point p = new Point(1234, 5678);
        Assert.assertEquals("(1234;5678)", p.toString());
        System.out.println(p);
    }

    @Test
    public void samePointsHaveSameHashcode() {
        Point l = new Point(0, 0);
        Point r = new Point(0, 0);
        Assert.assertEquals(l.hashCode(), r.hashCode());
        Assert.assertTrue(l.equals(r));
        Assert.assertTrue(r.equals(l));
    }

    @Test
    public void differentPointsHaveDifferentHashcode() {
        Point l = new Point(0, 0);
        Point r = new Point(5, 5);
        Assert.assertNotEquals(l.hashCode(), r.hashCode());
        Assert.assertFalse(l.equals(r));
        Assert.assertFalse(r.equals(l));
    }

    @Test
    public void hashSetContainsOnlyOneOfSamePoints() {
        Point l = new Point(0, 0);
        Point r = new Point(0, 0);
        HashSet<Point> pts = new HashSet<>();
        pts.add(l);
        pts.add(r);
        Assert.assertEquals(1, pts.size());
        Assert.assertTrue(pts.contains(l));
        Assert.assertTrue(pts.contains(r));
    }

    @Test
    public void hashSetContainsAllDifferentPoints() {
        Point l = new Point(0, 0);
        Point r = new Point(5, 5);
        HashSet<Point> pts = new HashSet<>();
        pts.add(l);
        pts.add(r);
        Assert.assertEquals(2, pts.size());
        Assert.assertTrue(pts.contains(l));
        Assert.assertTrue(pts.contains(r));
    }

    @Test
    public void differentPointsMightHaveSameHashcode() {
        Point l = new Point(0, 1);
        Point r = new Point(31, 0);
        Assert.assertEquals(l.hashCode(), r.hashCode());
        Assert.assertFalse(l.equals(r));
        Assert.assertFalse(r.equals(l));
    }

    @Test
    public void hashSetContainsAllDifferentPointsWithSameHashcode() {
        Point l = new Point(0, 1);
        Point r = new Point(31, 0);
        HashSet<Point> pts = new HashSet<>();
        pts.add(l);
        pts.add(r);
        Assert.assertEquals(2, pts.size());
        Assert.assertTrue(pts.contains(l));
        Assert.assertTrue(pts.contains(r));
    }
}
