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
    public void samePointsWithSameHashcode() {
        Point a = new Point(0, 0, "green");
        Point b = new Point(0, 0, "green");
        Point c = new Point(0, 0, "red");
        Assert.assertEquals(a.hashCode(), b.hashCode());
        Assert.assertTrue(a.equals(b));
        Assert.assertTrue(b.equals(a));
        Assert.assertEquals(a.hashCode(), c.hashCode());
        Assert.assertTrue(a.equals(c));
        Assert.assertTrue(c.equals(a));
        Assert.assertEquals(b.hashCode(), c.hashCode());
        Assert.assertTrue(b.equals(c));
        Assert.assertTrue(c.equals(b));
    }

    @Test
    public void hashSetContainsOnlyOneOfSamePoints() {
        Point red = new Point(0, 0, "red");
        Point red2 = new Point(0, 0, "red");
        Point green = new Point(0, 0, "green");
        HashSet<Point> pts = new HashSet<>();
        pts.add(red);
        pts.add(red2);
        pts.add(green);
        Assert.assertEquals(1, pts.size());
        Assert.assertTrue(pts.contains(red));
        Assert.assertTrue(pts.contains(red2));
        Assert.assertTrue(pts.contains(green));
    }

    @Test
    public void differentPointsWithDifferentHashcode() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Point c = new Point(5, 0);
        Point d = new Point(5, 5);
        Assert.assertNotEquals(a.hashCode(), b.hashCode());
        Assert.assertFalse(a.equals(b));
        Assert.assertFalse(a.equals(b));
        Assert.assertNotEquals(a.hashCode(), c.hashCode());
        Assert.assertFalse(a.equals(c));
        Assert.assertFalse(a.equals(c));
        Assert.assertNotEquals(a.hashCode(), d.hashCode());
        Assert.assertFalse(a.equals(d));
        Assert.assertFalse(a.equals(d));

        Assert.assertNotEquals(b.hashCode(), c.hashCode());
        Assert.assertFalse(b.equals(c));
        Assert.assertFalse(b.equals(c));
        Assert.assertNotEquals(b.hashCode(), d.hashCode());
        Assert.assertFalse(b.equals(d));
        Assert.assertFalse(b.equals(d));

        Assert.assertNotEquals(c.hashCode(), d.hashCode());
        Assert.assertFalse(c.equals(d));
        Assert.assertFalse(c.equals(d));
    }

    @Test
    public void differentPointsWithSameHashcode() {
        Point l = new Point(0, 1, "green");
        Point r = new Point(31, 0, "green");
        Assert.assertEquals(l.hashCode(), r.hashCode());
        Assert.assertFalse(l.equals(r));
        Assert.assertFalse(r.equals(l));
    }

    @Test
    public void hashSetContainsAllDifferentPointsWithDifferentHashcode() {
        Point[] points = {
                new Point(0, 0),
                new Point(0, 5),
                new Point(5, 0),
                new Point(5, 5)};
        HashSet<Point> pts = new HashSet<>();
        for (Point p : points) {
            pts.add(p);
        }
        for (Point p : points) {
            Assert.assertTrue(pts.contains(p));
        }
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
