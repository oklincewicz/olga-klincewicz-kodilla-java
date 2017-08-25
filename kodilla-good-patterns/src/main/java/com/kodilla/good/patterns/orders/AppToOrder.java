package com.kodilla.good.patterns.orders;

public class AppToOrder {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriver();

        OrderProcess orderProcess = new OrderProcess(new MailService(), new ProductOrderServices(), new ProductOrderRepository());
        orderProcess.process(orderRequest);
    }

}
