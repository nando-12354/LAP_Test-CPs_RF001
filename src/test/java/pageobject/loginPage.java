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
    @FindBy(xpath = "//input[@id='password']") protected WebElement inputClaveError;
    @FindBy(xpath = "//button[@type='submit']") protected WebElement btnLogin;
    @FindBy(xpath = "//h1[text()='Sistema de Administración']") protected WebElement txtTuua;
    @FindBy(xpath = "//a[contains(.,'Cambiar mi contraseña')]") protected WebElement lblCambioClave;
    @FindBy(xpath = "//p-password[@formcontrolname='NewPassword']//input") protected WebElement inputNuevaClave;
    @FindBy(xpath = "//p-password[@formcontrolname='RepeatPassword']//input") protected WebElement inputNuevaClaveConfimar;
    @FindBy(xpath = "//p-button[@label='Cambiar Contraseña']/button") protected WebElement btnCambiarClave;

    public loginPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void ingresarUsuario(String usuario){
        wait.until(ExpectedConditions.visibilityOf(inputUsuario));
        inputUsuario.sendKeys(usuario);
    }
    public void ingresarClave(String clave){
        wait.until(ExpectedConditions.visibilityOf(inputClave));
        inputClave.sendKeys(clave);
    }
    public void ingresarClaveError(String claveerror){
        wait.until(ExpectedConditions.visibilityOf(inputClaveError));
        limpiarCampo(inputClaveError);
        inputClaveError.sendKeys(claveerror);
    }
    public void clickBotonLogin(){
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        btnLogin.click();
    }
    public void validarTituloTuua(String tuua){
        wait.until(ExpectedConditions.visibilityOf(txtTuua));
        Assert.assertEquals(tuua, "Sistema de Administración", txtTuua.getText());
    }
    public void ingresarCambioClave(){
        wait.until(ExpectedConditions.visibilityOf(lblCambioClave));
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
        Assert.assertTrue("El usuario logueado " + logueado + " no es correcto.", usuarioValido);
    }
    public void ingresarNuevaClave(String nuevaclave){
        wait.until(ExpectedConditions.visibilityOf(inputNuevaClave));
        inputNuevaClave.sendKeys(nuevaclave);
    }
    public void ingresarNuevaClaveConfirmar(String claveconf){
        wait.until(ExpectedConditions.visibilityOf(inputNuevaClaveConfimar));
        inputNuevaClaveConfimar.sendKeys(claveconf);
    }
    public void clickBotonCambiarClave(){
        wait.until(ExpectedConditions.visibilityOf(btnCambiarClave));
        btnCambiarClave.click();
    }
}
