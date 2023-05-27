package root.tasks.search_in_array;

import root.tasks.TwoInputValLayout;

public class Task5894 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два массива данных. Сравнить содержимое двух массивов и посчитать количество элементов, присутствующих в обоих массивах.");
        appendCheckValuesHeader("red", "green");
        appendCheckValuesRow("qw fg hj ty kl", "qw er ty qw op");
        appendCheckValuesRow("q a z", "q w e");
        appendCheckValuesRow("oiuy hjkl vbmn", "asdf ghjk");
        appendCheckValuesRow("y", "y y y y y y y");
        appendCheckValuesRow("l l l l l l l l", "l");
        appendCheckValuesRow("a s d f", "");
        appendCheckValuesRow("", "zxc vbn");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String redRaw, String greenRaw) {
        if (redRaw.isEmpty()) {
            System.out.println("Данные в красном массиве отсутствуют");
            return;
        }
        if (greenRaw.isEmpty()) {
            System.out.println("Данные в зеленом массиве отсутствуют");
            return;
        }
        int count = 0;
        String[] redArr = redRaw.split(" ");
        String[] greenArr = greenRaw.split(" ");
        for (int i = 0; i < redArr.length; i++) {
            System.out.println("Проверяю элемент красного массива на индексе " + i + " со значением " + redArr[i]);
            int countOfItem = 0;
            for (int j = 0; j < greenArr.length; j++) {
                if (redArr[i].equals(greenArr[j])) {
                    countOfItem++;
                }
            }
            System.out.println("Этот элемент встретился " + countOfItem + " раз в зеленом массиве");
            count = count + countOfItem;
            System.out.println("Предварительное количество повторений " + count);
        }
        System.out.println("Итоговое количество повторений " + count);
    }

    public static void main(String[] args) {
        System.out.println(new Task5894());
    }
}
