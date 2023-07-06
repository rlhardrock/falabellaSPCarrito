package co.falabella.com.tasks;

import co.falabella.com.interactions.ClicAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CatalogoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClicAleatorio.clickProductoAzar()
        );
    }

    public static Performable clicAzar(){
        return instrumented(CatalogoTask.class);
    }
}
