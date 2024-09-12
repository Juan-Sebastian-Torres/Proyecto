package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.tasks.ChooseCategoryProductTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.utils.Constants.ACTOR;
import static co.com.screenplay.project.utils.Constants.PAGE_TITLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CategoryProductStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("selecciono la categoría Agradecimientos")
    public void iSelectTheCategoryAcknowledgments() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseCategoryProductTask.choose());
    }

    @Then("se visualizarán los productos para esta categoría")
    public void productsWillBeDisplayedForThisCategory() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(PAGE_TITLE)
                )
        );
    }


}
