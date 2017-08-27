package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public abstract class Supplier {

    private String supplierName;
    private String supplierEmail;
    private Map<Product, Integer> products = new HashMap<>();

    public abstract void process();

    public abstract boolean isOrderSucceed();

    public void informacionAboutDelivery(){
        System.out.println("Zapakowano");
        System.out.println("Wysłano");
        System.out.println("Dostarczone");
    }


    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }
}
