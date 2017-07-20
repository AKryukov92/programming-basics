package lab17;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author akryukov
 *         19.07.2017
 */
public class DataMapper {
    public Map<String, Client> loadClientData(Statement statement) throws SQLException {
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

    public Map<String, Product> loadProductData(Statement statement) throws SQLException {
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

    public Map<String, String> loadGroupData(Statement statement) throws SQLException {
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

    private static String LIST_ORDERS_QUERY = "SELECT" +
        " id" +
        ", order_date" +
        ", product_id" +
        ", quantity" +
        ", client_id" +
        ", employee_id" +
        ", finished" +
        " FROM orders";

    public Order mapOrder(ResultSet resultSet) throws SQLException {
        String id = resultSet.getString("id");
        String orderDate = resultSet.getString("order_date");
        String productId = resultSet.getString("product_id");
        int quantity = resultSet.getInt("quantity");
        String clientId = resultSet.getString("client_id");
        String employeeId = resultSet.getString("employee_id");
        boolean finished = resultSet.getBoolean("finished");
        return new Order(id, orderDate, productId, quantity, clientId, employeeId, finished);
    }

    public Map<String, List<Order>> loadOrdersByClientData(Statement statement) throws SQLException {
        Map<String, List<Order>> map = new HashMap<>();
        ResultSet resultSet = statement.executeQuery(LIST_ORDERS_QUERY);
        while(resultSet.next()){
           Order order = mapOrder(resultSet);
           String clientId = order.getClientId();
            if (map.containsKey(clientId)){
                List<Order> orders = map.get(clientId);
                orders.add(order);
            } else {
                List<Order> orders = new ArrayList<>();
                orders.add(order);
                map.put(clientId, orders);
            }
        }
        return map;
    }

    public Map<String, String> loadPositionsData(Statement statement) throws SQLException {
        Map<String, String> map = new HashMap<>();
        String query = "SELECT id, name FROM positions";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            map.put(id, name);
        }
        return map;
    }

    private static String LIST_EMPLOYEE_QUERY = "SELECT" +
        " id" +
        ", last_name" +
        ", first_name" +
        ", father_name" +
        ", gender" +
        ", birth_date" +
        ", marriage" +
        ", postal_index" +
        ", address" +
        ", position" +
        ", hire_type" +
        ", notes" +
        " FROM employees";

    public Map<String, List<Employee>> loadEmployeeDataByPosition(Statement statement) throws SQLException {
        Map<String, List<Employee>> map = new HashMap<>();
        ResultSet resultSet = statement.executeQuery(LIST_EMPLOYEE_QUERY);
        while(resultSet.next()){
            Employee employee = mapEmployee(resultSet);
            String position = employee.getPosition();
            if (map.containsKey(position)){
                List<Employee> employees = map.get(position);
                employees.add(employee);
            } else {
                List<Employee> employees = new ArrayList<>();
                employees.add(employee);
                map.put(position, employees);
            }
        }
        return map;
    }

    private Employee mapEmployee(ResultSet resultSet) throws SQLException {
        String id = resultSet.getString("id");
        String lastName = resultSet.getString("last_name");
        String firstName = resultSet.getString("first_name");
        String fatherName = resultSet.getString("father_name");
        String gender = resultSet.getString("gender");
        String birthDate = resultSet.getString("birth_date");
        boolean marriage = resultSet.getBoolean("marriage");
        String postalIndex = resultSet.getString("postal_index");
        String address = resultSet.getString("address");
        String position = resultSet.getString("position");
        String hireType = resultSet.getString("hire_type");
        String notes = resultSet.getString("notes");
        return new Employee(id, lastName, firstName, fatherName, gender, birthDate, marriage, postalIndex, address, position, hireType, notes);
    }

    public List<Employee> loadEmployeeList(Statement statement) throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery(LIST_EMPLOYEE_QUERY);
        while(resultSet.next()) {
            employeeList.add(mapEmployee(resultSet));
        }
        return employeeList;
    }

    public Map<String, List<Order>> loadOrdersDataByEmployee(Statement statement) throws SQLException {
        Map<String, List<Order>> map = new HashMap<>();
        ResultSet resultSet = statement.executeQuery(LIST_ORDERS_QUERY);
        while(resultSet.next()){
            Order order = mapOrder(resultSet);
            String employeeId = order.getEmployeeId();
            if (map.containsKey(employeeId)){
                List<Order> orders = map.get(employeeId);
                orders.add(order);
            } else {
                List<Order> orders = new ArrayList<>();
                orders.add(order);
                map.put(employeeId, orders);
            }
        }
        return map;
    }
}
