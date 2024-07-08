package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class calendarioPage extends util {
    @FindBy(xpath = "(//p-calendar[@inputid]//input)[1]") protected WebElement fechaDesde;
    @FindBy(xpath = "(//p-calendar[@inputid]//input)[2]") protected WebElement fechaHasta;
    @FindBy(xpath = "(//p-calendar[@inputid]//input)[3]") protected WebElement fechaVuelo;

    public calendarioPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void seleccionarFechaDesde(String desde){
        wait.until(ExpectedConditions.visibilityOf(fechaDesde));
        limpiarCampo(fechaDesde);
        fechaDesde.sendKeys(desde);
        fechaDesde.sendKeys(Keys.TAB);
    }
    public void seleccionarFechaHasta(String hasta){
        wait.until(ExpectedConditions.visibilityOf(fechaHasta));
        limpiarCampo(fechaHasta);
        fechaHasta.sendKeys(hasta);
        fechaHasta.sendKeys(Keys.TAB);
    }
    public void seleccionarFechaVuelo(String vuelo){
        wait.until(ExpectedConditions.visibilityOf(fechaVuelo));
        fechaVuelo.sendKeys(vuelo);
    }
}
