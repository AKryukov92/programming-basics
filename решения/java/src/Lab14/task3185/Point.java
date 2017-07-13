package Lab14.task3185;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Point {
    public int x;
    public int y;
    public double distanceTo(Point p){
        int dx = p.x - x;
        int dy = p.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
