package Lab14.stage2;

/**
 * @author AKryukov
 * 06.06.2018
 */
public class Range {
    public int from;
    public int to;

    public static boolean hasIntersection(int leftA, int leftB, int rightA, int rightB) {
        if (leftA > leftB || rightA > rightB) {
            throw new IllegalArgumentException("Некорректный интервал");
        }
        return !(leftB <= rightA || rightB <= leftA);
    }

    public static boolean hasIntersection(Range left, Range right) {
        return hasIntersection(left.from, left.to, right.from, right.to);
    }

    public boolean intersects(int a, int b) {
        if (from > to) {
            throw new IllegalStateException("Некорректный интервал");
        }
        return hasIntersection(from, to, a, b);
    }

    public boolean intersects(Range right) {
        if (from > to) {
            throw new IllegalStateException("Некорректный интервал");
        }
        return hasIntersection(this, right);
    }

    public void init(int a, int b) {
        this.from = a;
        this.to = b;
    }

    public void shift(int value) {
        this.from += value;
        this.to += value;
    }

    public void squeeze(int value) {
        if (value > to - from) {
            throw new IllegalArgumentException();
        }
        this.to -= value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Range point = (Range) o;
        if (from == point.from && to == point.to) return true;
        return false;
    }
}
