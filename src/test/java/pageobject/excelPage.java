package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class excelPage extends util {
    @FindBy(xpath = "//p-button[@icon='pi pi-file-excel']/button") protected WebElement btnExcel;
    @FindBy(xpath = "(//div[@class='dialog-botones']//p-button/button)[2]") protected WebElement btnExcelB;
    @FindBy(xpath = "(//p-button[@styleclass='p-button-success']/button[@type='button'])[1]") protected WebElement btnExcelC;
    public excelPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickBotonExcel(){
        btnExcel.click();
    }
    public void clickBotonExcelB(){
        btnExcelB.click();
    }
    public void clickBotonExcelC(){
        wait.until(ExpectedConditions.visibilityOf(btnExcelC));
        btnExcelC.click();
    }
}