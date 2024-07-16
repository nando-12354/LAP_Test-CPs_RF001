package pageobject;

import org.openqa.selenium.support.PageFactory;
import support.util;

public class modayudaPage extends util {

    public modayudaPage() {
        PageFactory.initElements(slowDriver, this);
    }
}
