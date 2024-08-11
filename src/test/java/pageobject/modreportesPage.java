package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modreportesPage extends util {
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/liquidacion-stickers']") protected WebElement opLiquidacionStickers;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/resumen-diario']") protected WebElement opResumenDiario;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/movimientos-tickets-contingencia']") protected WebElement opMovimientoTicket;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/stock-ticket-contingencia']") protected WebElement opStockTicket;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/detalles-linea-vuelo']") protected WebElement opDetalleLineaVuelo;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/bp-leidos-molinete']") protected WebElement opBpLeidosMolinete;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/tickets-vendidos-credito-contado']") WebElement opTicketVendidos;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/detalle-compania']") protected WebElement opDetalleCompania;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/tickets-bp-usados']") protected WebElement opTicketBpUsadoDiaMesHora;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/tickets-bp-usados-dia-mes']") protected WebElement opTicketBpUsadoDiaMes;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/recaudacion-mensual']") WebElement opRecaudacionMensual;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/liquidacion-venta']") protected WebElement opLiquidacionVenta;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/tickets-vencidos']") protected WebElement opTicketVencidos;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/cuadre-stickers-vendidos-bp-usados']") protected WebElement opCuadreStickers;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/tickets-bp-rehabilitados']") protected WebElement opTicketBpRehabilitados;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/bp-rehabilitados']") protected WebElement opBpRehabilitados;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/resumen-diario-por-turno']") protected WebElement opResumenDiarioTurno;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/extranet-bp-diarios']") protected WebElement opExtranetBpDiario;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/extranet-bp-mensual']") protected WebElement opExtranetBpMensual;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/reportes/pasajeros-fiscalia']") protected WebElement opPasajeroFiscalia;
    @FindBy(xpath = "//div/div/div/p-radiobutton[@inputid='rbFecha']") protected WebElement rdFechaResumenDiario;
    @FindBy(xpath = "//div/div/div/p-radiobutton[@inputid='rbRangoFechas']") protected WebElement rdRangoFechaResumenDiario;
    @FindBy(xpath = "//div/app-input-date[@label='Hora Desde']/span//input") protected WebElement inputHoraDesde;
    @FindBy(xpath = "//div/app-input-date[@label='Hora Hasta']/span//input") protected WebElement inputHoraHasta;
    @FindBy(xpath = "//div/div//app-input-select-2[@formcontrolname='indicadorFecha']//p-dropdown/div/div") protected WebElement cmbIndicadorFecha;
    @FindBy(xpath = "//app-input-select-2[@optionvalue='codigoTipoTicket']//p-dropdown//div[@role='button']") protected WebElement cmbTipoTicket;
    @FindBy(xpath = "//div/div//app-input-text-2[@formcontrolname='rangoTicketInicio']//input") protected WebElement inputTicketDesde;
    @FindBy(xpath = "//div/div//app-input-text-2[@formcontrolname='rangoTicketFin']//input") protected WebElement inputTicketHasta;
    @FindBy(xpath = "//button[contains(.,'Resumen')]") protected WebElement btnResumen;
    @FindBy(xpath = "(//div//p-calendar[@inputid]//input[@role='combobox'])[1]") protected WebElement txtfechaAl;
    @FindBy(xpath = "(//div//p-calendar[@inputid]//input[@role='combobox'])[3]") protected WebElement txtfechaVuelo;
    @FindBy(xpath = "(//div//input[@id='textInput'])[2]") protected WebElement txtNumeroBoarding;
    @FindBy(xpath = "//div/div/app-input-select-2[@optionvalue='codCompania']/span/p-dropdown//div[@role='button']") protected WebElement cmbCompania;
    @FindBy(xpath = "//div/div//app-input-select-2[@formcontrolname='tipoPago']//p-dropdown/div/div") protected WebElement cmbTipoPago;
    @FindBy(xpath = "//div/div//app-input-select-2[@formcontrolname='tipoRango']//p-dropdown/div/div") protected WebElement cmbTipoRango;
    @FindBy(xpath = "//div/app-input-text-2[@formcontrolname='destino']//input[@id]") protected WebElement inputDestino;
    @FindBy(xpath = "//app-input-text-2[@formcontrolname='numeroVuelo']//input[@id]") protected WebElement inputNumeroVuelo;
    @FindBy(xpath = "(//div/p-checkbox/div)[1]") protected WebElement checkBoarding;
    @FindBy(xpath = "(//div/p-checkbox/div)[2]") protected WebElement checkTicket;
    @FindBy(xpath = "//div//app-input-date[@formcontrolname='anio']//p-calendar//input") protected WebElement txtAnio;
    @FindBy(xpath = "//div/div//app-input-select-2[@formcontrolname='tipoMotivo']//p-dropdown/div/div") protected WebElement cmbMotivoReahabilitacion;
    @FindBy(xpath = "//div/div//app-input-select-2[@formcontrolname='tipoVuelo']//p-dropdown/div/div") protected WebElement cmbTipoVuelo;
    @FindBy(xpath = "//div/div//app-input-select-2[@formcontrolname='tipoPersona']//p-dropdown/div/div") protected WebElement cmbTipoPersona;
    @FindBy(xpath = "//div/div/div/p-radiobutton[@inputid='rbFecha']") protected WebElement rdTurno;
    @FindBy(xpath = "//div/div/div/p-radiobutton[@inputid='rbRangoFechas']") protected WebElement rdRangoTurno;
    @FindBy(xpath = "//div/app-input-text-2[@formcontrolname='codTurnoDesde']//input") protected WebElement inputTurnoDesde;
    @FindBy(xpath = "//div/app-input-text-2[@formcontrolname='codTurnoHasta']//input") protected WebElement inputTurnoHasta;
    @FindBy(xpath = "//div/div//app-input-select-2[@formcontrolname='tipoTrasbordo']//p-dropdown/div/div") protected WebElement cmbTipoTransbordo;
    @FindBy(xpath = "(//div//div/ul[@role='tablist']/li[@role='presentation']/a)[1]") protected WebElement pesBpUsados;
    @FindBy(xpath = "(//div//div/ul[@role='tablist']/li[@role='presentation']/a)[2]") protected WebElement pesBpRehabilitados;
    @FindBy(xpath = "(//div//div/ul[@role='tablist']/li[@role='presentation']/a)[3]") protected WebElement pesBpAnulados;
    @FindBy(xpath = "(//div//div/ul[@role='tablist']/li[@role='presentation']/a)[4]") protected WebElement pesBpNeto;
    @FindBy(xpath = "//div/app-input-text-2[@label='Nro. Vuelo']//input[@id]") protected WebElement inputNumeroVueloB;
    @FindBy(xpath = "//div/app-input-text-2[@label='Destino']//input[@id]") protected WebElement inputDestinoB;
    @FindBy(xpath = "(//div//p-calendar[@inputid]//input[@role='combobox'])[1]") protected WebElement txtMesUso;
    @FindBy(xpath = "") protected WebElement lblTotalRegistro;
    public modreportesPage() {
        PageFactory.initElements(slowDriver, this);
    }
    public void ingresarOpcionLiquidacionStickers(){
        wait.until(ExpectedConditions.visibilityOf(opLiquidacionStickers));
        opLiquidacionStickers.click();
    }
    public void ingresarOpcionResumenDiario(){
        wait.until(ExpectedConditions.visibilityOf(opResumenDiario));
        opResumenDiario.click();
    }
    public void ingresarOpcionMovimientoTicketContingencia(){
        wait.until(ExpectedConditions.visibilityOf(opMovimientoTicket));
        opMovimientoTicket.click();
    }
    public void ingresarOpcionStockTicketContingencia(){
        wait.until(ExpectedConditions.visibilityOf(opStockTicket));
        opStockTicket.click();
    }
    public void ingresarOpcionDetalleLineaVuelo(){
        wait.until(ExpectedConditions.visibilityOf(opDetalleLineaVuelo));
        scrollVertical(opDetalleLineaVuelo);
        opDetalleLineaVuelo.click();
    }
    public void ingresarOpcionBpLeidosMolinete(){
        wait.until(ExpectedConditions.visibilityOf(opBpLeidosMolinete));
        scrollVertical(opBpLeidosMolinete);
        opBpLeidosMolinete.click();
    }
    public void ingresarOpcionTicketVendidosCreditoContado(){
        wait.until(ExpectedConditions.visibilityOf(opTicketVendidos));
        scrollVertical(opTicketVendidos);
        opTicketVendidos.click();
    }
    public void ingresarOpcionDetalleCompania(){
        wait.until(ExpectedConditions.visibilityOf(opDetalleCompania));
        scrollVertical(opDetalleCompania);
        opDetalleCompania.click();
    }
    public void ingresarOpcionTicketBpUsadoDiaMesHora(){
        wait.until(ExpectedConditions.visibilityOf(opTicketBpUsadoDiaMesHora));
        scrollVertical(opTicketBpUsadoDiaMesHora);
        opTicketBpUsadoDiaMesHora.click();
    }
    public void ingresarOpcionTicketBpUsadoDiaMes(){
        wait.until(ExpectedConditions.visibilityOf(opTicketBpUsadoDiaMes));
        scrollVertical(opTicketBpUsadoDiaMes);
        opTicketBpUsadoDiaMes.click();
    }
    public void ingresarOpcionRecaudacionMensual(){
        wait.until(ExpectedConditions.visibilityOf(opRecaudacionMensual));
        scrollVertical(opRecaudacionMensual);
        opRecaudacionMensual.click();
    }
    public void ingresarOpcionLiquidacionVenta(){
        wait.until(ExpectedConditions.visibilityOf(opLiquidacionVenta));
        scrollVertical(opLiquidacionVenta);
        opLiquidacionVenta.click();
    }
    public void ingresarOpcionTicketVencidos(){
        wait.until(ExpectedConditions.visibilityOf(opTicketVencidos));
        scrollVertical(opTicketVencidos);
        opTicketVencidos.click();
    }
    public void ingresarOpcionCuadreStickersVendidosBpUsados(){
        wait.until(ExpectedConditions.visibilityOf(opCuadreStickers));
        scrollVertical(opCuadreStickers);
        opCuadreStickers.click();
    }
    public void ingresarOpcionTicketBpRehabilitados(){
        wait.until(ExpectedConditions.visibilityOf(opTicketBpRehabilitados));
        scrollVertical(opTicketBpRehabilitados);
        opTicketBpRehabilitados.click();
    }
    public void ingresarOpcionBpRehabilitados(){
        wait.until(ExpectedConditions.visibilityOf(opBpRehabilitados));
        scrollVertical(opBpRehabilitados);
        opBpRehabilitados.click();
    }
    public void ingresarOpcionResumenDiarioTurno(){
        wait.until(ExpectedConditions.visibilityOf(opResumenDiarioTurno));
        scrollVertical(opResumenDiarioTurno);
        opResumenDiarioTurno.click();
    }
    public void ingresarOpcionExtranetBpDiario(){
        wait.until(ExpectedConditions.visibilityOf(opExtranetBpDiario));
        scrollVertical(opExtranetBpDiario);
        opExtranetBpDiario.click();
    }
    public void ingresarOpcionExtranetBpMensual(){
        wait.until(ExpectedConditions.visibilityOf(opExtranetBpMensual));
        scrollVertical(opExtranetBpMensual);
        opExtranetBpMensual.click();
    }
    public void ingresarOpcionPasajeroFiscalia(){
        wait.until(ExpectedConditions.visibilityOf(opPasajeroFiscalia));
        scrollVertical(opPasajeroFiscalia);
        opPasajeroFiscalia.click();
    }
    public void seleccionarFechaResumenDiario(){
        wait.until(ExpectedConditions.visibilityOf(rdFechaResumenDiario));
        rdFechaResumenDiario.click();
    }
    public void seleccionarRangoFechaResumenDiario(){
        wait.until(ExpectedConditions.visibilityOf(rdRangoFechaResumenDiario));
        rdRangoFechaResumenDiario.click();
    }
    public void ingresarHoraDesde(String horadesde){
        inputHoraDesde.sendKeys(horadesde);
    }
    public void ingresarHoraHasta(String horahasta){
        inputHoraHasta.sendKeys(horahasta);
    }
    public void abrirComboboxIndicadorFecha(){
        wait.until(ExpectedConditions.visibilityOf(cmbIndicadorFecha));
        cmbIndicadorFecha.click();
    }
    public void abrirComboboxTipoTicket(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoTicket));
        cmbTipoTicket.click();
    }
    public void abrirComboboxTipoTicketClicks() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-spinner-overlay")));
        wait.until(ExpectedConditions.visibilityOf(cmbTipoTicket));

        for (int i = 0; i < 3; i++) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(cmbTipoTicket));
                cmbTipoTicket.click();
                break;
            } catch (ElementClickInterceptedException e) {
                Thread.sleep(1000);
            }
        }
    }
    public void seleccionarOpcion(String item) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionItem = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + item + "']"));
        opcionItem.click();
    }
    public void ingresarTicketDesde(String ticketdesde){
        inputTicketDesde.sendKeys(ticketdesde);
    }
    public void ingresarTicketHasta(String tickethasta){
        inputTicketHasta.sendKeys(tickethasta);
    }
    public void clickBotonResumne(){
        wait.until(ExpectedConditions.elementToBeClickable(btnResumen));
        btnResumen.click();
    }
    public void ingresarFechaAl(String fechaal){
        wait.until(ExpectedConditions.visibilityOf(txtfechaAl));
        limpiarCampo(txtfechaAl);
        txtfechaAl.sendKeys(fechaal);
        txtfechaAl.sendKeys(Keys.TAB);
    }
    public void seleccionarFechaVuelo(String fechavuelo){
        wait.until(ExpectedConditions.visibilityOf(txtfechaVuelo));
        txtfechaVuelo.sendKeys(fechavuelo);
        txtfechaVuelo.sendKeys(Keys.TAB);
    }
    public void ingresarNumeroBoarding(String numeroboarding){
        txtNumeroBoarding.sendKeys(numeroboarding);
    }
    public void abriComboboxCompania(){
        wait.until(ExpectedConditions.visibilityOf(cmbCompania));
        cmbCompania.click();
    }
    public void abriComboboxTipoPago(){
        cmbTipoPago.click();
    }
    public void abriComboboxTipoRango(){
        cmbTipoRango.click();
    }
    public void abriComboboxMotivoRehabilitacion(){
        cmbMotivoReahabilitacion.click();
    }
    public void ingresarDestino(String destino){
        inputDestino.sendKeys(destino);
    }
    public void ingresarNumeroVuelo(String vuelo){
        inputNumeroVuelo.sendKeys(vuelo);
    }
    public void seleccionarTipoDocumentoBoarding(String boarding) {
        wait.until(ExpectedConditions.visibilityOf(checkBoarding));
        if (boarding.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkBoarding));
            if (!checkBoarding.isSelected()) {
                checkBoarding.click();
            }
        } else if (boarding.toLowerCase().equals("no")) {
            if (checkBoarding.isSelected()) {
                checkBoarding.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkBoarding.isSelected());
        }
    }
    public void seleccionarTipoDocumentoTicket(String ticket) {
        wait.until(ExpectedConditions.visibilityOf(checkTicket));
        if (ticket.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkTicket));
            if (!checkTicket.isSelected()) {
                checkTicket.click();
            }
        } else if (ticket.toLowerCase().equals("no")) {
            if (checkTicket.isSelected()) {
                checkTicket.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkTicket.isSelected());
        }
    }
    public void ingresarAnio(String anio){
        wait.until(ExpectedConditions.visibilityOf(txtAnio));
        limpiarCampo(txtAnio);
        txtAnio.sendKeys(anio);
        txtAnio.sendKeys(Keys.TAB);
    }
    public void abrirComboboxTipoVuelo(){
        cmbTipoVuelo.click();
    }
    public void abrirComboboxTipoPersona(){
        cmbTipoPersona.click();
    }
    public void abrirComboboxTipoTransbordo(){
        cmbTipoTransbordo.click();
    }
    public void seleccionarTurno(){
        wait.until(ExpectedConditions.visibilityOf(rdTurno));
        rdTurno.click();
    }
    public void seleccionarRangoTurno(){
        wait.until(ExpectedConditions.visibilityOf(rdRangoTurno));
        rdRangoTurno.click();
    }
    public void ingresarTurnoDesde(String turnodesde){
        wait.until(ExpectedConditions.visibilityOf(inputTurnoDesde));
        inputTurnoDesde.sendKeys(turnodesde);
    }
    public void ingresarTurnoHasta(String turnohasta){
        inputTurnoHasta.sendKeys(turnohasta);
    }
    public void ingresarPestanaBoardingPassUsados(){
        wait.until(ExpectedConditions.visibilityOf(pesBpUsados));
        pesBpUsados.click();
    }
    public void ingresarPestanaBoardingPassRehabilitados(){
        pesBpRehabilitados.click();
    }
    public void ingresarPestanaBoardingPassAnulados(){
        pesBpAnulados.click();
    }
    public void ingresarPestanaBoardingPassNeto(){
        pesBpNeto.click();
    }
    public void ingresarNumeroVueloB(String numerovuelob){
        inputNumeroVueloB.sendKeys(numerovuelob);
    }
    public void ingresarNumeroVueloC(String numerovueloc){
        limpiarCampo(inputNumeroVueloB);
        inputNumeroVueloB.sendKeys(numerovueloc);
    }
    public void ingresarDestinoB(String destinob){
        inputDestinoB.sendKeys(destinob);
    }
    public void ingresarMesUso(String mes){
        wait.until(ExpectedConditions.visibilityOf(txtMesUso));
        txtMesUso.sendKeys(mes);
    }
    public void validarTotalRegistrosLabel(String registros){
        wait.until(ExpectedConditions.visibilityOf(lblTotalRegistro));
        Assert.assertEquals(registros, "Total de Boarding Pass Usados:", lblTotalRegistro.getText());
    }
}
