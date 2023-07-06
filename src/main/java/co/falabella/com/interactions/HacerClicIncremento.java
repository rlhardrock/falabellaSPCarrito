package co.falabella.com.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.falabella.com.ui.DetalleUI.BTN_CARGAR_CARRO;
import static co.falabella.com.ui.DetalleUI.BTN_INCREMENTO;

public class HacerClicIncremento implements Interaction {

    private final int vecesAClickear;

    public HacerClicIncremento(int vecesAClickear) {
        this.vecesAClickear = vecesAClickear;
    }

    public static HacerClicIncremento variasVeces(int veces) {
        return Tasks.instrumented(HacerClicIncremento.class, veces);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 1; i < vecesAClickear; i++) {
            actor.attemptsTo(Scroll
                    .to(BTN_INCREMENTO)
                    .then(Click.on(BTN_INCREMENTO)));
        }
    }
}

