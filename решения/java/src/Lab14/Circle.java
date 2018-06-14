package Lab14;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Circle {
    private int cx;
    private int cy;
    private int r;
    private String stroke;
    private int count;

    public Circle(int cx, int cy, int r, String stroke) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
        this.stroke = stroke;
        this.count = 0;
    }

    public void shiftX(int value) throws Exception {
        if (this.cx - this.r < -value) {
            throw new Exception("Левая точка круга должна иметь неотрицательные координаты");
        }
        this.cx += value;
        this.count++;
    }

    public void shiftY(int value) throws Exception {
        if (this.cy - this.r < -value) {
            throw new Exception("Верхняя точка круга должна иметь неотрицательные координаты");
        }
        this.cy += value;
        this.count++;
    }

    public void stretchX(int value) throws Exception {
        if (this.r * 2 <= -value) {
            throw new Exception("Ширина должна быть положительной");
        }
        this.r += value / 2;
        this.cx += value / 2;
        this.cy += value / 2;
        this.count++;
    }

    public void stretchY(int value) throws Exception {
        if (this.r * 2 <= -value) {
            throw new Exception("Ширина должна быть положительной");
        }
        this.r += value / 2;
        this.cx += value / 2;
        this.cy += value / 2;
        this.count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("<circle cx='%d' cy='%d' r='%d' fill='transparent' stroke='%s'/>", cx, cy, r, stroke);
    }
}
