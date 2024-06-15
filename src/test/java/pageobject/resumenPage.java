package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class resumenPage extends util {
    public resumenPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarResumen(String resumen) {
        boolean resumenValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div/span[text()='" + resumen + "']")));
        String xpath = "//div/div/span[text()='" + resumen + "']";

        try {
            WebElement resumenElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (resumenElemento.isDisplayed() && resumenElemento.getText().equals(resumen)) {
                resumenValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubico el resumen en el tiempo especificado
        }
        Assert.assertTrue("El resumen " + resumen + " no coincide.", resumenValido);
    }
}
