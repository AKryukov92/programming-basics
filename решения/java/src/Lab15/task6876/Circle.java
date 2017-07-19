package Lab15.task6876;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Circle extends Shape {
    private int cx;
    private int cy;
    private int r;

    public Circle(int cx, int cy, int r){
        super("black", 1, "transparent");
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "&lt;circle cx='" + cx +
            "' cy='" + cy +
            "' r='" + r +
            "' stroke='" + getStroke() +
            "' stroke-width='" + getStrokeWidth() +
            "' fill='" + getFill() +
            "'/&gt;";
    }
}
