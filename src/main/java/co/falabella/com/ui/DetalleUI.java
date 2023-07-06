package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleUI {

    public static Target BTN_INCREMENTO = Target
            .the("aumentar cantidad")
            .locatedBy("//button[@id='quantity-selector-increment-btn']");

    public static Target BTN_DECREMENTO = Target
            .the("disminuir cantidad")
            .locatedBy("//button[@id='quantity-selector-decrement-btn']");

    public static Target TXT_CANTIDAD = Target
            .the("solicitar cantidad, maximo 20")
            .locatedBy("//input[@id='quantity-selector-increment-input']");

    public static Target BTN_CARGAR_CARRO = Target
            .the("Agregar al Carro")
            .locatedBy("//button[@id='add-to-cart-button'");
}
