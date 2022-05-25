package root.tasks.filltemplate;

import root.tasks.MultipleInputValLayout;

public class Task4343 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        String user = args[0];
        String pass = args[1];
        String host = args[2];
        String port = args[3];
        String db = args[4];
        System.out.printf("User ID=%s;Password=%s;Host=%s;Port=%s;Database=%s;",
                user, pass, host, port, db);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями.");
        appendCheckSingle("User ID=$USER;Password=$PASS;Host=$HOST;Port=$PORT;Database=$DB;");
        appendCheckValuesHeader("user", "pass", "host", "port", "db");
        appendCheckValuesRow("test", "pass", "localhost", "5432", "my_db");
        appendCheckValuesRow("admin", "7e8efd48d69c", "production-node1", "5432", "bank");
        appendCheckValuesRow("akryukov", "123", "localhost", "dev-node1", "bank");
        appendCheckValuesFooter();
        appendFooter();
    }
}
