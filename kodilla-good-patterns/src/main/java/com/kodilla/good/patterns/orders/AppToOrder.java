package com.kodilla.good.patterns.orders;

public class AppToOrder {

    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retriver();

        OrderProcess orderProcess = new OrderProcess(new MailService(), new ProductOrderServices(), new ProductOrderRepository());
        orderProcess.process(orderRequest);
    }

}
