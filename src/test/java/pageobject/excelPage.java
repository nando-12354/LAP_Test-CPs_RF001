package pageobject;

import org.openqa.selenium.support.PageFactory;
import support.util;

public class excelPage extends util {
    //@FindBy(xpath = "") protected WebElement;
    public excelPage() {
        PageFactory.initElements(driver, this);
    }
}