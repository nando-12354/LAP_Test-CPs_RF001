package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class mensajesPage extends util {
    public mensajesPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarMensajeExito(String mensaje) {
        boolean mensajeValido = false;
        String xpath = "//div[contains(text(),'" + mensaje + "')]";

        try {
            WebElement mensajeElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (mensajeElemento.isDisplayed() && mensajeElemento.getText().equals(mensaje)) {
                mensajeValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // El mensaje no fue encontrado en el tiempo especificado
        }
        Assert.assertTrue("El mensaje " + mensaje + " no es igual o no se encontró.", mensajeValido);
    }
    public void validarNotificacionExito(String notificacion) {
        boolean notificacionValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-toast/p-toast/div/p-toastitem/div/div//div[text()='" + notificacion + "']")));
        String xpath = "//app-toast/p-toast/div/p-toastitem/div/div//div[text()='" + notificacion + "']";

        try {
            WebElement notificacionElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (notificacionElemento.isDisplayed() && notificacionElemento.getText().equals(notificacion)) {
                notificacionValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // El mensaje no fue encontrado en el tiempo especificado
        }
        Assert.assertTrue("El mensaje ingresado " + notificacion + " no es igual al del TUUA.", notificacionValido);
    }
    public void validarMensajeErrorLogin(String mensajeErrorLogin) {
        boolean msjerrorValido = false;
        String xpath = "//div//span[@class='tuua-mensaje ng-star-inserted' and normalize-space(text())='" + mensajeErrorLogin.trim() + "']";

        try {
            WebElement mensajeElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (mensajeElemento.isDisplayed() && mensajeElemento.getText().trim().equals(mensajeErrorLogin.trim())) {
                msjerrorValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // El mensaje no fue encontrado
        }
        Assert.assertTrue("No se reconoce al mensaje: " + mensajeErrorLogin + ". Validarlo!", msjerrorValido);
    }
    public void validarMensajeErrorLoginCambioPass(String mensajeErrorLoginPass) {
        boolean msjerrorpassValido = false;
        String xpath = "//div[@class and normalize-space(text())='" + mensajeErrorLoginPass.trim() + "']";

        try {
            WebElement mensajepassElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (mensajepassElemento.isDisplayed() && mensajepassElemento.getText().trim().equals(mensajeErrorLoginPass.trim())) {
                msjerrorpassValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // El mensaje no fue encontrado
        }
        Assert.assertTrue("No se reconoce al mensaje: " + mensajeErrorLoginPass + ". Validarlo!", msjerrorpassValido);
    }
    public void validarMensajeRojo(String mensajeError) {
        boolean mensajeValido = false;
        String xpath = "//small[@class='mensaje-error-flotante']/span[normalize-space(text())='" + mensajeError.trim() + "']";

        try {
            WebElement mensajeElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (mensajeElemento.isDisplayed() && mensajeElemento.getText().trim().equals(mensajeError.trim())) {
                mensajeValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // El mensaje no fue encontrado
        }
        Assert.assertTrue("No se reconoce al mensaje: " + mensajeError + ". Validarlo!", mensajeValido);
    }
    public void validarMensajeErrorTi(String msjerrorti) {
        boolean mensajetiValido = false;
        String xpath = "//div[@class='mensaje-error' and normalize-space(text())='" + msjerrorti.trim() + "']";

        try {
            WebElement mensajetiElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (mensajetiElemento.isDisplayed() && mensajetiElemento.getText().trim().equals(msjerrorti.trim())) {
                mensajetiValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // El mensaje no fue encontrado
        }
        Assert.assertTrue("No se reconoce al mensaje: " + msjerrorti + ". Validarlo!", mensajetiValido);
    }
    public void validarMensajeTicketNoRehabilitado(String norehabilitado) {
        boolean norehahValido = false;
        String xpath = "//ul/li[normalize-space(text())='" + norehabilitado + "']";

        try {
            WebElement norehabElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (norehabElemento.isDisplayed() && norehabElemento.getText().trim().equals(norehabilitado.trim())) {
                norehahValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // El mensaje no fue encontrado
        }
        Assert.assertTrue("No se reconoce al mensaje: " + norehabilitado + ". Validarlo!", norehahValido);
    }
}
