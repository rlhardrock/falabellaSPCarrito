package co.falabella.com.stepDefinitions;

import co.falabella.com.interactions.ClicAleatorio;
import co.falabella.com.interactions.EsperarIframe;
import co.falabella.com.questions.ConfirmarCargaQuestion;
import co.falabella.com.tasks.CatalogoTask;
import co.falabella.com.tasks.DetalleTask;
import co.falabella.com.tasks.HomeTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CargarCarritoStepDefinition {

    @Before
    public void establecerEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("abro la pagina web Falabella")
    public void abrirPaginaWebFalabella() {
        OnStage.theActorCalled("comerciante").
                wasAbleTo(Open.url("https://www.falabella.com.co/"));
    }

    @Cuando("busco el producto aleatorizado enviando al carrito de compras la cantidad necesitada")
    public void buscarProductoDetalles() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EsperarIframe.clicNoGracias(),
                HomeTask.explorarCatalogo(),
                CatalogoTask.clicAzar(),
                DetalleTask.procesarCantidad()
        );

    }

    @Entonces("visualizo el carro de compras con el producto en cantidad")
    public void visualizarCarro() {

    }
}
