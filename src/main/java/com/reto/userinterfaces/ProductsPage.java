package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {

    public static final Target PRODUCTS_TITLE = Target.the("Título Productos")
            .locatedBy("//span[@class='title']");

    public static final Target ADD_BACKPACK = Target.the("Agregar Producto")
            .locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");

    public static final Target SHOPPING_CART = Target.the("Carrito de compras")
            .locatedBy("//a[@class='shopping_cart_link']");

    public static final Target REMOVE_BACKPACK = Target.the("Remover Producto")
            .locatedBy("//button[@id='remove-sauce-labs-backpack']");
    }
