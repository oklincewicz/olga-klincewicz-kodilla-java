package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop extends Supplier {
    @Override
    public void process() {
        saveUserNameOnMailingList();
        isOrderSucceed();
        informacionAboutDelivery();
    }

    @Override
    public boolean isOrderSucceed() {
        return true;
    }

    private void saveUserNameOnMailingList() {
    }

    @Override
    public void informacionAboutDelivery() {
        super.informacionAboutDelivery();
    }
}
