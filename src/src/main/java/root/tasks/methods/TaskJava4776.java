package root.tasks.methods;

public class TaskJava4776 extends TaskCs4776 {
    protected static class Library {
        public static double task4776(double angleDegree) {
            double angleRadian = angleDegree * Math.PI / 180;
            return Math.cos(angleRadian);
        }
    }
    @Override
    protected void logic(String value) {
        double result;
        result = Library.task4776(69.97);
        System.out.printf("%.4f\n", result);
        //для наглядности проверки можно писать дополнительные условия
        if (0.3425 <= result && result <= 0.3426) {
            System.out.println("Верно");
        } else {
            System.out.println("Результат некорректный");
        }
        result = Library.task4776(31);
        System.out.printf("%.4f\n", result);
        System.out.printf("%.4f\n", Library.task4776(90));
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava4776());
    }
}
