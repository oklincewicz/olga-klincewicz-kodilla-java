package com.kodilla.good.patterns.orders;

public class OrderRequestRetriver {

    public OrderRequest retriver() {
        User user = new User("Ala Nowak", 98234449, "ala.nowak@ala.pl");
        Product product = new Product("Wycieraczka", "Wyposażenie Domu", 19.99, true);
        Dealer dealer = new Dealer("Stylowy Dom", 999670988, "stylowydom@stylowydom.com");

        return new OrderRequest(user, product, dealer);
    }

}
