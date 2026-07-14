package com.reto.tasks;

import com.reto.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenShoppingCart implements Task {

    private static final int TIMEOUT = 10;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(
                        ProductsPage.SHOPPING_CART,
                        WebElementStateMatchers.isClickable()
                ).forNoMoreThan(TIMEOUT).seconds(),

                JavaScriptClick.on(ProductsPage.SHOPPING_CART)
        );
    }

    public static OpenShoppingCart now() {
        return instrumented(OpenShoppingCart.class);
    }
}