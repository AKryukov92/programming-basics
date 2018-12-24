package Lab14;

import java.util.Comparator;

public class Comparator8258 implements Comparator<Integer> {
  @Override
  public int compare(Integer a, Integer b) {
    int d1 = Math.abs(a - 6);
    int d2 = Math.abs(b - 6);
    if (d1 > d2)
    {
      return 1;
    }
    else if (d1 == d2)
    {
      return 0;
    }
    else {
      return -1;
    }
  }
}
