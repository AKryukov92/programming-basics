package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

public class Task9361 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        //разделитель точку нельзя, т.к. в split это будет значить "любая буква", а это ненужная сложность сейчас
        appendTaskDescEscaped("Пользователь вводит две даты в формате dd_MM_yyyy, где yyyy - четыре цифры года, MM - две цифры месяца, dd - две цифры дня. Нужно определить, какая из дат больше: первая или вторая.");
        appendCheckValuesHeader("firstDate", "secondDate");
        appendCheckValuesRow("11_03_1685", "05_03_1685");
        appendCheckValuesRow("07_02_1986", "02_07_1986");
        appendCheckValuesRow("11_01_1804", "11_02_1804");
        appendCheckValuesRow("07_07_2003", "07_07_1993");
        appendCheckValuesRow("29_01_1785", "29_03_1777");
        appendCheckValuesRow("01_01_1970", "01_01_1970");
        appendCheckValuesRow("04_28_1502", "01_02_2023");
        appendCheckValuesRow("01_02_2023", "07_15_1934");
        appendCheckValuesRow("01_02", "01_02_2023");
        appendCheckValuesRow("01_02_2023", "01_02");
        appendCheckValuesRow("4", "01_02_2023");
        appendCheckValuesRow("01_02_2023", "14");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] arr = firstValue.split("_");
        if (arr.length != 3) {
            System.out.println("Дата должна состоять из трех фрагментов");
            return;
        }
        int firstDay = Integer.parseInt(arr[0]);
        int firstMonth = Integer.parseInt(arr[1]);
        if (firstMonth > 12) {
            System.out.println("Месяц должен быть меньше 12");
            return;
        }
        int firstYear = Integer.parseInt(arr[2]);

        arr = secondValue.split("_");
        if (arr.length != 3) {
            System.out.println("Дата должна состоять из трех фрагментов");
            return;
        }
        int secondDay = Integer.parseInt(arr[0]);
        int secondMonth = Integer.parseInt(arr[1]);
        if (secondMonth > 12) {
            System.out.println("Месяц должен быть меньше 12");
            return;
        }
        int secondYear = Integer.parseInt(arr[2]);

        if (firstYear > secondYear) {
            System.out.println("Первая дата " + firstValue + " больше второй " + secondValue);
        } else if (firstYear < secondYear) {
            System.out.println("Вторая дата " + secondValue + " больше первой " + firstValue);
        } else {
            if (firstMonth > secondMonth) {
                System.out.println("Первая дата " + firstValue + " больше второй " + secondValue);
            } else if (firstMonth < secondMonth) {
                System.out.println("Вторая дата " + secondValue + " больше первой " + firstValue);
            } else {
                if (firstDay > secondDay) {
                    System.out.println("Первая дата " + firstValue + " больше второй " + secondValue);
                } else if (firstDay < secondDay) {
                    System.out.println("Вторая дата " + secondValue + " больше первой " + firstValue);
                } else {
                    System.out.println("Даты равны");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9361());
    }
}
