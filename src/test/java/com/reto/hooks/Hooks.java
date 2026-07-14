package com.reto.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before
    public void setTheStage() {
        // Inicializa el escenario Screenplay antes de cada prueba
        OnStage.setTheStage(new OnlineCast());
    }
}