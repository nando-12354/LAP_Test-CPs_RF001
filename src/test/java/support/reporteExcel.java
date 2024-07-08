package support;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class reporteExcel {

    private static String formatoFecha(String tiempo) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            inputFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = inputFormat.parse(tiempo);

            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            return outputFormat.format(date);
        } catch (Exception e) {
            System.err.println("Error al formatear timestamp: " + e.getMessage());
            e.printStackTrace();
            return "Fecha/Hora no disponible";
        }
    }
    private static String traducirEstado(String estado) {
        switch (estado.toLowerCase()) {
            case "passed":
                return "Pasado";
            case "failed":
                return "Fallido";
            default:
                return "Esperando";
        }
    }
    public static void generateReport() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(new File("target/cucumber-report/cucumber.json"));

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Reporte de Pruebas");
        sheet.setDisplayGridlines(false);

        Font fuentePredeterminada = workbook.createFont();
        fuentePredeterminada.setFontName("Aptos Narrow");

        CellStyle cabeceraEstilo = workbook.createCellStyle();
        Font cabeceraFuente = workbook.createFont();
        cabeceraFuente.setBold(true);
        cabeceraFuente.setUnderline(Font.U_SINGLE);
        cabeceraFuente.setColor(IndexedColors.BLACK.getIndex());
        cabeceraFuente.setFontName("Aptos Narrow");
        cabeceraEstilo.setFont(cabeceraFuente);
        cabeceraEstilo.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        cabeceraEstilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cabeceraEstilo.setAlignment(HorizontalAlignment.CENTER);
        cabeceraEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
        // Definir bordes blancos para la cabecera
        cabeceraEstilo.setBorderBottom(BorderStyle.MEDIUM);
        cabeceraEstilo.setBottomBorderColor(IndexedColors.WHITE.getIndex());
        cabeceraEstilo.setBorderTop(BorderStyle.MEDIUM);
        cabeceraEstilo.setTopBorderColor(IndexedColors.WHITE.getIndex());
        cabeceraEstilo.setBorderLeft(BorderStyle.MEDIUM);
        cabeceraEstilo.setLeftBorderColor(IndexedColors.WHITE.getIndex());
        cabeceraEstilo.setBorderRight(BorderStyle.MEDIUM);
        cabeceraEstilo.setRightBorderColor(IndexedColors.WHITE.getIndex());

        CellStyle estiloCaracteristica = workbook.createCellStyle();
        estiloCaracteristica.setVerticalAlignment(VerticalAlignment.CENTER);
        estiloCaracteristica.setFont(fuentePredeterminada);

        CellStyle escenarioEstilo = workbook.createCellStyle();
        escenarioEstilo.setAlignment(HorizontalAlignment.LEFT);
        escenarioEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
        escenarioEstilo.setFont(fuentePredeterminada);

        CellStyle bordeEstilo = workbook.createCellStyle();
        bordeEstilo.setBorderBottom(BorderStyle.MEDIUM);
        bordeEstilo.setBottomBorderColor(IndexedColors.WHITE1.getIndex());
        bordeEstilo.setBorderTop(BorderStyle.MEDIUM);
        bordeEstilo.setTopBorderColor(IndexedColors.WHITE1.getIndex());
        bordeEstilo.setBorderLeft(BorderStyle.MEDIUM);
        bordeEstilo.setLeftBorderColor(IndexedColors.WHITE1.getIndex());
        bordeEstilo.setBorderRight(BorderStyle.MEDIUM);
        bordeEstilo.setRightBorderColor(IndexedColors.WHITE1.getIndex());
        bordeEstilo.setFont(fuentePredeterminada);

        CellStyle passedStyle = workbook.createCellStyle();
        passedStyle.cloneStyleFrom(bordeEstilo);
        passedStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        passedStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle failedStyle = workbook.createCellStyle();
        failedStyle.cloneStyleFrom(bordeEstilo);
        failedStyle.setFillForegroundColor(IndexedColors.CORAL.getIndex());
        failedStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle skippedStyle = workbook.createCellStyle();
        skippedStyle.cloneStyleFrom(bordeEstilo);
        skippedStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        skippedStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle bordeNegroInferiorEstilo = workbook.createCellStyle();
        bordeNegroInferiorEstilo.cloneStyleFrom(bordeEstilo);
        bordeNegroInferiorEstilo.setBorderBottom(BorderStyle.MEDIUM);
        bordeNegroInferiorEstilo.setBottomBorderColor(IndexedColors.BLACK.getIndex());

        Row cabeceraFila = sheet.createRow(0);
        cabeceraFila.createCell(0).setCellValue("CARACTERÍSTICA");
        cabeceraFila.createCell(1).setCellValue("ESCENARIO");
        cabeceraFila.createCell(2).setCellValue("PASOS");
        cabeceraFila.createCell(3).setCellValue("ESTADO");
        cabeceraFila.createCell(4).setCellValue("DURACIÓN");
        cabeceraFila.createCell(5).setCellValue("FECHA Y HORA");
        cabeceraFila.setHeightInPoints(30);

        for (int i = 0; i < 6; i++) {
            Cell cell = cabeceraFila.getCell(i);
            if (cell != null) {
                cell.setCellStyle(cabeceraEstilo); // Aplicar estilo a cada celda de la cabecera
            }
        }

        int pasoCorrecto = 0;
        int pasoFallido = 0;
        int pasoEspera = 0;

        int rowNum = 1;
        for (JsonNode feature : rootNode) {
            String featureName = feature.get("name") != null ? feature.get("name").asText() : "No hay nombre";
            JsonNode elementsNode = feature.get("elements");
            String featureStartTimestamp = feature.get("start_timestamp") != null ? feature.get("start_timestamp").asText() : "Fecha/Hora no disponible";

            if (elementsNode != null) {
                int featureStartRow = rowNum;
                for (JsonNode scenario : elementsNode) {
                    String scenarioName = scenario.get("name") != null ? scenario.get("name").asText() : "No hay escenario";
                    JsonNode stepsNode = scenario.get("steps");
                    String scenarioStartTimestamp = scenario.get("start_timestamp") != null ? scenario.get("start_timestamp").asText() : "Fecha/Hora no disponible";

                    if (stepsNode != null) {
                        int scenarioStartRow = rowNum;
                        for (JsonNode step : stepsNode) {
                            Row row = sheet.createRow(rowNum++);
                            String stepName = step.get("name") != null ? step.get("name").asText() : "No hay nombre";
                            String stepStatus = step.get("result") != null && step.get("result").get("status") != null ? step.get("result").get("status").asText() : "No hay estado";
                            String translatedStatus = traducirEstado(stepStatus);
                            long durationNs = step.get("result") != null && step.get("result").get("duration") != null ? step.get("result").get("duration").asLong() : -1;
                            String stepDuration = durationNs != -1 ? formatDuration(durationNs) : "No hay duración";
                            String stepStartTime = step.get("start_timestamp") != null ? step.get("start_timestamp").asText() : scenarioStartTimestamp;


                            Cell stepNameCell = row.createCell(2);
                            stepNameCell.setCellValue(stepName);
                            if ("passed".equalsIgnoreCase(stepStatus)) {
                                stepNameCell.setCellStyle(passedStyle);
                            } else if ("failed".equalsIgnoreCase(stepStatus)) {
                                stepNameCell.setCellStyle(failedStyle);
                            } else if ("skipped".equalsIgnoreCase(stepStatus)) {
                                stepNameCell.setCellStyle(skippedStyle);
                            } else {
                                stepNameCell.setCellStyle(bordeEstilo);
                            }

                            Cell stepStatusCell = row.createCell(3);
                            stepStatusCell.setCellValue(translatedStatus);
                            if ("passed".equalsIgnoreCase(stepStatus)) {
                                stepStatusCell.setCellStyle(passedStyle);
                            } else if ("failed".equalsIgnoreCase(stepStatus)) {
                                stepStatusCell.setCellStyle(failedStyle);
                            } else if ("skipped".equalsIgnoreCase(stepStatus)) {
                                stepStatusCell.setCellStyle(skippedStyle);
                            } else {
                                stepStatusCell.setCellStyle(bordeEstilo);
                            }

                            Cell stepDurationCell = row.createCell(4);
                            stepDurationCell.setCellValue(stepDuration);
                            if ("passed".equalsIgnoreCase(stepStatus)) {
                                stepDurationCell.setCellStyle(passedStyle);
                            } else if ("failed".equalsIgnoreCase(stepStatus)) {
                                stepDurationCell.setCellStyle(failedStyle);
                            } else if ("skipped".equalsIgnoreCase(stepStatus)) {
                                stepDurationCell.setCellStyle(skippedStyle);
                            } else {
                                stepDurationCell.setCellStyle(bordeEstilo);
                            }

                            Cell stepStartTimeCell = row.createCell(5);
                            stepStartTimeCell.setCellValue(formatoFecha(stepStartTime));
                            if ("passed".equalsIgnoreCase(stepStatus)) {
                                stepStartTimeCell.setCellStyle(passedStyle);
                            } else if ("failed".equalsIgnoreCase(stepStatus)) {
                                stepStartTimeCell.setCellStyle(failedStyle);
                            } else if ("skipped".equalsIgnoreCase(stepStatus)) {
                                stepStartTimeCell.setCellStyle(skippedStyle);
                            } else {
                                stepStartTimeCell.setCellStyle(bordeEstilo);
                            }

                            // Incrementar contadores según el estado del paso
                            if ("passed".equalsIgnoreCase(stepStatus)) {
                                pasoCorrecto++;
                            } else if ("failed".equalsIgnoreCase(stepStatus)) {
                                pasoFallido++;
                            } else if ("skipped".equalsIgnoreCase(stepStatus)) {
                                pasoEspera++;
                            }
                        }
                        // Combina celdas para la característica y el escenario
                        sheet.addMergedRegion(new CellRangeAddress(scenarioStartRow, rowNum - 1, 0, 0));
                        sheet.addMergedRegion(new CellRangeAddress(scenarioStartRow, rowNum - 1, 1, 1));

                        Row lastScenarioRow = sheet.getRow(rowNum - 1);
                        for (int i = 0; i < 6; i++) {
                            Cell cell = lastScenarioRow.getCell(i);
                            if (cell != null) {
                                cell.setCellStyle(bordeNegroInferiorEstilo);
                            } else {
                                cell = lastScenarioRow.createCell(i);
                                cell.setCellStyle(bordeNegroInferiorEstilo);
                            }
                        }

                        Row scenarioRow = sheet.getRow(scenarioStartRow);
                        Cell featureCell = scenarioRow.createCell(0);
                        featureCell.setCellValue(featureName);
                        featureCell.setCellStyle(estiloCaracteristica);

                        Cell scenarioCell = scenarioRow.createCell(1);
                        scenarioCell.setCellValue(scenarioName);
                        scenarioCell.setCellStyle(escenarioEstilo);
                    }
                }
            }
        }

        // Crear una nueva hoja para la tabla de resumen
        Sheet summarySheet = workbook.createSheet("Resumen");
        Row summaryHeaderRow = summarySheet.createRow(0);
        summaryHeaderRow.createCell(0).setCellValue("Característica");
        summaryHeaderRow.createCell(1).setCellValue("Escenario");
        summaryHeaderRow.createCell(2).setCellValue("Estado");
        summaryHeaderRow.createCell(3).setCellValue("Cantidad");

        CellStyle centeredStyle = workbook.createCellStyle();
        centeredStyle.setAlignment(HorizontalAlignment.CENTER);

        // Crear estilos
        CellStyle summaryHeaderRowStyle = workbook.createCellStyle();
        Font headerFontB = workbook.createFont();
        headerFontB.setBold(true);
        headerFontB.setColor(IndexedColors.BLACK.getIndex());
        headerFontB.setUnderline(Font.U_SINGLE); // Subrayado
        headerFontB.setFontName("Aptops Narrow");

        summaryHeaderRowStyle.setFont(headerFontB);
        summaryHeaderRowStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        summaryHeaderRowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        summaryHeaderRowStyle.setAlignment(HorizontalAlignment.CENTER);
        summaryHeaderRowStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        summaryHeaderRow.setHeightInPoints(30);

        // Asignar colores de fondo según el estado
        CellStyle resumenpassedStyle = workbook.createCellStyle();
        resumenpassedStyle.cloneStyleFrom(bordeEstilo);
        resumenpassedStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        resumenpassedStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle resumenfailedStyle = workbook.createCellStyle();
        resumenfailedStyle.cloneStyleFrom(bordeEstilo);
        resumenfailedStyle.setFillForegroundColor(IndexedColors.CORAL.getIndex());
        resumenfailedStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle resumenskippedStyle = workbook.createCellStyle();
        resumenskippedStyle.cloneStyleFrom(bordeEstilo);
        resumenskippedStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        resumenskippedStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        int summaryRowNum = 1;
        for (JsonNode feature : rootNode) {
            String featureName = feature.get("name") != null ? feature.get("name").asText() : "No hay nombre";
            JsonNode elementsNode = feature.get("elements");

            if (elementsNode != null) {
                for (JsonNode scenario : elementsNode) {
                    String scenarioName = scenario.get("name") != null ? scenario.get("name").asText() : "No hay escenario";
                    JsonNode stepsNode = scenario.get("steps");

                    if (stepsNode != null) {
                        int passedCount = 0;
                        int failedCount = 0;
                        int skippedCount = 0;

                        for (JsonNode step : stepsNode) {
                            String stepStatus = step.get("result") != null && step.get("result").get("status") != null ? step.get("result").get("status").asText() : "No hay estado";

                            if ("passed".equalsIgnoreCase(stepStatus)) {
                                passedCount++;
                            } else if ("failed".equalsIgnoreCase(stepStatus)) {
                                failedCount++;
                            } else if ("skipped".equalsIgnoreCase(stepStatus)) {
                                skippedCount++;
                            }

                            // Escribir en la hoja de Resumen
                            Row summaryDataRow = summarySheet.createRow(summaryRowNum++);
                            summaryDataRow.createCell(0).setCellValue(featureName);
                            summaryDataRow.createCell(1).setCellValue(scenarioName);
                            summaryDataRow.createCell(2).setCellValue("Pasados");
                            Cell stepStartTimeCell = summaryDataRow.createCell(2);
                            if ("Pasados".equalsIgnoreCase(stepStatus)) {
                                stepStartTimeCell.setCellStyle(resumenpassedStyle);
                            } else if ("Fallidos".equalsIgnoreCase(stepStatus)) {
                                stepStartTimeCell.setCellStyle(resumenfailedStyle);
                            } else if ("Esperando".equalsIgnoreCase(stepStatus)) {
                                stepStartTimeCell.setCellStyle(resumenskippedStyle);
                            } else {
                                stepStartTimeCell.setCellStyle(bordeEstilo);
                            }
                            summaryDataRow.createCell(3).setCellValue(passedCount);
                            summaryDataRow.getCell(2).setCellStyle(resumenpassedStyle);

                            summaryDataRow = summarySheet.createRow(summaryRowNum++);
                            summaryDataRow.createCell(0).setCellValue(featureName);
                            summaryDataRow.createCell(1).setCellValue(scenarioName);
                            summaryDataRow.createCell(2).setCellValue("Fallidos");
                            summaryDataRow.createCell(3).setCellValue(failedCount);
                            summaryDataRow.setRowStyle(resumenfailedStyle);

                            summaryDataRow = summarySheet.createRow(summaryRowNum++);
                            summaryDataRow.createCell(0).setCellValue(featureName);
                            summaryDataRow.createCell(1).setCellValue(scenarioName);
                            summaryDataRow.createCell(2).setCellValue("Esperando");
                            summaryDataRow.createCell(3).setCellValue(skippedCount);
                            summaryDataRow.setRowStyle(resumenskippedStyle);
                        }
                    }
                }
            }
        }
        // Aplicar el estilo de fuente a todas las celdas del resumen
        for (int i = 0; i < summaryRowNum; i++) {
            Row row = summarySheet.getRow(i);
            if (row != null) {
                for (int j = 0; j < 4; j++) { // Iterar sobre las 4 columnas
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        CellStyle cellStyle = workbook.createCellStyle();
                        Font font = workbook.createFont();
                        font.setFontName("Aptops Narrow"); // Cambiar el nombre de la fuente si es necesario
                        font.setFontHeightInPoints((short) 10); // Tamaño de la fuente
                        cellStyle.setFont(font);
                        cell.setCellStyle(cellStyle);
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            summaryHeaderRow.getCell(i).setCellStyle(summaryHeaderRowStyle);
        }

        // Ajustar tamaño de las columnas para las celdas no combinadas
        for (int i = 2; i < 6; i++) {
            sheet.autoSizeColumn(i);
        }

        // Ajustar tamaño de las columnas combinadas manualmente
        adjustColumnWidth(sheet, 0);
        adjustColumnWidth(sheet, 1);

        // Ajustar tamaño de las columnas en la hoja de resumen
        summarySheet.autoSizeColumn(0);
        summarySheet.autoSizeColumn(1);
        summarySheet.autoSizeColumn(2);
        summarySheet.autoSizeColumn(3);

        // Crear el directorio de salida si no existe
        File outputDir = new File("target/excel-reporte");
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }
        try (FileOutputStream fileOut = new FileOutputStream(new File(outputDir, "CPs_LAP.xlsx"))) {
            workbook.write(fileOut);
        }
        workbook.close();
    }

    // Método para ajustar manualmente el ancho de las columnas combinadas
    private static void adjustColumnWidth(Sheet sheet, int column) {
        final int maxWidth = 40;
        int contentWidth = 0;

        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
                Cell cell = row.getCell(column);
                if (cell != null) {
                    String cellValue = cell.getStringCellValue();
                    if (cellValue != null && !cellValue.isEmpty()) {
                        int length = cellValue.length() + 5; // Ajuste para dar espacio adicional
                        contentWidth = Math.max(contentWidth, length);
                    }
                }
            }
        }
        // Ajustar el ancho de la columna basado en el contenido más largo, limitado al ancho máximo
        sheet.setColumnWidth(column, Math.min(contentWidth * 180, maxWidth * 260));
    }

    // Método para obtener el ancho de una celda
    private static int getCellWidth(Cell cell) {
        int cellWidth = (int) (cell.getStringCellValue().length() * 256 * 1.2);
        return cellWidth;
    }

    private static String formatDuration(long durationNs) {
        long millis = durationNs / 1_000_000;
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        millis %= 1000;
        seconds %= 60;

        return String.format("%dm %02ds %03dms", minutes, seconds, millis);
    }
}