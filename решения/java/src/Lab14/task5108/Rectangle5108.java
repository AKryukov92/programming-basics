package Lab14.task5108;

import Lab14.task2033.Figure2033;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Rectangle5108 implements Figure2033 {
    private int x;
    private int y;
    private int h;
    private int w;
    private int count = 0;

    public Rectangle5108(int x, int y, int h, int w) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }

    @Override
    public int maxShiftX(int bound) {
        return bound - x - w;
    }

    @Override
    public int minShiftX() {
        return 1 - x;
    }

    @Override
    public int maxShiftY(int bound) {
        return bound - y - h;
    }

    @Override
    public int minShiftY() {
        return 1 - y;
    }

    @Override
    public int maxStretchX(int boundX, int boundY) {
        return maxShiftX(boundX);
    }

    @Override
    public int minStretchX() {
        return -w + 1;
    }

    @Override
    public int maxStretchY(int boundX, int boundY) {
        return maxShiftY(boundY);
    }

    @Override
    public int minStretchY() {
        return -h + 1;
    }

    @Override
    public void shiftX(int value) throws Exception {
        if (this.x < -value) {
            throw new Exception("Координата X должна быть неотрицательной");
        }
        this.count++;
        this.x += value;
    }

    @Override
    public void shiftY(int value) throws Exception {
        if (this.y < -value) {
            throw new Exception("Координата Y должна быть неотрицательной");
        }
        this.count++;
        this.y += value;
    }

    @Override
    public void stretchX(int value) throws Exception {
        if (this.w <= -value) {
            throw new Exception("Ширина должна быть положительной");
        }
        this.count++;
        this.w += value;
    }

    @Override
    public void stretchY(int value) throws Exception {
        if (this.h <= -value) {
            throw new Exception("Высота должна быть положительной");
        }
        this.count++;
        this.h += value;
    }

    @Override
    public int getCount() {
        return count;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    @Override
    public String toString() {
        return String.format("<rect x='%d' y='%d' width='%d' height='%d' fill='transparent' stroke='black'/>", x, y, w, h);
    }
}
