package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {

    public static final Target PRODUCT_NAME = Target.the("Nombre del producto")
            .locatedBy("//div[@class='inventory_item_name']");

}
