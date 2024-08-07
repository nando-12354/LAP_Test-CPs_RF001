package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
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
    @FindBy(xpath = "//p-button[@icon='pi pi-print']/button") protected WebElement btnPdfB;
    public pdfPage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Metodo que hace click en el boton de descarga de pdf
     */
    public void clickBotonPdf() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(btnPdf));
        btnPdf.click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw e;
        }
    }
    public void clickBotonPdfB() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(btnPdfB));
        btnPdfB.click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw e;
        }
    }
}
