package com.reto.questions;

import com.reto.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ProductsPageTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ProductsPage.PRODUCTS_TITLE).answeredBy(actor);
    }

    public static ProductsPageTitle title() {
        return new ProductsPageTitle();
    }
}
