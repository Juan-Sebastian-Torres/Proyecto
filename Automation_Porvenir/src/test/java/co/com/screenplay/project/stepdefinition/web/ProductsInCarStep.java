package co.com.screenplay.project.stepdefinition.web;

import co.com.screenplay.project.tasks.ChooseCarTask;
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

public class ProductsInCarStep {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("de clic en la opción “CARRO”")
    public void clickOnCARTOption() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseCategoryProductTask.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseFirstProductTask.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseCategoryProductTask.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseSecondProductTask.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseCarTask.choose());
    }
    @Then("se deberán visualizar los productos agregados")
    public void addedProductsShouldBeDisplayed() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(PAGE_TITLE_CAR)
                )
        );
    }
}
