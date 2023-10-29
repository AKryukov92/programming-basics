package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task8428 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskHeader();
        appendTaskDescNonEscaped("Перевести угол из градусов в радианы по формуле: <formula>angleRadian=angleDegree*&pi;/180</formula>, где angleDegree - угол в градусах(degrees), angleRadian - угол в радианах. <a href=\"https://ru.wikipedia.org/wiki/%D0%A0%D0%B0%D0%B4%D0%B8%D0%B0%D0%BD\" target=\"_blank\">Радиан</a> - угол, соответствующий дуге, длина которой равна её радиусу. Единица измерения плоских углов в Международной системе единиц (СИ). Команда для вычисления результата выглядит так:");
        appendCheckSingleNonEscaped("angleRadian = angleDegree * Math.PI / 180;");
        appendTaskDescNonEscaped("Выражение <zoom>Math.PI</zoom> обозначает &pi;. Его значение сохранено в переменной из стандартной библиотеке языка.");
        appendCheckValuesHeader("angleDegree", "angleRadian");
        appendCheckValuesRow("45");
        appendCheckValuesRow("1125");
        appendCheckValuesRow("0");
        appendCheckValuesRow("360");
        appendCheckValuesRow("90");
        appendCheckValuesRow("2000");
        appendCheckValuesFooter();
        appendTaskDescEscaped("В языке поддерживается следующие операторы для чисел:");
        appendOrderedNonEscaped(
                "<zoom>*</zoom> Умножение",
                "<zoom>/</zoom> Деление",
                "<zoom>+</zoom> Арифметическое сложение. Для строк этот оператор выполняет конкатенацию (склеивание).",
                "<zoom>-</zoom> Вычитание",
                "<zoom>%</zoom> Остаток от деления. Этот оператор будет рассмотрен позже."
        );
        appendTaskDescNonEscaped("В арифметических выражениях можно использовать круглые скобки <zoom>()</zoom>. Они работают как в математике - сначала вычисляется выражение внутри скобок, а затем все остальное.");
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double angleDegree = Double.parseDouble(value);
        double angleRadian = angleDegree * Math.PI / 180;
        System.out.printf("%.0f градусов это %.4f радиан", angleDegree, angleRadian);
    }
}
