package lab17;

import java.math.BigDecimal;

/**
 * @author akryukov
 *         20.07.2017
 */
public class Product {
    private String id;
    private String description;
    private String productGroupId;
    private String unitId;
    private BigDecimal weight;
    private BigDecimal cost;
    private int quantity;

    public Product(String id, String description, String productGroupId, String unitId, BigDecimal weight, BigDecimal cost, int quantity) {
        this.id = id;
        this.description = description;
        this.productGroupId = productGroupId;
        this.unitId = unitId;
        this.weight = weight;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getProductGroupId() {
        return productGroupId;
    }

    public String getUnitId() {
        return unitId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }
}
