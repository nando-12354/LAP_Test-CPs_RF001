package pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

/**
 * Clase que contiene los elementos de la página principal y se obtiene el titulo de la pantalla de inicio de sesion
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class principalPage extends util {
    @FindBy(xpath = "//h1[text()='INICIAR SESIÓN']") protected WebElement txtTitulo;
    public principalPage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Metodo que valida el titulo de la pantalla de inicio de sesion
     * @param titulo : Titulo de la pantalla de inicio de sesion
     */
    public void validarTitulo(String titulo){
        wait.until(ExpectedConditions.visibilityOf(txtTitulo));
        Assert.assertEquals(titulo, "INICIAR SESIÓN", txtTitulo.getText());
    }
}
