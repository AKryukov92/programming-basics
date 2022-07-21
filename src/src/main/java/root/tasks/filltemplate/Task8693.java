package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class Task8693 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран текст наименьшим количеством строк кода. Примените конкатенацию строк и команду записи значения в переменную (присвоение ей значения). Обратите внимание на строку \"Лягнувшая старого пса без хвоста\".");
        appendCheckSingle(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String a = "Который построил Джек.\n";
        String b = "Которая в тёмном чулане хранится\n";
        String c = "В доме,\n";
        String d = "Которая часто ворует пшеницу,\n";
        String e = "Который пугает и ловит синицу,\n";
        String f = "Который за шиворот треплет кота,\n";
        String g = "Которая доит корову безрогую,\n" +
                "Лягнувшую старого пса без хвоста,\n";
        String h = "Который бранится с коровницей строгою,\n";
        String i = "Которые будят того пастуха,\n";
        System.out.println("Самуил Маршак. Дом, который построил Джек.");
        System.out.println();
        System.out.println("Вот дом,");
        System.out.print(a);
        System.out.println();
        System.out.println("А это пшеница,");
        System.out.println(b + c + a);
        System.out.println("А это весёлая птица-синица,\n" + d + b + c + a);
        System.out.println("Вот кот,\n" + e + d + b + c + a);
        System.out.println("Вот пёс без хвоста,\n" + f + e + d + b + c + a);
        System.out.println("А это корова безрогая,\n" +
                "Лягнувшая старого пса без хвоста,\n" + f + e + d + b + c + a);
        System.out.println("А это старушка, седая и строгая,\n" + g + f + e + d + b + c + a);
        System.out.println("А это ленивый и толстый пастух,\n" + h + g + f + e + d + b + c + a);
        System.out.println("Вот два петуха,\n" + i + h + g + f + e + d + b + c + a);
    }

    public static void main(String[] args) {
        System.out.println(new Task8693());
    }
}
