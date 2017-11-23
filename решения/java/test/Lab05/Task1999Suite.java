package Lab05;

import org.junit.Test;

/**
 * Created by Александр on 23.11.2017.
 */
public class Task1999Suite extends TaskSuite {

    public void run() {
        Task1999.main(null);
    }

    @Test
    public void testInArea1() {
        compare(-100, 50, POSITIVE);
    }

    @Test
    public void testInArea2() {
        compare(100, 50, NEGATIVE);
    }

    @Test
    public void testInArea3() {
        compare(100, -50, NEGATIVE);
    }

    @Test
    public void testInArea4() {
        compare(-100, -50, NEGATIVE);
    }

    @Test
    public void testOnBorder1() {
        compare(-2, 50, POSITIVE);
    }

    @Test
    public void testOnBorder2() {
        compare(-100, 1, POSITIVE);
    }

    @Test
    public void testOnBorder3() {
        compare(-2, -50, NEGATIVE);
    }

    @Test
    public void testOnBorder4() {
        compare(100, 1, NEGATIVE);
    }

    @Test
    public void testBorderX() {
        compare(-2, 1, POSITIVE);
    }
}

