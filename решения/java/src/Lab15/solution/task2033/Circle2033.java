package Lab15.solution.task2033;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Circle2033 implements Figure2033 {
    private int cx;
    private int cy;
    private int r;
    private int count = 0;

    public Circle2033(int cx, int cy, int r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    @Override
    public void shiftX(int value) throws Exception {
        if (this.cx - this.r < -value) {
            throw new Exception("Левая точка круга должна иметь неотрицательные координаты");
        }
        this.cx += value;
        count++;
    }

    @Override
    public void shiftY(int value) throws Exception {
        if (this.cy - this.r < -value) {
            throw new Exception("Верхняя точка круга должна иметь неотрицательные координаты");
        }
        this.cy += value;
        count++;
    }

    @Override
    public void stretchX(int value) throws Exception {
        if (this.r * 2 <= -value) {
            throw new Exception("Ширина должна быть положительной");
        }
        this.r += value / 2;
        this.cx += value / 2;
        this.cy += value / 2;
        count++;
    }

    @Override
    public void stretchY(int value) throws Exception {
        if (this.r * 2 <= -value) {
            throw new Exception("Высота должна быть положительной");
        }
        this.r += value / 2;
        this.cx += value / 2;
        this.cy += value / 2;
        count++;
    }

    @Override
    public int maxShiftX(int bound) {
        return bound - cx - r;
    }

    @Override
    public int minShiftX() {
        return 0 - cx + r;
    }

    @Override
    public int maxShiftY(int bound) {
        return bound - cy - r;
    }

    @Override
    public int minShiftY() {
        return 0 - cy + r;
    }

    @Override
    public int maxStretchX(int boundX, int boundY) {
        if (boundX - cx < boundY - cy) {
            return maxShiftX(boundX);
        } else {
            return maxShiftY(boundY);
        }
    }

    @Override
    public int minStretchX() {
        return -r - r + 1;
    }

    @Override
    public int maxStretchY(int boundX, int boundY) {
        return maxStretchX(boundX, boundY);
    }

    @Override
    public int minStretchY() {
        return -r - r + 1;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("<circle cx='%d' cy='%d' r='%d' stroke='black' stroke-width='1' fill='transparent'/>", cx, cy, r);
        //return String.format("Действий:%d {\"cx\":%d,\"y\":%d,\"r\":%d}", count, cx, cy, r);
    }
}
