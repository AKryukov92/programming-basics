package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task8557 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            return;
        }
        String[] arr = value.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Глава " + (i+1) + " " + arr[i]);
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - названия глав, разделенные запятыми. Вывести содержание. Каждый пункт оформить по шаблону \"Глава $i $name\", где i - номер главы, name - название соответствующей главы. Нумерация глав должна начинаться с 1.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("Заполнение шаблона текстом,Организация вычислений,Проверка исходных данных,Взаимоисключающие случаи,Работа с интервалами значений,Реорганизация повторяющихся действий,Вложенные циклы,Массивы,Вычисление агрегатов,Строки,Обработка неизвестного объема данных,Запись в файлы,Методы,Исключения,Классы и объекты,Коллекции");
        appendCheckValuesRow("Печать текста на экране,Диктант по присваиванию,Получение строк от пользователя,Оформление текста по шаблону,Сокращение повторений в тексте");
        appendCheckValuesRow("введение,завязка,кульминация,развязка,заключение");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task8557().getContent());
    }
}
