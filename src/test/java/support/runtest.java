package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;
/**
 * Clase para ejecutar los tests de Cucumber
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 12-07-2024
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestión y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "definitions",
        tags = "@reporte",
        plugin = {"html:target/reporte-cucumber/index.html","json:target/reporte-cucumber/cucumber.json"})
public class runtest {
    @AfterClass
    public static void generaReporteExcel() throws IOException {
        reporteExcel reporte = new reporteExcel();
        reporte.generarReporte();
    }
}