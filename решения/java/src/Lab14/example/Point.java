package Lab14.example;

/**
 * @author AKryukov
 * 05.06.2018
 */
public class Point {
    public int x;
    public int y;
    public static double distanceBetween(int ax, int ay, int bx, int by) {
        int dx = ax - bx;
        int dy = ay - by;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
