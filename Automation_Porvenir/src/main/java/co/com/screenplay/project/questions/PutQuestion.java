package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.screenplay.project.utils.Constants.RESPONSE_REQUEST;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class PutQuestion implements Question<Boolean> {

    private int statusOK;

    public PutQuestion(int statusOK) {
        this.statusOK = statusOK;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThatResponse(
                        RESPONSE_REQUEST,
                        response -> response.statusCode(statusOK)
                                .body("name", equalTo("Juan"))
                                .body("job", equalTo("Automation"))
                )
        );

        return true;
    }

    public static PutQuestion updateSuccess(int statusOK) {
        return new PutQuestion(statusOK);
    }
}
