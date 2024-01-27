package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskJava2312 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("В файле содержатся три строки значений. Первая строка содержит адрес сервера (host). Вторая - имя пользователя (user). Третья - пароль (pass). Нужно прочитать эти данные и сформировать строку подключения ODBC по шаблону:");
        appendCheckSingleNonEscaped("User ID=$USER;Password=$PASS;Host=$HOST;Port=5432;Database=dvdrental;");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task2312/config1.cfg");
        appendCheckValuesRowWithFile("files/task2312/config2.cfg");
        appendCheckValuesRowWithFile("files/task2312/config3.cfg");
        appendCheckValuesRowWithFile("files/task2312/config4.cfg");
        appendCheckValuesRowWithFile("files/task2312/config5.cfg");
        appendCheckValuesRowWithFile("files/task2312/config6.cfg");
        appendCheckValuesFooter();
        appendTaskDescNonEscaped("Для того чтобы читать файл, нужно создать экземпляр класса File. В скобочках вместо path нужно подставить строковый литерал с адресом файла в файловой системе. Это может быть абсолютный \"C:/temp/files/task2312/config1.cfg\" или относительный путь \"./files/task2312/config1.cfg\". Относительный путь может выглядеть иначе в зависимости от расположения вашего проекта с решениями задач.");
        appendCheckSingleNonEscaped("File file = new File(path);");
        appendTaskDescNonEscaped("Чтение файла выполняется с помощью экземпляра класса Scanner. Слово file в скобочках это переменная, содержащая экземпляр класса File. В этот момент происходит открытие файла. Для чтения консоли у вас в такой команде было написано \"System.in\".");
        appendCheckSingleNonEscaped("Scanner fileReader = new Scanner(file);");
        appendTaskDescNonEscaped("Если на самом деле файла нет, то при попытке его открыть, программа упадет с ошибкой");
        appendCheckSingleNonEscaped("Exception in thread \"main\" java.io.FileNotFoundException: D:\\tfa\\src\\files\\task2312\\config3.cfg (Не удается найти указанный файл)\n" +
                "\tat java.io.FileInputStream.open0(Native Method)\n" +
                "\tat java.io.FileInputStream.open(FileInputStream.java:195)\n" +
                "\tat java.io.FileInputStream.<init>(FileInputStream.java:138)\n" +
                "\tat java.util.Scanner.<init>(Scanner.java:611)");
        appendTaskDescNonEscaped("Эту ошибку обычно не допускают и пишут сообщение об ошибке \"файл не найден\". Для этого проверьте условие \"file.exists()\" с помощью ветвления (if). Если это условие ложно, значит файл отсутствует. Если истинно - значит файл присутствует и его можно читать.");
        appendCheckSingleNonEscaped("if (!file.exists()) {//если файл не существует\n" +
                "    System.out.println(\"Файл не найден \" + file.getAbsolutePath());\n" +
                "}\n" +
                "if (file.exists()) {//если файл присутствует\n"+
        "   //действия по чтению файла\n" +
                "}");
        appendTaskDescNonEscaped("Выражение \"file.getAbsolutePath()\" нужно чтобы получить точный абсолютный путь к файлу. Это актуально в случае указания относительного пути и нужно чтобы понимать какой файл программа на самом деле попыталась открыть.");
        appendTaskDescNonEscaped("Чтение файла выполняется командой \"fileReader.nextLine()\". Это та же самая команда, что и для чтения данных из консоли. Файл это непредсказуемое хранилище данных. Он может присутствовать в файловой системе, но при этом не содержать данных. При попытке прочитать пустой файл, возникнет ошибка:");
        appendCheckSingleNonEscaped("Exception in thread \"main\" java.util.NoSuchElementException: No line found\n" +
                "\tat java.util.Scanner.nextLine(Scanner.java:1540)");
        appendTaskDescNonEscaped("Чтобы избежать этой проблемы, нужно написать ветвление. Условие \"fileReader.hasNext()\" будет истинно в случае если из файла можно прочитать данные с помощью \"fileReader.nextLine()\".");
        appendCheckSingleNonEscaped("if (!fileReader.hasNext()) {//если в файле нечего читать\n" +
                "    System.out.println(\"Адрес сервера не указан\");\n" +
                "}\n" +
                "if (fileReader.hasNext()) {//если в файле еще есть данные\n" +
                "    String host = fileReader.nextLine();//читаем строку из файла и записываем её в переменную host\n" +
                "}");
        appendTaskDescNonEscaped();
        appendFooter();
    }

    @Override
    protected void logic(String filename) {
        File file = new File(filename);
        System.out.println("Читаю конфигурацию из файла " + file.getAbsolutePath());
        if (!file.exists()) {
            System.out.println("Файл не найден " + file.getAbsolutePath());
            return;
        }
        try {
            Scanner fileReader = new Scanner(file);
            if (!fileReader.hasNext()) {
                System.out.println("Адрес сервера не указан");
                return;
            }
            String host = fileReader.nextLine();
            if (!fileReader.hasNext()) {
                System.out.println("Имя пользователя не указано");
                return;
            }
            String username = fileReader.nextLine();
            if (!fileReader.hasNext()) {
                System.out.println("Пароль не указан");
                return;
            }
            String password = fileReader.nextLine();
            System.out.printf("User ID=%s;Password=%s;Host=%s;Port=5432;Database=dvdrental;", username, password, host);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava2312());
    }
}
