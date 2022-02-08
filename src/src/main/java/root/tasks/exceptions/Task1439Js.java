package root.tasks.exceptions;

import root.tasks.OneInputValLayout;

public class Task1439Js extends OneInputValLayout {
        @Override
        protected void makeLayout() {
            appendHeader();
            appendTaskDesc("<ol>\n" +
                    "<li>В папке с задачами создайте файл task1439.html.</li>\n" +
                    "<li>Создайте в нем одно поле для ввода, поле для вывода результата и кнопку.</li>\n" +
                    "<li>Решите описанную ниже задачу. Исходные данные пользователь вводит вручную.</li>\n" +
                    "</ol>" +
                    "<p>Пользователь вводит данные - целые числа, разделенные пробелами. Найти среднее арифметическое среди введенных чисел. Фрагменты строк не участвуют в подсчете количества элементов. Сообщить пользователю индекс и значение некорректных элементов.</p>");
            appendCheckValuesHeader("data");
            appendCheckValuesRow("9 8 7 6 5");
            appendCheckValuesRow("5 2 11 3 1 3 4 4 4 4");
            appendCheckValuesRow("9 q 8 w 7 e 6 r 5 t");
            appendCheckValuesRow("q w e r");
            appendCheckValuesRow("0 0 0 0");
            appendCheckValuesRow("");
            appendCheckValuesFooter();
            appendFooter();
        }

        @Override
        protected void logic(String value) {
            String[] arr = value.split(" ");
            double sum = 0;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                try {
                    sum += Integer.parseInt(arr[i]);
                    count++;
                } catch (NumberFormatException ex) {
                    System.out.println("Элемент №" + i + " со значением " + arr[i] + " не число");
                }
            }
            if (count > 0) {
                double result = sum / count;
                System.out.printf("%.4f", result);
            } else {
                System.out.println("В исходном массиве отсутствовали числа");
            }
        }

        public static void main(String[] args) {
            System.out.println(new root.tasks.exceptions.Task1439().getContent());
        }
    }
