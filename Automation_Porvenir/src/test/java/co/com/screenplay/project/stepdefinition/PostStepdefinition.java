package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.PostQuestion;
import co.com.screenplay.project.tasks.post.Call;
import co.com.screenplay.project.utils.Uri;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.utils.Constants.*;
import static co.com.screenplay.project.utils.Constants.ENV_QA;
import static io.restassured.parsing.Parser.JSON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.apache.http.HttpStatus.SC_CREATED;

public class PostStepdefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("realizo una solicitud POST al endpoint con los datos del usuario")
    public void iMakeAPOSTRequestToTheEndpointApiUsersWithTheUserData() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                Call.service().apiPost(
                        BASE_URL.replace(TYPE_ENVIRONMENT, ENV_QA),
                        "{\n" +
                                "    \"name\": \"Juan\",\n" +
                                "    \"job\": \"Automation\"\n" +
                                "}",
                        Uri.LIST_USERS.getUri(),
                        String.valueOf(ContentType.JSON)));
    }

    @Then("valida estado de la peticion POST")
    public void validatePetitionStatusPost() {
        theActorInTheSpotlight().should(seeThat(PostQuestion.registerSuccess(SC_CREATED)));
    }
}
