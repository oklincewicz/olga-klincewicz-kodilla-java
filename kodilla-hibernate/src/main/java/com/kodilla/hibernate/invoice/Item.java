//package com.kodilla.hibernate.invoice;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.math.BigDecimal;
//
//@Entity
//@Table(name = "ITEM")
//public class Item {
//    private int id;
//    private BigDecimal price;
//    private int quantity;
//    private BigDecimal value;
//    private Product product;
//    private Invoice invoice;
//
//    public Item() {
//    }
//
//    public Item(BigDecimal price, int quantity) {
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    @Id
//    @NotNull
//    @GeneratedValue
//    @Column(name = "ITEM_ID")
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "PRODUCT_ID")
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    @NotNull
//    @Column(name = "PRICE")
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    @NotNull
//    @Column(name = "QUANTITY")
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//
//    @Column(name = "VALUE")
//    public BigDecimal getValue() {
//        return value;
//    }
//
//    public void setValue(BigDecimal value) {
//        this.value = value;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "INVOICE_ID")
//    public Invoice getInvoice() {
//        return invoice;
//    }
//
//    public void setInvoice(Invoice invoice) {
//        this.invoice = invoice;
//    }
//}
