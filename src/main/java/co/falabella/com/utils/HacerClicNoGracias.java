package co.falabella.com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HacerClicNoGracias {

    private WebDriver driver;

    public HacerClicNoGracias(WebDriver driver) {
        this.driver = driver;
    }
    public void noGracias(){
        WebElement iframe = driver.findElement(By.cssSelector("div.airship-html-prompt-shadow iframe"));
        driver.switchTo().frame(iframe);
        WebElement botonNoGracias = driver.findElement(By.cssSelector("button.airship-btn-deny"));
        botonNoGracias.click();
        driver.switchTo().defaultContent();
    }
}
