package com.reto.tasks;

import com.reto.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToCart implements Task {

    private static final int TIMEOUT = 10;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(
                        ProductsPage.ADD_BACKPACK,
                        WebElementStateMatchers.isVisible()
                ).forNoMoreThan(TIMEOUT).seconds(),

                JavaScriptClick.on(ProductsPage.ADD_BACKPACK)
        );
    }

    public static AddProductToCart now() {
        return instrumented(AddProductToCart.class);
    }
}