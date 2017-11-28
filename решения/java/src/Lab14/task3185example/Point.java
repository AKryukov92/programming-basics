package Lab14.task3185example;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Point {
    public int x;
    public int y;
    public double distanceTo(Point p){
        if(p == null){
            throw new IllegalArgumentException("Конечная точка не инициализирована");
        }
        int dx = p.x - x;
        int dy = p.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
