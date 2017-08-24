package com.kodilla.good.patterns.orders;

public interface OrderRepository {

    public boolean createOrder(User user, Product product, Dealer dealer);

}
