package co.falabella.com.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CatalogoUI {

    public static Target  TTL_PRODUCTO = Target.the("Parrilla de Productos")
            .locatedBy("div[id*='testId'] > .link-container > a");

}

