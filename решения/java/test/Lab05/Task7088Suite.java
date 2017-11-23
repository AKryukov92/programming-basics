package Lab05;

import org.junit.Test;

/**
 * Created by Александр on 23.11.2017.
 */
public class Task7088Suite extends TaskSuite {
    @Override
    void run() {
        Task7088.main(null);
    }

    @Test
    public void testInArea1() {
        compare(0, 100, NEGATIVE);
    }

    @Test
    public void testInArea2() {
        compare(1.5, 100, NEGATIVE);
    }

    @Test
    public void testInArea3() {
        compare(3, 100, POSITIVE);
    }

    @Test
    public void testInArea4() {
        compare(0, -0.5, NEGATIVE);
    }

    @Test
    public void testInArea5() {
        compare(1.5, -0.5, NEGATIVE);
    }

    @Test
    public void testInArea6() {
        compare(3, -0.5, NEGATIVE);
    }

    @Test
    public void testInArea7() {
        compare(0, -2, NEGATIVE);
    }

    @Test
    public void testInArea8() {
        compare(1.5, -2, POSITIVE);
    }

    @Test
    public void testInArea9() {
        compare(3, -2, POSITIVE);
    }

    @Test
    public void testOnBorder1() {
        compare(1, 100, NEGATIVE);
    }

    @Test
    public void testOnBorder2() {
        compare(2, 100, POSITIVE);
    }

    @Test
    public void testOnBorder3() {
        compare(0, 0, NEGATIVE);
    }

    @Test
    public void testOnBorder4() {
        compare(1.5, 0, NEGATIVE);
    }

    @Test
    public void testOnBorder5() {
        compare(3, 0, POSITIVE);
    }

    @Test
    public void testOnBorder6() {
        compare(1, -0.5, NEGATIVE);
    }

    @Test
    public void testOnBorder7() {
        compare(2, -0.5, NEGATIVE);
    }

    @Test
    public void testOnBorder8() {
        compare(0, -1, NEGATIVE);
    }

    @Test
    public void testOnBorder9() {
        compare(1.5, -1, POSITIVE);
    }

    @Test
    public void testOnBorder10() {
        compare(3, -1, POSITIVE);
    }

    @Test
    public void testOnBorder11(){
        compare(1, -50, POSITIVE);
    }

    @Test
    public void testOnBorder12(){
        compare(2, -50, POSITIVE);
    }

    @Test
    public void testOnBorderX1(){
        compare(0, 1, NEGATIVE);
    }

    @Test
    public void testOnBorderX2(){
        compare(2, 0, POSITIVE);
    }

    @Test
    public void testOnBorderX3(){
        compare(1, -1, POSITIVE);
    }

    @Test
    public void testOnBorderX4(){
        compare(2, -1, POSITIVE);
    }
}
