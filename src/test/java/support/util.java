package support;

import definitions.hooks;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

public class util extends hooks {
    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    public static SlowWebDriver slowDriver;
    private Alert dialogo;

    public util() {
        slowDriver = new SlowWebDriver(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        js = (JavascriptExecutor) driver;
    }
    public void ventanaActiva(){
        Set<String> identificadores = driver.getWindowHandles();
        for (String identificador:identificadores){
            driver.switchTo().window(identificador);
        }
    }
    public void ventanaInicial(){
        driver.close();
        driver.switchTo().window("");
    }
    public void scrollVertical(WebElement scroll){
        js.executeScript("arguments[0].scrollIntoView(true);", scroll);
    }
    public void limpiarCampo(WebElement limpiar){
        js.executeScript("arguments[0].value = '';", limpiar);
    }
    public void localizadorBoton(WebElement localizador){
        js.executeScript("arguments[0].click();", localizador);
    }
    public void aceptarDialogo() {
        dialogo = driver.switchTo().alert();
        dialogo.accept();
    }
    public void obtenerTextoDialogo(String mensaje) {
        dialogo = driver.switchTo().alert();
        Assert.assertEquals(mensaje, dialogo.getText());
    }
    public static void evidencias() throws IOException {
        Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("ddMMyyy_HHmmssSSS");
            String path = "C:\\Users\\Nando\\IdeaProjects\\LAP_AutoTest-RF001\\target\\evidencias\\";
            String nombre = formato.format(fecha)+"_evidencia.jpg";

            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(path+nombre));
    }
}
