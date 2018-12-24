package Lab14;

import java.util.Comparator;

public class Comparator7186 implements Comparator<Integer> {
  private int x;
  public Comparator7186(int x){
    this.x = x;
  }
  @Override
  public int compare(Integer a, Integer b) {
    int d1 = Math.abs(a - x);
    int d2 = Math.abs(b - x);
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
