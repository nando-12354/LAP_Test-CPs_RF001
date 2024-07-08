package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "definitions",
        tags = "@reporte",
        plugin = {"html:target/cucumber-report/index.html","json:target/cucumber-report/cucumber.json"})
public class runtest {
    @AfterClass
    public static void generateExcelReport() throws IOException {
        reporteExcel report = new reporteExcel();
        report.generateReport();

        // Agregar un enlace al reporte Excel en el reporte HTML de Cucumber
        addLinkToCucumberReport();
    }

    private static void addLinkToCucumberReport() {
        String excelReportLink = "<a href=\"../excel-reporte/CPs_LAP.xlsx\" target=\"_blank\">Ver Reporte Excel</a>";
        System.out.println(excelReportLink);
    }
}