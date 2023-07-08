package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target TTL_PRODUCTO_CARRITO = Target.the("Producto en  Carrito")
            .locatedBy("//p[@class='chakra-text css-1h76ti1' or @data-testid='name']");


    public static final Target TTL_CANTIDAD_CARRITO = Target.the("Cantidad de Producto en carrito")
            .locatedBy("//p[@data-testid='total-products-count']");
}


//input[data-testid*='-quantity-input']