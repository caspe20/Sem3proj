package com.example.Sem3proj.business.machine;

public class ProductType {
    private final int productID;
    private final String productName;
    private final double optimalSpeed;

    public ProductType(int productID, String productName, double optimalSpeed) {
        this.productID = productID;
        this.productName = productName;
        this.optimalSpeed = optimalSpeed;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getOptimalSpeed() {
        return optimalSpeed;
    }
}
