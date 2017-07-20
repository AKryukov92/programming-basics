package lab17;

/**
 * Created by Александр on 20.07.2017.
 */
public class Order {
    private String id;
    private String date;
    private String productId;
    private int quantity;
    private String clientId;
    private String employeeId;
    private boolean finished;

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getClientId() {
        return clientId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public boolean isFinished() {
        return finished;
    }

    public Order(String id, String date, String productId, int quantity, String clientId, String employeeId, boolean finished) {

        this.id = id;
        this.date = date;
        this.productId = productId;
        this.quantity = quantity;
        this.clientId = clientId;
        this.employeeId = employeeId;
        this.finished = finished;
    }
}
