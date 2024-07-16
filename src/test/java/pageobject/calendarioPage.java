package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

/**
 * POM para la pagina de calendario
 * Se definen los elementos y metodos de la pagina de calendario
 * Se extiende de la clase util para hacer uso de sus metodos
 * @see util Clase con métodos de uso general para la automatización de pruebas
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class calendarioPage extends util {
    @FindBy(xpath = "(//p-calendar[@inputid]//input)[1]") protected WebElement fechaDesde;
    @FindBy(xpath = "(//p-calendar[@inputid]//input)[2]") protected WebElement fechaHasta;
    @FindBy(xpath = "(//p-calendar[@inputid]//input)[3]") protected WebElement fechaVuelo;

    public calendarioPage() {
        PageFactory.initElements(slowDriver, this);
    }

    /**
     * Selecciona la fecha desde del calendario
     * @param desde Fecha desde en formato dd/mm/yyyy
     */
    public void seleccionarFechaDesde(String desde){
        wait.until(ExpectedConditions.visibilityOf(fechaDesde));
        limpiarCampo(fechaDesde);
        fechaDesde.sendKeys(desde);
        fechaDesde.sendKeys(Keys.TAB);
    }
    /**
     * Selecciona la fecha hasta del calendario
     * @param hasta Fecha hasta en formato dd/mm/yyyy
     */
    public void seleccionarFechaHasta(String hasta){
        wait.until(ExpectedConditions.visibilityOf(fechaHasta));
        limpiarCampo(fechaHasta);
        fechaHasta.sendKeys(hasta);
        fechaHasta.sendKeys(Keys.TAB);
    }
    /**
     * Selecciona la fecha del vuelo del calendario
     * @param vuelo Fecha del vuelo en formato dd/mm/yyyy
     */
    public void seleccionarFechaVuelo(String vuelo){
        wait.until(ExpectedConditions.visibilityOf(fechaVuelo));
        fechaVuelo.sendKeys(vuelo);
    }
}
