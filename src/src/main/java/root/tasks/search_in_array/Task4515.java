package root.tasks.search_in_array;

import root.tasks.OneInputValLayout;

public class Task4515 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        String[] arr = value.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Повторения есть");
                    return;
                }
            }
        }
        System.out.println("Повторений нет");
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - символы, разделенные пробелами. Проверить, есть ли среди введенных символов повторения.");
        appendCheckValuesHeader("N", "sum");
        appendCheckValuesRow("q w e r");
        appendCheckValuesRow("q w q r");
        appendCheckValuesRow("q w e q");
        appendCheckValuesRow("q w e w");
        appendCheckValuesRow("r r r r");
        appendCheckValuesRow("a b c d q w e r");
        appendCheckValuesFooter();
        appendFooter();
    }
}
