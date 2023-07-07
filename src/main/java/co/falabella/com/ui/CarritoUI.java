package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static Target TTL_PRODUCTO_CARRITO = Target.the("Producto en  Carrito")
            .locatedBy("div.chakra-stack.cell-container p.chakra-text.css-1h76ti1");

    public static Target TTL_CANTIDAD_CARRITO = Target.the("Cantidad de Producto en carrito")
            .locatedBy("input[type='number'].chakra-input.css-1hzo6s2");
}
