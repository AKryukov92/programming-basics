package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task9711 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            return;
        }
        String[] arr = value.split(" ");
        String x = arr[arr.length - 1];
        int i = arr.length - 1;
        while(i > 0) {
            arr[i] = arr[i-1];
            i--;
        }
        arr[0] = x;
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - символы, разделенные пробелами. " +
                "Сдвинуть все элементы массива на 1 позицию вправо. " +
                "Последний элемент поставить в начало. " +
                "Обратите внимание, что в этой задаче нужно изменить содержимое массива, а не просто вывести в нужном порядке. ");
        appendCheckValuesHeader("data");
        //однажды при объяснении очень удачно получилось провести параллель массива с двумя элементами и задачи на перестановку двух элементов
        appendCheckValuesRow("first second");
        appendCheckValuesRow("q w e r t y");
        appendCheckValuesRow("a s d f g h j k l m");
        appendCheckValuesRow("zx cv bn m");
        appendCheckValuesRow("single");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task9711().getContent());
    }
}
