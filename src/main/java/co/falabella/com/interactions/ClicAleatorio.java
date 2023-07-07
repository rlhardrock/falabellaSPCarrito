package co.falabella.com.interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import java.util.Random;

import static co.falabella.com.ui.CatalogoUI.TTL_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicAleatorio implements Interaction {

    private String productoSeleccionado;

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades listaProductos = TTL_PRODUCTO.resolveAllFor(actor);
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaProductos.size());

        productoSeleccionado = listaProductos.get(indiceAleatorio).getText();
        WebElementFacade articulo = listaProductos.get(indiceAleatorio);
        articulo.click();
    }

    public static Performable clickProductoAzar(){
        return instrumented(ClicAleatorio.class);
    }

    public String getProductoSeleccionado() {
        return productoSeleccionado;
    }


}
