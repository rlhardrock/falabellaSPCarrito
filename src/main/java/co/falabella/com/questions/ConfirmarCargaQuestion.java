package co.falabella.com.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.falabella.com.ui.CarritoUI.TTL_PRODUCTO_CARRITO;

public class ConfirmarCargaQuestion implements Question <Boolean> {

    private String productoSeleccionado;

    public ConfirmarCargaQuestion(String productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade producto = TTL_PRODUCTO_CARRITO.resolveFor(actor);
        String productoEnCarrito = producto.getText();
        return productoSeleccionado.equals(productoEnCarrito);
    }

    public static Question<Boolean> carritoCargadoProducto(String productoSeleccionado){
        return new ConfirmarCargaQuestion(productoSeleccionado);
    }
}
