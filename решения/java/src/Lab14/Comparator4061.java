package Lab14;

import java.util.Comparator;

public class Comparator4061 implements Comparator<Integer> {
  @Override
  public int compare(Integer left, Integer right) {
    int absL = Math.abs(left);
    int absR = Math.abs(right);
    if (absL > absR)
    {
      return 1;
    } else if (absL < absR)
    {
      return -1;
    } else
    {
      if (left < 0 && right > 0)
      {
        return -1;
      }
      else if (left > 0 && right < 0)
      {
        return 1;
      }
      else
      {
        return 0;
      }
    }
  }
}
