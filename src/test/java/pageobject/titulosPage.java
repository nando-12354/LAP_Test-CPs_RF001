package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

/**
 * Clase que permite validar los titulos de la pagina web y
 * los elementos de la pagina web son identificados por su etiqueta HTML y su contenido y estan configurados directamente en el metodo
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class titulosPage extends util {
    public titulosPage() {
        PageFactory.initElements(slowDriver, this);
    }

    /**
     * Metodo que valida el titulo principal de cada pantalla de la pagina web
     * @param titulo : Titulo principal de la pagina web
     */
    public void validarTitulo(String titulo){
        boolean tituloValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='" + titulo + "']")));
        String xpath = "//h1[text()='" + titulo + "']";
        try {
            WebElement titutloElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (titutloElemento.isDisplayed() && titutloElemento.getText().equals(titulo)) {
                tituloValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó el titulo
        }
        Assert.assertTrue("El titulo " + titulo + " no coincide.", tituloValido);
    }

    /**
     * Metodo que valida el subtitulo de cada pantalla de la pagina web
     * @param subtitulo : Subtitulo de la pagina web
     */
    public void validarSubTitulo(String subtitulo){
        boolean subtituloValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2/span[text()='" + subtitulo + "']")));
        String xpath = "//h2/span[text()='" + subtitulo + "']";
        try {
            WebElement subtitutloElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (subtitutloElemento.isDisplayed() && subtitutloElemento.getText().equals(subtitulo)) {
                subtituloValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó el subtitulo
        }
        Assert.assertTrue("El subtitulo " + subtitulo + " no coincide.", subtituloValido);
    }

    /**
     * Metodo que valida el titulo del popup de representante
     * @param representante : Titulo del popup de representante
     */
    public void validarTituloRepresentante(String representante){
        boolean representanteValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='" + representante + "']")));
        String xpath = "//h5[text()='" + representante + "']";
        try {
            WebElement representanteElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (representanteElemento.isDisplayed() && representanteElemento.getText().equals(representante)) {
                representanteValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se pudo validar
        }
        Assert.assertTrue("El " + representante + " no coincide.", representanteValido);
    }

    /**
     * Metodo que valida el titulo del popup de detalle
     * @param detalle : Titulo del popup de detalle
     */
    public void validarTituloDetalle(String detalle){
        boolean representanteValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='dialog']//span[text()='" + detalle + "'])[1]")));
        String xpath = "(//div[@role='dialog']//span[text()='" + detalle + "'])[1]";
        try {
            WebElement representanteElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (representanteElemento.isDisplayed() && representanteElemento.getText().equals(detalle)) {
                representanteValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se pudo validar
        }
        Assert.assertTrue("El " + detalle + " no coincide.", representanteValido);
    }

    /**
     * Metodo que valida el titulo de la informacion procesada del modulo de Reportes
     * @param infoprocesada : Titulo de la informacion procesada
     */
    public void validarTituloInformacionProcesada(String infoprocesada){
        boolean informacionValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='" + infoprocesada + "']")));
        String xpath = "//h5[text()='" + infoprocesada + "']";
        try {
            WebElement informacionElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (informacionElemento.isDisplayed() && informacionElemento.getText().equals(infoprocesada)) {
                informacionValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se pudo validar
        }
        Assert.assertTrue("La " + infoprocesada + " no se pudo validar.", informacionValido);
    }
}
