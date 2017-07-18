package Lab15.task1457;

import java.util.Comparator;

/**
 * Created by Александр on 18.07.2017.
 */
public class Comparator1457 implements Comparator<Point> {
    private Point target;
    private int count;

    public Comparator1457(Point target){
        if(target == null){
            throw new IllegalArgumentException("Целевая точка не инициализирована");
        }
        this.target = target;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public Point getTarget() {
        return target;
    }

    @Override
    public int compare(Point o1, Point o2) {
        double d1 = target.distanceTo(o1);
        double d2 = target.distanceTo(o2);
        count++;
        if(d1 > d2){
            return 1;
        } else if (d1 == d2) {
            return 0;
        } else {
            return -1;
        }
    }
}
