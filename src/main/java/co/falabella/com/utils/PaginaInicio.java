package co.falabella.com.utils;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {

    public static final Target NO_GRACIAS_BUTTON = Target
            .the("botón 'No, gracias'")
            .locatedBy("//div[@class='airship-html-prompt-shadow']//button[@class='airship-btn airship-btn-deny']");
}
