package Lab05;

import org.junit.Test;

/**
 * Created by Александр on 23.11.2017.
 */
public class Task5382Suite extends TaskSuite {
    @Override
    void run() {
        Task5382.main(null);
    }

    @Test
    public void testInArea1() {
        compare(0, 50, NEGATIVE);
    }

    @Test
    public void testInArea2() {
        compare(100, 50, NEGATIVE);
    }

    @Test
    public void testInArea3() {
        compare(0, 3, NEGATIVE);
    }

    @Test
    public void testInArea4() {
        compare(100, 3, POSITIVE);
    }

    @Test
    public void testInArea5() {
        compare(0, 0, NEGATIVE);
    }

    @Test
    public void testInArea6() {
        compare(100, 0, NEGATIVE);
    }

    @Test
    public void testOnBorder1() {
        compare(1, 50, NEGATIVE);
    }

    @Test
    public void testOnBorder2() {
        compare(0, 4, NEGATIVE);
    }

    @Test
    public void testOnBorder3() {
        compare(100, 4, POSITIVE);
    }

    @Test
    public void testOnBorder4() {
        compare(1, 3, POSITIVE);
    }

    @Test
    public void testOnBorder5() {
        compare(0, 2, NEGATIVE);
    }

    @Test
    public void testOnBorder6() {
        compare(100, 2, POSITIVE);
    }

    @Test
    public void testOnBorder7() {
        compare(0, 0, NEGATIVE);
    }

    @Test
    public void testOnBorderX1() {
        compare(1, 4, POSITIVE);
    }

    @Test
    public void testOnBorderX2() {
        compare(1, 2, POSITIVE);
    }
}
