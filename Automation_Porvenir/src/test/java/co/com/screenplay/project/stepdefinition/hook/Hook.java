package co.com.screenplay.project.stepdefinition.hook;

import co.com.screenplay.project.hook.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.utils.Constants.*;
import static co.com.screenplay.project.utils.Constants.ENV_QA;

@Slf4j
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

    @Given("{string} obtiene la baseurl de la api")
    public void getTheBaseurlFromTheApi(String actor) {
        log.info(String.format(
                FORMAT_THREE,
                actor,
                CALL_SERVICE,
                BASE_URL.replace(TYPE_ENVIRONMENT, ENV_QA))
        );
    }

}
