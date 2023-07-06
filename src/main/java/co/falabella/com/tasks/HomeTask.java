package co.falabella.com.tasks;

import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    /*
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("hidrolavadora")
                        .into(TXT_BUSCAR)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable explorar(){
        return instrumented(HomeTask.class);
    }*/
}
