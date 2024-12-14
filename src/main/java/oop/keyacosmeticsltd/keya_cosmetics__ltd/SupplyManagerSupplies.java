package oop.keyacosmeticsltd.keya_cosmetics__ltd;

public class SupplyManagerSupplies {
    private String category, productName;
    private int deliveryTime, unitprice, supplyRating;

    public SupplyManagerSupplies(String category, String productName, int deliveryTime, int unitprice, int supplyRating) {
        this.category = category;
        this.productName = productName;
        this.deliveryTime = deliveryTime;
        this.unitprice = unitprice;
        this.supplyRating = supplyRating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(int unitprice) {
        this.unitprice = unitprice;
    }

    public int getSupplyRating() {
        return supplyRating;
    }

    public void setSupplyRating(int supplyRating) {
        this.supplyRating = supplyRating;
    }
}
