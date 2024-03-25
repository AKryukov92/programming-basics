package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava9479 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит идентификатор клиента (customerId). Нужно вывести на экран, сколько времени проходило между датами его чеков.");
        appendCheckValuesHeader("customerId");
        appendCheckValuesRow("59");
        appendCheckValuesRow("27");
        appendCheckValuesRow("2");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String customerId) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        PreparedStatement selectInvoices = connection.prepareStatement("select invoiceDate from invoices where customerId = ? order by invoiceDate asc;");
        selectInvoices.setString(1, customerId);
        ResultSet resInvoices = selectInvoices.executeQuery();
        if (resInvoices.next()) {
            Date prev = resInvoices.getDate("invoiceDate");
            long prevTs = prev.getTime();
            while (resInvoices.next()) {
                Date cur = resInvoices.getDate("invoiceDate");
                long curTs = cur.getTime();
                long diff = curTs - prevTs;
                long diffHours = diff / 3600000;
                System.out.println("Разница между " + prev + " и " + cur + " равна " + diff + " миллисекунд (" + diffHours + " часов)");
                prevTs = curTs;
                prev = cur;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava9479());
    }
}
