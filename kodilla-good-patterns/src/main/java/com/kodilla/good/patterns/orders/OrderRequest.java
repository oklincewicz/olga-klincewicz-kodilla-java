package com.kodilla.good.patterns.orders;

public class OrderRequest {

    private static User user;
    private static Product product;
    private final Dealer dealer;

    public OrderRequest(final User user, final Product product, final Dealer dealer) {
        this.user = user;
        this.product = product;
        this.dealer = dealer;
    }

    public static User getUser() {
        return user;
    }

    public static Product getProduct() {
        return product;
    }

    public Dealer getDealer() {
        return dealer;
    }


}
