package support;

import definitions.hooks;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

/**
 * Clase util que contiene metodos de utilidad para el manejo de elementos web
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestión y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class util extends hooks {
    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    public static velocidad slowDriver;
    private Alert dialogo;

    public util() {
        slowDriver = new velocidad(driver);
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

    public void manejarNuevaPestana(long segundosEspera) {
        String ventanaPrincipal = driver.getWindowHandle();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> todasLasVentanas = driver.getWindowHandles();

        for (String ventana : todasLasVentanas) {
            if (!ventana.equals(ventanaPrincipal)) {
                driver.switchTo().window(ventana);

                try {
                    Thread.sleep(segundosEspera * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.close();
                break;
            }
        }
        driver.switchTo().window(ventanaPrincipal);
    }

    /**
     * Metodo que permite hacer scroll vertical en la pagina web
     * @param scroll Elemento web al que se desea hacer scroll de forma vertical en la pagina web
     * <b>Este metodo es util para hacer scroll en paginas web que tienen elementos que no se visualizan</b>
     */
    public void scrollVertical(WebElement scroll){
        js.executeScript("arguments[0].scrollIntoView(true);", scroll);
    }

    /**
     * Metodo que permite borrar o limpiar un campo de texto
     * @param limpiar Elemento que se desea limpiar y se tiene llamar al metodo limpiarCampo();
     * <b>Este metodo es util para limpiar campos de texto en formularios web que contienen textos por defectos y se desea modificar</b>
     */
    public void limpiarCampo(WebElement limpiar){
        js.executeScript("arguments[0].value = '';", limpiar);
    }
    public void localizadorBoton(WebElement localizador){
        js.executeScript("arguments[0].click();", localizador);
    }

    /**
     * Metodo que permite aceptar la alerta que se muestra en la pagina web al realizar una accion
     */
    public void aceptarDialogo() {
        dialogo = driver.switchTo().alert();
        dialogo.accept();
    }

    /**
     * Metodo que permite obtener el texto de la alerta que se muestra en la pagina web al realizar una accion
     * @param mensaje Mensaje que se desea obtener de la alerta que se muestra en la pagina web
     * <b>Este metodo es util para validar mensajes de alertas que se muestran en la pagina web</b>
     */
    public void obtenerTextoDialogo(String mensaje) {
        dialogo = driver.switchTo().alert();
        Assert.assertEquals(mensaje, dialogo.getText());
    }

    /**
     * Metodo que permite evidenciar en formato JPG la ejecucion de los casos de pruebas de cucumber
     * Solo se debe configurar este metodo en cada paso donde requiera que captura la evidencia
     * @throws IOException Excepcion que se lanza si no se puede guardar la evidencia de la ejecucion de los casos de pruebas
     */
    public static void evidencias() throws IOException {
        Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("ddMMyyy_HHmmssSSS");
            String path = "C:\\Users\\Nando\\Desktop\\LAPTest_RF001-CPs\\target\\evidencias\\";
            String nombre = formato.format(fecha)+"_evidencia.jpg";

            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(path+nombre));
    }
}
