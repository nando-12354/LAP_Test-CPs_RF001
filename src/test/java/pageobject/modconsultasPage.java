package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    @FindBy(xpath = "(//div/div//p-dropdown//div[@role='button'])[1]") protected WebElement cmbUsuario;
    @FindBy(xpath = "(//td[contains(.,'Cobro tasa internacional')])[2]") protected WebElement btnTablas;
    @FindBy(xpath = "//div/p-radiobutton[@value='NumeroTicket']") protected WebElement rdNumeroTicket;
    @FindBy(xpath = "//div/p-radiobutton[@value='RangoTicket']") protected WebElement rdRangoTicket;
    @FindBy(xpath = "//div/p-radiobutton[@value='Boarding']") protected WebElement rdBoarding;
    @FindBy(xpath = "//app-input-text-2[@label='Número de Ticket']//input") protected WebElement inputNumeroTicket;
    @FindBy(xpath = "//app-input-text-2[@label='Desde']//input") protected WebElement inputNumeroTicketDesde;
    @FindBy(xpath = "//app-input-text-2[@label='Hasta']//input") protected WebElement inputNumeroTicketHasta;
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
    @FindBy(xpath = "//div/app-input-text-2[@label='Cod. Turno']//input") protected WebElement txtCodigoTurno;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='iDError']//p-dropdown//div[@role='button']") protected WebElement cmbTipoError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='tipoError']//p-dropdown//div[@role='button']") protected WebElement cmbError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='tipoBoarding']//p-dropdown//div[@role='button']") protected WebElement cmbTipoBp;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='sCompania']//p-dropdown//div[@role='button']") protected WebElement cmbCompaniaError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='codMolinete']//p-dropdown//div[@role='button']") protected WebElement cmbMolineteError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='tipIngreso']//p-dropdown//div[@role='button']") protected WebElement cmbTipoIngresoError;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fTablaSincronizacion']//p-dropdown//div[@role='button']") protected WebElement cmbTablaSincronizacion;
    @FindBy(xpath = "//div/app-input-select-2[@formcontrolname='fTipoSincronizacion']//p-dropdown//div[@role='button']") protected WebElement cmbTipoSincronizacion;
    @FindBy(xpath = "//div/app-input-date[@label='Hora desde']/span//input") protected WebElement inputHoraDesde;
    @FindBy(xpath = "//div/app-input-date[@label='Hora hasta']/span//input") protected WebElement inputHoraHasta;
    @FindBy(xpath = "//app-input-text-2[@formcontrolname='fNumeroCaja']//input") protected WebElement inputNumeroCaja;
    @FindBy(xpath = "(//div//p-calendar[@inputid]//input[@role='combobox'])[1]")
    protected WebElement txtFechaDesde;
    @FindBy(xpath = "(//div//p-calendar[@inputid]//input[@role='combobox'])[3]")
    protected WebElement txtFechaHasta;
    @FindBy(xpath = "(//div//p-calendar[@inputid]//input[@role='combobox'])[2]")
    protected WebElement txtHoraDesdeB;
    @FindBy(xpath = "(//div//p-calendar[@inputid]//input[@role='combobox'])[4]")
    protected WebElement txtHoraHastaB;
    @FindBy(xpath = "(//div//p-dropdown[@optionlabel='sDscCampo']//div[@role='button'])[1]") protected WebElement cmbTipoDocumentoTicketBpUsado;
    @FindBy(xpath = "//div//input[@inputid='input']") protected WebElement txtNumeroVuelo;
    @FindBy(xpath = "(//p-calendar[@id='fechaDesde'])[2]") protected WebElement txtFechaVuelo;
    @FindBy(xpath = "//app-input-date[@formcontrolname='fchVuelo']//p-calendar//input") protected WebElement txtFechaVueloLogError;
    @FindBy(xpath = "//div//div//p-radiobutton[@name='rango']") protected WebElement rdResumenTicketBpAnulado;
    public modconsultasPage() {
        PageFactory.initElements(slowDriver, this);
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
        scrollVertical(opAuditoria);
        opAuditoria.click();
    }
    public void ingresarOpcionTicketsProcesados(){
        wait.until(ExpectedConditions.visibilityOf(opTicketsProcesados));
        scrollVertical(opTicketsProcesados);
        opTicketsProcesados.click();
    }
    public void ingresarOpcionLogErrores(){
        wait.until(ExpectedConditions.visibilityOf(opLogErrores));
        scrollVertical(opLogErrores);
        opLogErrores.click();
    }
    public void ingresarOpcionSincronizacion(){
        wait.until(ExpectedConditions.visibilityOf(opSincronizacion));
        scrollVertical(opSincronizacion);
        opSincronizacion.click();
    }
    public void ingresarOpcionTransaccionCritica(){
        wait.until(ExpectedConditions.visibilityOf(opTransaccionCritica));
        scrollVertical(opTransaccionCritica);
        opTransaccionCritica.click();
    }
    public void ingresarOpcionDepuracion(){
        wait.until(ExpectedConditions.visibilityOf(opDepuracion));
        scrollVertical(opDepuracion);
        opDepuracion.click();
    }
    public void ingresarOpcionFiscalia(){
        wait.until(ExpectedConditions.visibilityOf(opFiscalia));
        scrollVertical(opFiscalia);
        opFiscalia.click();
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
    public void abrirComboTablaSincronizacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbTablaSincronizacion));
        cmbTablaSincronizacion.click();
    }
    public void seleccionarTablaSincronizacion(String tablasincronizacion){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionTablaSincro = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + tablasincronizacion + "']"));
        opcionTablaSincro.click();
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
        wait.until(ExpectedConditions.visibilityOf(rdNumeroTicket));
        rdNumeroTicket.click();
    }
    public void clickPorRangoTicket(){
        wait.until(ExpectedConditions.visibilityOf(rdRangoTicket));
        rdRangoTicket.click();
    }
    public void clickPorBoarding(){
        wait.until(ExpectedConditions.visibilityOf(rdBoarding));
        rdBoarding.click();
    }
    public void ingresarFechaProceso(String fechaproceso){
        wait.until(ExpectedConditions.visibilityOf(txtFechaProceso));
        limpiarCampo(txtFechaProceso);
        txtFechaProceso.sendKeys(fechaproceso);
        txtFechaProceso.sendKeys(Keys.TAB);
    }
    public void clickRadioBotonCompra(){
        wait.until(ExpectedConditions.visibilityOf(rdCompra));
        rdCompra.click();
    }
    public void clickRadioBotonCVenta(){
        wait.until(ExpectedConditions.visibilityOf(rdVenta));
        rdVenta.click();
    }
    public void ingresarCodigoTurno(String codigoturno){
        wait.until(ExpectedConditions.visibilityOf(txtCodigoTurno));
        txtCodigoTurno.sendKeys(codigoturno);
    }
    public void ingresarHoraDesde(String horadesde){
        inputHoraDesde.sendKeys(horadesde);
    }
    public void ingresarHoraHasta(String horahasta){
        inputHoraHasta.sendKeys(horahasta);
    }
    public void ingresarNumeroCaja(String caja){
        inputNumeroCaja.sendKeys(caja);
    }
    public void ingresarNumeroTicket(String ticket){
        inputNumeroTicket.sendKeys(ticket);
    }
    public void ingresarNumeroTicketDesde(String ticketdesde){
        inputNumeroTicketDesde.sendKeys(ticketdesde);
    }
    public void ingresarNumeroTicketHasta(String tickethasta){
        inputNumeroTicketHasta.sendKeys(tickethasta);
    }
    public void ingresarFechaDesde(String fechadesde){
        wait.until(ExpectedConditions.visibilityOf(txtFechaDesde));
        limpiarCampo(txtFechaDesde);
        txtFechaDesde.sendKeys(fechadesde);
        txtFechaDesde.sendKeys(Keys.TAB);
    }
    public void ingresarFechaHasta(String fechahasta){
        wait.until(ExpectedConditions.visibilityOf(txtFechaHasta));
        limpiarCampo(txtFechaHasta);
        txtFechaHasta.sendKeys(fechahasta);
        txtFechaHasta.sendKeys(Keys.TAB);
    }
    public void ingresarHoraDesdeB(String horadesde){
        wait.until(ExpectedConditions.visibilityOf(txtHoraDesdeB));
        txtHoraDesdeB.sendKeys(horadesde);
        txtHoraDesdeB.sendKeys(Keys.TAB);
    }
    public void ingresarHoraHastaB(String horahasta){
        wait.until(ExpectedConditions.visibilityOf(txtHoraHastaB));
        txtHoraHastaB.sendKeys(horahasta);
        txtHoraHastaB.sendKeys(Keys.TAB);
    }
    public void abrirComboboxTicketBpUsado(String ticketbp){
        cmbTipoDocumentoTicketBpUsado.click();
    }
    public void ingresarNumeroVuelo(String vuelo){
        wait.until(ExpectedConditions.visibilityOf(txtNumeroVuelo));
        txtNumeroVuelo.sendKeys(vuelo);
    }
    public void ingresarFechaVuelo(String fechavuelo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p-calendar[@id='fechaDesde'])[2]")));
        txtFechaVuelo.sendKeys(fechavuelo);
    }
    public void ingresarFechaVueloLogError(String vuelologerror){
        wait.until(ExpectedConditions.visibilityOf(txtFechaVueloLogError));
        txtFechaVueloLogError.sendKeys(vuelologerror);
    }
    public void seleccionarResumenTicketBpAnulados(){
        wait.until(ExpectedConditions.visibilityOf(rdResumenTicketBpAnulado));
        rdResumenTicketBpAnulado.click();
    }
}
