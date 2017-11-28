package Lab14.task5032;

/**
 * @author akryukov
 *         24.11.2017
 */
public class Rectangle5032 {
    int x;
    int y;
    int h;
    int w;
    String stroke;
    int count;

    public Rectangle5032(int x, int y, int h, int w, String stroke) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.stroke = stroke;
        this.count = 0;
    }

    public void shiftX(int value) throws Exception {
        if (this.x < -value) {
            throw new Exception("Координата X должна быть неотрицательной");
        }
        this.count++;
        this.x += value;
    }

    public void shiftY(int value) throws Exception {
        if (this.y < -value) {
            throw new Exception("Координата Y должна быть неотрицательной");
        }
        this.count++;
        this.y += value;
    }

    public void stretchX(int value) throws Exception {
        if (this.w <= -value) {
            throw new Exception("Ширина должна быть положительной");
        }
        this.count++;
        this.w += value;
    }

    public void stretchY(int value) throws Exception {
        if (this.h <= -value) {
            throw new Exception("Высота должна быть положительной");
        }
        this.count++;
        this.h += value;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("<rect x='%d' y='%d' width='%d' height='%d' fill='transparent' stroke='%s'/>", x, y, w, h, stroke);
    }
}
