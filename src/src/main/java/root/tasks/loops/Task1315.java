package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task1315 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int i = 1;
        System.out.println("Предисловие");
        while (i <= 7) {
            System.out.println("Глава " + i);
            i++;
        }
        System.out.println("Послесловие");
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран в столбик все целые числа от 1 до 7 включительно. В начале программы должно появиться слово \"Предисловие\", а после всех чисел - слово \"Послесловие\". Перед каждым числом нужно написать слово \"Глава\".");
        appendCheckSingle(wrapLogic("7"));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task1315().getContent());
    }
}
