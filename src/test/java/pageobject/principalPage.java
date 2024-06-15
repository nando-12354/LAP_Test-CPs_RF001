package pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class principalPage extends util {
    @FindBy(xpath = "//h1[text()='INICIAR SESIÓN']") protected WebElement txtTitulo;
    public principalPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarTitulo(String titulo){
        wait.until(ExpectedConditions.visibilityOf(txtTitulo));
        Assert.assertEquals(titulo, "INICIAR SESIÓN", txtTitulo.getText());
    }
}
