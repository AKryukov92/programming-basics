package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class Task1860 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendNonEscaped("Конкатенация. <a href='https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%BD%D0%BA%D0%B0%D1%82%D0%B5%D0%BD%D0%B0%D1%86%D0%B8%D1%8F#%D0%92_%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B5'>из Википедии</a> Конкатена́ция (лат. concatenatio «присоединение цепями; сцепле́ние») — операция склеивания объектов линейной структуры, обычно строк. Например, конкатенация слов «микро» и «мир» даст слово «микромир»." +
                " Вы можете конкатенировать (склеивать, соединять) значения переменных и строковые литералы. Это нужно для формирования больших фрагментов текста из множества маленьких." +
                " Обычно используется оператор '+', но это иногда приводит к путанице с операцией сложения чисел. Поэтому в некоторых языках программирования используют другие операторы. Например две точки '..' или две палочки '||'.");
        appendTaskHeader();
        appendTaskDesc("Составить программу вывода на экран слова (word), вводимого с клавиатуры. Перед выводимым словом нужно написать фразу \"Мы стремимся к \".");
        appendCheckValuesHeader("word");
        appendCheckValuesRow("знаниям");
        appendCheckValuesRow("цели");
        appendCheckValuesRow("результату");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        System.out.println("Мы стремимся к " + value);
    }
}
