using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Npgsql;
using Classes.lab17;


namespace lab17
{
    class Lab17Caller
    {
        static void Main(string[] args)
        {
            String host = "localhost";
            String username = "business";
            String password = "business";
            String dbname = "business";
            String connString = String.Format("Host={0};Port=5432;Database={1};Username={2};Password={3}",
                host,
                dbname,
                username,
                password);

            DataMapper dataMapper = new DataMapper();
            View view = new View();
            using (NpgsqlConnection connection = new NpgsqlConnection(connString))
            {
                connection.Open();
                try
                {
                    Step1(dataMapper, view, connection);
                    Step2(dataMapper, view, connection);
                    Step3(dataMapper, view, connection);
                    Step4(dataMapper, view, connection);
                    Step5(dataMapper, view, connection);
                    Step6(dataMapper, view, connection);
                    Step7(dataMapper, view, connection);
                    Step8(dataMapper, view, connection);
                }
                catch (NpgsqlException ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }

        public static void Step1(DataMapper mapper, View view, NpgsqlConnection connection)
        {
            Dictionary<String, Client> clientData = mapper.LoadClientData(connection);
            view.ClientData = clientData;

            Console.WriteLine("<h2>Избранные клиенты</h2>");
            view.PrintClientData("900ee4da-4b2c-4b54-a3b6-6ab01c1ccdee");
            view.PrintClientData("f20464cb-2c6b-4f8d-b1dd-3cef77ea2e35");
        }


        public static void Step2(DataMapper mapper, View view, NpgsqlConnection connection)
        {
            view.ProductData = mapper.LoadProductData(connection);

            Console.WriteLine();
            Console.WriteLine("<h2>Избранные товары</h2>");
            view.PrintProductData("459b52b6-2fcf-431c-b9a0-344d47c3430d");
            view.PrintProductData("9ab18218-9692-413d-a489-f8857966a437");
            view.PrintProductData("4911b1d6-a1ae-45a2-8f51-3051d7338351");
        }

        public static void Step3(DataMapper mapper, View view, NpgsqlConnection connection)
        {
            view.ProductData = mapper.LoadProductData(connection);
            Dictionary<String, String> productGroups = mapper.LoadGroupData(connection);

            Console.WriteLine();
            Console.WriteLine("<h2>Избранные товары (с указанием группы)</h2>");
            view.PrintProductData("e7b27ac5-aa37-41ef-89f4-9c3e8372f8ff", productGroups);
            view.PrintProductData("d1123ce9-7531-4579-8272-6af7bb767a78", productGroups);
        }

        public static void Step4(DataMapper mapper, View view, NpgsqlConnection connection)
        {
            view.ProductData = mapper.LoadProductData(connection);
            Dictionary<String, String> productGroups = mapper.LoadGroupData(connection);

            Console.WriteLine();
            Console.WriteLine("<h2>Товары по группам</h2>");
            view.PrintProductData(productGroups);
        }

        public static void Step5(DataMapper mapper, View view, NpgsqlConnection connection)
        {
            Dictionary<String, List<Employee>> employeesByPosition = mapper.LoadEmployeeDataByPosition(connection);
            Console.WriteLine();
            Console.WriteLine("<h2>Сотрудники каждой должности</h2>");
            view.PrintEmployeesByPosition(employeesByPosition, mapper.LoadPositionsData(connection));
        }

        public static void Step6(DataMapper mapper, View view, NpgsqlConnection connection)
        {
            view.ClientData = mapper.LoadClientData(connection);
            view.ProductData = mapper.LoadProductData(connection);
            view.OrdersData = mapper.LoadOrdersByClientData(connection);

            Console.WriteLine();
            Console.WriteLine("<h2>Открытые заказы по клиентам</h2>");
            view.PrintOpenClientOrders();
        }

        public static void Step7(DataMapper mapper, View view, NpgsqlConnection connection)
        {
            view.ClientData = mapper.LoadClientData(connection);
            view.ProductData = mapper.LoadProductData(connection);
            view.OrdersData = mapper.LoadOrdersByClientData(connection);

            Console.WriteLine();
            Console.WriteLine("<h2>Закрытые заказы по клиентам</h2>");
            view.PrintClosedClientOrders();
        }

        public static void Step8(DataMapper mapper, View view, NpgsqlConnection connection)
        {
            view.ClientData = mapper.LoadClientData(connection);
            List<Employee> employeeList = mapper.LoadEmployeeList(connection);
            Console.WriteLine();
            Console.WriteLine("<h2>Заказы по сотрудникам</h2>");
            view.PrintEmployeesOrders(employeeList, mapper.LoadOrdersDataByEmployee(connection), mapper.LoadPositionsData(connection));
        }

    }
}
