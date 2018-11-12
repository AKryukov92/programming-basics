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
}
