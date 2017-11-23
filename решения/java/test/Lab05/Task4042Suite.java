package Lab05;

import org.junit.Test;

/**
 * Created by Александр on 23.11.2017.
 */
public class Task4042Suite extends TaskSuite {
    @Override
    void run() {
        Task4042.main(null);
    }

    @Test
    public void testInArea1() {
        compare(3, 50, NEGATIVE);
    }

    @Test
    public void testInArea2() {
        compare(5, 0, POSITIVE);
    }

    @Test
    public void testInArea3() {
        compare(7, -50, NEGATIVE);
    }

    @Test
    public void testOnBorder1() {
        compare(-11, 1.5, POSITIVE);
    }

    @Test
    public void testOnBorder2() {
        compare(-13, -2, POSITIVE);
    }
}
