package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop extends Supplier {

    @Override
    public void process() {
        checkStockStatus();
        isOrderSucceed();
        informacionAboutDelivery();
    }

    @Override
    public boolean isOrderSucceed() {
        return true;
    }

    private void checkStockStatus() {

    }

    @Override
    public void informacionAboutDelivery() {
        super.informacionAboutDelivery();
    }
}
