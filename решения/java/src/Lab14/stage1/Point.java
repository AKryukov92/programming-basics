package Lab14.stage1;

/**
 * @author AKryukov
 * 05.06.2018
 */
public class Point {
    public double x;
    public double y;

    public static double distanceBetween(double ax, double ay, double bx, double by) {
        double dx = ax - bx;
        double dy = ay - by;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distanceBetween(Point a, Point b){
        if(a == null) {
            throw new IllegalArgumentException("Начальная точка не инициализирована");
        }
        if (b == null){
            throw new IllegalArgumentException("Конечная точка не инициализирована");
        }
        return distanceBetween(a.x, a.y, b.x, b.y);
    }

    public double distanceTo(int x, int y){
        return distanceBetween(this.x, this.y, x, y);
    }

    public double distanceTo(Point p){
        if(p == null) {
            throw new IllegalArgumentException("Начальная точка не инициализирована");
        }
        return distanceBetween(this, p);
    }
}
