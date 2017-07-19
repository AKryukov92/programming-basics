package Lab15.task6876;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Rectangle extends Shape {
    private int x;
    private int y;
    private int w;
    private int h;

    public Rectangle(int x, int y, int w, int h) {
        super("black", 1, "transparent");
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }

    @Override
    public String toString() {
        return "&lt;rect x='" + x +
            "' y='" + y +
            "' width='" + w +
            "' height='" + h +
            "' stroke='" + getStroke() +
            "' stroke-width='" + getStrokeWidth() +
            "' fill='" + getFill() +
            "'/&gt;";
    }
}
