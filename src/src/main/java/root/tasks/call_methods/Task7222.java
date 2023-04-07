package root.tasks.call_methods;

import root.tasks.OneInputValLayout;

public class Task7222 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит цифры штрих кода в стандарте EAN-13. Расшифровать значение штрих кода. Номер товара EAN-13 имеет следующую структуру:");
        appendOrdered(
                "первые 3 цифры — это префикс или код национальной организации-члена EAN International (для EAN Россия – 460-469);",
                "следующие 6 цифр — это регистрационный номер предприятия — изготовителя;",
                "следующая группа из 3-х цифр — это порядковый номер продукции внутри предприятия;",
                "последняя 13-я цифра — контрольное число. Оно вычисляется из предыдущих двенадцати."
        );
        appendCheckValuesHeader("ean");
        appendCheckValuesRow("4607009520018");
        appendCheckValuesRow("9785750200641");
        appendCheckValuesRow("9785964300694");
        appendCheckValuesRow("123456789012");
        appendCheckValuesRow("12345678901234567890");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String code) {
        if (code.length() != 13) {
            System.out.println("Некорректная длина штрих-кода");
        } else {
            String country = code.substring(0, 3);
            String manufacturer = code.substring(3, 9);
            String product = code.substring(9, 12);
            String checksum = code.substring(12);
            System.out.println("Код страны: " + country);
            System.out.println("Код изготовителя: " + manufacturer);
            System.out.println("Код товара: " + product);
            System.out.println("Контрольное число: " + checksum);
        }
    }
}