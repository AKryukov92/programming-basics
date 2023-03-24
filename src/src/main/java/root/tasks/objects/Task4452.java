package root.tasks.objects;

import root.tasks.LayoutMaker;

public class Task4452 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте класс по описанию");
        appendOrdered(
                ""
        );
        appendSubheading("Реализуйте дополнительные ограничения");
        appendOrdered(
                "У программиста, использующего класс не должно быть возможности записать в поле cent некорректное значение",
                ""
        );
        //какие способы доступа к полям класса существуют?
        //Money balance = new Money();
        //прямой balance.cent = x;
        //через конструктор new Money(euro, x)
        //через сеттер balance.setCent(x)
        appendFooter();
    }

    private static class Money {
        int euro, cent;
    }
}
