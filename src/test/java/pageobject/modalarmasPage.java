package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modalarmasPage extends util {
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/alarmas/configuracion-alarmas']") protected WebElement opConfigurarAlarmas;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/alarmas/monitoreo-alarma']") protected WebElement opMonitorearAlarmas;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/alarmas/consulta-alarmas']") protected WebElement opAlarmasGeneradas;
    @FindBy(xpath = "//div/div/app-input-select-2[@optionvalue='codigoModulo']/span/p-dropdown//div[@role='button']") protected WebElement cmbModulo;
    @FindBy(xpath = "//div/div/app-input-select-2[@optionvalue='codigoAlarma']/span/p-dropdown//div[@role='button']") protected WebElement cmbTipoAlarma;
    @FindBy(xpath = "//div/div/app-input-select-2[@optionvalue='codCampo']/span/p-dropdown//div[@role='button']") protected WebElement cmbEstado;
    @FindBy(xpath = "//div//app-input-select-2[@optionvalue='codUsuario']/span/p-dropdown//div[@role='button']") protected WebElement cmbUsuarioA;
    @FindBy(xpath = "//div/app-input-text-2[@formcontrolname='sDscFinMensaje']/span/input") protected WebElement inputFinMensaje;
    @FindBy(xpath = "//div/app-input-text-2[@formcontrolname='sDscAsunto']/span/input") protected WebElement inputAsuntoCorreo;
    @FindBy(xpath = "//span[contains(.,'Agregar')]") protected WebElement btnAgregar;
    @FindBy(xpath = "//span[contains(.,'Actualizar')]") protected WebElement btnActualizar;
    @FindBy(xpath = "//span[contains(.,'Eliminar')]") protected WebElement btnEliminar;
    @FindBy(xpath = "(//input[@id='textInput'])[3]") protected WebElement inputCorreo;
    @FindBy(xpath = "(//input[@id='textInput'])[3]") protected WebElement inputCorreoAct;
    @FindBy(xpath = "//div/table/tbody/tr/td/a[@href='#/principal/alarmas/configuracion-alarmas/W0000001/001']") protected WebElement btnEditarA;
    @FindBy(xpath = "//div/table/tbody/tr/td/a[@href='#/principal/alarmas/configuracion-alarmas/W0000048/S01']") protected WebElement btnEditarB;
    @FindBy(xpath = "//div/table/tbody/tr/td/a[@href='#/principal/alarmas/configuracion-alarmas/W0000050/S01']") protected WebElement btnEditarC;
    @FindBy(xpath = "//div/table/tbody/tr/td/a[@href='#/principal/alarmas/configuracion-alarmas/W0000051/S01']") protected WebElement btnEditarD;
    @FindBy(xpath = "//div/table/tbody/tr/td/a[@href='#/principal/alarmas/configuracion-alarmas/W0000086/S03']") protected WebElement btnEditarE;
    @FindBy(xpath = "(//div//app-input-select-2[@optionvalue='sCodUsuario']/span/p-dropdown//div[@role='button'])[2]") protected WebElement cmbUsuarioB;
    @FindBy(xpath = "//div/app-input-date[@label='Hora de inicio']/span//input") protected WebElement txtHoraDesde;
    @FindBy(xpath = "//div/app-input-date[@label='Hora de fin']/span//input") protected WebElement txtHoraHasta;

    public modalarmasPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void ingresarOpcionConfigurarAlarmas(){
        wait.until(ExpectedConditions.visibilityOf(opConfigurarAlarmas));
        opConfigurarAlarmas.click();
    }
    public void ingresarOpcionMonitorearAlarmas(){
        wait.until(ExpectedConditions.visibilityOf(opMonitorearAlarmas));
        opMonitorearAlarmas.click();
    }
    public void ingresarOpcionAlarmasGeneradas(){
        wait.until(ExpectedConditions.visibilityOf(opAlarmasGeneradas));
        opAlarmasGeneradas.click();
    }
    public void abrirComboboxModulo(){
        wait.until(ExpectedConditions.visibilityOf(cmbModulo));
        cmbModulo.click();
    }
    public void abrirComboboxTipoAlarma(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoAlarma));
        cmbTipoAlarma.click();
    }
    public void abrirComboboxEstado(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstado));
        cmbEstado.click();
    }
    public void abrirComboboxUsuarioA(){
        wait.until(ExpectedConditions.visibilityOf(cmbUsuarioA));
        cmbUsuarioA.click();
    }
    public void abrirComboboxUsuarioB(){
        wait.until(ExpectedConditions.visibilityOf(cmbUsuarioB));
        cmbUsuarioB.click();
    }
    public void seleccionarOpcion(String item) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionItem = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + item + "']"));
        opcionItem.click();
    }
    public void ingresarFinMensaje(String mensaje){
        wait.until(ExpectedConditions.visibilityOf(inputFinMensaje));
        inputFinMensaje.sendKeys(mensaje);
    }
    public void ingresarAsuntoCorreo(String asunto){
        wait.until(ExpectedConditions.visibilityOf(inputAsuntoCorreo));
        inputAsuntoCorreo.sendKeys(asunto);
    }
    public void clickBotonAgregar(){
        wait.until(ExpectedConditions.visibilityOf(btnAgregar));
        btnAgregar.click();
    }
    public void clickBotonActualizar(){
        wait.until(ExpectedConditions.visibilityOf(btnActualizar));
        btnActualizar.click();
    }
    public void clickBotonEliminar(){
        wait.until(ExpectedConditions.visibilityOf(btnEliminar));
        btnEliminar.click();
    }
    public void ingresarCorreo(String correo){
        wait.until(ExpectedConditions.visibilityOf(inputCorreo));
        inputCorreo.sendKeys(correo);
    }
    public void ingresarActualizacionCorreo(String actualizar){
        wait.until(ExpectedConditions.visibilityOf(inputCorreoAct));
        limpiarCampo(inputCorreoAct);
        inputCorreoAct.sendKeys(actualizar);
    }
    public void clickBotonEditarA(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarA));
        btnEditarA.click();
    }
    public void clickBotonEditarB(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarB));
        btnEditarB.click();
    }
    public void clickBotonEditarC(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarC));
        btnEditarC.click();
    }
    public void clickBotonEditarD(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarD));
        btnEditarD.click();
    }
    public void clickBotonEditarE(){
        wait.until(ExpectedConditions.visibilityOf(btnEditarE));
        btnEditarE.click();
    }
    public void ingresarHoraDesde(String horadesde){
        wait.until(ExpectedConditions.visibilityOf(txtHoraDesde));
        txtHoraDesde.sendKeys(horadesde);
    }
    public void ingresarHoraHasta(String horahasta){
        wait.until(ExpectedConditions.visibilityOf(txtHoraHasta));
        txtHoraHasta.sendKeys(horahasta);
    }
}
