package lab17;

import java.util.List;
import java.util.Map;

/**
 * @author akryukov
 *         20.07.2017
 */
public class View {
    private Map<String, Client> clientData;
    private Map<String, Product> productData;
    private Map<String, List<Order>> orderData;

    public void setClientData(Map<String, Client> clientData) {
        this.clientData = clientData;
    }

    public void setProductData(Map<String, Product> productMap) {
        this.productData = productMap;
    }

    public void setOrderData(Map<String, List<Order>> orderData) {
        this.orderData = orderData;
    }

    public void printClientData(String clientId){
        Client client = clientData.get(clientId);
        System.out.println("<h3>" + client.getName() + "</h3>");
        System.out.println("<div>Расчетный счет: " + client.getCheckingAccount() + "</div>");
        System.out.println("<div>ИНН: " + client.getInn() + "</div>");
    }

    public void printProductData(String productId){
        Product product = productData.get(productId);
        System.out.println("<h3>" + product.getDescription() + "</h3>");
        System.out.println("<div>Цена:" + product.getCost() + "</div>");
        System.out.println("<div>Масса:" + product.getWeight() + "</div>");
        System.out.println("<div>Остаток на складе:" + product.getQuantity() + "</div>");
    }

    public void printProductData(String productId, Map<String, String> productGroupsData){
        Product product = productData.get(productId);
        System.out.println("<h3>" + product.getDescription() + "</h3>");
        System.out.println("<div>Группа товара: " + productGroupsData.get(product.getProductGroupId()) + "</div>");
        System.out.println("<div>Цена:" + product.getCost() + "</div>");
        System.out.println("<div>Масса:" + product.getWeight() + "</div>");
        System.out.println("<div>Остаток на складе:" + product.getQuantity() + "</div>");
    }

    public void printProductData(Map<String, String> productGroupsData){
        for (Map.Entry<String, String> groupEntry : productGroupsData.entrySet()){
            System.out.println("<h3>" + groupEntry.getValue() + "</h3>");
            System.out.println("<ul>");
            int count = 0;
            for(Map.Entry<String, Product> productEntry : productData.entrySet()){
                if(productEntry.getValue().getProductGroupId().equals(groupEntry.getKey())){
                    System.out.println("<li>" + productEntry.getValue().getDescription() + "</li>");
                    count++;
                }
            }
            System.out.println("</ul>");
            System.out.println("<div>" + count + " наименований</div>");
        }
    }

    public void printEmployeesByPosition(Map<String, List<Employee>> employeesByPosition, Map<String, String> positionsById){
        for (Map.Entry<String, String> positionEntry : positionsById.entrySet()){
            List<Employee> employeeList = employeesByPosition.get(positionEntry.getKey());
            System.out.println("<h3>" + positionEntry.getValue() + "</h3>");
            System.out.println("<ul>");
            for (Employee employee : employeeList){
                System.out.println("<li>" + employee.getLastName() + " " + employee.getFirstName() + "</li>");
            }
            System.out.println("</ul>");
        }
    }

    public void printOpenClientOrders(){
        printClientOrders(false);
    }

    public void printClosedClientOrders(){
        printClientOrders(true);
    }

    public void printClientOrders(boolean closed){
        for (Map.Entry<String, Client> clientEntry : clientData.entrySet()){
            Client client = clientEntry.getValue();
            System.out.println("<h3>" + client.getName() + "</h3>");
            System.out.println("<div>Расчетный счет: " + client.getCheckingAccount() + "</div>");
            System.out.println("<div>ИНН: " + client.getInn() + "</div>");
            System.out.println("<div>Заказы:");
            System.out.println("<ul>");
            List<Order> orders = orderData.get(client.getId());
            for (Order order : orders){
                Product product = productData.get(order.getProductId());
                if(order.isFinished() == closed) {
                    System.out.println("<li>" + product.getDescription() + " в количестве " + order.getQuantity() + " единиц на дату " + order.getDate() + "</li>");
                }
            }
            System.out.println("</ul>");
            System.out.println("</div>");
        }
    }

    public void printEmployeesOrders(List<Employee> employees, Map<String, List<Order>> ordersByEmployee, Map<String, String> positionsById){
        for (Employee employee : employees){
            System.out.println("<h3>" + employee.getLastName() + " " + employee.getFirstName() + "</h3>");
            System.out.println("<p>" + positionsById.get(employee.getPosition()) + "</p>");
            if (ordersByEmployee.containsKey(employee.getId())) {
                List<Order> orderList = ordersByEmployee.get(employee.getId());
                System.out.println("<ul>");
                for (Order order : orderList) {
                    Product product = productData.get(order.getProductId());
                    System.out.print("<li>");
                    if(order.isFinished()){
                        System.out.print("(закрыт) ");
                    }
                    System.out.print(product.getDescription() + " в количестве " + order.getQuantity() + " единиц на дату " + order.getDate());
                    Client client = clientData.get(order.getClientId());
                    System.out.print(". Заказчик - " + client.getName());
                    System.out.println("</li>");
                }
                System.out.println("</ul>");
            }
        }
    }
}
