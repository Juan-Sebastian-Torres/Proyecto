
package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.tasks.ChooseCategoryProductTask;
import co.com.screenplay.project.tasks.ChooseFirstProductTask;
import co.com.screenplay.project.tasks.ChooseSecondProductTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductsStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("de clic en la opción Añadir al carrito")
    public void clickOnOptionAddToCart() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseCategoryProductTask.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseFirstProductTask.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseCategoryProductTask.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseSecondProductTask.choose());
    }

    @Then("el producto se agregará al carrito de compras")
    public void theProductWillBeAddedToTheShoppingCart() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(PAGE_TITLE_CAR)
                )
        );
    }
}
