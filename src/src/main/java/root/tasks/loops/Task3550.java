package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task3550 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int v = Integer.parseInt(value);
        System.out.println("Таблица умножения на " + v);
        int i = 1;
        while(i <= 9){
            System.out.printf("%d x %d = %d\n", i, v, i*v);
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число V." +
                " Вывести на экран таблицу умножения чисел от 1 до 9 включительно на V." +
                " В начале программы вывести сообщение по шаблону \"Таблица умножения на $V\"." +
                " Каждую следующую строчку оформить по шаблону \"$i x $v = $p\"," +
                " где i - число от 1 до 9," +
                " p - результат умножения V на i.");
        appendCheckValuesHeader("V");
        appendCheckValuesRow("2");
        appendCheckValuesRow("3");
        appendCheckValuesRow("-13");
        appendCheckValuesRow("0");
        appendCheckValuesRow("7");
        appendCheckValuesRow("11");
        appendCheckValuesRow("1027");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task3550().getContent());
    }
}
