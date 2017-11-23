package Lab05;

import org.junit.Test;

/**
 * Created by Александр on 23.11.2017.
 */
public class Task9038Suite extends TaskSuite {
    @Override
    void run() {
        Task9038.main(null);
    }

    @Test
    public void testInArea1(){
        compare(0, 50, NEGATIVE);
    }

    @Test
    public void testInArea2(){
        compare(100, 50, POSITIVE);
    }

    @Test
    public void testInArea3(){
        compare(0, 1, POSITIVE);
    }

    @Test
    public void testInArea4(){
        compare(100, 1, POSITIVE);
    }

    @Test
    public void testInArea5(){
        compare(0, 0, NEGATIVE);
    }

    @Test
    public void testInArea6(){
        compare(100, 0, POSITIVE);
    }

    @Test
    public void testOnBorder1(){
        compare(2, 50, POSITIVE);
    }

    @Test
    public void testOnBorder2(){
        compare(0, 1.5, POSITIVE);
    }

    @Test
    public void testOnBorder3(){
        compare(0, 0.5, POSITIVE);
    }

    @Test
    public void testOnBorder4(){
        compare(2, 0, POSITIVE);
    }

    @Test
    public void testOnBorderX1(){
        compare(2, 1.5, POSITIVE);
    }

    @Test
    public void testOnBorderX2(){
        compare(2, 0.5, POSITIVE);
    }
}
