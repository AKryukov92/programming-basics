package Lab15.task8258example;

import java.util.Comparator;

/**
 * @author akryukov
 *         18.07.2017
 */
public class Comparator8258 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int d1 = Math.abs(o1 - 6);
        int d2 = Math.abs(o2 - 6);
        if(d1 > d2){
            return 1;
        } else if (d1 == d2) {
            return 0;
        } else {
            return -1;
        }
    }
}
