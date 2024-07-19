package root.tasks.methods;

import root.tasks.OneInputValLayout;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Task1991 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дан массив, содержащий названия глав. Сформируйте оглавление. Каждый пункт оформить по шаблону \"Глава $i $name\", где i - номер главы, name - название соответствующей главы. Нумерация глав должна начинаться с 1.");
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод task1991.",
                "Метод принимает массив строк как аргумент и возвращает строку.",
                "В теле метода нельзя использовать команды вывода в консоль."
        );
        appendCheckValuesHeader("data");
        appendCheckValuesRow("Заполнение шаблона текстом,Организация вычислений,Проверка исходных данных,Взаимоисключающие случаи,Работа с интервалами значений,Реорганизация повторяющихся действий,Вложенные циклы,Массивы,Вычисление агрегатов,Строки,Обработка неизвестного объема данных,Запись в файлы,Методы,Исключения,Классы и объекты,Коллекции");
        appendCheckValuesRow("Печать текста на экране,Диктант по присваиванию,Получение строк от пользователя,Оформление текста по шаблону,Сокращение повторений в тексте");
        appendCheckValuesRow("");
        appendCheckValuesRow("введение,завязка,кульминация,развязка,заключение");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException, FileNotFoundException {
        System.out.println(Library.task1991(value.split(",")));
    }

    static class Library {
        public static String task1991(String[] data) {
            String result = "Оглавление:";
            int i = 1;
            while (i <= data.length) {
                result += "Глава " + i + " " + data[i - 1] + "\n";
                i++;
            }
            return result;
        }
    }
}
