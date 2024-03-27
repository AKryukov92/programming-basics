package root.tasks.methods;

import java.sql.SQLException;

public class TaskJava7581 extends TaskCs7581 {
    @Override
    protected void logic(String value) throws SQLException {
        String[] arr = "a;s;d;f".split(";");
        boolean result = Library.Task7581(arr);
        System.out.println(result);
        arr = new String[]{"z", "x", "c", "v", "x"};
        System.out.println(Library.Task7581(arr));
        result = Library.Task7581("zx;df;ty;jk".split(";"));
        System.out.println(result);
        System.out.println(
                Library.Task7581(
                        "q;a;z;w;s;x;e;d;c".split(";")
                )
        );
        System.out.println(Library.Task7581(new String[0]));
    }
}
