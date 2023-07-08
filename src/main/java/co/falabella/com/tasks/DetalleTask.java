package co.falabella.com.tasks;

import co.falabella.com.interactions.DarClicAgregarAlCarro;
import co.falabella.com.interactions.HacerClicIncremento;
import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetalleTask implements Task {

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
                HacerClicIncremento.variasVeces(Integer.parseInt(inventario.get(0).get("cantidad"))),
                DarClicAgregarAlCarro.cargarCarro()
        );
    }

    public static Performable procesarCantidad(){
        return instrumented(DetalleTask.class);
    }
}
