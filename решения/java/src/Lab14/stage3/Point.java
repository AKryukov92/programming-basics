package Lab14.stage3;

/**
 * @author AKryukov
 * 05.06.2018
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static double distanceBetween(int ax, int ay, int bx, int by) {
        int dx = ax - bx;
        int dy = ay - by;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Point point = (Point) o;
        if (x == point.x && y == point.y) return true;
        return false;
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
