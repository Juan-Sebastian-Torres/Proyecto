package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUserTask  implements Task {

    public static CreateUserTask withData (){return instrumented(CreateUserTask.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Get.resource("/api/users?page=2"));}
}
