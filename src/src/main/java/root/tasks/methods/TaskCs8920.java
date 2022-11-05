package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class TaskCs8920 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] arr = secondValue.split(" ");
        System.out.println(task4283(firstValue, arr));
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(4283));
        appendOrdered(
                "В классе Methods реализуйте публичный статический метод Task4283.",
                "Он принимает в качестве аргументов 1 строковое значение и массив строковых значений. Метод возвращает целое число.",
                "В теле метода верните результат решения задачи, используя значения аргументов в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "В классе TestSuite создайте юнит-тест для проверки задачи Task4283.",
                "В теле юнит-теста 4 раза вызовите статический метод Task4283 класса Methods. При каждом вызове в качестве аргументов нужно передавать значения из разных тестов, описанных в задаче.",
                "Корректность результатов каждого вызова метода Task4283 проверьте с помощью статического метода AreEqual класса Assert.",
                "После запуска юнит-теста, он должен быть отмечен зеленым знаком в списке методов."
        );
        appendFooter();
    }

    private int task4283(String k, String[] arr) {
        int count = 0;
        for(String element: arr) {
            if (element.equals(k)) {
                count++;
            }
        }
        return count;
    }
}
