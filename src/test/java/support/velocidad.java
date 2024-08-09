package support;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.List;
import java.util.Set;

/**
 * Clase que permite reducir la velocidad de ejecución de las pruebas
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 12-07-2024
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestión y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class velocidad extends RemoteWebDriver {
    private final WebDriver driver;
    private long demora = 500;

    public velocidad(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Método que establece la demora
     * @param demora Tiempo de demora
     */
    public void establecerDemora(long demora) {
        this.demora = demora;
    }

    /**
     * Método que reduce la velocidad
     */
    private void reducirVelocidad() {
        try {
            Thread.sleep(demora);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void get(String url) {
        reducirVelocidad();
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
        reducirVelocidad();
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        reducirVelocidad();
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
