package root.tasks.calculations;

import root.tasks.TwoInputValLayout;

public class Task7243 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        int small = Integer.parseInt(firstValue);
        int large = Integer.parseInt(secondValue);
        if (small < 0 || 5 < small) {
            System.out.println("Фактическое количество жидкости в маленькой емкости должно быть от 0 до 5 литров включительно");
            return;
        }
        if (large < 0 || 8 < large){
            System.out.println("Фактическое количество жидкости в большой емкости должно быть от 0 до 8 литров включительно");
            return;
        }
        int newLarge;
        int newSmall;
        int deficit = 8 - large;
        if (small > deficit) {
            newLarge = 8;
            newSmall = small - deficit;
        } else {
            newLarge = large + small;
            newSmall = 0;
        }
        System.out.printf("Было: в маленькой %d из 5, в большой %d из 8\n", small, large);
        System.out.printf("Стало: в маленькой %d из 5, в большой %d из 8", newSmall, newLarge);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Даны две ёмкости объемом 5 и 8 литров. Пользователь вводит два целых числа - фактическое количество воды в них. Определить, сколько воды получится в этих ёмкостях при переливании из маленькой в большую. Переливание происходит \"до краев\". Излишки остаются в маленькой ёмкости. Ответ оформить по шаблону:");
        appendCheckSingle("Было в маленькой $small из 5, в большой $large из 8\n" +
                "Стало в маленькой $resultSmall из 5, в большой $resultLarge из 8");
        appendCheckValuesHeader("small", "large");
        appendCheckValuesRow("5", "8");
        appendCheckValuesRow("0", "0");
        appendCheckValuesRow("5","0");
        appendCheckValuesRow("5", "1");
        appendCheckValuesRow("5", "3");
        appendCheckValuesRow("5", "4");
        appendCheckValuesRow("4", "5");
        appendCheckValuesRow("3", "7");
        appendCheckValuesRow("-1", "2");
        appendCheckValuesRow("20", "3");
        appendCheckValuesRow("1", "-4");
        appendCheckValuesRow("2", "19");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7243().getContent());
    }
}
