package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.HomeProductUI.GO_CART;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waitting;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ChooseCarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(GO_CART, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(GO_CART));
        waitting(TIME_SHORT);
    }

    public static ChooseCarTask choose() {
        return Tasks.instrumented(ChooseCarTask.class);
    }
}
