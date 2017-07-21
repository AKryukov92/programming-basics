using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.lab17
{
    public class View
    {
        public Dictionary<String, Client> ClientData { set; get; }
        public Dictionary<String, Product> ProductData { set; get; }
        public Dictionary<String, List<Order>> OrdersData { set; get; }

        public void PrintClientData(String clientId)
        {
            Client client = ClientData[clientId];
            Console.WriteLine("<h3>" + client.Name + "</h3>");
            Console.WriteLine("<div>Расчетный счет:" + client.CheckingAccount + "</div>");
            Console.WriteLine("<div>ИНН:" + client.Inn + "</div>");
        }

        public void PrintProductData(String productId){
            Product product = ProductData[productId];
            Console.WriteLine("<h3>" + product.Description + "</h3>");
            Console.WriteLine("<div>Цена:" + product.Cost + "</div>");
            Console.WriteLine("<div>Масса:" + product.Weight + "</div>");
            Console.WriteLine("<div>Остаток на складе:" + product.Quantity + "</div>");
        }

        public void PrintProductData(String productId, Dictionary<String, String> productGroupsData)
        {
            Product product = ProductData[productId];
            Console.WriteLine("<h3>" + product.Description + "</h3>");
            Console.WriteLine("<div>Группа товара: " + productGroupsData[product.ProductGroupId] + "</div>");
            Console.WriteLine("<div>Цена:" + product.Cost + "</div>");
            Console.WriteLine("<div>Масса:" + product.Weight + "</div>");
            Console.WriteLine("<div>Остаток на складе:" + product.Quantity + "</div>");
        }

        public void PrintProductData(Dictionary<String, String> productGroupsData)
        {
            foreach (var groupKey in productGroupsData.Keys)
            {
                Console.WriteLine("<h3." + productGroupsData[groupKey] + "</h3>");
                Console.WriteLine("<ul>");
                int count = 0;
                foreach (var productKey in ProductData.Keys)
                {
                    Product product = ProductData[productKey];
                    if (product.ProductGroupId == groupKey)
                    {
                        Console.WriteLine("<li>" + product.Description + "</li>");
                        count++;
                    }
                }
                Console.WriteLine("</ul>");
                Console.WriteLine("<div>" + count + " наименований</div>");
            }
        }

        public void PrintEmployeesByPosition(Dictionary<String, List<Employee>> emplyeesByPosition, Dictionary<String, String> positionsByid)
        {
            foreach (var positionId in positionsByid.Keys)
            {
                List<Employee> list = emplyeesByPosition[positionId];
                Console.WriteLine("<h3>" + positionsByid[positionId] + "</h3>");
                Console.WriteLine("<ul>");
                foreach (var employee in list)
                {
                    Console.WriteLine("<li>" + employee.LastName + " " + employee.FirstName + "</li>");
                }
                Console.WriteLine("</ul>");
            }
        }

        public void PrintOpenClientOrders()
        {
            PrintClientOrders(false);
        }

        public void PrintClosedClientOrders()
        {
            PrintClientOrders(true);
        }

        public void PrintClientOrders(Boolean closed)
        {
            foreach (var clientId in ClientData.Keys)
            {
                Client client = ClientData[clientId];
                Console.WriteLine("<h3>" + client.Name + "</h3>");
                Console.WriteLine("<div>Расчетный счет: " + client.CheckingAccount + "</div>");
                Console.WriteLine("<div>ИНН: " + client.Inn + "</div>");
                Console.WriteLine("<div>Заказы: ");
                Console.WriteLine("<ul>");
                List<Order> orders = OrdersData[client.Id];
                foreach (var order in orders)
                {
                    Product product = ProductData[order.ProductId];
                    if (order.IsFinished == closed)
                    {
                        Console.WriteLine("<li>" + product.Description + " в количестве " + order.Quantity + " единиц на дату " + order.Date + "</li>");
                    }
                }
                Console.WriteLine("</ul>");
                Console.WriteLine("</div>");
            }
        }

        public void PrintEmployeesOrders(List<Employee> employees, Dictionary<String, List<Order>> ordersByEmployee, Dictionary<String, String> positionsById)
        {
            foreach (var employee in employees)
            {
                Console.WriteLine("<h3>" + employee.LastName + " " + employee.FirstName + "</h3>");
                Console.WriteLine("<p>" + positionsById[employee.Position] + "</p>");
                if (ordersByEmployee.ContainsKey(employee.Id))
                {
                    List<Order> orderList = ordersByEmployee[employee.Id];
                    Console.WriteLine("<ul>");
                    foreach (var order in orderList)
                    {
                        Product product = ProductData[order.ProductId];
                        Console.Write("<li>");
                        if(order.IsFinished){
                            Console.Write("(закрыт)");
                        }
                        Console.Write(product.Description + " в количестве " + order.Quantity + " единиц на дату " + order.Date);
                        Client client = ClientData[order.ClientId];
                        Console.WriteLine(". Заказчик - " + client.Name);
                        Console.WriteLine("</li>");
                    }
                    Console.WriteLine("</ul>");
                }
            }
        }
    }
}
