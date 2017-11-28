package Lab14.task3956example;

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
        super("black", 0, "black");
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public Rectangle(int x, int y, int w, int h, String stroke, String fill, int strokeWidth) {
        super(stroke, strokeWidth, fill);
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void slide(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public Point getCenter() {
        return new Point(x + w / 2, y + h / 2);
    }

    @Override
    public double area() {
        return w * h;
    }

    @Override
    public String toString() {
        return "<rect x='" + x +
            "' y='" + y +
            "' w='" + w +
            "' h='" + h +
            "' stroke='" + getStroke() +
            "' stroke-width='" + getStrokeWidth() +
            "' fill='" + getFill() +
            "'/>";
    }
}
