package pageobject;

import org.openqa.selenium.support.PageFactory;
import support.util;

public class voucherPage extends util {
    //@FindBy(xpath = "") protected WebElement;
    public voucherPage() {
        PageFactory.initElements(driver, this);
    }
}
