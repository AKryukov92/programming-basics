import org.junit.Assert;
import org.junit.Test;
import root.tasks.objects.TaskJava1606;
import root.tasks.objects.TaskJava7040;

public class RangeSuite {
    @Test
    public void doublesContainDoubleTest() {
        boolean actual = TaskJava7040.Range.contains(100, 200, 300);
        Assert.assertFalse(actual);
        Assert.assertTrue(TaskJava7040.Range.contains(5, 10, 7));
        Assert.assertFalse(TaskJava7040.Range.contains(20, 30, 3));
        Assert.assertThrows(IllegalArgumentException.class, () -> TaskJava7040.Range.contains(999, 1, 100));
    }

    @Test
    public void rangeContainsDoubleTest() {
        boolean actual;
        TaskJava1606.Range range = new TaskJava1606.Range();
        range.left = 5;
        range.right = 10;
        actual = TaskJava1606.Range.contains(range, 7);
        Assert.assertTrue(actual);
        range.left = 20;
        range.right = 30;
        Assert.assertFalse(TaskJava1606.Range.contains(range, 3));
        range.left = 100;
        range.right = 200;
        actual = TaskJava1606.Range.contains(range, 300);
        Assert.assertFalse(actual);
        range.left = 999;
        range.right = 1;
        Assert.assertThrows(IllegalArgumentException.class, () -> TaskJava1606.Range.contains(range, 100));
    }
}
