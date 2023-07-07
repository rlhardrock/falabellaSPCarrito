package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleUI {

    public static Target BTN_INCREMENTO = Target
            .the("aumentar cantidad")
            .locatedBy("//button[@id='quantity-selector-increment-btn']");

    public static Target BTN_CARGAR_CARRO = Target
            .the("Agregar al Carro")
            .locatedBy("//button[@id='add-to-cart-button']");

    public static Target BTN_VER_CARRO = Target
            .the("Agregar al Carro")
            .locatedBy("//a[@id='linkButton']");

}
