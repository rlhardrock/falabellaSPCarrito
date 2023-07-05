package co.falabella.com.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CargarCarritoStepDefinition {

    @Before
    public void establecerEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("abro la pagina web Falabella")
    public void abrirPaginaWebFalabella() {
        OnStage.theActorCalled("Mercader").
                wasAbleTo(Open.url("https://www.falabella.com.co/falabella-co"));
    }

    @Cuando("busco el producto deseado confirmando sus detalles")
    public void buscarProductoDetalles() {

    }

    @Cuando("envio al carrito de compras la cantidad necesitada")
    public void enviarCargarCarrito() {

    }

    @Entonces("visualizo el carro de compras con el producto en cantidad")
    public void visualizarCarro() {

    }
}
