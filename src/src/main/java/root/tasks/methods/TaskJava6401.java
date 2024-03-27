package root.tasks.methods;

import root.Console;

import java.sql.SQLException;

public class TaskJava6401 extends TaskCs6401 {
    @Override
    protected void logic(String value) throws SQLException {
        double a = -2, b = 7;
        boolean result;
        double x = -10;
        result = Library.Task6401(a, b, x);
        if (result) {
            System.out.println(x + " принадлежит интервалу");
        } else {
            System.out.println(x + " за пределами интервала");
        }
        result = Library.Task6401(b, a, x);
        if (result) {
            System.out.println(x + " принадлежит интервалу");
        } else {
            System.out.println(x + " за пределами интервала");
        }
        x = 0;
        if (Library.Task6401(-2, 7, x)) {
            System.out.println(x + " принадлежит интервалу");
        } else {
            System.out.println(x + " за пределами интервала");
        }

        if (Library.Task6401(7, -2, x)) {
            System.out.println(x + " принадлежит интервалу");
        } else {
            System.out.println(x + " за пределами интервала");
        }
        System.out.println(Library.Task6401(-2, 7, 15));
        System.out.println(Library.Task6401(-2, 7, 4));
    }
}
