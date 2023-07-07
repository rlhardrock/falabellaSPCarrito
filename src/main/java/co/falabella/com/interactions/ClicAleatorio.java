package co.falabella.com.interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.util.ArrayList;
import java.util.Random;

import static co.falabella.com.ui.CatalogoUI.TTL_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicAleatorio implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades listaProductos = TTL_PRODUCTO.resolveAllFor(actor);
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaProductos.size());
        WebElementFacade articulo = listaProductos.get(indiceAleatorio);
        articulo.click();

        //String productoSeleccionado = articulo.getText();
        //actor.remember("producto que se ha seleccionado", productoSeleccionado);

    }

    public static Performable clickProductoAzar(){
        return instrumented(ClicAleatorio.class);
    }

    /*
    public static String cualProductoSeleccionado(Actor actor) {
        return actor.recall("productoSeleccionado");
    } */

}
