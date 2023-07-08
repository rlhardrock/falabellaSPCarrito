package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target TTL_PRODUCTO_CARRITO = Target.the("Producto en  Carrito")
            .locatedBy("//p[contains(@data-testid, 'name')]");
    //p[@data-testid='name']

    public static final Target TTL_CANTIDAD_CARRITO = Target.the("Cantidad de Producto en carrito")
            .locatedBy("input[data-testid*='-quantity-input']");
    //input[data-testid$='-quantity-input']

}