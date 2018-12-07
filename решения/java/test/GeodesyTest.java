import Lab14.geodesy.Direction;
import Lab14.geodesy.Point;
import org.junit.Assert;
import org.junit.Test;

public class GeodesyTest {
    @Test
    public void task4913(){
        Methods.forwardTask(1,1, 5, 30);
        Methods.forwardTask(7,11, 13, 110);
        Methods.forwardTask(17,19, 23, 230);
        Methods.forwardTask(29,31, 3, 290);
        Methods.forwardTask(33,37, 10, 90);
        Methods.forwardTask(33,37, 10, 180);
        Methods.forwardTask(33,37, 10, 270);
        Methods.forwardTask(33,37, 10, 360);
        Methods.forwardTask(1,1, -5, 45);
        Methods.forwardTask(1,1,0, 45);
        Methods.forwardTask(1,1,10,-5);
        Methods.forwardTask(1,1,10,0);
    }

    @Test
    public void rumbNE() {
        Point src = new Point();
        src.x = 1;
        src.y = 1;

        Point dest = new Point();
        dest.x = 4;
        dest.y = 5;

        Direction dir = Methods.backwardTask(src, dest);
        Point dest1 = Methods.forwardTask(src, dir);
        Assert.assertEquals(dest.x, dest1.x, 0.0001);
        Assert.assertEquals(dest.y, dest1.y, 0.0001);
    }

    @Test
    public void rumbSE() {
        Point src = new Point();
        src.x = 1;
        src.y = 5;

        Point dest = new Point();
        dest.x = 4;
        dest.y = 1;

        Direction dir = Methods.backwardTask(src, dest);
        Point dest1 = Methods.forwardTask(src, dir);
        Assert.assertEquals(dest.x, dest1.x, 0.0001);
        Assert.assertEquals(dest.y, dest1.y, 0.0001);
    }

    @Test
    public void rumbSW() {
        Point src = new Point();
        src.x = 4;
        src.y = 5;

        Point dest = new Point();
        dest.x = 1;
        dest.y = 1;

        Direction dir = Methods.backwardTask(src, dest);
        Point dest1 = Methods.forwardTask(src, dir);
        Assert.assertEquals(dest.x, dest1.x, 0.0001);
        Assert.assertEquals(dest.y, dest1.y, 0.0001);
    }

    @Test
    public void rumbNW() {
        Point src = new Point();
        src.x = 4;
        src.y = 1;

        Point dest = new Point();
        dest.x = 1;
        dest.y = 5;

        Direction dir = Methods.backwardTask(src, dest);
        Point dest1 = Methods.forwardTask(src, dir);
        Assert.assertEquals(dest.x, dest1.x, 0.0001);
        Assert.assertEquals(dest.y, dest1.y, 0.0001);
    }

    @Test
    public void rumbN() {
        Point src = new Point();
        src.x = 1;
        src.y = 1;
        Point dest = new Point();
        dest.x = 1;
        dest.y = 6;

        Direction direction = Methods.backwardTask(src, dest);
        Point actual = Methods.forwardTask(src, direction);
        Assert.assertEquals(dest.x, actual.x, 0.0001);
        Assert.assertEquals(dest.y, actual.y, 0.0001);
    }

    @Test
    public void rumbE() {
        Point src = new Point();
        src.x = 1;
        src.y = 1;
        Point dest = new Point();
        dest.x = 6;
        dest.y = 1;

        Direction direction = Methods.backwardTask(src, dest);
        Point actual = Methods.forwardTask(src, direction);
        Assert.assertEquals(dest.x, actual.x, 0.0001);
        Assert.assertEquals(dest.y, actual.y, 0.0001);
    }

    @Test
    public void rumbS() {
        Point src = new Point();
        src.x = 1;
        src.y = 6;
        Point dest = new Point();
        dest.x = 1;
        dest.y = 1;

        Direction direction = Methods.backwardTask(src, dest);
        Point actual = Methods.forwardTask(src, direction);
        Assert.assertEquals(dest.x, actual.x, 0.0001);
        Assert.assertEquals(dest.y, actual.y, 0.0001);
    }

    @Test
    public void rumbW() {
        Point src = new Point();
        src.x = 6;
        src.y = 1;
        Point dest = new Point();
        dest.x = 1;
        dest.y = 1;

        Direction direction = Methods.backwardTask(src, dest);
        Point actual = Methods.forwardTask(src, direction);
        Assert.assertEquals(dest.x, actual.x, 0.0001);
        Assert.assertEquals(dest.y, actual.y, 0.0001);
    }

}
