package lab17;

import java.util.Map;

/**
 * @author akryukov
 *         20.07.2017
 */
public class View {
    private Map<String, Client> clientData;
    private Map<String, Product> productData;

    public void setClientData(Map<String, Client> clientData) {
        this.clientData = clientData;
    }

    public void setProductData(Map<String, Product> productMap) {
        this.productData = productMap;
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
}
