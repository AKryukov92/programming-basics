package Lab15.task6876;

/**
 * @author akryukov
 *         17.07.2017
 */
public abstract class Shape {
    private String stroke;
    private int strokeWidth;
    private String fill;

    public Shape(String stroke, int strokeWidth, String fill) {
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
        this.fill = fill;
    }

    public String getStroke() {
        return stroke;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public String getFill() {
        return fill;
    }

    public abstract double area();

    public static String getHeader(){
        return "&lt;svg width=\"150\" height=\"150\"&gt;";
    }

    public static String getFooter(){
        return "&lt;/svg&gt;";
    }
}
