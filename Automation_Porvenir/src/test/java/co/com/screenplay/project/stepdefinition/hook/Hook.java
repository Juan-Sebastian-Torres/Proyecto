package co.com.screenplay.project.stepdefinition.hook;

import co.com.screenplay.project.hook.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.utils.Constants.ACTOR;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que estoy en la página principal de la tienda floristeria")
    public void ImOnTheMainPageOfTheStoreFlorist() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                OpenWeb.broserURL()
        );
    }

    @Given("que estoy en la categoría Agradecimientos")
    public void imInTheCategoryThanks() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                OpenWeb.broserURL()
        );
    }

    @Given("que he agregado los productos de la categoría Agradecimientos al carrito")
    public void haveAddedTheProductsOfTheCategoryThankYouToTheCart() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                OpenWeb.broserURL()
        );
    }

}
