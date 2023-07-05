package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeInterface {

    public static Target TXT_BUSCAR = Target
            .the("Buscar en falabella.com")
            .locatedBy("input[@id='testId-SearchBar-Input']");
}
