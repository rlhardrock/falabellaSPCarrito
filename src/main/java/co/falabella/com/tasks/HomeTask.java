package co.falabella.com.tasks;

import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static co.falabella.com.ui.HomeUI.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {

    Excel excel = new Excel();

    private static ArrayList<Map<String, String>> inventario = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            inventario = excel.leerDatosDeHojaDeExcel("src/test/resources/data/inventario.xlsx", "mercado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(inventario.get(0).get("producto"))
                        .into(TXT_BUSCAR)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable explorarCatalogo(){
        return instrumented(HomeTask.class);
    }
}
