package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class imprimirPage extends util {
    @FindBy(xpath = "//p-button[@icon='pi pi-print']/button") protected WebElement btnImprimir;
    @FindBy(xpath = "(//div[@class='dialog-botones']//p-button/button)[1]") protected WebElement btnImprimirB;
    public imprimirPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickBotonImprimir(){
        btnImprimir.click();
    }
    public void clickBotonImprimirB(){
        btnImprimirB.click();
    }
}
