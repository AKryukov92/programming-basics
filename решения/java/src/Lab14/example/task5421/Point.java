package Lab14.example.task5421;

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
    public double distanceTo(int px, int py){
        int dx = px - x;
        int dy = py - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String print(){
        return "(" + x + ";" + y + ")";
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
