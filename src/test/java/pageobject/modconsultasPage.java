package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modconsultasPage extends util {
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/usuarios']") protected WebElement opUsuarios;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/companias']") protected WebElement opCompanias;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/turnos']") protected WebElement opTurnos;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/detalle-ticket-bp']") protected WebElement opDetalleTicketBp;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/ticket-bp-fecha']") protected WebElement opTicketBpFecha;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/cuadre-sticker-bp']") protected WebElement opCuadreTicketBp;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/operacion-compra-venta']") protected WebElement opCompraVenta;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/ticket-bp-usado']") protected WebElement opTicketBpUsados;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/ticket-bp-anulado']") protected WebElement opTicketBpAnulados;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/auditoria']") protected WebElement opAuditoria;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/tickets-procesados']") protected WebElement opTicketsProcesados;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/log-errores-molinete']") protected WebElement opLogErrores;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/sincronizacion']") protected WebElement opSincronizacion;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/transaccion-critica']") protected WebElement opTransaccionCritica;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/depuracion']") protected WebElement opDepuracion;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/consulta/busqueda-pasajeros-fiscalia']") protected WebElement opFiscalia;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[1]") protected WebElement cmbRol;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[2]") protected WebElement cmbEstado;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[3]") protected WebElement cmbGrupo;
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[1]") protected WebElement cmbUsuario;
    @FindBy(xpath = "(//td[contains(.,'Cobro tasa internacional')])[2]") protected WebElement btnTablas;
    @FindBy(xpath = "//div/p-radiobutton[@value='NumeroTicket']") protected WebElement rdNumeroTicket;
    @FindBy(xpath = "//div/p-radiobutton[@value='RangoTicket']") protected WebElement rdRangoTicket;
    @FindBy(xpath = "//div/p-radiobutton[@value='Boarding']") protected WebElement rdBoarding;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='tipo']//div[@role='button']") protected WebElement cmbTipoDocumento;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='company']//div[@role='button']") protected WebElement cmbCompania;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='ticket']//div[@role='button']") protected WebElement cmbTipoTicket;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='cobro']//div[@role='button']") protected WebElement cmbIndicadorCobro;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='persona']//div[@role='button']") protected WebElement cmbTipoPersona;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='vuelo']//div[@role='button']") protected WebElement cmbTipoVuelo;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='turno']//div[@role='button']") protected WebElement cmbEstadoTurno;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='cajero']//div[@role='button']") protected WebElement cmbCajero;
    @FindBy(xpath = "//div/div/span/p-dropdown[@inputid='anulacion']//div[@role='button']") protected WebElement cmbMedioAnulacion;
    @FindBy(xpath = "//div//p-calendar[@inputid='calendar']//input") protected WebElement txtFechaProceso;
    @FindBy(xpath = "//div/div/p-radiobutton[@inputid='form1']") protected WebElement rdCompra;
    @FindBy(xpath = "//div/div/p-radiobutton[@inputid='form2']") protected WebElement rdVenta;
    @FindBy(xpath = "(//div/div/span/p-dropdown//div[@role='button'])[6]") protected WebElement cmbTipoTransbordo;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fOperacion']//p-dropdown//div[@role='button']") protected WebElement cmbOperacion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fTabla']//p-dropdown//div[@role='button']") protected WebElement cmbTabla;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fModulo']//p-dropdown//div[@role='button']") protected WebElement cmbModulo;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fSubModulo']//p-dropdown//div[@role='button']") protected WebElement cmbSubModulo;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fUsuario']//p-dropdown//div[@role='button']") protected WebElement cmbAuditoriaUsuario;
    @FindBy(xpath = "//div/app-input-text-2[@label='Cod. Turno']//input") protected WebElement txtCodigoTurno;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='sIDError']//p-dropdown//div[@role='button']") protected WebElement cmbTipoError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='sTipoError']//p-dropdown//div[@role='button']") protected WebElement cmbError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='sTipoBoarding']//p-dropdown//div[@role='button']") protected WebElement cmbTipoBp;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='sCompania']//p-dropdown//div[@role='button']") protected WebElement cmbCompaniaError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='sCodMolinete']//p-dropdown//div[@role='button']") protected WebElement cmbMolineteError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='sTipIngreso']//p-dropdown//div[@role='button']") protected WebElement cmbTipoIngresoError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fMolinete']//p-dropdown//div[@role='button']") protected WebElement cmbMolineteSincronizacion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fTablaSincronizacion']//p-dropdown//div[@role='button']") protected WebElement cmbTablaSincronizacion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fEstadoSincronizacion']//p-dropdown//div[@role='button']") protected WebElement cmbEstadoSincronizacion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fTipoSincronizacion']//p-dropdown//div[@role='button']") protected WebElement cmbTipoSincronizacion;
    public modconsultasPage() {
        PageFactory.initElements(driver, this);
    }
    public void ingresarOpcionUsuarios(){
        wait.until(ExpectedConditions.visibilityOf(opUsuarios));
        opUsuarios.click();
    }
    public void ingresarOpcionCompanias(){
        wait.until(ExpectedConditions.visibilityOf(opCompanias));
        opCompanias.click();
    }
    public void ingresarOpcionTurnos(){
        wait.until(ExpectedConditions.visibilityOf(opTurnos));
        opTurnos.click();
    }
    public void ingresarOpcionDetalleTicketBp(){
        wait.until(ExpectedConditions.visibilityOf(opDetalleTicketBp));
        opDetalleTicketBp.click();
    }
    public void ingresarOpcionTicketBpFecha(){
        wait.until(ExpectedConditions.visibilityOf(opTicketBpFecha));
        opTicketBpFecha.click();
    }
    public void ingresarOpcionCuadreTicketBp(){
        wait.until(ExpectedConditions.visibilityOf(opCuadreTicketBp));
        opCuadreTicketBp.click();
    }
    public void ingresarOpcionOperacionCompraVenta(){
        wait.until(ExpectedConditions.visibilityOf(opCompraVenta));
        opCompraVenta.click();
    }
    public void ingresarOpcionTicketBpUsados(){
        wait.until(ExpectedConditions.visibilityOf(opTicketBpUsados));
        scrollVertical(opTicketBpUsados);
        opTicketBpUsados.click();
    }
    public void ingresarOpcionTicketBpAnulados(){
        wait.until(ExpectedConditions.visibilityOf(opTicketBpAnulados));
        opTicketBpAnulados.click();
    }
    public void ingresarOpcionAuditoria(){
        wait.until(ExpectedConditions.visibilityOf(opAuditoria));
        opAuditoria.click();
    }
    public void ingresarOpcionTicketsProcesados(){
        wait.until(ExpectedConditions.visibilityOf(opTicketsProcesados));
        opTicketsProcesados.click();
    }
    public void ingresarOpcionLogErrores(){
        wait.until(ExpectedConditions.visibilityOf(opLogErrores));
        opLogErrores.click();
    }
    public void ingresarOpcionSincronizacion(){
        wait.until(ExpectedConditions.visibilityOf(opSincronizacion));
        opSincronizacion.click();
    }
    public void ingresarOpcionTransaccionCritica(){
        wait.until(ExpectedConditions.visibilityOf(opTransaccionCritica));
        opTransaccionCritica.click();
    }
    public void ingresarOpcionDepuracion(){
        wait.until(ExpectedConditions.visibilityOf(opDepuracion));
        opDepuracion.click();
    }
    public void ingresarOpcionFiscalia(){
        wait.until(ExpectedConditions.visibilityOf(opFiscalia));
        opFiscalia.click();
    }
    public void abrirComboRol(){
        wait.until(ExpectedConditions.visibilityOf(cmbRol));
        cmbRol.click();
    }
    public void seleccionarRol(String rol){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionRol = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + rol + "']"));
        opcionRol.click();
    }
    public void abrirComboEstado(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstado));
        cmbEstado.click();
    }
    public void seleccionarEstado(String estado){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionEstado = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + estado + "']"));
        opcionEstado.click();
    }
    public void abrirComboGrupo(){
        wait.until(ExpectedConditions.visibilityOf(cmbGrupo));
        cmbGrupo.click();
    }
    public void seleccionarGrupo(String grupo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionGrupo = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + grupo + "']"));
        opcionGrupo.click();
    }
    public void abrirComboUsuario(){
        wait.until(ExpectedConditions.visibilityOf(cmbUsuario));
        cmbUsuario.click();
    }
    public void seleccionarUsuario(String usuario){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionUsuario = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + usuario + "']"));
        opcionUsuario.click();
    }
    public void abrirComboTipoDocumento(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoDocumento));
        cmbTipoDocumento.click();
    }
    public void seleccionarTipoDocumento(String documento){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionDocumento = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + documento + "']"));
        opcionDocumento.click();
    }
    public void abrirComboCompania(){
        wait.until(ExpectedConditions.visibilityOf(cmbCompania));
        cmbCompania.click();
    }
    public void SeleccionarCompania(String compania){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionCompania = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + compania + "']"));
        opcionCompania.click();
    }
    public void abrirComboTipoTicket(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoTicket));
        cmbTipoTicket.click();
    }
    public void seleccionarTipoTicket(String tipoticket){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTipoTicket = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + tipoticket + "']"));
        opcionTipoTicket.click();
    }
    public void abrirComboIndicadorCobro(){
        wait.until(ExpectedConditions.visibilityOf(cmbIndicadorCobro));
        cmbIndicadorCobro.click();
    }
    public void seleccionarIndicadorCobro(String indicador){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionIndicador = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + indicador + "']"));
        opcionIndicador.click();
    }
    public void abrirComboTipoPersona(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoPersona));
        cmbTipoPersona.click();
    }
    public void seleccionarTipoPersona(String persona){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionPersona = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + persona + "']"));
        opcionPersona.click();
    }
    public void abrirComboTipoVuelo(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoVuelo));
        cmbTipoVuelo.click();
    }
    public void seleccionarTipoVuelo(String tipovuelo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTipoVuelo = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + tipovuelo + "']"));
        opcionTipoVuelo.click();
    }
    public void abrirComboEstadoTurno(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstadoTurno));
        cmbEstadoTurno.click();
    }
    public void seleccionarEstadoTurno(String estadoturno){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionEstadoTurno = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + estadoturno + "']"));
        opcionEstadoTurno.click();
    }
    public void abrirComboCajero(){
        wait.until(ExpectedConditions.visibilityOf(cmbCajero));
        cmbCajero.click();
    }
    public void seleccionarCajero(String cajero){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionCajero = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + cajero + "']"));
        opcionCajero.click();
    }
    public void abrirComboMedioAnulacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbMedioAnulacion));
        cmbMedioAnulacion.click();
    }
    public void seleccionarMedioAnulacion(String medioanulacion){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionMedioAnulacion = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + medioanulacion + "']"));
        opcionMedioAnulacion.click();
    }
    public void abrirComboTipoTransbordo(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoTransbordo));
        cmbTipoTransbordo.click();
    }
    public void seleccionarTipoTransbordo(String transbordo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTransbordo = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + transbordo + "']"));
        opcionTransbordo.click();
    }
    public void abrirComboOperacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbOperacion));
        cmbOperacion.click();
    }
    public void seleccionarOperacion(String operacion){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionOperacion = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + operacion + "']"));
        opcionOperacion.click();
    }
    public void abrirComboTabla(){
        wait.until(ExpectedConditions.visibilityOf(cmbTabla));
        cmbTabla.click();
    }
    public void seleccionarTabla(String tabla){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTabla = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + tabla + "']"));
        opcionTabla.click();
    }
    public void abrirComboModulo(){
        wait.until(ExpectedConditions.visibilityOf(cmbModulo));
        cmbModulo.click();
    }
    public void seleccionarModulo(String modulo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionModulo = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + modulo + "']"));
        opcionModulo.click();
    }
    public void abrirComboSubModulo(){
        wait.until(ExpectedConditions.visibilityOf(cmbSubModulo));
        cmbSubModulo.click();
    }
    public void seleccionarSubModulo(String submodulo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionSubModulo = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + submodulo + "']"));
        opcionSubModulo.click();
    }
    public void abrirComboAuditoriaUsuario(){
        wait.until(ExpectedConditions.visibilityOf(cmbAuditoriaUsuario));
        cmbAuditoriaUsuario.click();
    }
    public void seleccionarAuditoriaUsuario(String auditoriausuario){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionAuditoriaUsuario = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + auditoriausuario + "']"));
        opcionAuditoriaUsuario.click();
    }
    public void abrirComboTipoError(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoError));
        cmbTipoError.click();
    }
    public void seleccionarTipoError(String tipoerror){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTipoError = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + tipoerror + "']"));
        opcionTipoError.click();
    }
    public void abrirComboError(){
        wait.until(ExpectedConditions.visibilityOf(cmbError));
        cmbError.click();
    }
    public void seleccionarError(String error){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionError = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + error + "']"));
        opcionError.click();
    }
    public void abrirComboTipoBoarding(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoBp));
        cmbTipoBp.click();
    }
    public void seleccionarTipoBoarding(String tipobp){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTipoBp = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + tipobp + "']"));
        opcionTipoBp.click();
    }
    public void abrirComboCompaniaError(){
        wait.until(ExpectedConditions.visibilityOf(cmbCompaniaError));
        cmbCompaniaError.click();
    }
    public void seleccionarCompaniaError(String compania){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionCompaniaError = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + compania + "']"));
        opcionCompaniaError.click();
    }
    public void abrirComboMolineteError(){
        wait.until(ExpectedConditions.visibilityOf(cmbMolineteError));
        cmbMolineteError.click();
    }
    public void seleccionarMolineteError(String molineteerror){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionMolineteError = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + molineteerror + "']"));
        opcionMolineteError.click();
    }
    public void abrirComboTipoIngredoError(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoIngresoError));
        cmbTipoIngresoError.click();
    }
    public void seleccionarTipoIngresoError(String tipoingreso){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTipoIngreso = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + tipoingreso + "']"));
        opcionTipoIngreso.click();
    }
    public void abrirComboMolineteSincronizacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbMolineteSincronizacion));
        cmbMolineteSincronizacion.click();
    }
    public void seleccionarMolineteSincronizacion(String molinetesincronizacion){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionMolSincro = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + molinetesincronizacion + "']"));
        opcionMolSincro.click();
    }
    public void abrirComboTablaSincronizacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbTablaSincronizacion));
        cmbTablaSincronizacion.click();
    }
    public void seleccionarTablaSincronizacion(String tablasincronizacion){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTablaSincro = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + tablasincronizacion + "']"));
        opcionTablaSincro.click();
    }
    public void abrirComboEstadoSincronizacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstadoSincronizacion));
        cmbEstadoSincronizacion.click();
    }
    public void seleccionarEstadoSincronizacion(String estadosincronizacion){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionEstadoSincro = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + estadosincronizacion + "']"));
        opcionEstadoSincro.click();
    }
    public void abrirComboTipoSincronizacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoSincronizacion));
        cmbTipoSincronizacion.click();
    }
    public void seleccionarTipoSincronizacion(String tiposincronizacion){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTipoSincro = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + tiposincronizacion + "']"));
        opcionTipoSincro.click();
    }
    public void clickBotonTablas(){
        wait.until(ExpectedConditions.visibilityOf(btnTablas));
        btnTablas.click();
    }
    public void clickPorNumeroTicket(){
        rdNumeroTicket.click();
    }
    public void clickPorRangoTicket(){
        rdRangoTicket.click();
    }
    public void clickPorBoarding(){
        rdBoarding.click();
    }
    public void ingresarFechaProceso(String fechaproceso){
        txtFechaProceso.sendKeys(fechaproceso);
    }
    public void clickRadioBotonCompra(){
        rdCompra.click();
    }
    public void clickRadioBotonCVenta(){
        rdVenta.click();
    }
    public void ingresarCodigoTurno(String codigoturno){
        txtCodigoTurno.sendKeys(codigoturno);
    }
}
