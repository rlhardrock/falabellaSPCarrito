package co.falabella.com.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Excel {
    public List<Map<String, String>> leerDatosDeHojaDeExcel(String rutaDeExcel, String hojaDeExcel) throws IOException, InvalidFormatException {
        List<Map<String, String>> datos = new ArrayList<>();

        try (Workbook workbook = WorkbookFactory.create(new FileInputStream(rutaDeExcel))) {
            Sheet sheet = workbook.getSheet(hojaDeExcel);
            Row titulos = sheet.getRow(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }

                Map<String, String> informacion = new HashMap<>();
                for (int i = 0; i < titulos.getLastCellNum(); i++) {
                    Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    String titulo = titulos.getCell(i).getStringCellValue();
                    String valor = obtenerValorCelda(cell);
                    informacion.put(titulo, valor);
                }

                datos.add(informacion);
            }
        }

        return datos;
    }

    private String obtenerValorCelda(Cell cell) {
        if (cell == null) {
            return "";
        }

        CellType cellType = CellType.forInt(cell.getCellType());
        switch (cellType) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf((long) cell.getNumericCellValue());
                }
            default:
                return "";
        }
    }
}