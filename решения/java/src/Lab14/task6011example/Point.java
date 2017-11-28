package Lab14.task6011example;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Point {
    public int x;
    public int y;
    public static double distanceBetween(Point p1, Point p2){
        if(p1 == null) {
            throw new IllegalArgumentException("Начальная точка не инициализирована");
        }
        if (p2 == null){
            throw new IllegalArgumentException("Конечная точка не инициализирована");
        }
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
