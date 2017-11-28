package Lab14.task7301example;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p){
        int dx = p.x - x;
        int dy = p.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public double distanceTo(int px, int py){
        int dx = px - x;
        int dy = py - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

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

    public String print(){
        return "(" + x + ";" + y + ")";
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
