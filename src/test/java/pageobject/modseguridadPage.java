package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modseguridadPage extends util {
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/seguridad/roles']") protected WebElement opRoles;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/seguridad/usuarios']") protected WebElement opUsuarios;
    @FindBy(xpath = "//div/app-button-primary/p-button/button[@type='button']") protected WebElement btnnuevoRol;
    @FindBy(xpath = "//input[@id='input']") protected WebElement inputRol;
    @FindBy(xpath = "//input[@inputid='user']") protected WebElement inputUsuario;
    @FindBy(xpath = "//input[@inputid='nombre']") protected WebElement inputNombre;
    @FindBy(xpath = "//p-dropdown/div/div[@role='button']") protected WebElement cmbrolPadre;
    @FindBy(xpath = "//p-overlay/div/div//div/ul/p-dropdownitem[1]") protected WebElement itemrolPadre;
    @FindBy(xpath = "(//table//tbody/tr//button[@icon='pi pi-pencil'])[1]") protected WebElement btnEditarRol;
    @FindBy(xpath = "(//table//tbody/tr//button[@icon='pi pi-trash'])[1]") protected WebElement btnEliminarRol;
    @FindBy(xpath = "//button[contains(.,'Nuevo usuario')]") protected WebElement btnNuevoUsuario;
    @FindBy(xpath = "//input[@inputid='apellidos']") protected WebElement inputApellidos;
    @FindBy(xpath = "//input[@inputid='nombres']") protected WebElement inputNombres;
    @FindBy(xpath = "//input[@inputid='usuario']") protected WebElement inputUsuarioCrear;
    @FindBy(xpath = "//input[@inputid='apellidos']") protected WebElement inputApellidosEditar;
    @FindBy(xpath = "//input[@inputid='nombres']") protected WebElement inputNombresEditar;
    @FindBy(xpath = "//input[@inputid='usuario']") protected WebElement inputUsuarioEditar;
    @FindBy(xpath = "//input[@id='clave']") protected WebElement inputClave;
    @FindBy(xpath = "//input[@id='confirmar']") protected WebElement inputClaveConfirmar;
    @FindBy(xpath = "//button[contains(.,'Guardar')]") protected WebElement btnGuardar;
    @FindBy(xpath = "(//section/span/div/p-checkbox)[1]") protected WebElement checkRolDisponible;
    @FindBy(xpath = "//input[@id='vigencia']") protected WebElement inputFechaVigencia;
    @FindBy(xpath = "//div/div/p-checkbox[@label='Habilitar campos']/div") protected WebElement checkHabilitarCampos;
    public modseguridadPage() {
        PageFactory.initElements(driver, this);
    }
    public void ingresarOpcionRoles(){
        wait.until(ExpectedConditions.visibilityOf(opRoles));
        opRoles.click();
    }
    public void ingresarOpcionUsuarios(){
        wait.until(ExpectedConditions.visibilityOf(opUsuarios));
        opUsuarios.click();
    }
    public void botonNuevoRol(){
        wait.until(ExpectedConditions.visibilityOf(btnnuevoRol));
        btnnuevoRol.click();
    }
    public void ingresarRol(String rol){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='input']")));
        inputRol.sendKeys(rol);
    }
    public void clickRolPadre(){
        cmbrolPadre.click();
    }
    public void ingresarRolPadre(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p-overlay/div/div//div/ul/p-dropdownitem[1]")));
        itemrolPadre.click();
    }
    public void clickBotonEditarRol(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarRol));
        btnEditarRol.click();
    }
    public void clickBotonEliminarRol(){
        wait.until(ExpectedConditions.visibilityOf(btnEliminarRol));
        btnEliminarRol.click();
    }
    public void clickBotonNuenoUsuario(){
        wait.until(ExpectedConditions.visibilityOf(btnNuevoUsuario));
        btnNuevoUsuario.click();
    }
    public void clickbotonGuardar(){
        wait.until(ExpectedConditions.visibilityOf(btnGuardar));
        btnGuardar.click();
    }
    public void ingresarSegUsuario(String usuario){
        wait.until(ExpectedConditions.visibilityOf(inputUsuario));
        inputUsuario.sendKeys(usuario);
    }
    public void ingresarSegNombre(String nombre){
        wait.until(ExpectedConditions.visibilityOf(inputNombre));
        inputNombre.sendKeys(nombre);
    }
    public void ingresarSegApellidos(String apellidos){
        wait.until(ExpectedConditions.visibilityOf(inputApellidos));
        inputApellidos.sendKeys(apellidos);
    }
    public void ingresarSegNombres(String nombres){
        wait.until(ExpectedConditions.visibilityOf(inputNombres));
        inputNombres.sendKeys(nombres);
    }
    public void ingresarSegUsuarioCrear(String usuario){
        wait.until(ExpectedConditions.visibilityOf(inputUsuarioCrear));
        inputUsuarioCrear.sendKeys(usuario);
    }
    public void ingresarSegClave(String clave){
        wait.until(ExpectedConditions.visibilityOf(inputClave));
        inputClave.sendKeys(clave);
    }
    public void ingresarSegClaveConfirmar(String claveconf){
        wait.until(ExpectedConditions.visibilityOf(inputClaveConfirmar));
        inputClaveConfirmar.sendKeys(claveconf);
    }
    public void seleccionarRolDisponible(String rol){
        wait.until(ExpectedConditions.visibilityOf(checkRolDisponible));
        if (rol.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkRolDisponible));
            if (!checkRolDisponible.isSelected()) {
                checkRolDisponible.click();
            }
        } else if (rol.toLowerCase().equals("no")) {
            if (checkRolDisponible.isSelected()) {
                checkRolDisponible.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkRolDisponible)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkRolDisponible.isSelected());
        }
    }
    public void ingresarFechaVigencia(String fecha) {
        limpiarCampo(inputFechaVigencia);
        inputFechaVigencia.sendKeys(fecha);
    }
    public void ingresarApellidosEditar(String apellidos){
        limpiarCampo(inputApellidosEditar);
        inputApellidosEditar.sendKeys(apellidos);
    }
    public void ingresarNombresEditar(String nombres){
        limpiarCampo(inputNombresEditar);
        inputNombresEditar.sendKeys(nombres);
    }
    public void ingresarUsuarioEditar(String usuario){
        limpiarCampo(inputUsuarioEditar);
        inputUsuarioEditar.sendKeys(usuario);
    }
    public void seleccionarHabilitarCampos(String habilitar){
        wait.until(ExpectedConditions.visibilityOf(checkHabilitarCampos));
        if (habilitar.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkHabilitarCampos));
            if (!checkHabilitarCampos.isSelected()) {
                checkHabilitarCampos.click();
            }
        } else if (habilitar.toLowerCase().equals("no")) {
            if (checkHabilitarCampos.isSelected()) {
                checkHabilitarCampos.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkHabilitarCampos)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkHabilitarCampos.isSelected());
        }
    }
}
