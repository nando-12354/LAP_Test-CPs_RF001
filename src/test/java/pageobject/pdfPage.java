package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class pdfPage extends util {
    @FindBy(xpath = "//p-button[@icon='pi pi-file-pdf']/button") protected WebElement btnPdf;
    public pdfPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void clickBotonPdf(){
        wait.until(ExpectedConditions.visibilityOf(btnPdf));
        btnPdf.click();
    }
}
