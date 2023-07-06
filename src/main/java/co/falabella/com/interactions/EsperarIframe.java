package co.falabella.com.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class EsperarIframe implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowsingTheWeb.as(actor).getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("const shadowRoot = arguments[0].shadowRoot; const button = shadowRoot.querySelector('.airship-btn-deny'); button.click();",
                driver.findElement(By.cssSelector("div.airship-html-prompt-shadow"))
        );
    }

    public static Performable clicNoGracias() {
        return Task.where("{0} espera a que aparezca el iframe y hace clic en 'No, gracias'",
                new EsperarIframe());
    }
}