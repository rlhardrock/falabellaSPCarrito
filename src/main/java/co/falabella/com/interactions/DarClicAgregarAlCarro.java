package co.falabella.com.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.falabella.com.ui.DetalleUI.BTN_CARGAR_CARRO;

public class DarClicAgregarAlCarro implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll
                .to(BTN_CARGAR_CARRO)
                .then(Click.on(BTN_CARGAR_CARRO)));
    }

    public static DarClicAgregarAlCarro cargarCarro() {
        return Tasks.instrumented(DarClicAgregarAlCarro.class);
    }
}

