package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

/**
 * Clase que contiene los metodos para validar el cuerpo de las grilla o tablas de la pagina
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class bodyPage extends util {
    public bodyPage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Metodo que valida los textos del cuerpo de la grilla o tabla de la pagina
     * @param cuerpo : Cuerpo de la grilla
     */
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
        Assert.assertTrue("Error!. EL campo '" + cuerpo.trim() + "' no es válido.", cuerpoValido);
    }

    /**
     * Metodo que valida los textos del cuerpo de la grilla o tabla de la pagina
     * @param cuerpob : Cuerpo de la grilla
     */
    public void validarCuerpoGrillaB(String cuerpob) {
        boolean cuerpobValido = false;
        String xpath = "//p-table//table/tbody/tr/td//strong[normalize-space(text())='" + cuerpob.trim() + "']";
        try {
            WebElement cuerpobElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            String textoReal = cuerpobElemento.getText().trim();
            System.out.println("Campo: '" + textoReal + "'");
            if (cuerpobElemento.isDisplayed() && textoReal.equals(cuerpob.trim())) {
                cuerpobValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó el texto del body
        }
        Assert.assertTrue("Error!. EL campo '" + cuerpob.trim() + "' no es válido.", cuerpobValido);
    }
}
