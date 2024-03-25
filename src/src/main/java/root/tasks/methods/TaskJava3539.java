package root.tasks.methods;

import java.sql.SQLException;

public class TaskJava3539 extends TaskCs3539 {
    @Override
    protected void logic(String value) throws SQLException {
        double[] data = new double[]{4, 2, 3, 4, 3, 2};
        double[] result = Library.task3539(data);
        System.out.println("Исходный массив:");
        int i = 0;
        while (i < data.length) {
            System.out.print(data[i] + " ");
            i += 1;
        }
        System.out.println("\nРезультат обработки:");
        i = 0;
        while (i < result.length) {
            System.out.print(result[i] + " ");
            i += 1;
        }
    }
}
