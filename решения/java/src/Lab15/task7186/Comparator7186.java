package Lab15.task7186;

import java.util.Comparator;

/**
 * Created by Александр on 18.07.2017.
 */
public class Comparator7186 implements Comparator<Integer> {
    private int root;
    public Comparator7186(int root){
        this.root = root;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        int d1 = Math.abs(o1 - root);
        int d2 = Math.abs(o2 - root);
        if(d1 > d2){
            return 1;
        } else if (d1 == d2) {
            return 0;
        } else {
            return -1;
        }
    }
}
