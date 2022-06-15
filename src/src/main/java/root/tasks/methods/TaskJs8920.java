package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class TaskJs8920 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] arr = secondValue.split(" ");
        System.out.println(task4283(firstValue, arr));
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте функцию для решения задачи <a href=\"#task4283\" target=\"_blank\">4283(открыть в новой вкладке)</a>");
        appendOrdered(
                "В файле для исходного кода реализуйте функцию task4283.",
                "В качестве аргументов ей будут передавать 1 строковое значение и массив строковых значений.",
                "В теле функции нужно вернуть результат решения задачи, используя значения аргументов в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "Создайте юнит-тест для проверки задачи и подпишите его словами \"в задаче 4283 должен получиться корректный результат\".",
                "В теле юнит-теста нужно 4 раза вызвать функцию task4283. При каждом вызове в качестве аргументов нужно передавать значения из разных тестов, описанных в задаче.",
                "Корректность результатов каждого вызова функции task4283 нужно проверить с помощью функции expect в сочетании с функцией toBeCloseTo. Для этой задачи достаточно точности в 4 знака после запятой.",
                "При открытии файла SpecRunner.html, в нем должна быть зеленая строка \"в задаче 4283 должен получиться корректный результат\"."
        );
        appendFooter();
    }

    private int task4283(String k, String[] arr) {
        int count = 0;
        for (String element : arr) {
            if (element.equals(k)) {
                count++;
            }
        }
        return count;
    }
}
