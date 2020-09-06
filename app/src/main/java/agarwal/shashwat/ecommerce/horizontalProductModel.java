package agarwal.shashwat.ecommerce;

public class horizontalProductModel {
    private String productImage,productName,productQuantity,productPrice;

    public horizontalProductModel() {
    }

    public horizontalProductModel(String productImage, String productName, String productQuantity, String productPrice) {
        this.productImage = productImage;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public String getProductPrice() {
        return productPrice;
    }
}
