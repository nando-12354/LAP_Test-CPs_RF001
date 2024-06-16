package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modayudaPage extends util {

    public modayudaPage() {
        PageFactory.initElements(driver, this);
    }

}
