import org.junit.Assert;
import org.junit.Test;

public class Lab14Suite {
    @Test
    public void test7891() {
        int[] data = {9, 8, 7, 6, 5, 4};
        int[] expected = {9, 8, 17, 7, 6, 13, 5, 4, 9};
        int[] actual = Lab14.task7891(data);
        Assert.assertArrayEquals(expected, actual);

        data = new int[]{11, 13, 17, 19, 23, 29};
        expected = new int[]{11, 13, 24, 17, 19, 36, 23, 29, 52};
        actual = Lab14.task7891(data);
        Assert.assertArrayEquals(expected, actual);

        data = new int[]{0, 0};
        expected = new int[]{0, 0, 0};
        actual = Lab14.task7891(data);
        Assert.assertArrayEquals(expected, actual);

        data = new int[]{};
        expected = new int[]{};
        actual = Lab14.task7891(data);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test7891exception() {
        Lab14.task7891(new int[]{9, 8, 7});
    }
}
