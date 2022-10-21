package root.tasks.search;

import root.tasks.OneInputValLayout;

public class Task7703 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("");
        appendCheckValuesHeader("source");
        appendCheckValuesRow("q w e w q w");
        appendCheckValuesRow("q w e r q w e r q w e");
        appendCheckValuesRow("e w w w w w");
        appendCheckValuesRow("");
        appendCheckValuesRow("r r r r r r");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Отсутствуют исходные данные");
        } else {
            String[] arr = value.split(" ");
            int[] num = new int[arr.length];
            int i = 0;
            while (i < arr.length) {
                String elementToCount = arr[i];
                int count = 0;
                int j = 0;
                while (j < arr.length) {
                    if (arr[j].equals(elementToCount)) {
                        count++;
                    }
                    j++;
                }
                num[i] = count;
                i++;
            }
            i = 0;
            while(i < num.length) {
                System.out.print(num[i] + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7703());
    }
}
