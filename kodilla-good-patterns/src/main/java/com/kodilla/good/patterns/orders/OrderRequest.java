package com.kodilla.good.patterns.orders;

public class OrderRequest {

    private final User user;
    private final Product product;
    private final Dealer dealer;

    public OrderRequest(final User user, final Product product, final Dealer dealer) {
        this.user = user;
        this.product = product;
        this.dealer = dealer;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Dealer getDealer() {
        return dealer;
    }


}
