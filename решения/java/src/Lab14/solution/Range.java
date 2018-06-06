package Lab14.solution;

/**
 * @author AKryukov
 * 06.06.2018
 */
public class Range {
    public int from;
    public int to;
    public static boolean hasIntersection(int leftA, int leftB, int rightA, int rightB){
        if(leftA > leftB || rightA > rightB){
            throw new IllegalArgumentException("Некорректный интервал");
        }
        return !(leftB <= rightA || rightB <= leftA);
    }

    public static boolean hasIntersection(Range left, Range right){
        return hasIntersection(left.from, left.to, right.from, right.to);
    }

    public boolean intersects(int a, int b){
        if (from > to){
            throw new IllegalStateException("Некорректный интервал");
        }
        return hasIntersection(from, to, a, b);
    }
}
