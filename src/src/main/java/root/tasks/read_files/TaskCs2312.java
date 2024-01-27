package root.tasks.read_files;

import root.tasks.OneInputValLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskCs2312 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("В файле содержатся три строки. Первая строка содержит адрес сервера (host). Вторая - имя пользователя (user). Третья - пароль (pass). Нужно прочитать эти данные и сформировать строку подключения ODBC по шаблону:");
        appendCheckSingleNonEscaped("User ID=$USER;Password=$PASS;Host=$HOST;Port=5432;Database=dvdrental;");
        appendCheckValuesHeader("filename");
        appendCheckValuesRowWithFile("files/task2312/config1.cfg");
        appendCheckValuesRowWithFile("files/task2312/config2.cfg");
        appendCheckValuesRowWithFile("files/task2312/config3.cfg");
        appendCheckValuesRowWithFile("files/task2312/config4.cfg");
        appendCheckValuesRowWithFile("files/task2312/config5.cfg");
        appendCheckValuesRowWithFile("files/task2312/config6.cfg");
        appendCheckValuesFooter();
        appendTaskDescNonEscaped("Для того чтобы читать файл, нужно создать экземпляр класса StreamReader. В скобочках вместо path нужно подставить строковый литерал с адресом файла в файловой системе. Это может быть абсолютный \"C:/temp/files/task2312/config1.cfg\" или относительный путь \"./files/task2312/config1.cfg\". Относительный путь может выглядеть иначе в зависимости от расположения вашего проекта с решениями задач.");
        appendCheckSingleNonEscaped("StreamReader reader = new StreamReader(path);");
        appendTaskDescNonEscaped("В этот момент происходит открытие файла. Если на самом деле файла нет, то при попытке его открыть, программа упадет с ошибкой");
        appendCheckSingleNonEscaped("Необработанное исключение: System.IO.FileNotFoundException: Файл 'D:\\tfa\\src\\files\\task2312\\config12.cfg' не найден.\n" +
                "   в System.IO.__Error.WinIOError(Int32 errorCode, String maybeFullPath)\n" +
                "   в System.IO.FileStream.Init(String path, FileMode mode, FileAccess access, Int32 rights, Boolean useRights, FileShare share, Int32 bufferSize, FileOptions options, SECURITY_ATTRIBUTES secAttrs, String msgPath, Boolean bFromProxy, Boolean useLongPath, Boolean checkHost)\n" +
                "   в System.IO.FileStream..ctor(String path, FileMode mode, FileAccess access, FileShare share, Int32 bufferSize, FileOptions options, String msgPath, Boolean bFromProxy, Boolean useLongPath, Boolean checkHost)\n" +
                "   в System.IO.StreamReader..ctor(String path, Encoding encoding, Boolean detectEncodingFromByteOrderMarks, Int32 bufferSize, Boolean checkHost)\n" +
                "   в System.IO.StreamReader..ctor(String path)");
        appendTaskDescNonEscaped("Эту ошибку обычно не допускают и пишут сообщение об ошибке \"файл не найден\". Для этого проверьте условие \"File.Exists(path)\" с помощью ветвления (if). Если это условие ложно, значит файл не существует. Если истинно - значит файл присутствует и его можно читать.");
        appendCheckSingleNonEscaped("if (!File.Exists(path)) {//если файл не существует\n" +
                "    Console.WriteLine(\"Файл не найден \" + Path.GetFullPath(path));\n" +
                "}\n" +
                "if (File.Exists(path)) {//если файл присутствует\n" +
                "   //действия по чтению файла\n" +
                "}");
        appendTaskDescNonEscaped("Выражение \"Path.GetFullPath(path)\" нужно чтобы получить точный абсолютный путь к файлу. Это актуально в случае указания относительного пути и нужно чтобы понимать какой файл программа на самом деле попыталась открыть.");
        appendTaskDescNonEscaped("Чтение файла выполняется командой \"reader.ReadLine()\". Это та же самая команда, что и для чтения данных из консоли. Файл это непредсказуемое хранилище данных. Он может присутствовать в файловой системе, но при этом не содержать данных. При чтении пустого файла, команда reader.ReadLine() вернет значение null. Оно не является строкой. Чтобы быть уверенным, что команда сможет прочитать данные из файла, нужно написать ветвление. Условие \"reader.EndOfStream\" будет истинно в случае если чтение файла подошло к концу или файл был изначально пуст.");
        appendCheckSingleNonEscaped("if (reader.EndOfStream) {//если в файле нечего читать\n" +
                "    Console.WriteLine(\"Адрес сервера не указан\");\n" +
                "}\n" +
                "if (!reader.EndOfStream) {//если в файле еще есть данные\n" +
                "    String host = reader.ReadLine();//читаем строку из файла и записываем её в переменную host\n" +
                "}\n");
        appendTaskDescEscaped("В конце работы программы файлы нужно закрывать. Для этого нужно вызвать команду:");
        appendCheckSingleNonEscaped("reader.Close();");
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
            System.out.printf("User ID=%s;Password=%s;Host=%s;Port=5432;Database=dvdrental;", username, password, host);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs2312());
    }
}
