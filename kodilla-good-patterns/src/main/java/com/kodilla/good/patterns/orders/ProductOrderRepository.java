package com.kodilla.good.patterns.orders;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product, Dealer dealer) {
        return true;
    }
}
