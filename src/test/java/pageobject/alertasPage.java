package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class alertasPage extends util {
    public alertasPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarAlerta(String alerta) {
        boolean alertaValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(.,'" + alerta + "')]")));
        String xpath = "//h1[contains(.,'" + alerta + "')]";

        try {
            WebElement alertaElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (alertaElemento.isDisplayed() && alertaElemento.getText().equals(alerta)) {
                alertaValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubico la alerta en el tiempo especificado
        }
        Assert.assertTrue("La alerta " + alerta + " no coincide.", alertaValido);
    }
    public void validarAviso(String aviso) {
        boolean avisoValido = false;
        String xpath = "(//div[contains(.,'" + aviso + "')])[5]";

        try {
            WebElement avisoElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (avisoElemento.isDisplayed() && avisoElemento.getText().equals(aviso)) {
                avisoValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubico el aviso en el tiempo especificado
        }
        Assert.assertTrue("El aviso " + aviso + " no coincide.", avisoValido);
    }
    public void validarAlertaConfirmacion(String confirmacion) {
        boolean confirmacionValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(.,'" + confirmacion + "')])[5]")));
        String xpath = "(//div[contains(.,'" + confirmacion + "')])[5]";

        try {
            WebElement confirmacionElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (confirmacionElemento.isDisplayed() && confirmacionElemento.getText().equals(confirmacion)) {
                confirmacionValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // La alerta de confirmacion no se encontró
        }
        Assert.assertTrue("El alerta de confirmacion " + confirmacion + " no coincide.", confirmacionValido);
    }
    public void validarMensajeEliminacion() {
        boolean mensajeValido = false;
        String regex = "Se elimino el tipo de cambio J[0-9]{9} satisfactoriamente...";
        String xpath = "//div[contains(text(),'Se elimino el tipo de cambio')]";

        try {
            WebElement mensajeElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            String mensajeTexto = mensajeElemento.getText();
            System.out.println("Mensaje: " + mensajeTexto);
            if (mensajeElemento.isDisplayed() && mensajeTexto.matches(regex)) {
                mensajeValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            System.out.println("No se encontró el elemento con el xpath.");
        }
        Assert.assertTrue("El mensaje no es igual al de la alerta.", mensajeValido);
    }
    public void validarMensajeEliminacionB() {
        boolean msjValido = false;
        String regex = "Se eliminó el precio L[0-9]{9} satisfactoriamente...";
        String xpath = "//div[contains(text(),'Se elimino el tipo de cambio')]";

        try {
            WebElement msjElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            String msjTexto = msjElemento.getText();
            System.out.println("Mensaje: " + msjTexto);
            if (msjElemento.isDisplayed() && msjTexto.matches(regex)) {
                msjValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            System.out.println("No se encontró el elemento con el xpath.");
        }
        Assert.assertTrue("El mensaje no es igual al de la alerta.", msjValido);
    }
}



