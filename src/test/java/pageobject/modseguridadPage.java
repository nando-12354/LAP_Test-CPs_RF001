package pageobject;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modseguridadPage extends util {
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/seguridad/roles']") protected WebElement opRoles;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/seguridad/usuarios']") protected WebElement opUsuarios;
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
    @FindBy(xpath = "(//section/span/div/p-checkbox)[1]") protected WebElement checkRolDisponible;
    @FindBy(xpath = "//input[@id='vigencia']") protected WebElement inputFechaVigencia;
    @FindBy(xpath = "//div/div/p-checkbox[@label='Habilitar campos']/div") protected WebElement checkHabilitarCampos;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[1]") protected WebElement checkPefilA;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[2]") protected WebElement checkPefilB;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[3]") protected WebElement checkPefilC;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[4]") protected WebElement checkPefilD;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[5]") protected WebElement checkPefilE;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[6]") protected WebElement checkPefilF;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[7]") protected WebElement checkPefilG;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[8]") protected WebElement checkPefilH;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[9]") protected WebElement checkPefilI;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[10]") protected WebElement checkPefilJ;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[11]") protected WebElement checkPefilK;
    @FindBy(xpath = "(//section//ul/li//mat-checkbox//div[@class='mdc-checkbox'])[12]") protected WebElement checkPefilL;

    public modseguridadPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void validarOpcionesSeguridad(String seguridad){
        boolean opcionValida = false;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul/li/a/span[text()='" + seguridad + "']")));
        String xpath = "//div/ul/li/a/span[normalize-space(text())='" + seguridad.trim() + "']";

        try {
            WebElement seguridadOpciones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            if (seguridadOpciones.isDisplayed() && seguridadOpciones.getText().equals(seguridad.trim())) {
                opcionValida = true;
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // No se ubicó la opción
        }
        Assert.assertTrue("Opción" + seguridad + " no reconocida. Validarlo!", opcionValida);
    }
    public void ingresarOpcionRoles(){
        wait.until(ExpectedConditions.visibilityOf(opRoles));
        opRoles.click();
    }
    public void ingresarOpcionUsuarios(){
        wait.until(ExpectedConditions.visibilityOf(opUsuarios));
        opUsuarios.click();
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
        scrollVertical(checkRolDisponible);
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
        inputFechaVigencia.sendKeys(Keys.TAB);
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
    public void seleccionarCheckPerfilA(String perfila){
        wait.until(ExpectedConditions.visibilityOf(checkPefilA));
        if (perfila.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilA));
            if (!checkPefilA.isSelected()) {
                checkPefilA.click();
            }
        } else if (perfila.toLowerCase().equals("no")) {
            if (checkPefilA.isSelected()) {
                checkPefilA.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilA)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilA.isSelected());
        }
    }
    public void seleccionarCheckPerfilB(String perfilb){
        wait.until(ExpectedConditions.visibilityOf(checkPefilB));
        if (perfilb.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilB));
            if (!checkPefilB.isSelected()) {
                checkPefilB.click();
            }
        } else if (perfilb.toLowerCase().equals("no")) {
            if (checkPefilB.isSelected()) {
                checkPefilB.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilB)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilB.isSelected());
        }
    }
    public void seleccionarCheckPerfilC(String perfilc){
        wait.until(ExpectedConditions.visibilityOf(checkPefilC));
        if (perfilc.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilC));
            if (!checkPefilC.isSelected()) {
                checkPefilC.click();
            }
        } else if (perfilc.toLowerCase().equals("no")) {
            if (checkPefilC.isSelected()) {
                checkPefilC.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilC)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilC.isSelected());
        }
    }
    public void seleccionarCheckPerfilD(String perfild){
        wait.until(ExpectedConditions.visibilityOf(checkPefilD));
        if (perfild.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilD));
            if (!checkPefilD.isSelected()) {
                checkPefilD.click();
            }
        } else if (perfild.toLowerCase().equals("no")) {
            if (checkPefilD.isSelected()) {
                checkPefilD.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilD)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilD.isSelected());
        }
    }
    public void seleccionarCheckPerfilE(String perfile){
        wait.until(ExpectedConditions.visibilityOf(checkPefilE));
        if (perfile.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilE));
            if (!checkPefilE.isSelected()) {
                checkPefilE.click();
            }
        } else if (perfile.toLowerCase().equals("no")) {
            if (checkPefilE.isSelected()) {
                checkPefilE.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilE)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilE.isSelected());
        }
    }
    public void seleccionarCheckPerfilF(String perfilf){
        wait.until(ExpectedConditions.visibilityOf(checkPefilF));
        if (perfilf.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilF));
            if (!checkPefilF.isSelected()) {
                checkPefilF.click();
            }
        } else if (perfilf.toLowerCase().equals("no")) {
            if (checkPefilF.isSelected()) {
                checkPefilF.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilF)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilF.isSelected());
        }
    }
    public void seleccionarCheckPerfilG(String perfilg){
        wait.until(ExpectedConditions.visibilityOf(checkPefilG));
        if (perfilg.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilG));
            if (!checkPefilG.isSelected()) {
                checkPefilG.click();
            }
        } else if (perfilg.toLowerCase().equals("no")) {
            if (checkPefilG.isSelected()) {
                checkPefilG.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilG)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilG.isSelected());
        }
    }
    public void seleccionarCheckPerfilH(String perfilh){
        wait.until(ExpectedConditions.visibilityOf(checkPefilH));
        if (perfilh.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilH));
            if (!checkPefilH.isSelected()) {
                checkPefilH.click();
            }
        } else if (perfilh.toLowerCase().equals("no")) {
            if (checkPefilH.isSelected()) {
                checkPefilH.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilH)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilH.isSelected());
        }
    }
    public void seleccionarCheckPerfilI(String perfili){
        wait.until(ExpectedConditions.visibilityOf(checkPefilI));
        if (perfili.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilI));
            if (!checkPefilI.isSelected()) {
                checkPefilI.click();
            }
        } else if (perfili.toLowerCase().equals("no")) {
            if (checkPefilI.isSelected()) {
                checkPefilI.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilI)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilI.isSelected());
        }
    }
    public void seleccionarCheckPerfilJ(String perfilj){
        wait.until(ExpectedConditions.visibilityOf(checkPefilJ));
        if (perfilj.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilJ));
            if (!checkPefilJ.isSelected()) {
                checkPefilJ.click();
            }
        } else if (perfilj.toLowerCase().equals("no")) {
            if (checkPefilJ.isSelected()) {
                checkPefilJ.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilJ)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilJ.isSelected());
        }
    }
    public void seleccionarCheckPerfilK(String perfilk){
        wait.until(ExpectedConditions.visibilityOf(checkPefilK));
        if (perfilk.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilK));
            if (!checkPefilK.isSelected()) {
                checkPefilK.click();
            }
        } else if (perfilk.toLowerCase().equals("no")) {
            if (checkPefilK.isSelected()) {
                checkPefilK.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilK)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilK.isSelected());
        }
    }
    public void seleccionarCheckPerfilL(String perfill){
        wait.until(ExpectedConditions.visibilityOf(checkPefilA));
        if (perfill.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.elementToBeClickable(checkPefilL));
            if (!checkPefilL.isSelected()) {
                checkPefilL.click();
            }
        } else if (perfill.toLowerCase().equals("no")) {
            if (checkPefilL.isSelected()) {
                checkPefilL.click();
            }
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(checkPefilL)));
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPefilL.isSelected());
        }
    }
}
