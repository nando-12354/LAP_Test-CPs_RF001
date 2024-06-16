package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class loginPage extends util {
    @FindBy(xpath = "//input[@id='user']") protected WebElement inputUsuario;
    @FindBy(xpath = "//input[@id='password']") protected WebElement inputClave;
    @FindBy(xpath = "//button[@type='button']") protected WebElement btnLogin;
    @FindBy(xpath = "//h1[text()='Sistema de Administración']") protected WebElement txtTuua;
    @FindBy(xpath = "//a[contains(.,'Cambiar mi contraseña')]") protected WebElement lblCambioClave;
    public loginPage() {
        PageFactory.initElements(driver, this);
    }
    public void ingresarUsuario(String usuario){
        wait.until(ExpectedConditions.visibilityOf(inputUsuario));
        inputUsuario.sendKeys(usuario);
    }
    public void ingresarClave(String clave){
        inputClave.sendKeys(clave);
    }
    public void clickBotonLogin(){
        btnLogin.click();
    }
    public void validarTituloTuua(String tuua){
        wait.until(ExpectedConditions.visibilityOf(txtTuua));
        Assert.assertEquals(tuua, "Sistema de Administración", txtTuua.getText());
    }
    public void ingresarCambioClave(){
        lblCambioClave.click();
    }
    public void validarUsuario(String logueado){
        boolean usuarioValido = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/span[text()='" + logueado + "']")));
        String xpath = "//button/span[text()='" + logueado + "']";

        try {
            WebElement usuarioElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (usuarioElemento.isDisplayed() && usuarioElemento.getText().equals(logueado)) {
                usuarioValido = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se reconoce al usuario logueado
        }
        Assert.assertTrue("El usuario " + logueado + " no coincide.", usuarioValido);
    }
}
