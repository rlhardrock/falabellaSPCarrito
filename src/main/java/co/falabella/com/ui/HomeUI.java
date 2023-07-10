package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {

    public static final Target TXT_BUSCAR = Target
            .the("Buscar en falabella.com")
            .locatedBy("//input[@id='testId-SearchBar-Input']");

}
