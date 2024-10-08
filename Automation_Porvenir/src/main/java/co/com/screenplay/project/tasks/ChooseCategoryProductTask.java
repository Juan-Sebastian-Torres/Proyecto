package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.HomeUI.CATEGORY_PRODUCT;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waitting;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ChooseCategoryProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(CATEGORY_PRODUCT, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(CATEGORY_PRODUCT));
        waitting(TIME_SHORT);
    }

    public static ChooseCategoryProductTask choose(){
        return Tasks.instrumented(ChooseCategoryProductTask.class);
    }
}
