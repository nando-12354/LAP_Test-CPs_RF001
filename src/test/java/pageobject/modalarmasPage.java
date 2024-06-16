package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modalarmasPage extends util {
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/alarmas/configuracion-alarmas']") protected WebElement opConfigurarAlarmas;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/alarmas/monitoreo-alarma']") protected WebElement opMonitorearAlarmas;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/alarmas/consulta-alarmas']") protected WebElement opAlarmasGeneradas;
    public modalarmasPage() {
        PageFactory.initElements(driver, this);
    }
    public void ingresarOpcionConfigurarAlarmas(){
        wait.until(ExpectedConditions.visibilityOf(opConfigurarAlarmas));
        opConfigurarAlarmas.click();
    }
    public void ingresarOpcionMonitorearAlarmas(){
        wait.until(ExpectedConditions.visibilityOf(opMonitorearAlarmas));
        opMonitorearAlarmas.click();
    }
    public void ingresarOpcionAlarmasGeneradas(){
        wait.until(ExpectedConditions.visibilityOf(opAlarmasGeneradas));
        opAlarmasGeneradas.click();
    }
}
