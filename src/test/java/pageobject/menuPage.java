package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class menuPage extends util {
    @FindBy(xpath = "//div/div/ul/li[1]") protected WebElement modSeguridad;
    @FindBy(xpath = "//div/div/ul/li[2]") protected WebElement modConfgeneral;
    @FindBy(xpath = "//div/div/ul/li[3]") protected WebElement modMantenimiento;
    @FindBy(xpath = "//div/div/ul/li[4]") protected WebElement modOperacion;
    @FindBy(xpath = "//div/div/ul/li[5]") protected WebElement modRehabilitacion;
    @FindBy(xpath = "//div/div/ul/li[6]") protected WebElement modConsultas;
    @FindBy(xpath = "//div/div/ul/li[7]") protected WebElement modReportes;
    @FindBy(xpath = "//div/div/ul/li[8]") protected WebElement modAlarmas;
    @FindBy(xpath = "//div/div/ul/li[9]") protected WebElement modAyuda;
    public menuPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarModSeguridad(){
        wait.until(ExpectedConditions.visibilityOf(modSeguridad));
        modSeguridad.click();
    }
    public void validarModConfgeneral(){
        wait.until(ExpectedConditions.visibilityOf(modConfgeneral));
        modConfgeneral.click();
    }
    public void validarModMantenimiento(){
        wait.until(ExpectedConditions.visibilityOf(modMantenimiento));
        modMantenimiento.click();
    }
    public void validarModOperacion(){
        wait.until(ExpectedConditions.visibilityOf(modOperacion));
        scrollVertical(modOperacion);
        modOperacion.click();
    }
    public void validarModRehabilitacion(){
        wait.until(ExpectedConditions.visibilityOf(modRehabilitacion));
        scrollVertical(modRehabilitacion);
        modRehabilitacion.click();
    }
    public void validarModConsultas(){
        wait.until(ExpectedConditions.visibilityOf(modConsultas));
        scrollVertical(modConsultas);
        modConsultas.click();
    }
    public void validarModReportes(){
        wait.until(ExpectedConditions.visibilityOf(modReportes));
        scrollVertical(modReportes);
        modReportes.click();
    }
    public void validarModAlarmas(){
        wait.until(ExpectedConditions.visibilityOf(modAlarmas));
        modAlarmas.click();
    }
    public void validarModAyuda(){
        wait.until(ExpectedConditions.visibilityOf(modAyuda));
        modAyuda.click();
    }
}
