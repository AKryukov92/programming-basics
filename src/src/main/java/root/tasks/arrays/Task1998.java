package root.tasks.arrays;

import root.tasks.ThreeInputValLayout;

import java.io.PrintStream;

public class Task1998 extends ThreeInputValLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - символы, разделенные символом \" \", одну отдельную строку append и число a." +
                " Нужно вставить указанную строку в массив, заменив существующее содержимое." +
                " Если число a больше размера массива, то нужно создать новый массив." +
                " Размер нового массива должен быть такой, чтобы число a было последним индексом." +
                " Содержимое старого массива нужно переписать на те же позиции." +
                " Все недостающие элементы заполнить строкой \"empty\"." +
                " Вывести элементы полученного массива по возрастанию индекса.");
        appendCheckValuesHeader("arr", "append", "a");
        appendCheckValuesRow("qa ws ed rf", "initial", "0");
        appendCheckValuesRow("qa ws ed rf", "third", "2");
        appendCheckValuesRow("qa ws ed rf", "fourth", "3");
        appendCheckValuesRow("qa ws ed rf", "fifth", "4");
        appendCheckValuesRow("qa ws ed rf", "sixth", "5");
        appendCheckValuesRow("a s d f g h j", "###", "3");
        appendCheckValuesRow("a s d f g h j", "###", "0");
        appendCheckValuesRow("a s d f g h j", "###", "6");
        appendCheckValuesRow("a s d f g h j", "###", "15");
        appendCheckValuesRow("", "irrelevant", "100");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue, String thirdValue) {
        if (firstValue.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = firstValue.split(" ");
        String str = secondValue;
        int a = Integer.parseInt(thirdValue);
        if (a < arr.length) {
            arr[a] = str;
            int i = 0;
            while (i < arr.length) {
                System.out.print(arr[i] + " ");
                i++;
            }
        } else {
            String[] result = new String[a + 1];
            int i = 0;
            while (i < arr.length) {
                result[i] = arr[i];
                i++;
            }
            while (i < a) {
                result[i] = "empty";
                i++;
            }
            result[a] = str;
            i = 0;
            while (i < result.length) {
                System.out.print(result[i] + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1998().getContent());
    }
}
