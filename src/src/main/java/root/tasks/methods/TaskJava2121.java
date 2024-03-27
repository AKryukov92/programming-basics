package root.tasks.methods;

import java.sql.SQLException;

public class TaskJava2121 extends TaskCs2121 {

    @Override
    protected void logic(String value) throws SQLException {
        int p = 0, q = 7;
        boolean result = Library.Task2121(p, q);
        System.out.println(result);
        System.out.println(Library.Task2121(14, 9));
        System.out.println(Library.Task2121(5, 5));
    }
}
