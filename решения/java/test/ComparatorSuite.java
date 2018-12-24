import Lab14.Comparator7186;
import Lab14.Comparator8258;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ComparatorSuite {
  @Test
  public void comparator8258test() {
    Comparator8258 cmp = new Comparator8258();
    Assert.assertEquals(-1, cmp.compare(5, 10));
    Assert.assertEquals(1, cmp.compare(10, 5));
    Assert.assertEquals(-1, cmp.compare(4, 20));
    Assert.assertEquals(1, cmp.compare(50, 20));
    Assert.assertEquals(0, cmp.compare(15, 15));
    Assert.assertEquals(0, cmp.compare(5, 7));
  }

  @Test
  public void comparator8258SortTest() {
    List<Integer> expected, actual;
    Comparator8258 cmp = new Comparator8258();
    expected = Arrays.asList(7, 3, 10, 1);
    actual = Arrays.asList(1, 3, 7, 10);
    actual.sort(cmp);
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void comparator7186Test() {
    Comparator7186 cmp = new Comparator7186(100);
    Assert.assertEquals(-1, cmp.compare(99, 1));
    Assert.assertEquals(1, cmp.compare(1, 99));
    Assert.assertEquals(0, cmp.compare(50, 150));
    Assert.assertEquals(0, cmp.compare(5, 5));
    cmp = new Comparator7186(47);
    Assert.assertEquals(1, cmp.compare(9, 57));
    Assert.assertEquals(-1, cmp.compare(58, 9));
    Assert.assertEquals(0, cmp.compare(53, 41));
    Assert.assertEquals(0, cmp.compare(60, 60));
  }

  @Test
  public void comparator7186SortTest() {
    List<Integer> expected, actual;
    actual = Arrays.asList(1, 3, 7, 10);
    expected = Arrays.asList(7, 3, 10, 1);
    actual.sort(new Comparator7186(6));
    Assert.assertEquals(expected, actual);

    actual = Arrays.asList(1, 3, 7, 10);
    expected = Arrays.asList(10, 7, 3, 1);
    actual.sort(new Comparator7186(10));
    Assert.assertEquals(expected, actual);

    actual = Arrays.asList(1, 3, 7, 10);
    expected = Arrays.asList(3, 1, 7, 10);
    actual.sort(new Comparator7186(4));
    Assert.assertEquals(expected, actual);

    actual = Arrays.asList(-49, -55, -60, -60, 15, -28, 22, -16, 4, 61,
            74, -39, -55, -14, -12, 66, 80, -47, 1, -65);
    expected = Arrays.asList(-49, -47, -55, -55, -60, -60, -39, -65, -28,
            -16, -14, -12, 1, 4, 15, 22, 61, 66, 74, 80);
    actual.sort(new Comparator7186(-50));
    Assert.assertEquals(expected, actual);
  }
}
