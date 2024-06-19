package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class bodyPage extends util {
    public bodyPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarCuerpoGrilla(String cuerpo) {
        boolean cuerpoValido = false;
        String xpath = "//p-table//table/tbody/tr/td[normalize-space(text())='" + cuerpo.trim() + "']";

        try {
            WebElement cuerpoElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            String textoReal = cuerpoElemento.getText().trim();
            System.out.println("Campo: '" + textoReal + "'");
            if (cuerpoElemento.isDisplayed() && textoReal.equals(cuerpo.trim())) {
                cuerpoValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó el texto del body
        }
        Assert.assertTrue("El texto del body '" + cuerpo.trim() + "' no coincide.", cuerpoValido);
    }
}
