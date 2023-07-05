package co.falabella.com.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/cargarCarrito.feature",
        tags = "@BuscarAgregarCarritoExito",
        glue = "co.falabella.com.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        monochrome= true
)

public class CargarCarritoRunner {

}
