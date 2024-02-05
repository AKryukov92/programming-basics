package root.tasks.methods;

import java.sql.SQLException;

public class TaskJava2936 extends TaskCs2936 {

    @Override
    protected void logic(String value) throws SQLException {
        double[] data, result;
        data = new double[]{9, 8, 7, 6, 5, 4};
        result = Library.task2936(31, data);
        System.out.print("При умножении массива '");
        int i = 0;
        while (i < data.length) {
            System.out.print(data[i] + "  ");
            i++;
        }
        System.out.print("на число 31, получился массив ");
        i = 0;
        while (i < result.length) {
            System.out.print(result[i] + "  ");
            i++;
        }
    }
}
