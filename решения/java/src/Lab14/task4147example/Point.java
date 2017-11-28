package Lab14.task4147example;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String print(){
        return "(" + x + ";" + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
