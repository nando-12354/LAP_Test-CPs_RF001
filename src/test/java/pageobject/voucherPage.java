package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

/**
 * Clase que permite realizar click en los botones de voucher de la pagina web
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class voucherPage extends util {
    @FindBy(xpath = "//p-button[@icon='pi pi-print']/button") protected WebElement btnVoucher;
    @FindBy(xpath = "//p-button[@icon='pi pi-file']/button") protected WebElement btnVoucherB;
    public voucherPage() {
        PageFactory.initElements(slowDriver, this);
    }

    /**
     * Metodo que realiza click en el boton de voucher
     */
    public void clickBotonVoucher(){
        wait.until(ExpectedConditions.visibilityOf(btnVoucher));
        btnVoucher.click();
    }

    /**
     * Metodo que realiza click en el boton de voucher B
     */
    public void clickBotonVoucherB(){
        wait.until(ExpectedConditions.visibilityOf(btnVoucherB));
        btnVoucherB.click();
    }
}
