package Lab14.stage2;

/**
 * @author AKryukov
 * 05.06.2018
 */
public class Point {
    private double x;
    private double y;
    private String color;

    public void setCoordinates(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setColor(String value){
        this.color = value;
    }

    public String getColor() {
        return color;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;

        Point point = (Point) other;
        if (x == point.x && y == point.y) return true;
        return false;
    }
}
