package com.kodilla.good.patterns.food2door;

public class HealthyShop extends Supplier {


    @Override
    public void process() {
        sendEmailToUserWithBon();
        isOrderSucceed();
        informacionAboutDelivery();
    }

    @Override
    public boolean isOrderSucceed() {
        return true;
    }

    private void sendEmailToUserWithBon() {
    }

    @Override
    public void informacionAboutDelivery() {
        super.informacionAboutDelivery();
    }
}
