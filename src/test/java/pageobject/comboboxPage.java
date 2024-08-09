package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

/**
 * Clase que contienen los combobox para abrir y elegir sus items
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class comboboxPage extends util {
    @FindBy(xpath = "//div/app-input-select[@id='selectRolPadre']/span/p-dropdown//div[@role='button']") protected WebElement cmbRolPadre;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='rol']//div[@role='button']") protected WebElement cmbRolPadreUsuario;
    @FindBy(xpath = "//div//p-dropdown[@optionlabel='descripcionCampo']//div[@role='button']") protected WebElement cmbEstadoUsuario;
    @FindBy(xpath = "//div/div//p-dropdown[@formcontrolname='privilegio']//div[@role='button']") protected WebElement cmbPrivilegioUsuario;
    @FindBy(xpath = "(//div//p-dropdown[@optionlabel='descripcionCampo']//div[@role='button'])[1]") protected WebElement cmbEstadoUsuarioEditar;
    @FindBy(xpath = "//app-input-select-2[@formcontrolname='fMotivo']//div[@role='button']") protected WebElement cmbMotivoTicketMasivo;
    @FindBy(xpath = "//app-input-select-2[@name='selectedTipoTasa']//p-dropdown//div[@role='button']") protected WebElement cmbTipoOperacionTC;
    @FindBy(xpath = "//app-representante-compania//p-dropdown//div[@role='button']") protected WebElement cmbRepresentanteCompania;
    @FindBy(xpath = "//div/div//span/p-dropdown//div[@role='button']") protected WebElement cmbMoneda;
    @FindBy(xpath = "//p-dropdown[@inputid='tipoPasajero']//div[@role='button']") protected WebElement cmbTipoPasajeroTipoTicket;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='listaTipos']//div[@role='button']") protected WebElement cmbTipoCompania;
    @FindBy(xpath = "//div/app-input-select[@inputid='modalidadVenta']//div[@role='button']") protected WebElement cmbTipoModalidad;
    @FindBy(xpath = "//div/app-input-select[@inputid]//div[@role='button']") protected WebElement cmbTipoTicketModalidad;
    @FindBy(xpath = "(//app-input-select-2//p-dropdown//div[@role='button'])[1]") protected WebElement cmbMotivos;
    @FindBy(xpath = "//div/div/span/p-dropdown[@id='cias']//div[@role='button']") protected WebElement cmbCompaniaTicketVuelo;
    @FindBy(xpath = "//app-input-select-2[@optionvalue='codigoCompania']//p-dropdown//div[@role='button']") protected WebElement cmbCompaniaBoarding;
    @FindBy(xpath = "//app-input-select-2[@label='Vuelo *']//p-dropdown//div[@role='button']") protected WebElement cmbVueloTicketVueloBpVuelo;
    @FindBy(xpath = "(//div/div/span/p-dropdown[@inputid='tipo']//div[@role='button'])[2]") protected WebElement cmbTipoDocumentoRepresentante;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[1]") protected WebElement cmbRol;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[2]") protected WebElement cmbEstado;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[3]") protected WebElement cmbGrupo;
    @FindBy(xpath = "//p-dropdown[@optionvalue='codCompania']//div[@role='button']") protected WebElement cmbCompaniaTicketBpFecha;
    @FindBy(xpath = "(//app-input-select-2[@optionlabel='descripcionCampo']//div[@role='button'])[1]") protected WebElement cmbTipoDocumentoTicketBpUsado;
    @FindBy(xpath = "(//div//app-input-select-2[@optionlabel='descripcionCampo']//div[@role='button'])[3]") protected WebElement cmbTipoPasajeroTicketBpUsado;
    @FindBy(xpath = "(//app-input-select-2[@optionlabel='descripcionCampo']//div[@role='button'])[4]") protected WebElement cmbTipoVueloTicketBpUsado;
    @FindBy(xpath = "//app-input-select-2[@optionlabel='descripcionCompania']//div[@role='button']") protected WebElement cmbCompaniaTicketBpUsado;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fMolinete']//p-dropdown//div[@role='button']") protected WebElement cmbMolineteSincronizacion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fEstadoSincronizacion']//p-dropdown//div[@role='button']") protected WebElement cmbEstadoSincronizacion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fUsuario']//p-dropdown//div[@role='button']") protected WebElement cmbAuditoriaUsuario;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='codigoMolinete']//p-dropdown//div[@role='button']") protected WebElement cmbMolineteDepuracion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='codigoTabla']//p-dropdown//div[@role='button']") protected WebElement cmbTablaDepuracion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='codigoEstado']//p-dropdown//div[@role='button']") protected WebElement cmbEstadoDepuracion;
    @FindBy(xpath = "//p-dropdown[@inputid='tipo']//div[@role='button']") protected WebElement cmbTipoTicketModalidaVenta;
    @FindBy(xpath = "//p-dropdown[@inputid='tipoVuelo']//div[@role='button']") protected WebElement cmbTipoVueloTipoTicket;
    @FindBy(xpath = "//p-dropdown[@inputid='tipoTrasb']//div[@role='button']") protected WebElement cmbTipoTransbordoTipoTicket;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='fModulo']//div[@role='button']") protected WebElement cmbModuloTransaccionCritica;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='estadoTurno']//div[@role='button']") protected WebElement cmbEstadoTurno;
    @FindBy(xpath = "//app-input-select-2[@formcontrolname='compania']//p-dropdown[@inputid]//div[@role='button']") protected  WebElement cmbCompania;
    public comboboxPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void abrirComboboxRolPadre(){
        wait.until(ExpectedConditions.visibilityOf(cmbRolPadre));
        cmbRolPadre.click();
    }
    public void abrirComboboxRolPadreUsuario(){
        wait.until(ExpectedConditions.visibilityOf(cmbRolPadreUsuario));
        cmbRolPadreUsuario.click();
    }
    public void abrirComboboxEstadoUsuario(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstadoUsuario));
        cmbEstadoUsuario.click();
    }
    public void abrirComboboxPrivilegioUsuario(){
        wait.until(ExpectedConditions.visibilityOf(cmbPrivilegioUsuario));
        cmbPrivilegioUsuario.click();
    }
    public void abrirComboboxEstadoUsuarioEditar(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstadoUsuarioEditar));
        cmbEstadoUsuarioEditar.click();
    }
    public void abrirComboboxRepresentanteCompania(){
        wait.until(ExpectedConditions.visibilityOf(cmbRepresentanteCompania));
        cmbRepresentanteCompania.click();
    }
    public void abrirComboboxMotivoTicketMasivo(){
        wait.until(ExpectedConditions.visibilityOf(cmbMotivoTicketMasivo));
        cmbMotivoTicketMasivo.click();
    }
    public void abrirComboboxMotivos(){
        wait.until(ExpectedConditions.visibilityOf(cmbMotivos));
        cmbMotivos.click();
    }
    public void abrirComboboxCompaniaTicketVuelo(){
        wait.until(ExpectedConditions.visibilityOf(cmbCompaniaTicketVuelo));
        cmbCompaniaTicketVuelo.click();
    }
    public void abrirComboboxTipoDocumentoRepresentante(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoDocumentoRepresentante));
        cmbTipoDocumentoRepresentante.click();
    }
    public void abrirComboboxCompaniaBoarding(){
        wait.until(ExpectedConditions.visibilityOf(cmbCompaniaBoarding));
        cmbCompaniaBoarding.click();
    }
    public void abrirComboboxVueloTicketVueloBpVuelo(){
        wait.until(ExpectedConditions.visibilityOf(cmbVueloTicketVueloBpVuelo));
        cmbVueloTicketVueloBpVuelo.click();
    }
    public void abrirComboboxTipoCompania(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoCompania));
        cmbTipoCompania.click();
    }
    public void abrirComboboxTipoModalidad(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoModalidad));
        cmbTipoModalidad.click();
    }
    public void abrirComboboxTipoTicketModalidad(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoTicketModalidad));
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
        wait.until(ExpectedConditions.visibilityOf(cmbTipoDocumentoTicketBpUsado));
        cmbTipoDocumentoTicketBpUsado.click();
    }
    public void abrirComboboxTipoVueloTicketBpUsado(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoVueloTicketBpUsado));
        cmbTipoVueloTicketBpUsado.click();
    }
    public void abrirComboboxCompaniaTicketBpUsado(){
        wait.until(ExpectedConditions.visibilityOf(cmbCompaniaTicketBpUsado));
        cmbCompaniaTicketBpUsado.click();
    }
    public void abrirComboboxTipoPasajeroTicketBpUsado(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoPasajeroTicketBpUsado));
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
    public void abrirComboboxTicketModalidaVenta(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoTicketModalidaVenta));
        cmbTipoTicketModalidaVenta.click();
    }
    public void abrirComboboxTipoVueloTipoTicket(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoVueloTipoTicket));
        cmbTipoVueloTipoTicket.click();
    }
    public void abrirComboboxTipoTransbordoTipoTicket(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoTransbordoTipoTicket));
        cmbTipoTransbordoTipoTicket.click();
    }
    public void abrirComboboxModuloTransaccionCritica(){
        wait.until(ExpectedConditions.visibilityOf(cmbModuloTransaccionCritica));
        cmbModuloTransaccionCritica.click();
    }
    public void abrirComboboxEstadoTurno(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstadoTurno));
        cmbEstadoTurno.click();
    }
    public void abrirComboboxCompania(){
        wait.until(ExpectedConditions.visibilityOf(cmbCompania));
        cmbCompania.click();
    }

    /**
     * Metodo que selecciona una opcion de un combobox
     * @param item : Item a seleccionar
     */
    public void seleccionarOpcion(String item) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionItem = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + item + "']"));
        opcionItem.click();
    }

    /**
     * Metodo que selecciona una opcion de un combobox
     * @param itemvuelo : Item a seleccionar
     */
    public void seleccionarOpcionVuelo(String itemvuelo) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement itemVuelo = driver.findElement(By.xpath("//p-dropdownitem/li/span[contains(text(), '" + itemvuelo.trim() + "')]"));
        itemVuelo.click();
    }
}


