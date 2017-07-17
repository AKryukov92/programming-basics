package Lab14.task1953;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Circle {
    private int cx;
    private int cy;
    private int r;

    public Circle(int cx, int cy, int r){
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public double area(){
        return Math.PI * r * r;
    }

    public Interval getProjectionX(){
        return new Interval(cx - r, cx + r);
    }

    public Interval getProjectionY(){
        return new Interval(cy - r, cy + r);
    }

    @Override
    public String toString() {
        return "<circle cx='" + cx +
            "' cy='" + cy +
            "' r='" + r +
            "'/>";
    }
}
