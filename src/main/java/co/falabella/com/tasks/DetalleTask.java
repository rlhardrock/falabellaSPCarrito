package co.falabella.com.tasks;

import co.falabella.com.interactions.DarClicAgregarAlCarro;
import co.falabella.com.interactions.HacerClicIncremento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetalleTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                HacerClicIncremento.variasVeces(6),
                DarClicAgregarAlCarro.cargarCarro()
        );
    }

    public static Performable procesarCantidad(){
        return instrumented(DetalleTask.class);
    }
}
