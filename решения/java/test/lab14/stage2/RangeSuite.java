package lab14.stage2;

import Lab14.stage2.Range;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author AKryukov
 * 06.06.2018
 */
@SuppressWarnings("ResultOfMethodCallIgnored")
public class RangeSuite {
    @Test
    public void hasIntersectionIntsTest() {
        int[] leftAs = {2, 11, 23, 43, 5, 67};
        int[] leftBs = {3, 17, 37, 53, 15, 71};
        int[] rightAs = {5, 13, 29, 41, 0, 59};
        int[] rightBs = {7, 19, 31, 47, 30, 61};
        boolean[] results = {false, true, true, true, true, false};
        for (int i = 0; i < leftAs.length; i++) {
            boolean result = Range.hasIntersection(
                leftAs[i],
                leftBs[i],
                rightAs[i],
                rightBs[i]);
            Assert.assertEquals(results[i], result);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionIntsWrongLeftTest() {
        Range.hasIntersection(79, 73, 83, 89);
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionIntsWrongRightTest() {
        Range.hasIntersection(97, 101, 107, 103);
    }

    @Test
    public void hasIntersectionRangesTest() {
        int[] leftAs = {2, 11, 23, 43, 5, 67};
        int[] leftBs = {3, 17, 37, 53, 15, 71};
        int[] rightAs = {5, 13, 29, 41, 0, 59};
        int[] rightBs = {7, 19, 31, 47, 30, 61};
        boolean[] results = {false, true, true, true, true, false};
        Range left = new Range(), right = new Range();
        for (int i = 0; i < leftAs.length; i++) {
            left.init(leftAs[i], leftBs[i]);
            right.init(rightAs[i], rightBs[i]);
            boolean result = Range.hasIntersection(left, right);
            Assert.assertEquals(results[i], result);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionRangesWrongLeftTest() {
        Range left = new Range(), right = new Range();
        left.init(79, 73);
        right.init(83, 89);
        Range.hasIntersection(left, right);
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionRangesWrongRightTest() {
        Range left = new Range(), right = new Range();
        left.init(97, 101);
        right.init(107, 103);
        Range.hasIntersection(left, right);
    }

    @Test
    public void intersectsIntsTest() {
        Range left = new Range();
        int[] leftAs = {2, 11, 23, 43, 5, 67};
        int[] leftBs = {3, 17, 37, 53, 15, 71};
        int[] rightAs = {5, 13, 29, 41, 0, 59};
        int[] rightBs = {7, 19, 31, 47, 30, 61};
        boolean[] results = {false, true, true, true, true, false};
        for (int i = 0; i < leftAs.length; i++) {
            left.init(leftAs[i], leftBs[i]);
            boolean result = left.intersects(rightAs[i], rightBs[i]);
            Assert.assertEquals(results[i], result);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void intersectsIntWrongLeftTest() {
        Range left = new Range();
        left.init(79, 73);
        left.intersects(83, 89);
    }

    @Test(expected = IllegalArgumentException.class)
    public void intersectsIntsWrongRightTest(){
        Range right = new Range();
        right.init(97, 101);
        right.intersects(107, 103);
    }

    @Test
    public void intersectsRangeTest(){
        int[] leftAs = {2, 11, 23, 43, 5, 67};
        int[] leftBs = {3, 17, 37, 53, 15, 71};
        int[] rightAs = {5, 13, 29, 41, 0, 59};
        int[] rightBs = {7, 19, 31, 47, 30, 61};
        boolean[] results = {false, true, true, true, true, false};
        Range left = new Range(), right = new Range();
        for (int i = 0; i < leftAs.length; i++) {
            left.init(leftAs[i], leftBs[i]);
            right.init(rightAs[i], rightBs[i]);
            Assert.assertEquals(results[i], left.intersects(right));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void intersectsRangeWrongLeftTest(){
        Range left = new Range(), right = new Range();
        left.init(79, 73);
        right.init(83, 89);
        left.intersects(right);
    }

    @Test(expected = IllegalArgumentException.class)
    public void intersectsRangesWrongRightTest() {
        Range left = new Range(), right = new Range();
        left.init(97, 101);
        right.init(107, 103);
        left.intersects(right);
    }
}
