package lab17;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author akryukov
 *         19.07.2017
 */
public class DataMapper {
    public Map<String, Client> fillClientData(Statement statement) throws SQLException {
        Map<String, Client> map = new HashMap<>();
        String query =
            "SELECT" +
            " id" +
            ", checking_account" +
            ", inn" +
            ", name" +
            " FROM clients";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            String id = resultSet.getString("id");
            String checkingAccount = resultSet.getString("checking_account");
            String inn = resultSet.getString("inn");
            String name = resultSet.getString("name");
            Client client = new Client(id, checkingAccount, inn, name);
            map.put(id, client);
        }
        return map;
    }

    public Map<String, Product> fillProductData(Statement statement) throws SQLException {
        Map<String, Product> map = new HashMap<>();
        String query =
            "SELECT" +
            " id" +
            ", description" +
            ", product_group_id" +
            ", unit_id" +
            ", weight" +
            ", cost" +
            ", quantity" +
            " FROM products";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            String id = resultSet.getString("id");
            String description = resultSet.getString("description");
            String groupId = resultSet.getString("product_group_id");
            String unitId = resultSet.getString("unit_id");
            BigDecimal weight = resultSet.getBigDecimal("weight");
            BigDecimal cost = resultSet.getBigDecimal("cost");
            int quantity = resultSet.getInt("quantity");
            Product product = new Product(id, description, groupId, unitId, weight, cost, quantity);
            map.put(id, product);
        }
        return map;
    }

    public Map<String, String> fillGroupData(Statement statement) throws SQLException {
        Map<String, String> map = new HashMap<>();
        String query =
            "SELECT" +
            " id" +
            ", name" +
            " FROM product_groups";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            map.put(id, name);
        }
        return map;
    }
}
