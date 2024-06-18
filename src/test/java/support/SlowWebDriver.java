package support;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.List;
import java.util.Set;

public class SlowWebDriver extends RemoteWebDriver {
    private final WebDriver driver;
    private long delay = 1500;

    public SlowWebDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }

    private void slowDown() {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void get(String url) {
        slowDown();
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        slowDown();
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        slowDown();
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }
}
