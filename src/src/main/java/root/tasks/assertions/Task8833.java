package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task8833 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskDesc("При разработке программы мы первым делаем реализуем основную логику, а потом проверки." +
                " Но в коде проверка исходных данных обычно располагается в начале, сразу после получения исходных данных и перед основной логикой.");
        appendSubheading("Общий план работы программы");
        appendOrdered(
                "Получить исходные данные.",
                "Проверить корректность исходных данных и сообщить об ошибке.",
                "Если данные корректны, то выполнить полезные действия.",
                "Сообщить пользователю результат."
        );
        appendHeader();
        appendNonEscaped("Вычислить результат по формуле <formula><sqrt><val>x</val></sqrt></formula>");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("7606");
        appendCheckValuesRow("9");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-7603");
        appendCheckValuesRow("-1");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double x = Double.parseDouble(value);
        if (x < 0) {
            System.out.println("Значение X должно быть неотрицательным");
        }
        if (x >= 0) {
            double result = Math.sqrt(x);
            System.out.printf("Корень из %.4f равен %.4f", x, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8833());
    }
}
