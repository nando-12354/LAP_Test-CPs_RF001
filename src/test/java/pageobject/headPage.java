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
        Assert.assertTrue("Error!. La columna '" + cabecera.trim() + "' no se pudo validar.", cabeceraValido);
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
        Assert.assertTrue("Error!. La columna '" + cabecerab.trim() + "' no se pudo validar.", cabecerabValido);
    }
    public void validarCabeceraGrillaC(String cabecerac) {
        boolean cabeceracValido = false;
        String xpath = "//p-table//table/thead//th/p-checkbox//label[normalize-space(text())='" + cabecerac.trim() + "']";

        try {
            WebElement cabeceracElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            String textoReal = cabeceracElemento.getText().trim();
            System.out.println("Campo: '" + textoReal + "'");
            if (cabeceracElemento.isDisplayed() && textoReal.equals(cabecerac.trim())) {
                cabeceracValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó el texto de la cabecera
        }
        Assert.assertTrue("Error!. La columna '" + cabecerac.trim() + "' no se pudo validar.", cabeceracValido);
    }
    public void validarCabeceraGrillaD(String cabecerad) {
        boolean cabeceradValido = false;
        String xpath = "//table/thead/tr/th[normalize-space(text())='" + cabecerad.trim() + "']";

        try {
            WebElement cabeceradElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            String textoReal = cabeceradElemento.getText().trim();
            System.out.println("Campo: '" + textoReal + "'");
            if (cabeceradElemento.isDisplayed() && textoReal.equals(cabecerad.trim())) {
                cabeceradValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó el texto de la cabecera
        }
        Assert.assertTrue("Error!. La columna '" + cabecerad.trim() + "' no se pudo validar.", cabeceradValido);
    }
}
