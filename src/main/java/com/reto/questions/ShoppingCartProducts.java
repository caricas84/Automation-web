package com.reto.questions;

import com.reto.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

public class ShoppingCartProducts implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ShoppingCartPage.PRODUCT_NAME)
                .answeredBy(actor);
    }

    public static ShoppingCartProducts displayed() {
        return new ShoppingCartProducts();
    }
}