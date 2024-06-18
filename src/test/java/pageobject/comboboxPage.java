package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class comboboxPage extends util {
    @FindBy(xpath = "//div/app-input-select[@id='selectRolPadre']/span/p-dropdown//div[@role='button']") protected WebElement cmbRolPadre;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='rol']//div[@role='button']") protected WebElement cmbRolPadreUsuario;
    @FindBy(xpath = "//div//p-dropdown[@optionlabel='sDscCampo']//div[@role='button']") protected WebElement cmbEstadoUsuario;
    @FindBy(xpath = "//div/div//p-dropdown[@optionlabel='sDscCampo']//div[@role='button']") protected WebElement cmbPrivilegioUsuario;
    @FindBy(xpath = "(//div//p-dropdown[@optionlabel='sDscCampo']//div[@role='button'])[1]") protected WebElement cmbEstadoUsuarioEditar;
    @FindBy(xpath = "(//div//p-dropdown[@optionlabel='sDscCampo']//div[@role='button'])[2]") protected WebElement cmbPrivilegioUsuarioEditar;
    @FindBy(xpath = "//div/div/span/p-dropdown//div[@role='button']") protected WebElement cmbMotivoTicketMasivo;
    @FindBy(xpath = "//app-input-select-2[@name='selectedTipoTasa']//p-dropdown//div[@role='button']") protected WebElement cmbTipoOperacionTC;
    @FindBy(xpath = "//app-representante-compania//p-dropdown//div[@role='button']") protected WebElement cmbRepresentanteCompania;
    @FindBy(xpath = "//div/div//span/p-dropdown//div[@role='button']") protected WebElement cmbMoneda;
    @FindBy(xpath = "(//div/app-input-select//p-dropdown//div[@role='button'])[1]") protected WebElement cmbTipoPasajeroTipoTicket;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='listaTipos']//div[@role='button']") protected WebElement cmbTipoCompania;
    @FindBy(xpath = "//div/app-input-select[@inputid='modalidadVenta']//div[@role='button']") protected WebElement cmbTipoModalidad;
    @FindBy(xpath = "//div/app-input-select[@inputid]//div[@role='button']") protected WebElement cmbTipoTicketModalidad;
    @FindBy(xpath = "//div/div//p-dropdown[@optionlabel='sDscCampo']//div[@role='button']") protected WebElement cmbMotivos;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='cias']//div[@role='button']") protected WebElement cmbCompaniaTicketVuelo;
    @FindBy(xpath = "//app-input-select-2[@optionvalue='sCodCompania']//p-dropdown//div[@role='button']") protected WebElement cmbBpNormalBpMasivo;
    @FindBy(xpath = "//div/div//p-dropdown[@optionlabel='sDscCompania']//div[@role='button']") protected WebElement cmbBpSalidaBpVueloBpFecha;
    @FindBy(xpath = "(//div/div/span/p-dropdown[@optionvalue]//div[@role='button'])[3]") protected WebElement cmbVueloTicketVueloBpVuelo;
    @FindBy(xpath = "(//div/div/span/p-dropdown[@inputid='tipo']//div[@role='button'])[2]") protected WebElement cmbTipoDocumentoRepresentante;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[1]") protected WebElement cmbRol;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[2]") protected WebElement cmbEstado;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[3]") protected WebElement cmbGrupo;
    @FindBy(xpath = "//p-dropdown[@optionvalue='sCodCompania']//div[@role='button']") protected WebElement cmbCompaniaTicketBpFecha;
    @FindBy(xpath = "(//div//p-dropdown[@optionlabel='sDscCampo']//div[@role='button'])[1]") protected WebElement cmbTipoDocumentoTicketBpUsado;
    @FindBy(xpath = "(//div//p-dropdown[@optionlabel='sDscCampo']//div[@role='button'])[3]") protected WebElement cmbTipoPasajeroTicketBpUsado;
    @FindBy(xpath = "(//div//p-dropdown[@optionlabel='sDscCampo']//div[@role='button'])[4]") protected WebElement cmbTipoVueloTicketBpUsado;
    @FindBy(xpath = "//p-dropdown[@optionlabel='sDscCompania']//div[@role='button']") protected WebElement cmbCompaniaTicketBpUsado;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fMolinete']//p-dropdown//div[@role='button']") protected WebElement cmbMolineteSincronizacion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fEstadoSincronizacion']//p-dropdown//div[@role='button']") protected WebElement cmbEstadoSincronizacion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fUsuario']//p-dropdown//div[@role='button']") protected WebElement cmbAuditoriaUsuario;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='codigoMolinete']//p-dropdown//div[@role='button']") protected WebElement cmbMolineteDepuracion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='codigoTabla']//p-dropdown//div[@role='button']") protected WebElement cmbTablaDepuracion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='codigoEstado']//p-dropdown//div[@role='button']") protected WebElement cmbEstadoDepuracion;

    public comboboxPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void abrirComboboxRolPadre(){
        cmbRolPadre.click();
    }
    public void abrirComboboxRolPadreUsuario(){
        cmbRolPadreUsuario.click();
    }
    public void abrirComboboxEstadoUsuario(){
        cmbEstadoUsuario.click();
    }
    public void abrirComboboxPrivilegioUsuario(){
        cmbPrivilegioUsuario.click();
    }
    public void abrirComboboxEstadoUsuarioEditar(){
        cmbEstadoUsuarioEditar.click();
    }
    public void abrirComboboxPrivilegioUsuarioEditar(){
        cmbPrivilegioUsuarioEditar.click();
    }
    public void abrirComboboxRepresentanteCompania(){
        cmbRepresentanteCompania.click();
    }
    public void abrirComboboxMotivoTicketMasivo(){
        cmbMotivoTicketMasivo.click();
    }
    public void abrirComboboxMotivos(){
        cmbMotivos.click();
    }
    public void abrirComboboxCompaniaTicketVuelo(){
        cmbCompaniaTicketVuelo.click();
    }
    public void abrirComboboxTipoDocumentoRepresentante(){
        cmbTipoDocumentoRepresentante.click();
    }
    public void abrirComboboxCompaniaBpNormalBpMasivo(){
        cmbBpNormalBpMasivo.click();
    }
    public void abrirComboboxCompaniaBpSalidaBpVueloBpFecha(){
        cmbBpSalidaBpVueloBpFecha.click();
    }
    public void abrirComboboxVueloTicketVueloBpVuelo(){
        cmbVueloTicketVueloBpVuelo.click();
    }
    public void abrirComboboxTipoCompania(){
        cmbTipoCompania.click();
    }
    public void abrirComboboxTipoModalidad(){
        cmbTipoModalidad.click();
    }
    public void abrirComboboxTipoTicketModalidad(){
        cmbTipoTicketModalidad.click();
    }
    public void abrirComboboxRol(){
        wait.until(ExpectedConditions.visibilityOf(cmbRol));
        cmbRol.click();
    }
    public void abrirComboboxEstado(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstado));
        cmbEstado.click();
    }
    public void abrirComboboxGrupo(){
        wait.until(ExpectedConditions.visibilityOf(cmbGrupo));
        cmbGrupo.click();
    }
    public void abrirComboCompaniaTicketBpFecha(){
        wait.until(ExpectedConditions.visibilityOf(cmbCompaniaTicketBpFecha));
        cmbCompaniaTicketBpFecha.click();
    }
    public void abrirComboboxTicketBpUsado(){
        cmbTipoDocumentoTicketBpUsado.click();
    }
    public void abrirComboboxTipoVueloTicketBpUsado(){
        cmbTipoVueloTicketBpUsado.click();
    }
    public void abrirComboboxCompaniaTicketBpUsado(){
        cmbCompaniaTicketBpUsado.click();
    }
    public void abrirComboboxTipoPasajeroTicketBpUsado(){
        cmbTipoPasajeroTicketBpUsado.click();
    }
    public void abrirComboboxMolineteSincronizacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbMolineteSincronizacion));
        cmbMolineteSincronizacion.click();
    }
    public void abrirComboboxEstadoSincronizacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstadoSincronizacion));
        cmbEstadoSincronizacion.click();
    }
    public void abrirComboAuditoriaUsuario(){
        wait.until(ExpectedConditions.visibilityOf(cmbAuditoriaUsuario));
        cmbAuditoriaUsuario.click();
    }
    public void abrirComboboxMolineteDepuracion(){
        wait.until(ExpectedConditions.visibilityOf(cmbMolineteDepuracion));
        cmbMolineteDepuracion.click();
    }
    public void abrirComboboxTablaDepuracion(){
        wait.until(ExpectedConditions.visibilityOf(cmbTablaDepuracion));
        cmbTablaDepuracion.click();
    }
    public void abrirComboboxEstadoDepuracion(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstadoDepuracion));
        cmbEstadoDepuracion.click();
    }
    public void abrirComboboxMoneda(){
        wait.until(ExpectedConditions.visibilityOf(cmbMoneda));
        cmbMoneda.click();
    }
    public void abrirComboboxTipoPasajeroTipoTicket(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoPasajeroTipoTicket));
        cmbTipoPasajeroTipoTicket.click();
    }
    public void abrirComboboxTipoOperacionTasaCambio(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoOperacionTC));
        cmbTipoOperacionTC.click();
    }
    public void seleccionarOpcion(String item) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionItem = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + item + "']"));
        opcionItem.click();
    }
}


