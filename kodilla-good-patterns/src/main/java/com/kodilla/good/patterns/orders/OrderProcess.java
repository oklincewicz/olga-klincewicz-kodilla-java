package com.kodilla.good.patterns.orders;

public class OrderProcess {

    private InformationService informationService;
    private OrderServices orderServices;
    private OrderRepository orderRepository;

    public OrderProcess(final InformationService informationService,
                        final OrderServices orderServices,
                        final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderServices = orderServices;
        this.orderRepository = orderRepository;
    }



    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrder = orderServices.createOrder(OrderRequest.getUser(), OrderRequest.getProduct(),
                orderRequest.getDealer());

        if(isOrder) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDealer());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }

}
