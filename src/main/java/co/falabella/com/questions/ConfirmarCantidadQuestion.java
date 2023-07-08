package co.falabella.com.questions;

import co.falabella.com.utils.Excel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.falabella.com.ui.CarritoUI.TTL_CANTIDAD_CARRITO;

public class ConfirmarCantidadQuestion implements Question<Boolean> {

    Excel excel = new Excel();
    private static ArrayList<Map<String, String>> inventario = new ArrayList<>();


    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            inventario = excel.leerDatosDeHojaDeExcel("src/test/resources/data/inventario.xlsx", "mercado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        WebElementFacade producto = TTL_CANTIDAD_CARRITO.resolveFor(actor);
        String cantidadSolicitada = inventario.get(0).get("cantidad");
        String cantidadEnCarrito = producto.getText();
        return cantidadEnCarrito.contains(cantidadSolicitada);
    }

    public static Question<Boolean> carritoEmbaladoProducto(){
        return new ConfirmarCantidadQuestion();
    }
}