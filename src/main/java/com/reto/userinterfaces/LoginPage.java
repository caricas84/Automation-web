package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USERNAME = Target.the("Campo usuario")
            .locatedBy("//input[@id='user-name']");

    public static final Target PASSWORD = Target.the("Campo contraseña")
            .locatedBy("//input[@id='password']");

    public static final Target LOGIN_BUTTON = Target.the("Botón login")
            .locatedBy("//input[@id='login-button']");
}
