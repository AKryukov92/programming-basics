package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task7339 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Конкатенация. <a href='https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%BD%D0%BA%D0%B0%D1%82%D0%B5%D0%BD%D0%B0%D1%86%D0%B8%D1%8F#%D0%92_%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B5'>из Википедии</a> Конкатена́ция (лат. concatenatio «присоединение цепями; сцепле́ние») — операция склеивания объектов линейной структуры, обычно строк. Например, конкатенация слов «микро» и «мир» даст слово «микромир»." +
                " Это нужно для формирования больших фрагментов текста из множества маленьких." +
                " Чтобы конкатенировать литералы \"микро\" и \"мир\", напишите в исходном коде между ними знак +");
        appendCheckSingleNonEscaped("print(\"микро\" + \"мир\")");
        appendTaskDescEscaped("В результате получится:");
        appendCheckSingleNonEscaped("микромир");
        appendTaskDescEscaped("Напишите еще несколько слов с применением конкатенации:");
        appendCheckSingleNonEscaped("синезеленый\nвысокоскоростной\nотказоустойчивый\nау");
        appendFooter();
    }
}
