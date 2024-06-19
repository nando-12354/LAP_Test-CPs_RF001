package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class headPage extends util {
    public headPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarCabeceraGrilla(String cabecera) {
        boolean cabeceraValido = false;
        String xpath = "//p-table//table/thead/tr/th[normalize-space(text())='" + cabecera.trim() + "']";

        try {
            WebElement cabeceraElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            String textoReal = cabeceraElemento.getText().trim();
            System.out.println("Campo: '" + textoReal + "'");
            if (cabeceraElemento.isDisplayed() && textoReal.equals(cabecera.trim())) {
                cabeceraValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó el texto de la cabecera
        }
        Assert.assertTrue("El texto de la cabecera '" + cabecera.trim() + "' no coincide.", cabeceraValido);
    }
    public void validarCabeceraGrillaB(String cabecerab) {
        boolean cabecerabValido = false;
        String xpath = "//p-table//table/thead/tr/th/div[normalize-space(text())='" + cabecerab.trim() + "']";

        try {
            WebElement cabecerabElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            String textoReal = cabecerabElemento.getText().trim();
            System.out.println("Campo: '" + textoReal + "'");
            if (cabecerabElemento.isDisplayed() && textoReal.equals(cabecerab.trim())) {
                cabecerabValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó el texto de la cabecera
        }
        Assert.assertTrue("El texto de la cabecera '" + cabecerab.trim() + "' no coincide.", cabecerabValido);
    }
}
