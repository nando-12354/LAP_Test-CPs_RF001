package support;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Clase para generar un reporte en Excel a partir de un archivo JSON generado por Cucumber
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class reporteExcel {

    public static void main(String[] args) {
        try {
            generarReporte();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Convierte la duracion de los pasos de Cucumber a minutos segundos y milisegundos
     * @param tiempo Duracion en nanosegundos
     * @return Duracion convertida a minutos segundos y milisegundos
     */
    private static String formatoFecha(String tiempo) {
        try {
            SimpleDateFormat formatoDuracion = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            formatoDuracion.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date fechaHora = formatoDuracion.parse(tiempo);
            SimpleDateFormat formatoFechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            return formatoFechaHora.format(fechaHora);
        } catch (Exception e) {
            System.err.println("Error al convertir timestamp: " + e.getMessage());
            e.printStackTrace();
            return "Fecha/Hora no disponible";
        }
    }

    /**
     * Traduce el estado de los pasos de Cucumber a español
     * @param estado Estado de los pasos de Cucumber
     * @return Estado traducido
     */
    private static String traducirEstado(String estado) {
        switch (estado.toLowerCase()) {
            case "passed":
                return "Pasado";
            case "failed":
                return "Fallido";
            default:
                return "Omitido";
        }
    }

    /**
     * Método para generar un reporte en Excel a partir de un archivo JSON generado por Cucumber.
     * Crea dos hojas en el archivo Excel: Reporte de Pruebas y Resumen
     * @throws IOException Error al leer el archivo JSON
     * {@link runtest} para ver un ejemplo de uso
     */
    public static void generarReporte() throws IOException {
        try {
            FileInputStream archivoJson = new FileInputStream("target/reporte-cucumber/cucumber.json");
            ObjectMapper mapeadorObjeto = new ObjectMapper();
            JsonNode nodoRaiz = mapeadorObjeto.readTree(archivoJson);

            Workbook excel = new XSSFWorkbook();
            Sheet hojaReporte = excel.createSheet("Reporte de Pruebas");
            hojaReporte.setDisplayGridlines(false);

            Sheet hojaDeResumen = excel.createSheet("Resumen");
            hojaDeResumen.setDisplayGridlines(false);

            hojaReportePrueba(hojaReporte, nodoRaiz, excel);
            hojaResumen(hojaDeResumen, nodoRaiz, excel);

            SimpleDateFormat formatoFechaArchivo = new SimpleDateFormat("ddMMyyyy_HHmmss");
            String nombreArchivo = "CP-LAP_" + formatoFechaArchivo.format(new Date()) + ".xlsx";

            File carpeta = new File("target/reporte-excel");
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }
            FileOutputStream archivoSalida = new FileOutputStream(new File(carpeta, nombreArchivo));
            excel.write(archivoSalida);
            archivoSalida.close();
            excel.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para los estilos, fuente, colores de la hoja de Reporte de Pruebas en el archivo Excel
     * @param hoja Hoja de Reporte de Pruebas
     * @param nodoRaiz Nodo raíz del archivo JSON
     * @param excel Introducir los estilos, fuente, colores a la hoja del Excel
     */
    private static void hojaReportePrueba(Sheet hoja, JsonNode nodoRaiz, Workbook excel) {
        Font fuentePredeterminada = excel.createFont();
        fuentePredeterminada.setFontName("Aptos Narrow");

        CellStyle cabeceraEstilo = excel.createCellStyle();
        Font cabeceraFuente = excel.createFont();
        cabeceraFuente.setBold(true);
        cabeceraFuente.setUnderline(Font.U_SINGLE);
        cabeceraFuente.setColor(IndexedColors.BLACK.getIndex());
        cabeceraFuente.setFontName("Aptos Narrow");
        cabeceraEstilo.setFont(cabeceraFuente);
        cabeceraEstilo.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        cabeceraEstilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cabeceraEstilo.setAlignment(HorizontalAlignment.CENTER);
        cabeceraEstilo.setVerticalAlignment(VerticalAlignment.CENTER);

        cabeceraEstilo.setBorderBottom(BorderStyle.MEDIUM);
        cabeceraEstilo.setBottomBorderColor(IndexedColors.WHITE.getIndex());
        cabeceraEstilo.setBorderTop(BorderStyle.MEDIUM);
        cabeceraEstilo.setTopBorderColor(IndexedColors.WHITE.getIndex());
        cabeceraEstilo.setBorderLeft(BorderStyle.MEDIUM);
        cabeceraEstilo.setLeftBorderColor(IndexedColors.WHITE.getIndex());
        cabeceraEstilo.setBorderRight(BorderStyle.MEDIUM);
        cabeceraEstilo.setRightBorderColor(IndexedColors.WHITE.getIndex());

        CellStyle estiloCaracteristica = excel.createCellStyle();
        estiloCaracteristica.setVerticalAlignment(VerticalAlignment.CENTER);
        estiloCaracteristica.setFont(fuentePredeterminada);
        estiloCaracteristica.setWrapText(true);

        CellStyle escenarioEstilo = excel.createCellStyle();
        escenarioEstilo.setAlignment(HorizontalAlignment.LEFT);
        escenarioEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
        escenarioEstilo.setFont(fuentePredeterminada);
        escenarioEstilo.setWrapText(true);

        CellStyle bordeEstilo = excel.createCellStyle();
        bordeEstilo.setBorderBottom(BorderStyle.MEDIUM);
        bordeEstilo.setBottomBorderColor(IndexedColors.WHITE.getIndex());
        bordeEstilo.setBorderTop(BorderStyle.MEDIUM);
        bordeEstilo.setTopBorderColor(IndexedColors.WHITE.getIndex());
        bordeEstilo.setBorderLeft(BorderStyle.MEDIUM);
        bordeEstilo.setLeftBorderColor(IndexedColors.WHITE.getIndex());
        bordeEstilo.setBorderRight(BorderStyle.MEDIUM);
        bordeEstilo.setRightBorderColor(IndexedColors.WHITE.getIndex());
        bordeEstilo.setFont(fuentePredeterminada);

        CellStyle estiloPasado = excel.createCellStyle();
        estiloPasado.cloneStyleFrom(bordeEstilo);
        estiloPasado.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        estiloPasado.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle estiloFallido = excel.createCellStyle();
        estiloFallido.cloneStyleFrom(bordeEstilo);
        estiloFallido.setFillForegroundColor(IndexedColors.CORAL.getIndex());
        estiloFallido.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle estiloOmitido = excel.createCellStyle();
        estiloOmitido.cloneStyleFrom(bordeEstilo);
        estiloOmitido.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        estiloOmitido.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle bordeNegroInferiorEstilo = excel.createCellStyle();
        bordeNegroInferiorEstilo.cloneStyleFrom(bordeEstilo);
        bordeNegroInferiorEstilo.setBorderBottom(BorderStyle.MEDIUM);
        bordeNegroInferiorEstilo.setBottomBorderColor(IndexedColors.BLACK.getIndex());

        Row cabeceraFila = hoja.createRow(0);
        cabeceraFila.createCell(0).setCellValue("CARACTERISTICA");
        cabeceraFila.createCell(1).setCellValue("ESCENARIO");
        cabeceraFila.createCell(2).setCellValue("PASOS");
        cabeceraFila.createCell(3).setCellValue("ESTADO");
        cabeceraFila.createCell(4).setCellValue("DURACIÓN");
        cabeceraFila.createCell(5).setCellValue("FECHA Y HORA");
        cabeceraFila.setHeightInPoints(30);

        for (int i = 0; i < 6; i++) {
            Cell cell = cabeceraFila.getCell(i);
            if (cell != null) {
                cell.setCellStyle(cabeceraEstilo);
            }
        }

        int pasoCorrecto = 0;
        int pasoFallido = 0;
        int pasoOmitido = 0;

        int numeroFila = 1;
        for (JsonNode caracteristica : nodoRaiz) {
            String caracteristicaNombre = caracteristica.get("name") != null ? caracteristica.get("name").asText() : "No hay nombre";
            JsonNode elementosNodo = caracteristica.get("elements");
            String caracteristicaInicioFechaHora = caracteristica.get("start_timestamp") != null ? caracteristica.get("start_timestamp").asText() : "Fecha/Hora no disponible";

            if (elementosNodo != null) {
                int caracteristicaInicioFila = numeroFila;
                for (JsonNode escenario : elementosNodo) {
                    String escenarioNombre = escenario.get("name") != null ? escenario.get("name").asText() : "No hay escenario";
                    JsonNode pasosNodo = escenario.get("steps");
                    String escenarioInicioFechaHora = escenario.get("start_timestamp") != null ? escenario.get("start_timestamp").asText() : "Fecha/Hora no disponible";

                    if (pasosNodo != null) {
                        int escenarioInicioFila = numeroFila;
                        for (JsonNode paso : pasosNodo) {
                            Row fila = hoja.createRow(numeroFila++);
                            String pasoNombre = paso.get("name") != null ? paso.get("name").asText() : "No hay nombre";
                            String pasoEstado = paso.get("result") != null && paso.get("result").get("status") != null ? paso.get("result").get("status").asText() : "No hay estado";
                            String estadoTraducido = traducirEstado(pasoEstado);
                            long duracion = paso.get("result") != null && paso.get("result").get("duration") != null ? paso.get("result").get("duration").asLong() : -1;
                            String pasoDuracion = duracion != -1 ? formatoDuracion(duracion) : "No hay duración";
                            String pasoHoraInicio = paso.get("start_timestamp") != null ? paso.get("start_timestamp").asText() : escenarioInicioFechaHora;

                            Cell pasoNombreCelda = fila.createCell(2);
                            pasoNombreCelda.setCellValue(pasoNombre);

                            Cell estadoCelda = fila.createCell(3);
                            estadoCelda.setCellValue(estadoTraducido);

                            Cell duracionCelda = fila.createCell(4);
                            duracionCelda.setCellValue(pasoDuracion);

                            Cell fechaHoraCelda = fila.createCell(5);
                            fechaHoraCelda.setCellValue(formatoFecha(pasoHoraInicio));

                            CellStyle estilo;
                            if ("passed".equalsIgnoreCase(pasoEstado)) {
                                pasoNombreCelda.setCellStyle(estiloPasado);
                                estadoCelda.setCellStyle(estiloPasado);
                                duracionCelda.setCellStyle(estiloPasado);
                                fechaHoraCelda.setCellStyle(estiloPasado);
                                pasoCorrecto++;
                            } else if ("failed".equalsIgnoreCase(pasoEstado)) {
                                pasoNombreCelda.setCellStyle(estiloFallido);
                                estadoCelda.setCellStyle(estiloFallido);
                                duracionCelda.setCellStyle(estiloFallido);
                                fechaHoraCelda.setCellStyle(estiloFallido);
                                pasoFallido++;
                            } else {
                                pasoNombreCelda.setCellStyle(estiloOmitido);
                                estadoCelda.setCellStyle(estiloOmitido);
                                duracionCelda.setCellStyle(estiloOmitido);
                                fechaHoraCelda.setCellStyle(estiloOmitido);
                                pasoOmitido++;
                            }
                        }
                        // Combinar celdas de escenario para pasos
                        hoja.addMergedRegion(new CellRangeAddress(escenarioInicioFila, numeroFila - 1, 1, 1));
                        Cell celdaEscenario = hoja.getRow(escenarioInicioFila).createCell(1);
                        celdaEscenario.setCellValue(escenarioNombre);
                        celdaEscenario.setCellStyle(escenarioEstilo);

                        // Combinar celdas de característica para pasos del escenario
                        hoja.addMergedRegion(new CellRangeAddress(escenarioInicioFila, numeroFila - 1, 0, 0));
                        Cell celdaCaracteristica = hoja.getRow(escenarioInicioFila).createCell(0);
                        celdaCaracteristica.setCellValue(caracteristicaNombre);
                        celdaCaracteristica.setCellStyle(estiloCaracteristica);

                        aplicarBordeNegro(hoja.getRow(numeroFila - 1), 6);
                    }
                }
            }
        }
        hoja.setColumnWidth(0, 25 * 256);
        hoja.setColumnWidth(1, 35 * 256);

        for (int i = 2; i < 6; i++) {
            hoja.autoSizeColumn(i);
        }
    }

    /**
     * Método para aplicar un borde negro al final de cada escenario de prueba
     * @param fila Parámetro para agregar el borde
     * @param numeroColumnas Cantidad de columnas que contiene la hoja
     */
    private static void aplicarBordeNegro(Row fila, int numeroColumnas) {
        for (int i = 0; i < numeroColumnas; i++) {
            Cell celda = fila.getCell(i);
            if (celda != null) {
                CellStyle estiloOriginal = celda.getCellStyle();
                CellStyle nuevoEstilo = fila.getSheet().getWorkbook().createCellStyle();
                nuevoEstilo.cloneStyleFrom(estiloOriginal);
                nuevoEstilo.setBorderBottom(BorderStyle.MEDIUM);
                nuevoEstilo.setBottomBorderColor(IndexedColors.BLACK.getIndex());
                celda.setCellStyle(nuevoEstilo);
            }
        }
    }

    /**
     * Método para dar formato a la duración de la prueba en minutos, segundos y milisegundos
     * @param duracion Para agregar el tiempo de la prueba
     * @return La duración en formato mm:ss:ms
     */
    private static String formatoDuracion(long duracion) {
        long milisegundos = duracion / 1_000_000;
        long segundos = milisegundos / 1000;
        long minutos = segundos / 60;
        milisegundos %= 1000;
        segundos %= 60;

        return String.format("%dm %02ds %03dms", minutos, segundos, milisegundos);
    }

    /**
     * Método para los estilos, fuente, colores de la hoja de Resumen en el archivo Excel
     * @param resumenHoja  Hoja de Resumen de las pruebas
     * @param nodoRaiz Nodo raíz del archivo JSON
     * @param excel Introducir los estilos, fuente, colores a la hoja del Excel
     */
    private static void hojaResumen(Sheet resumenHoja, JsonNode nodoRaiz, Workbook excel) {
        Font fuentePredeterminada = excel.createFont();
        fuentePredeterminada.setFontName("Aptos Narrow");

        CellStyle estiloCabecera = excel.createCellStyle();
        Font fuenteCabecera = excel.createFont();
        fuenteCabecera.setBold(true);
        fuenteCabecera.setUnderline(Font.U_SINGLE);
        fuenteCabecera.setColor(IndexedColors.BLACK.getIndex());
        fuenteCabecera.setFontName("Aptos Narrow");

        estiloCabecera.setFont(fuenteCabecera);
        estiloCabecera.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        estiloCabecera.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        estiloCabecera.setAlignment(HorizontalAlignment.CENTER);
        estiloCabecera.setVerticalAlignment(VerticalAlignment.CENTER);
        estiloCabecera.setBorderBottom(BorderStyle.MEDIUM);
        estiloCabecera.setBottomBorderColor(IndexedColors.WHITE.getIndex());
        estiloCabecera.setBorderTop(BorderStyle.MEDIUM);
        estiloCabecera.setTopBorderColor(IndexedColors.WHITE.getIndex());
        estiloCabecera.setBorderLeft(BorderStyle.MEDIUM);
        estiloCabecera.setLeftBorderColor(IndexedColors.WHITE.getIndex());
        estiloCabecera.setBorderRight(BorderStyle.MEDIUM);
        estiloCabecera.setRightBorderColor(IndexedColors.WHITE.getIndex());

        CellStyle estiloCabeceraEstado = excel.createCellStyle();
        Font fuenteCabeceraEstado = excel.createFont();
        fuenteCabeceraEstado.setBold(true);
        fuenteCabeceraEstado.setItalic(true);
        fuenteCabeceraEstado.setColor(IndexedColors.WHITE.getIndex());
        fuenteCabeceraEstado.setUnderline(Font.U_SINGLE);
        fuenteCabeceraEstado.setFontName("Aptos Narrow");

        estiloCabeceraEstado.setFont(fuenteCabeceraEstado);
        estiloCabeceraEstado.setFillForegroundColor(IndexedColors.DARK_BLUE.getIndex());
        estiloCabeceraEstado.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        estiloCabeceraEstado.setAlignment(HorizontalAlignment.CENTER);
        estiloCabeceraEstado.setVerticalAlignment(VerticalAlignment.CENTER);
        estiloCabeceraEstado.setBorderBottom(BorderStyle.MEDIUM);
        estiloCabeceraEstado.setBottomBorderColor(IndexedColors.WHITE.getIndex());
        estiloCabeceraEstado.setBorderTop(BorderStyle.MEDIUM);
        estiloCabeceraEstado.setTopBorderColor(IndexedColors.WHITE.getIndex());
        estiloCabeceraEstado.setBorderLeft(BorderStyle.MEDIUM);
        estiloCabeceraEstado.setLeftBorderColor(IndexedColors.WHITE.getIndex());
        estiloCabeceraEstado.setBorderRight(BorderStyle.MEDIUM);
        estiloCabeceraEstado.setRightBorderColor(IndexedColors.WHITE.getIndex());

        CellStyle estiloContador = excel.createCellStyle();
        estiloContador.setAlignment(HorizontalAlignment.CENTER);
        estiloContador.setVerticalAlignment(VerticalAlignment.CENTER);
        estiloContador.setFont(fuentePredeterminada);

        CellStyle centradoEstilo = excel.createCellStyle();
        centradoEstilo.setVerticalAlignment(VerticalAlignment.CENTER);

        CellStyle pasadoEstilo = excel.createCellStyle();
        pasadoEstilo.cloneStyleFrom(estiloContador);
        pasadoEstilo.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        pasadoEstilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle fallidoEstilo = excel.createCellStyle();
        fallidoEstilo.cloneStyleFrom(estiloContador);
        fallidoEstilo.setFillForegroundColor(IndexedColors.CORAL.getIndex());
        fallidoEstilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle omitidoEstilo = excel.createCellStyle();
        omitidoEstilo.cloneStyleFrom(estiloContador);
        omitidoEstilo.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        omitidoEstilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        Row filaCabecera = resumenHoja.createRow(0);
        filaCabecera.createCell(0).setCellValue("CARACTERISTICA");
        filaCabecera.createCell(1).setCellValue("ESCENARIO");
        filaCabecera.createCell(2).setCellValue("PASADO");
        filaCabecera.createCell(3).setCellValue("FALLIDO");
        filaCabecera.createCell(4).setCellValue("OMITIDO");
        filaCabecera.setHeightInPoints(30);

        for (int i = 0; i < 2; i++) {
            Cell cell = filaCabecera.getCell(i);
            if (cell != null) {
                cell.setCellStyle(estiloCabecera);
            }
        }
        for (int i = 2; i < 5; i++) {
            Cell cell = filaCabecera.getCell(i);
            if (cell != null) {
                cell.setCellStyle(estiloCabeceraEstado);
            }
        }

        int numeroFila = 1;
        for (JsonNode caracteristica : nodoRaiz) {
            String nombreCaracteristica = caracteristica.get("name") != null ? caracteristica.get("name").asText() : "No hay nombre";
            JsonNode elementosNode = caracteristica.get("elements");

            if (elementosNode != null) {
                for (JsonNode escenario : elementosNode) {
                    String nombreEscenario = escenario.get("name") != null ? escenario.get("name").asText() : "No hay escenario";

                    int pasadoContador = 0;
                    int fallidoContador = 0;
                    int omitidoContador = 0;

                    JsonNode pasosNodo = escenario.get("steps");
                    if (pasosNodo != null) {
                        for (JsonNode paso : pasosNodo) {
                            String pasoEstado = paso.get("result") != null && paso.get("result").get("status") != null ? paso.get("result").get("status").asText() : "skipped";
                            switch (pasoEstado.toLowerCase()) {
                                case "passed":
                                    pasadoContador++;
                                    break;
                                case "failed":
                                    fallidoContador++;
                                    break;
                                default:
                                    omitidoContador++;
                                    break;
                            }
                        }
                    }
                    Row fila = resumenHoja.createRow(numeroFila++);
                    fila.setHeightInPoints(25);
                    Cell celdaCaracteristica = fila.createCell(0);
                    celdaCaracteristica.setCellValue(nombreCaracteristica);
                    celdaCaracteristica.setCellStyle(centradoEstilo);
                    Cell celdaEscenario = fila.createCell(1);
                    celdaEscenario.setCellValue(nombreEscenario);
                    celdaEscenario.setCellStyle(centradoEstilo);
                    fila.createCell(2).setCellValue(pasadoContador);
                    fila.createCell(3).setCellValue(fallidoContador);
                    fila.createCell(4).setCellValue(omitidoContador);

                    fila.getCell(2).setCellStyle(pasadoEstilo);
                    fila.getCell(3).setCellStyle(fallidoEstilo);
                    fila.getCell(4).setCellStyle(omitidoEstilo);
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            resumenHoja.autoSizeColumn(i);
        }
    }
}