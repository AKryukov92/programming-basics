package Lab14.task3956example;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Circle extends Shape {
    private int cx;
    private int cy;
    private int r;

    public Circle(int cx, int cy, int r, String stroke, String fill, int strokeWidth) {
        super(stroke, strokeWidth, fill);
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public Circle(int cx, int cy, int r){
        super("black", 0, "black");
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    @Override
    public void slide(int dx, int dy) {
        cx += dx;
        cy += dy;
    }

    @Override
    public Point getCenter() {
        return new Point(cx, cy);
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "<circle cx='" + cx +
            "' cy='" + cy +
            "' r='" + r +
            "' stroke='" + getStroke() +
            "' stroke-width='" + getStrokeWidth() +
            "' fill='" + getFill() +
            "'/>";
    }
}
