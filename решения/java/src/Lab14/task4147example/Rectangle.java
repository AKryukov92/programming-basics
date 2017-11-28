package Lab14.task4147example;


/**
 * @author akryukov
 *         17.07.2017
 */
public class Rectangle {
    private int x;
    private int y;
    private int w;
    private int h;

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public Rectangle(Point p, int w, int h){
        this.x = p.getX();
        this.y = p.getY();
        this.w = w;
        this.h = h;
    }

    public Rectangle(Interval rangeX, Interval rangeY){
        this.x = rangeX.getA();
        this.w = rangeX.length();
        this.y = rangeY.getA();
        this.h = rangeY.length();
    }

    public boolean contains(Point p){
        return x <= p.getX() && p.getX() <= x + w
            && y <= p.getY() && p.getY() <= y + h;
    }

    public double area() {
        return w * h;
    }

    public Interval getProjectionX(){
        return new Interval(x, x + w);
    }

    public Interval getProjectionY(){
        return new Interval(y, y + h);
    }

    @Override
    public String toString() {
        return "<rect x='" + x +
            "' y='" + y +
            "' w='" + w +
            "' h='" + h +
            "'/>";
    }
}
