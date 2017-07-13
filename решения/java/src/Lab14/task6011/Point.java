package Lab14.task6011;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Point {
    public int x;
    public int y;
    public static double distanceBetween(Point p1, Point p2){
        if(p1 == null || p2 == null){
            throw new IllegalArgumentException("Некорректный интервал");
        }
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
