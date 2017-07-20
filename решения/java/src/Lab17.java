import lab17.Client;
import lab17.DataMapper;
import lab17.Product;
import lab17.View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

/**
 * @author akryukov
 *         20.07.2017
 */
public class Lab17 {

    public static void main(String[] args) {
        String address = "jdbc:postgresql://127.0.0.1:5432/business";
        String name = "business";
        String password = "business";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Не удалось загрузить драйвер");
            return;
        }
        DataMapper mapper = new DataMapper();
        View view = new View();

        try (Connection connection = DriverManager.getConnection(address, name, password);
             Statement statement = connection.createStatement()
        ){
            Step1(mapper, view, statement);
            Step2(mapper, view, statement);
            Step3(mapper, view, statement);
            Step4(mapper, view, statement);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Step1(DataMapper mapper, View view, Statement statement) throws SQLException {
        Map<String, Client> clientData = mapper.fillClientData(statement);
        view.setClientData(clientData);

        System.out.println("<h2>Избранные клиенты</h2>");
        view.printClientData("900ee4da-4b2c-4b54-a3b6-6ab01c1ccdee");
        view.printClientData("f20464cb-2c6b-4f8d-b1dd-3cef77ea2e35");
    }

    public static void Step2(DataMapper mapper, View view, Statement statement) throws SQLException {
        view.setProductData(mapper.fillProductData(statement));

        System.out.println();
        System.out.println("<h2>Избранные товары</h2>");
        view.printProductData("459b52b6-2fcf-431c-b9a0-344d47c3430d");
        view.printProductData("9ab18218-9692-413d-a489-f8857966a437");
        view.printProductData("4911b1d6-a1ae-45a2-8f51-3051d7338351");
    }

    public static void Step3(DataMapper mapper, View view, Statement statement) throws SQLException {
        view.setProductData(mapper.fillProductData(statement));
        Map<String, String> productGroups = mapper.fillGroupData(statement);

        System.out.println();
        System.out.println("<h2>Избранные товары (с указанием группы)</h2>");
        view.printProductData("e7b27ac5-aa37-41ef-89f4-9c3e8372f8ff", productGroups);
        view.printProductData("d1123ce9-7531-4579-8272-6af7bb767a78", productGroups);
    }

    public static void Step4(DataMapper mapper, View view, Statement statement) throws SQLException {
        view.setProductData(mapper.fillProductData(statement));
        Map<String, String> productGroups = mapper.fillGroupData(statement);

        System.out.println();
        System.out.println("<h2>Товары по группам</h2>");
        view.printProductData(productGroups);
    }
}
