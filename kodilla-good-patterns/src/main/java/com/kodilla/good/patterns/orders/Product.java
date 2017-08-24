package com.kodilla.good.patterns.orders;

public class Product {
    private final String productName;
    private final String productCategory;
    private final double productPrice;
    private final boolean productAvailability;

    public Product(final String productName, final String productCategory, final double productPrice, final boolean productAvailability) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productAvailability = productAvailability;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public boolean isProductAvailability() {
        return productAvailability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.productPrice, productPrice) != 0) return false;
        if (productAvailability != product.productAvailability) return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        return productCategory != null ? productCategory.equals(product.productCategory) : product.productCategory == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productName != null ? productName.hashCode() : 0;
        result = 31 * result + (productCategory != null ? productCategory.hashCode() : 0);
        temp = Double.doubleToLongBits(productPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (productAvailability ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productPrice=" + productPrice +
                ", productAvailability=" + productAvailability +
                '}';
    }
}
