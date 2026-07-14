package com.reto.tasks;

import com.reto.models.UserData;
import com.reto.userinterfaces.LoginPage;
import com.reto.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private static final int TIMEOUT = 10;

    private final UserData userData;

    public Login(UserData userData) {
        this.userData = userData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LoginPage.USERNAME, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(TIMEOUT).seconds(),

                Enter.theValue(userData.getUsername())
                        .into(LoginPage.USERNAME),

                Enter.theValue(userData.getPassword())
                        .into(LoginPage.PASSWORD),

                JavaScriptClick.on(LoginPage.LOGIN_BUTTON),

                WaitUntil.the(ProductsPage.PRODUCTS_TITLE, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(TIMEOUT).seconds()
        );
    }

    public static Login with(UserData userData) {
        return instrumented(Login.class, userData);
    }
}