using Npgsql;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.lab17
{
    public class DataMapper
    {
        public Dictionary<string, Client> LoadClientData(NpgsqlConnection connection)
        {
            Dictionary<String, Client> map = new Dictionary<string, Client>();
            String query =
                "SELECT" +
                " id" +
                ", checking_account" +
                ", inn" +
                ", name" +
                " FROM clients";
            NpgsqlCommand command = new NpgsqlCommand(query, connection);
            NpgsqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                String id = reader.GetString(0);
                String checkingAccount = reader.GetString(1);
                String inn = reader.GetString(2);
                String name = reader.GetString(3);
                Client client = new Client(id, checkingAccount, inn, name);
                map.Add(id, client);
            }
            reader.Close();
            return map;
        }

        public Dictionary<String, Product> LoadProductData(NpgsqlConnection connection)
        {
            Dictionary<String, Product> map = new Dictionary<string, Product>();
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
            NpgsqlCommand command = new NpgsqlCommand(query, connection);
            NpgsqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                String id = reader.GetString(0);
                String description = reader.GetString(1);
                String groupId = reader.GetString(2);
                String unitId = reader.GetString(3);
                Decimal weight = reader.IsDBNull(4) ? 0 : reader.GetDecimal(4);
                Decimal cost = reader.GetDecimal(5);
                int quantity = reader.GetInt32(6);
                Product product = new Product(id, description, groupId, unitId, weight, cost, quantity);
                map.Add(id, product);
            }
            reader.Close();
            return map;
        }

        public Dictionary<String, String> LoadGroupData(NpgsqlConnection connection)
        {
            Dictionary<String, String> map = new Dictionary<string, string>();
            String query =
                "SELECT" +
                " id" +
                ", name" +
                " FROM product_groups";
            NpgsqlCommand command = new NpgsqlCommand(query, connection);
            NpgsqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                String id = reader.GetString(0);
                String name = reader.GetString(1);
                map.Add(id, name);
            }
            reader.Close();
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

        public Order MapOrder(NpgsqlDataReader reader)
        {
            String id = reader.GetString(0);
            DateTime orderDate = reader.GetDateTime(1);
            String productId = reader.GetString(2);
            int quantity = reader.GetInt32(3);
            String clientId = reader.GetString(4);
            String employeeId = reader.GetString(5);
            bool isFinished = reader.GetBoolean(6);
            return new Order(id, orderDate.ToString(), productId, quantity, clientId, employeeId, isFinished);
        }

        public Dictionary<String, List<Order>> LoadOrdersByClientData(NpgsqlConnection connection)
        {
            Dictionary<String, List<Order>> map = new Dictionary<string, List<Order>>();
            NpgsqlCommand command = new NpgsqlCommand(LIST_ORDERS_QUERY, connection);
            NpgsqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                Order order = MapOrder(reader);
                if (map.ContainsKey(order.ClientId))
                {
                    List<Order> orders = map[order.ClientId];
                    orders.Add(order);
                }
                else
                {
                    List<Order> orders = new List<Order>();
                    orders.Add(order);
                    map.Add(order.ClientId, orders);
                }
            }
            reader.Close();
            return map;
        }

        public Dictionary<String, String> LoadPositionsData(NpgsqlConnection connection)
        {
            Dictionary<String, String> map = new Dictionary<string, string>();
            String query = "SELECT id, name FROM positions";
            NpgsqlCommand command = new NpgsqlCommand(query, connection);
            NpgsqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                String id = reader.GetString(0);
                String name = reader.GetString(1);
                map.Add(id, name);
            }
            reader.Close();
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

        public Dictionary<String, List<Employee>> LoadEmployeeDataByPosition(NpgsqlConnection connection)
        {
            Dictionary<String, List<Employee>> map = new Dictionary<string, List<Employee>>();
            NpgsqlCommand command = new NpgsqlCommand(LIST_EMPLOYEE_QUERY, connection);
            NpgsqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                Employee employee = MapEmployee(reader);
                if (map.ContainsKey(employee.Position))
                {
                    List<Employee> employeeList = map[employee.Position];
                    employeeList.Add(employee);
                }
                else
                {
                    List<Employee> employees = new List<Employee>();
                    employees.Add(employee);
                    map.Add(employee.Position, employees);
                }
            }
            reader.Close();
            return map;
        }

        public Employee MapEmployee(NpgsqlDataReader reader)
        {
            String id = reader.GetString(0);
            String lastName = reader.GetString(1);
            String firstName = reader.GetString(2);
            String fatherName = reader.GetString(3);
            String gender = reader.GetString(4);
            DateTime birthDate = reader.GetDateTime(5);
            Boolean marriage = reader.GetBoolean(6);
            String postalIndex = reader.GetString(7);
            String address = reader.GetString(8);
            String position = reader.GetString(9);
            String hiretype = reader.GetString(10);
            String notes = reader.GetString(11);
            return new Employee(id, lastName, firstName, fatherName, gender, birthDate.ToString(),
                marriage, postalIndex, address, position, hiretype, notes);
        }

        public List<Employee> LoadEmployeeList(NpgsqlConnection connection)
        {
            List<Employee> employeeList = new List<Employee>();
            NpgsqlCommand command = new NpgsqlCommand(LIST_EMPLOYEE_QUERY, connection);
            NpgsqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                reader.Read();
                employeeList.Add(MapEmployee(reader));
            }
            reader.Close();
            return employeeList;
        }

        public Dictionary<String, List<Order>> LoadOrdersDataByEmployee(NpgsqlConnection connection)
        {
            Dictionary<String, List<Order>> map = new Dictionary<string, List<Order>>();
            NpgsqlCommand command = new NpgsqlCommand(LIST_ORDERS_QUERY, connection);
            NpgsqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                Order order = MapOrder(reader);
                if (map.ContainsKey(order.EmployeeId))
                {
                    List<Order> orders = map[order.EmployeeId];
                    orders.Add(order);
                }
                else
                {
                    List<Order> orders = new List<Order>();
                    orders.Add(order);
                    map.Add(order.EmployeeId, orders);
                }
            }
            reader.Close();
            return map;
        }
    }
}
