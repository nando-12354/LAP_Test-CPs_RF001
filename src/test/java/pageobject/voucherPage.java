package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.util;

public class voucherPage extends util {
    @FindBy(xpath = "//p-button[@icon='pi pi-print']/button") protected WebElement btnVoucher;
    @FindBy(xpath = "//p-button[@icon='pi pi-file']/button") protected WebElement btnVoucherB;
    public voucherPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickBotonVoucher(){
        btnVoucher.click();
    }
    public void clickBotonVoucherB(){
        btnVoucherB.click();
    }
}
