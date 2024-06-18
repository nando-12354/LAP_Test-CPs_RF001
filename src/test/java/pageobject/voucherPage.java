package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class voucherPage extends util {
    @FindBy(xpath = "//p-button[@icon='pi pi-print']/button") protected WebElement btnVoucher;
    @FindBy(xpath = "//p-button[@icon='pi pi-file']/button") protected WebElement btnVoucherB;
    public voucherPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void clickBotonVoucher(){
        wait.until(ExpectedConditions.visibilityOf(btnVoucher));
        btnVoucher.click();
    }
    public void clickBotonVoucherB(){
        wait.until(ExpectedConditions.visibilityOf(btnVoucherB));
        btnVoucherB.click();
    }
}
