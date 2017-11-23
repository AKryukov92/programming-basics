package Lab05;

import org.junit.Test;

/**
 * Created by Александр on 23.11.2017.
 */
public class Task6351Suite extends TaskSuite {
    @Override
    void run() {
        Task6351.main(null);
    }

    @Test
    public void testInArea1() {
        compare(-100, 50, NEGATIVE);
    }

    @Test
    public void testInArea2() {
        compare(1.5, 50, NEGATIVE);
    }

    @Test
    public void testInArea3() {
        compare(100, 50, NEGATIVE);
    }

    @Test
    public void testInArea4() {
        compare(-100, 0, NEGATIVE);
    }

    @Test
    public void testInArea5() {
        compare(1.5, 0, POSITIVE);
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
        compare(2, 50, NEGATIVE);
    }

    @Test
    public void testOnBorder3() {
        compare(-100, 4, NEGATIVE);
    }

    @Test
    public void testOnBorder4() {
        compare(1.5, 4, POSITIVE);
    }

    @Test
    public void testOnBorder5() {
        compare(100, 4, NEGATIVE);
    }

    @Test
    public void testOnBorder6() {
        compare(1, 0, POSITIVE);
    }

    @Test
    public void testOnBorder7() {
        compare(2, 0, POSITIVE);
    }

    @Test
    public void testBorderX1() {
        compare(1, 4, POSITIVE);
    }

    @Test
    public void testBorderX2() {
        compare(2, 4, POSITIVE);
    }
}
