package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

/**
 * Clase que contiene los elementos de los botones para exportar a Excel y sus respectivos metodos
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class excelPage extends util {
    @FindBy(xpath = "//p-button[@icon='pi pi-file-excel']/button") protected WebElement btnExcel;
    @FindBy(xpath = "(//div[@class='dialog-botones']//p-button/button)[2]") protected WebElement btnExcelB;
    @FindBy(xpath = "(//p-button[@styleclass='p-button-success']/button[@type='button'])[1]") protected WebElement btnExcelC;
    @FindBy(xpath = "(//p-button[@ptooltip='Exportar a Excel']/button)[2]") protected WebElement btnExcelD;

    public excelPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void clickBotonExcel(){
        wait.until(ExpectedConditions.visibilityOf(btnExcel));
        btnExcel.click();
    }
    public void clickBotonExcelB(){
        wait.until(ExpectedConditions.visibilityOf(btnExcelB));
        btnExcelB.click();
    }
    public void clickBotonExcelC(){
        wait.until(ExpectedConditions.visibilityOf(btnExcelC));
        btnExcelC.click();
    }
    public void clickBotonExcelD(){
        wait.until(ExpectedConditions.visibilityOf(btnExcelD));
        btnExcelD.click();
    }
}