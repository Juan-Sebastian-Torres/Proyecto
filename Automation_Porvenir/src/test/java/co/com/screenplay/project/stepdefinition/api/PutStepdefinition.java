package co.com.screenplay.project.stepdefinition.api;

import co.com.screenplay.project.questions.PutQuestion;
import co.com.screenplay.project.tasks.put.Call;
import co.com.screenplay.project.utils.Uri;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.utils.Constants.*;
import static co.com.screenplay.project.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.apache.http.HttpStatus.SC_OK;

public class PutStepdefinition {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("configura la peticion a disipar")
    public void configureRequestADissipate() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                Call.service()
                        .apiPut(
                                BASE_URL.replace(TYPE_ENVIRONMENT, ENV_QA),
                                "{\n" +
                                        "    \"name\": \"Juan\",\n" +
                                        "    \"job\": \"Automation\"\n" +
                                        "}",
                                Uri.UPDATE_USER.getUri(),
                                String.valueOf(ContentType.JSON)
                        )
        );
    }

    @Then("valida los datos consultados fueron actualizados")
    public void validatesTheDataConsultedWasUpdated() {
        theActorInTheSpotlight().should(seeThat(PutQuestion.updateSuccess(SC_OK)));
    }
}