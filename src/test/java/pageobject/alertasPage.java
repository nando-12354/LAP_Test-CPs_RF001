package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class alertasPage extends util {
    public alertasPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarAlerta(String alerta) {
        boolean alertaValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(.,'" + alerta + "')]")));
        String xpath = "//h1[contains(.,'" + alerta + "')]";

        try {
            WebElement alertaElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (alertaElemento.isDisplayed() && alertaElemento.getText().equals(alerta)) {
                alertaValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubico la alerta en el tiempo especificado
        }
        Assert.assertTrue("La alerta " + alerta + " no coincide.", alertaValido);
    }
    public void validarAviso(String aviso) {
        boolean avisoValido = false;
        String xpath = "(//div[contains(.,'" + aviso + "')])[5]";

        try {
            WebElement avisoElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (avisoElemento.isDisplayed() && avisoElemento.getText().equals(aviso)) {
                avisoValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubico el aviso en el tiempo especificado
        }
        Assert.assertTrue("El aviso " + aviso + " no coincide.", avisoValido);
    }
}



