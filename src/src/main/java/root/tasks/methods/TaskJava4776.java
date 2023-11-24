package root.tasks.methods;

public class TaskJava4776 extends TaskCs4776 {
    @Override
    protected void logic(String value) {
        double result;
        result = TaskCs4776.Library.task4776(69.97);
        System.out.printf("%.4f\n", result);
        //для наглядности проверки можно писать дополнительные условия
        if (0.9395 <= result && result <= 0.9396) {
            System.out.println("Верно");
        } else {
            System.out.println("Результат некорректный");
        }
        result = TaskCs4776.Library.task4776(31);
        System.out.printf("%.4f\n", result);
        System.out.printf("%.4f\n", TaskCs4776.Library.task4776(90));
    }
}
