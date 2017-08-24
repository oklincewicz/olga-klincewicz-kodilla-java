package com.kodilla.good.patterns.orders;

public class ProductOrderServices implements OrderServices {

    @Override
    public boolean createOrder(User user, Product product, Dealer dealer) {
        return true;
    }
}
