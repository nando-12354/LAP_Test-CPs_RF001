package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class titulosPage extends util {
    public titulosPage() {
        PageFactory.initElements(slowDriver, this);
    }
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
