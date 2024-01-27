package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskJava2312 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("В файле содержатся три строки. Первая строка содержит адрес сервера (host). Вторая - имя пользователя (user). Третья - пароль (pass). Нужно прочитать эти данные и сформировать строку подключения JDBC по шаблону:");
        appendCheckSingleNonEscaped("postgresql://$USER:$PASS@$HOST:5432/dvdrental");
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
        appendTaskDescNonEscaped("Скорее всего, эта команда вызовет ошибку компиляции:");
        appendCheckSingleNonEscaped("java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown");
        appendTaskDescNonEscaped("Это значит, что нужно обработать исключение. Эта тема будет разобрана позже. Сейчас добавьте выражение \"throws FileNotFoundException\" таким образом:");
        appendCheckSingleNonEscaped("public static void main(String[] args) throws FileNotFoundException {");
        appendTaskDescNonEscaped("Это выражение указывает на то, что программа должна упасть с технической ошибкой при попытке открыть файл, если на самом деле файла нет. Ошибка выглядит так:");
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
                "}\n");
        appendTaskDescEscaped("В конце работы программы файлы нужно закрывать. Для этого нужно вызвать команду:");
        appendCheckSingleNonEscaped("fileReader.close();");
        appendTaskDescEscaped("Обратите внимание, что программа может закончиться как при выполнении всех действий, так и при вызове команды \"return;\". Добавьте закрытие файла во все варианты завершения программы.");
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
            System.out.printf("postgresql://%s:%s@%s:5432/dvdrental", username, password, host);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava2312());
    }
}
