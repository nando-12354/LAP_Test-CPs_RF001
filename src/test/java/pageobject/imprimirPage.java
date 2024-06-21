package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class imprimirPage extends util {
    @FindBy(xpath = "//p-button[@icon='pi pi-print']/button") protected WebElement btnImprimir;
    @FindBy(xpath = "(//div[@class='dialog-botones']//p-button/button)[1]") protected WebElement btnImprimirB;
    @FindBy(xpath = "(//p-button[@styleclass='p-button-success']/button[@type='button'])[1]") protected WebElement btnImprimirC;
    @FindBy(xpath = "(//p-button[@styleclass='p-button-success']/button[@type='button'])[2]") protected WebElement btnImprimirD;
    @FindBy(xpath = "(//p-button[@icon='pi pi-print']/button)[2]") protected WebElement btnImprimirResumen;

    public imprimirPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void clickBotonImprimir(){
        wait.until(ExpectedConditions.visibilityOf(btnImprimir));
        btnImprimir.click();
    }
    public void clickBotonImprimirB(){
        wait.until(ExpectedConditions.visibilityOf(btnImprimirB));
        btnImprimirB.click();
    }
    public void clickBotonImprimirC(){
        wait.until(ExpectedConditions.visibilityOf(btnImprimirC));
        btnImprimirC.click();
    }
    public void clickBotonImprimirD(){
        wait.until(ExpectedConditions.visibilityOf(btnImprimirD));
        btnImprimirD.click();
    }
    public void clickBotonImprimirResumen(){
        wait.until(ExpectedConditions.visibilityOf(btnImprimirResumen));
        btnImprimirResumen.click();
    }
}
