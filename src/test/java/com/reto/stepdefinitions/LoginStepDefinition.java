package com.reto.stepdefinitions;

import com.reto.models.UserData;
import com.reto.questions.ProductsPageTitle;
import com.reto.tasks.Login;
import com.reto.tasks.OpenApplication;
import com.reto.questions.ShoppingCartProducts;
import com.reto.tasks.AddProductToCart;
import com.reto.tasks.OpenShoppingCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import static com.reto.utils.TestData.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class LoginStepDefinition {

    @Given("that the user opens the application")
    public void thatTheUserOpensTheApplication() {theActorCalled(ACTOR).attemptsTo(OpenApplication.at(URL));}

    @When("enter valid credentials")
    public void enterValidCredentials() {
        theActorInTheSpotlight().attemptsTo(Login.with(new UserData(USERNAME,PASSWORD)));}

    @Then("you should see the products page")
    public void youShouldSeeTheProductsPage() {
        theActorInTheSpotlight().should(
                seeThat(
                        ProductsPageTitle.title(),
                        equalTo("Products")
                )
        );}

    @And("add the Sauce Labs Backpack product")
    public void addTheSauceLabsBackpackProduct() {theActorInTheSpotlight().attemptsTo(AddProductToCart.now());}

    @And("open the shopping cart")
    public void openTheShoppingCart() {theActorInTheSpotlight()
            .attemptsTo(OpenShoppingCart.now());}

    @Then("you should see the Sauce Labs Backpack product")
    public void youShouldSeeTheSauceLabsBackpackProduct() {
        theActorInTheSpotlight().should(
                seeThat(
                        ShoppingCartProducts.displayed(),
                        equalTo("Sauce Labs Backpack")
                )
        );
    }
}