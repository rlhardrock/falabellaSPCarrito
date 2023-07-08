package co.falabella.com.questions;

import co.falabella.com.interactions.ClicAleatorio;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.falabella.com.ui.CarritoUI.TTL_PRODUCTO_CARRITO;

public class ConfirmarCargaQuestion implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade producto = TTL_PRODUCTO_CARRITO.resolveFor(actor);
        String productoEnCarrito = producto.getText();
        String productoSeleccionado = ClicAleatorio.getProductoSeleccionado();
        return productoSeleccionado.equals(productoEnCarrito);
        //return productoEnCarrito.equals(productoSeleccionado);
    }

    public static Question<Boolean> carritoCargadoProducto(){
        return new ConfirmarCargaQuestion();
    }
}