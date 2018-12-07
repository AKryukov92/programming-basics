import Lab14.geodesy.Direction;
import Lab14.geodesy.Point;

public class Methods {

    public static double task1934(int a, int b) {
        if (-7 * b < 0) {
            String message = "Подкоренное выражение должно быть неотрицательно";
            throw new IllegalArgumentException(message);
        }
        return a * Math.sqrt(-7 * b);
    }

    public static double task3943(int x, int y) {
        if (y < 0) {
            String message = "Подкоренное выражение должно быть неотрицательно";
            throw new IllegalArgumentException(message);
        }
        if (x + Math.sqrt(y) < 0) {
            String message = "Подкоренное выражение должно быть неотрицательно";
            throw new IllegalArgumentException(message);
        }
        return -5 * Math.sqrt(x + Math.sqrt(y));
    }

    public static void forwardTask(int x, int y, int distance, double angle){
        Point src = new Point();
        src.x = x;
        src.y = y;
        Direction direction = new Direction();
        direction.distance = distance;
        direction.angle = angle;
        try {
            Point result = forwardTask(src, direction);
            System.out.printf("Координаты второй точки (%.4f;%.4f)\n", result.x, result.y);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static Point forwardTask(Point src, Direction direction) {
        if (direction.distance <= 0){
            throw new IllegalArgumentException("Горизонтальное проложение линии должно быть положительно");
        }
        if (direction.angle < 0){
            throw new IllegalArgumentException("Угол должен быть неотрицательным");
        }
        double dx = direction.distance * Math.cos(Math.toRadians(direction.angle));
        double dy = direction.distance * Math.sin(Math.toRadians(direction.angle));
        System.out.println("Приращение координат:");
        System.out.printf("\u0394x = %.4f\n\u0394y = %.4f\n", dx, dy);
        Point p = new Point();
        p.x = src.x + dx;
        p.y = src.y + dy;
        return p;
    }

    public static Direction backwardTask(Point src, Point dest) {
        double dx = dest.x - src.x;
        double dy = dest.y - src.y;
        Direction dir = new Direction();
        dir.distance = Math.sqrt(dx * dx + dy * dy);

        double rumb = Math.toDegrees(Math.atan(dy / dx));
        if (dx >= 0 && dy >= 0){
            dir.angle = rumb;
        } else if (dx < 0 && dy >= 0){
            dir.angle = 180 + rumb;
        } else if (dx < 0 && dy < 0){
            dir.angle = rumb + 180;
        } else {
            dir.angle = 360 + rumb;
        }
        return dir;
    }
}
