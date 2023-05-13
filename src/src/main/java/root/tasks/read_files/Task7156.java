package root.tasks.read_files;

import root.tasks.TwoInputValLayout;

public class Task7156 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Космический торговец. В директории содержатся файлы, описывающие цены на покупку и продажу различных товаров. Пользователь вводит две строки - названия планет. Нужно вывести какие товары выгодно приобрести на первой введенной планете и продать на второй.");
        appendOrderedNonEscaped(

        );
        appendCheckValuesRow("", "");
        //appendCheckValuesRow();

        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {

    }
}
