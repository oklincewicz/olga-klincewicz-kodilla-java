package com.kodilla.good.patterns.orders;

public class OrderDto {

    public final User user;
    public final Product product;
    public final boolean isOrder;

    public OrderDto(final User user, final Product product, final boolean isOrder) {
        this.user = user;
        this.product = product;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
