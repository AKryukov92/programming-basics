package Lab14.stage1;

/**
 * @author AKryukov
 * 05.06.2018
 */
public class Point {
    public double x;
    public double y;

    public Point(){}

    public Point(int px, int py){
        this.x = px;
        this.y = py;
    }

    public static Point zero(){
        Point instance = new Point();
        instance.x = 0;
        instance.y = 0;
        return instance;
    }

    public static Point make(int px, int py){
        Point instance = new Point();
        instance.x = px;
        instance.y = py;
        return instance;
    }

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
