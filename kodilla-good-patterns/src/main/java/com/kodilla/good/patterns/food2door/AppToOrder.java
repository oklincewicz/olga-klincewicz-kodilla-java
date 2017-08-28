package com.kodilla.good.patterns.food2door;

public class AppToOrder {

    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.process();

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.process();

        HealthyShop healthyShop = new HealthyShop();
        healthyShop.process();
    }

}
