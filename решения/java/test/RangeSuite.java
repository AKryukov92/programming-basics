import Lab14.solution.Range;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author AKryukov
 * 06.06.2018
 */
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
        boolean result = Range.hasIntersection(79, 73, 83, 89);
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionIntsWrongRightTest() {
        boolean result = Range.hasIntersection(97, 101, 107, 103);
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
            left.from = leftAs[i];
            left.to = leftBs[i];
            right.from = rightAs[i];
            right.to = rightBs[i];
            boolean result = Range.hasIntersection(left, right);
            Assert.assertEquals(results[i], result);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionRangesWrongLeftTest() {
        Range left = new Range(), right = new Range();
        left.from = 79;
        left.to = 73;
        right.from = 83;
        right.to = 89;
        boolean result = Range.hasIntersection(left, right);
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionRangesWrongRightTest() {
        Range left = new Range(), right = new Range();
        left.from = 97;
        left.to = 101;
        right.from = 107;
        right.to = 103;
        boolean result = Range.hasIntersection(left, right);
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
            left.from = leftAs[i];
            left.to = leftBs[i];
            boolean result = left.intersects(rightAs[i], rightBs[i]);
            Assert.assertEquals(results[i], result);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void intersectsIntWrongLeftTest() {
        Range left = new Range();
        left.from = 79;
        left.to = 73;
        boolean result = left.intersects(83, 89);
    }

    @Test(expected = IllegalArgumentException.class)
    public void intersectsIntsWrongRightTest(){
        Range right = new Range();
        right.from = 97;
        right.to = 101;
        boolean result = right.intersects(107, 103);
    }
}
