package Lab15.task1457;

/**
 * Created by Александр on 18.07.2017.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p){
        if(p == null){
            throw new IllegalArgumentException("Конечная точка не инициализирована");
        }
        int dx = p.x - x;
        int dy = p.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public String toString() {
        return "(" + x + ';' + y + ')';
    }
}
