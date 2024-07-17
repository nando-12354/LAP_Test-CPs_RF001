package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

/**
 * Clase que contiene el elemento del boton de descarga de pdf
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class pdfPage extends util {
    @FindBy(xpath = "//p-button[@icon='pi pi-file-pdf']/button") protected WebElement btnPdf;
    public pdfPage() {
        PageFactory.initElements(slowDriver, this);
    }

    /**
     * Metodo que hace click en el boton de descarga de pdf
     */
    public void clickBotonPdf(){
        wait.until(ExpectedConditions.visibilityOf(btnPdf));
        btnPdf.click();
    }
}
