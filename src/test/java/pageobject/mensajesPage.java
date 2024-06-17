package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class mensajesPage extends util {
    public mensajesPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarMensajeExito(String mensaje) {
        boolean mensajeValido = false;
        String xpath = "//div[contains(text(),'" + mensaje + "')]";

        try {
            WebElement mensajeElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (mensajeElemento.isDisplayed() && mensajeElemento.getText().equals(mensaje)) {
                mensajeValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // El mensaje no fue encontrado en el tiempo especificado
        }
        Assert.assertTrue("El mensaje " + mensaje + " no coincide.", mensajeValido);
    }
}
