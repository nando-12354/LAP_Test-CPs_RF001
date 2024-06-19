package pageobject;

import io.cucumber.java.de.Wenn;
import io.cucumber.java.ro.Si;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class modoperacionPage extends util {
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/tasa-cambio']")
    protected WebElement optasaCambio;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/precio-ticket']")
    protected WebElement opprecioTicket;
    @FindBy(xpath = "//span[contains(.,'Gestión Ticket Contingencia')]")
    WebElement opgestionTicketContingencia;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/preemision-ticket-contingencia']")
    protected WebElement opsubpreticketContingencia;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/registro-ticket-contingencia']")
    protected WebElement opsubticketContingencia;
    @FindBy(xpath = "(//span[contains(.,'Extorno')])[1]")
    WebElement opExtorno;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/extorno-operaciones']")
    protected WebElement opsubextornoOperacion;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/extorno-tickets']")
    protected WebElement opsubextornoTicket;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/extorno-rehabilitacion']")
    protected WebElement opsubextornoRehabilitacion;
    @FindBy(xpath = "(//span[contains(.,'Anulación')])[1]")
    WebElement opAnulacion;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/anulacion-ticket']")
    protected WebElement opsubanulacionTicket;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/anulacion-bcbp']")
    protected WebElement opsubanulacionBcbp;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/venta-masiva-credito']")
    protected WebElement opventaMasiva;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/extension-fecha-vigencia-ticket']")
    protected WebElement opextensionFecha;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/gestion-molinete']")
    protected WebElement opgestionMolinete;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/generacion-archivo-venta']")
    protected WebElement opgeneracionArchivo;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/cierre-turno']")
    protected WebElement opcerrarTurno;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/operacion/generacion-comprobante-seae']")
    protected WebElement opgeneracionSeae;
    @FindBy(xpath = "//div//div//p-radiobutton[@inputid='tasaCambioRadioButton1']")
    protected WebElement rdTCactual;
    @FindBy(xpath = "//div//div//p-radiobutton[@inputid='tasaCambioRadioButton2']")
    protected WebElement rdTCprogramada;
    @FindBy(xpath = "//div//div//p-radiobutton[@inputid='tasaCambioRadioButton3']")
    protected WebElement rdTChistorica;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[1]")
    protected WebElement checkCompraA;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[2]")
    protected WebElement checkVentaA;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[3]")
    protected WebElement checkCompraB;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[4]")
    protected WebElement checkVentaB;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[5]")
    protected WebElement checkCompraC;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[6]")
    protected WebElement checkVentaC;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[7]")
    protected WebElement checkCompraD;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[8]")
    protected WebElement checkVentaD;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[9]")
    protected WebElement checkCompraE;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[10]")
    protected WebElement checkVentaE;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[1]")
    protected WebElement inputValorA;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[2]")
    protected WebElement inputValorB;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[3]")
    protected WebElement inputValorC;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[4]")
    protected WebElement inputValorD;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[5]")
    protected WebElement inputValorE;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[6]")
    protected WebElement inputValorF;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[7]")
    protected WebElement inputValorG;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[8]")
    protected WebElement inputValorH;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[9]")
    protected WebElement inputValorI;
    @FindBy(xpath = "(//table//tbody/tr/td/input)[10]")
    protected WebElement inputValorJ;
    @FindBy(xpath = "//div/app-input-date[@label='Fecha Programada']//p-calendar//input")
    protected WebElement inputFechaProgramada;
    @FindBy(xpath = "//div/app-input-date[@label='Hora Programada']/span//input")
    protected WebElement inputHoraProgramada;
    @FindBy(xpath = "(//table//tbody/tr/td/p-button[@icon='pi pi-trash']/button)[1]")
    protected WebElement btnEliminarTCprogramadaA;
    @FindBy(xpath = "(//table//tbody/tr/td/p-button[@icon='pi pi-trash']/button)[2]")
    protected WebElement btnEliminarTCprogramadaB;
    @FindBy(xpath = "(//table//tbody/tr/td/p-button[@icon='pi pi-trash']/button)[3]")
    protected WebElement btnEliminarTCprogramadaC;
    @FindBy(xpath = "(//table//tbody/tr/td/p-button[@icon='pi pi-trash']/button)[4]")
    protected WebElement btnEliminarTCprogramadaD;
    @FindBy(xpath = "(//table//tbody/tr/td/p-button[@icon='pi pi-trash']/button)[5]")
    protected WebElement btnEliminarTCprogramadaE;
    @FindBy(xpath = "(//div//p-calendar[@inputid]//input[@role='combobox'])[1]")
    protected WebElement txtFechaDesdeTC;
    @FindBy(xpath = "(//div//p-calendar[@inputid]//input[@role='combobox'])[2]")
    protected WebElement txtFechaHastaTC;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/input[@type='checkbox'])[1]")
    protected WebElement checkMonedaA;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/input[@type='checkbox'])[2]")
    protected WebElement checkMonedaVentaA;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/input[@type='checkbox'])[3]")
    protected WebElement checkMonedaB;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/input[@type='checkbox'])[4]")
    protected WebElement checkMonedaVentaB;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/input[@type='checkbox'])[5]")
    protected WebElement checkMonedaC;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/input[@type='checkbox'])[6]")
    protected WebElement checkMonedaVentaC;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/input[@type='number'])[1]")
    protected WebElement inputPrecioA;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/input[@type='number'])[2]")
    protected WebElement inputPrecioB;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/input[@type='number'])[3]")
    protected WebElement inputPrecioC;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/select)[1]")
    protected WebElement cmbCodigoMonedaA;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/select)[2]")
    protected WebElement cmbCodigoMonedaB;
    @FindBy(xpath = "(//p-table/div/div/table//tbody/tr/td/select)[3]")
    protected WebElement cmbCodigoMonedaC;
    @FindBy(xpath = "(//table//tbody/tr/td//button[@icon='pi pi-trash'])[1]")
    protected WebElement btnEliminarPTProgramadaA;
    @FindBy(xpath = "(//div/div/span/p-dropdown//div[@role='button'])[1]")
    protected WebElement cmbTipoVuelo;
    @FindBy(xpath = "(//div/div/span/p-dropdown//div[@role='button'])[2]")
    protected WebElement cmbTipoTransbordo;
    @FindBy(xpath = "(//div/div/span/p-dropdown//div[@role='button'])[3]")
    protected WebElement cmbTipoPasajero;
    @FindBy(xpath = "(//div/div/span/p-dropdown//div[@role='button'])[4]")
    protected WebElement cmbPrecioTicket;
    @FindBy(xpath = "(//div/div/span/p-dropdown//div[@role='button'])[5]")
    protected WebElement cmbRepresentanteVentaMasiva;
    @FindBy(xpath = "//button[contains(.,'Generar')]")
    WebElement btnGenerar;
    @FindBy(xpath = "//input[@id='cantidad']")
    WebElement inputCantidad;
    @FindBy(xpath = "//h3[contains(.,'Datos de Turno')]")
    WebElement lblDatosTurno;
    @FindBy(xpath = "//h3[contains(.,'Filtro consulta')]")
    WebElement lblFiltroConsulta;
    @FindBy(xpath = "//h3[contains(.,'Datos de venta')]")
    WebElement lblDatosVenta;
    @FindBy(xpath = "//form/div/div/app-input-select-2[@optionlabel='sUsuario']//div[@role='button']") protected WebElement cmbFiltroUsuario;
    @FindBy(xpath = "//form/div//app-input-text-2[@formcontrolname='fNumIni']//input") protected WebElement inputTicketDesde;
    @FindBy(xpath = "//form/div//app-input-text-2[@formcontrolname='fNumFin']//input") protected WebElement inputTicketHasta;
    @FindBy(xpath = "(//table//tbody/tr/td/p-tablecheckbox)[1]") protected WebElement checkTicketContigenciaA;
    @FindBy(xpath = "(//table//tbody/tr/td/p-tablecheckbox)[2]") protected WebElement checkTicketContigenciaB;
    @FindBy(xpath = "(//table//tbody/tr/td/p-tablecheckbox)[3]") protected WebElement checkTicketContigenciaC;
    @FindBy(xpath = "(//table//tbody/tr/td/p-tablecheckbox)[4]") protected WebElement checkTicketContigenciaD;
    @FindBy(xpath = "(//table//tbody/tr/td/p-tablecheckbox)[5]") protected WebElement checkTicketContigenciaE;
    @FindBy(xpath = "//div//div/div[@class='sub-cierre']/p-checkbox") protected WebElement checkCierreTurno;
    @FindBy(xpath = "//form/div/div//p-dropdown[@inputid='ddlesttur']//div[@role='button']") protected WebElement cmbEstadoturno;
    @FindBy(xpath = "//form/div/div/app-input-text[@placeholderlabel='Turno']//input") protected WebElement inputTurno;
    @FindBy(xpath = "(//table//tbody/tr/td/button[@icon='pi pi-eye'])[1]") protected WebElement btnVerDetalleTurno;
    @FindBy(xpath = "//form/div/div/app-input-select-2[@formcontrolname='tipo_operacion']//p-dropdown[@inputid]//div[@role='button']") protected WebElement cmbTipoOperacion;
    @FindBy(xpath = "//button[contains(.,'Extornar')]") WebElement btnExtornar;
    @FindBy(xpath = "//div/app-input-text[@label='Motivo']//input") WebElement inputMotivoExtorno;
    @FindBy(xpath = "//div/div/div/app-input-text-2/span/input") protected WebElement inputTicketRehabilitacion;
    @FindBy(xpath = "(//app-input-text//input)[1]") protected WebElement inputTicketExtension;
    @FindBy(xpath = "(//app-input-text//input)[2]") protected WebElement inputDiasExtension;
    @FindBy(xpath = "//div/div/div/app-input-text-2[@placeholderlabel='Del Nro:']/span/input") protected WebElement inputTicketDesdeRehabilitacion;
    @FindBy(xpath = "//div/div/div/app-input-text-2[@placeholderlabel='Al Nro:']/span/input") protected WebElement inputTicketHastaRehabilitacion;
    @FindBy(xpath = "//app-input-text[@label='Desde Número']//input") protected WebElement inputTicketDesdeExtension;
    @FindBy(xpath = "//app-input-text[@label='Hasta Número']//input") protected WebElement inputTicketHastaExtension;
    @FindBy(xpath = "//div/div/div/app-input-text-2[@placeholderlabel='Número Vuelo']/span/input") protected WebElement inputNumVueloRehabilitacion;
    @FindBy(xpath = "//div//div//p-radiobutton[@inputid='filters']") protected WebElement rdFiltroConsulta;
    @FindBy(xpath = "//form/div/div/app-input-select-2[@formcontrolname='fEstadoTurno']//p-dropdown//div[@role='button']") protected WebElement cmbEstadoTurnoAnulacion;
    @FindBy(xpath = "//form/div/div/app-input-select-2[@formcontrolname='fTipoTicket']//p-dropdown//div[@role='button']") protected WebElement cmbTipoTicketAnulacion;
    @FindBy(xpath = "//div/div/div/div/div/div/p-radiobutton[@inputid='rangoTicketRadioButton2']") protected WebElement rdRangoTicketsAnulacion;
    @FindBy(xpath = "//p-radiobutton[@inputid='tasaCambioRadioButton2']") protected WebElement rdRangoTicketsExtension;
    @FindBy(xpath = "//app-input-text-2[@formcontrolname='fDesdeNumero']/span/input") protected WebElement inputTicketDesdeAnulacion;
    @FindBy(xpath = "//app-input-text-2[@formcontrolname='fHastaNumero']/span/input") protected WebElement inputTicketHastaAnulacion;
    @FindBy(xpath = "//div/app-input-text-2[@label='Motivo de Anulación']//input") protected WebElement inputMotivoAnulacion;
    @FindBy(xpath = "//button[contains(.,'Anular')]") WebElement btnAnular;
    @FindBy(xpath = "//div/div/app-input-select-2[@optionlabel]/span/p-dropdown//div[@role='button']") WebElement cmbCompaniaAnulacionBcbp;
    @FindBy(xpath = "(//table//tbody/tr/td/p-checkbox)[1]") WebElement checkAnulacionBcbp;
    @FindBy(xpath = "//div/app-input-text-2[@label='Cantidad']//input") WebElement inputCantidadVentaMasiva;
    @FindBy(xpath = "//div/app-input-text-2[@label='Numero de Vuelo']//input") WebElement inputNumeroVueloVentaMasiva;
    @FindBy(xpath = "//div//p-dropdown[@inputid='doc']/div/div") WebElement cmbTipoDocumentoGestionMolinete;
    @FindBy(xpath = "//div//p-dropdown[@inputid='vuelo']/div/div") WebElement cmbTipoVueloGestionMolinete;
    @FindBy(xpath = "//div//p-dropdown[@inputid='acceso']/div/div") WebElement cmbTipoAccesoGestionMolinete;
    @FindBy(xpath = "//div//p-dropdown[@inputid='molinete']/div/div") WebElement cmbTipoMolineteGestionMolinete;
    @FindBy(xpath = "//div//p-dropdown[@inputid='estado']/div/div") WebElement cmbEstadoGestionMolinete;
    @FindBy(xpath = "//textarea[@id='float-input']") WebElement txtDescripcionGestionMolinete;
    @FindBy(xpath = "//form/div/div/app-input-select-2[@formcontrolname='formato']//p-dropdown//div[@role='button']") protected WebElement cmbFormatoArchivoVenta;
    @FindBy(xpath = "(//div/mat-checkbox//input[@type='checkbox'])[3]") protected WebElement checkArchivoVentaA;
    @FindBy(xpath = "(//div/mat-checkbox//input[@type='checkbox'])[4]") protected WebElement checkArchivoVentaB;
    @FindBy(xpath = "(//div/mat-checkbox//input[@type='checkbox'])[5]") protected WebElement checkArchivoVentaC;
    @FindBy(xpath = "//form//app-input-date[@formcontrolname='anioMes']//p-calendar//input") protected WebElement txtFechaArchivoSeae;
    @FindBy(xpath = "//p-dropdown[@inputid='selectInput']//div[@role='button']") protected WebElement cmbTipoDocumentoArchivoSeae;
    @FindBy(xpath = "//button[contains(.,'Cerrar turno')]") WebElement btnCerrarTurno;
    @FindBy(xpath = "//p-table//table/tbody/tr/td/input[@type='checkbox']") WebElement checkTicketExtension;
    public modoperacionPage() {
        PageFactory.initElements(slowDriver, this);
    }

    public void ingresarOpcionTasaCambio() {
        wait.until(ExpectedConditions.visibilityOf(optasaCambio));
        optasaCambio.click();
    }

    public void ingresarOpcionGestionPrecioTicket() {
        wait.until(ExpectedConditions.visibilityOf(opprecioTicket));
        opprecioTicket.click();
    }

    public void ingresarOpcionGestionTicketContingencia() {
        wait.until(ExpectedConditions.visibilityOf(opgestionTicketContingencia));
        opgestionTicketContingencia.click();
    }

    public void ingresarSubOpcionPreTicketContingencia() {
        wait.until(ExpectedConditions.visibilityOf(opsubpreticketContingencia));
        opsubpreticketContingencia.click();
    }

    public void ingresarSubOpcionTicketContingencia() {
        wait.until(ExpectedConditions.visibilityOf(opsubticketContingencia));
        opsubticketContingencia.click();
    }

    public void ingresarOpcionExtorno() {
        wait.until(ExpectedConditions.visibilityOf(opExtorno));
        opExtorno.click();
    }

    public void ingresarSubOpcionExtornoOperacion() {
        wait.until(ExpectedConditions.visibilityOf(opsubextornoOperacion));
        opsubextornoOperacion.click();
    }

    public void ingresarSubOpcionExtornoTicket() {
        wait.until(ExpectedConditions.visibilityOf(opsubextornoTicket));
        opsubextornoTicket.click();
    }

    public void ingresarSubOpcionExtornoRehabilitacion() {
        wait.until(ExpectedConditions.visibilityOf(opsubextornoRehabilitacion));
        opsubextornoRehabilitacion.click();
    }

    public void ingresarOpcionAnulacion() {
        wait.until(ExpectedConditions.visibilityOf(opAnulacion));
        opAnulacion.click();
    }

    public void ingresarSubOpcionAnulacionTicket() {
        wait.until(ExpectedConditions.visibilityOf(opsubanulacionTicket));
        opsubanulacionTicket.click();
    }

    public void ingresarSubOpcionAnulacionBcbp() {
        wait.until(ExpectedConditions.visibilityOf(opsubanulacionBcbp));
        opsubanulacionBcbp.click();
    }

    public void ingresarOpcionVentanMasivaCredito() {
        wait.until(ExpectedConditions.visibilityOf(opventaMasiva));
        opventaMasiva.click();
    }

    public void ingresarOpcionExtensionFechaVigencia() {
        wait.until(ExpectedConditions.visibilityOf(opextensionFecha));
        opextensionFecha.click();
    }

    public void ingresarOpcionGestionMolinete() {
        wait.until(ExpectedConditions.visibilityOf(opgestionMolinete));
        opgestionMolinete.click();
    }

    public void ingresarOpcionGeneracionArchivoVenta() {
        wait.until(ExpectedConditions.visibilityOf(opgeneracionArchivo));
        scrollVertical(opgeneracionArchivo);
        opgeneracionArchivo.click();
    }

    public void ingresarOpcionCerrarTurno() {
        wait.until(ExpectedConditions.visibilityOf(opcerrarTurno));
        opcerrarTurno.click();
    }

    public void ingresarOpcionGeneracionArchivoSeae() {
        wait.until(ExpectedConditions.visibilityOf(opgeneracionSeae));
        opgeneracionSeae.click();
    }

    public void clickTasaCambioActual() {
        wait.until(ExpectedConditions.visibilityOf(rdTCactual));
        rdTCactual.click();
    }

    public void clickTasaCambioProgramada() {
        wait.until(ExpectedConditions.visibilityOf(rdTCprogramada));
        rdTCprogramada.click();
    }

    public void clickTasaCambioHistorica() {
        wait.until(ExpectedConditions.visibilityOf(rdTChistorica));
        rdTChistorica.click();
    }

    public void seleccionarCompraA(String compraa) {
        wait.until(ExpectedConditions.visibilityOf(checkCompraA));
        if (compraa.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompraA));
            if (!checkCompraA.isSelected()) {
                checkCompraA.click();
            }
        } else if (compraa.toLowerCase().equals("no")) {
            if (checkCompraA.isSelected()) {
                checkCompraA.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompraA.isSelected());
        }
    }

    public void seleccionarVentaA(String ventaa) {
        wait.until(ExpectedConditions.visibilityOf(checkVentaA));
        if (ventaa.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkVentaA));
            if (!checkVentaA.isSelected()) {
                checkVentaA.click();
            }
        } else if (ventaa.toLowerCase().equals("no")) {
            if (checkVentaA.isSelected()) {
                checkVentaA.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkVentaA.isSelected());
        }
    }

    public void seleccionarCompraB(String comprab) {
        wait.until(ExpectedConditions.visibilityOf(checkCompraB));
        if (comprab.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompraB));
            if (!checkCompraB.isSelected()) {
                checkCompraB.click();
            }
        } else if (comprab.toLowerCase().equals("no")) {
            if (checkCompraB.isSelected()) {
                checkCompraB.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompraB.isSelected());
        }
    }

    public void seleccionarVentaB(String ventab) {
        wait.until(ExpectedConditions.visibilityOf(checkVentaB));
        if (ventab.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkVentaB));
            if (!checkVentaB.isSelected()) {
                checkVentaB.click();
            }
        } else if (ventab.toLowerCase().equals("no")) {
            if (checkVentaB.isSelected()) {
                checkVentaB.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkVentaB.isSelected());
        }
    }

    public void seleccionarCompraC(String comprac) {
        wait.until(ExpectedConditions.visibilityOf(checkCompraC));
        if (comprac.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompraC));
            if (!checkCompraC.isSelected()) {
                checkCompraC.click();
            }
        } else if (comprac.toLowerCase().equals("no")) {
            if (checkCompraC.isSelected()) {
                checkCompraC.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompraC.isSelected());
        }
    }

    public void seleccionarVentaC(String ventac) {
        wait.until(ExpectedConditions.visibilityOf(checkVentaC));
        if (ventac.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkVentaC));
            if (!checkVentaC.isSelected()) {
                checkVentaC.click();
            }
        } else if (ventac.toLowerCase().equals("no")) {
            if (checkVentaC.isSelected()) {
                checkVentaC.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkVentaC.isSelected());
        }
    }

    public void seleccionarCompraD(String comprad) {
        wait.until(ExpectedConditions.visibilityOf(checkCompraD));
        if (comprad.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompraD));
            if (!checkCompraD.isSelected()) {
                checkCompraD.click();
            }
        } else if (comprad.toLowerCase().equals("no")) {
            if (checkCompraD.isSelected()) {
                checkCompraD.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompraD.isSelected());
        }
    }

    public void seleccionarVentaD(String ventad) {
        wait.until(ExpectedConditions.visibilityOf(checkVentaD));
        if (ventad.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkVentaD));
            if (!checkVentaD.isSelected()) {
                checkVentaD.click();
            }
        } else if (ventad.toLowerCase().equals("no")) {
            if (checkVentaD.isSelected()) {
                checkVentaD.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkVentaD.isSelected());
        }
    }

    public void seleccionarCompraE(String comprae) {
        wait.until(ExpectedConditions.visibilityOf(checkCompraE));
        if (comprae.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompraE));
            if (!checkCompraE.isSelected()) {
                checkCompraE.click();
            }
        } else if (comprae.toLowerCase().equals("no")) {
            if (checkCompraE.isSelected()) {
                checkCompraE.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompraE.isSelected());
        }
    }

    public void seleccionarVentaE(String ventae) {
        wait.until(ExpectedConditions.visibilityOf(checkVentaE));
        if (ventae.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkVentaE));
            if (!checkVentaE.isSelected()) {
                checkVentaE.click();
            }
        } else if (ventae.toLowerCase().equals("no")) {
            if (checkVentaE.isSelected()) {
                checkVentaE.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkVentaE.isSelected());
        }
    }

    public void ingresarTasaCambioCompra(String tasascompra) {
        String[] tasasSegments = tasascompra.split("/");
        limpiarCampo(inputValorA);
        inputValorA.sendKeys(tasasSegments[0]);
        limpiarCampo(inputValorC);
        inputValorC.sendKeys(tasasSegments[1]);
        limpiarCampo(inputValorE);
        inputValorE.sendKeys(tasasSegments[2]);
        limpiarCampo(inputValorG);
        inputValorG.sendKeys(tasasSegments[3]);
        limpiarCampo(inputValorI);
        inputValorI.sendKeys(tasasSegments[4]);
    }

    public void ingresarTasaCambioVenta(String tasasventa) {
        String[] tasasSegments = tasasventa.split("/");
        limpiarCampo(inputValorB);
        inputValorB.sendKeys(tasasSegments[0]);
        limpiarCampo(inputValorD);
        inputValorD.sendKeys(tasasSegments[1]);
        limpiarCampo(inputValorF);
        inputValorF.sendKeys(tasasSegments[2]);
        limpiarCampo(inputValorH);
        inputValorH.sendKeys(tasasSegments[3]);
        limpiarCampo(inputValorJ);
        inputValorJ.sendKeys(tasasSegments[4]);
    }

    public void ingresarFechaProgramada(String fechaprogramada) {
        wait.until(ExpectedConditions.visibilityOf(inputFechaProgramada));
        limpiarCampo(inputFechaProgramada);
        inputFechaProgramada.sendKeys(fechaprogramada);
    }

    public void ingresarHoraPagramada(String horaprogramada) {
        inputHoraProgramada.sendKeys(horaprogramada);
    }

    public void clickBotonEliminarTCprogramadaA() {
        btnEliminarTCprogramadaA.click();
    }

    public void clickBotonEliminarTCprogramadaB() {
        btnEliminarTCprogramadaB.click();
    }

    public void clickBotonEliminarTCprogramadaC() {
        btnEliminarTCprogramadaC.click();
    }

    public void clickBotonEliminarTCprogramadaD() {
        btnEliminarTCprogramadaD.click();
    }

    public void clickBotonEliminarTCprogramadaE() {
        btnEliminarTCprogramadaE.click();
    }

    public void seleccionarFechaDesde(String fechadesde) {
        wait.until(ExpectedConditions.visibilityOf(txtFechaDesdeTC));
        limpiarCampo(txtFechaDesdeTC);
        txtFechaDesdeTC.sendKeys(fechadesde);
    }

    public void seleccionarFechaHasta(String fechahasta) {
        wait.until(ExpectedConditions.visibilityOf(txtFechaHastaTC));
        limpiarCampo(txtFechaHastaTC);
        txtFechaHastaTC.sendKeys(fechahasta);
    }

    public void seleccionarMonedaA(String monedaa) {
        wait.until(ExpectedConditions.visibilityOf(checkMonedaA));
        if (monedaa.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkMonedaA));
            if (!checkMonedaA.isSelected()) {
                checkMonedaA.click();
            }
        } else if (monedaa.toLowerCase().equals("no")) {
            if (checkMonedaA.isSelected()) {
                checkMonedaA.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkMonedaA.isSelected());
        }
    }

    public void seleccionarMonedaB(String monedab) {
        wait.until(ExpectedConditions.visibilityOf(checkMonedaB));
        if (monedab.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkMonedaB));
            if (!checkMonedaB.isSelected()) {
                checkMonedaB.click();
            }
        } else if (monedab.toLowerCase().equals("no")) {
            if (checkMonedaB.isSelected()) {
                checkMonedaB.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkMonedaB.isSelected());
        }
    }

    public void seleccionarMonedaC(String monedac) {
        wait.until(ExpectedConditions.visibilityOf(checkMonedaC));
        if (monedac.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkMonedaC));
            if (!checkMonedaC.isSelected()) {
                checkMonedaC.click();
            }
        } else if (monedac.toLowerCase().equals("no")) {
            if (checkMonedaC.isSelected()) {
                checkMonedaC.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkMonedaC.isSelected());
        }
    }

    public void seleccionarMonedaVentaA(String monedaventaa) {
        wait.until(ExpectedConditions.visibilityOf(checkMonedaVentaA));
        if (monedaventaa.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkMonedaVentaA));
            if (!checkMonedaVentaA.isSelected()) {
                checkMonedaVentaA.click();
            }
        } else if (monedaventaa.toLowerCase().equals("no")) {
            if (checkMonedaVentaA.isSelected()) {
                checkMonedaVentaA.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkMonedaVentaA.isSelected());
        }
    }

    public void seleccionarMonedaVentaB(String monedaventab) {
        wait.until(ExpectedConditions.visibilityOf(checkMonedaVentaB));
        if (monedaventab.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkMonedaVentaB));
            if (!checkMonedaVentaB.isSelected()) {
                checkMonedaVentaB.click();
            }
        } else if (monedaventab.toLowerCase().equals("no")) {
            if (checkMonedaVentaB.isSelected()) {
                checkMonedaVentaB.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkMonedaVentaB.isSelected());
        }
    }

    public void seleccionarMonedaVentaC(String monedaventac) {
        wait.until(ExpectedConditions.visibilityOf(checkMonedaVentaC));
        if (monedaventac.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkMonedaVentaC));
            if (!checkMonedaVentaC.isSelected()) {
                checkMonedaVentaC.click();
            }
        } else if (monedaventac.toLowerCase().equals("no")) {
            if (checkMonedaVentaC.isSelected()) {
                checkMonedaVentaC.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkMonedaVentaC.isSelected());
        }
    }

    public void ingresarPrecioVenta(String precio) {
        String[] precioSegments = precio.split("/");
        limpiarCampo(inputPrecioA);
        inputPrecioA.sendKeys(precioSegments[0]);
        limpiarCampo(inputPrecioB);
        inputPrecioB.sendKeys(precioSegments[1]);
        limpiarCampo(inputPrecioC);
        inputPrecioC.sendKeys(precioSegments[2]);
    }

    public void seleccionarCodigoMonedaA(String codigoa) {
        wait.until(ExpectedConditions.visibilityOf(cmbCodigoMonedaA));
        new Select(cmbCodigoMonedaA).selectByVisibleText(codigoa);
    }

    public void seleccionarCodigoMonedaB(String codigob) {
        wait.until(ExpectedConditions.visibilityOf(cmbCodigoMonedaB));
        new Select(cmbCodigoMonedaB).selectByVisibleText(codigob);
    }

    public void seleccionarCodigoMonedaC(String codigoc) {
        wait.until(ExpectedConditions.visibilityOf(cmbCodigoMonedaC));
        new Select(cmbCodigoMonedaC).selectByVisibleText(codigoc);
    }

    public void clickBotonEliminarPTprogramadaA() {
        btnEliminarPTProgramadaA.click();
    }

    public void abrirComboboxTipoVuelo() {
        wait.until(ExpectedConditions.visibilityOf(cmbTipoVuelo));
        cmbTipoVuelo.click();
    }

    public void abrirComboboxTipoTransbordo() {
        cmbTipoTransbordo.click();
    }

    public void abrirComboboxTipoPasajero() {
        cmbTipoPasajero.click();
    }

    public void abrirComboboxPrecioTicket() {
        cmbPrecioTicket.click();
    }

    public void seleccionarOpcion(String item) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[@role='listbox']")));
        WebElement opcionItem = driver.findElement(By.xpath("//p-dropdownitem/li/span[text()='" + item + "']"));
        opcionItem.click();
    }

    public void clickBotonGenerar() {
        btnGenerar.click();
    }

    public void ingresarCantidad(String cantidad) {
        limpiarCampo(inputCantidad);
        inputCantidad.sendKeys(cantidad);
    }

    public void validarTitulo(String titulo) {
        boolean tituloValido = false;
        wait.until(ExpectedConditions.visibilityOf(lblDatosTurno));
        try {
            if (lblDatosTurno.isDisplayed() && lblDatosTurno.getText().equals(titulo)) {
                tituloValido = true;
            }
        } catch (NoSuchElementException e) {
            //El titulo se agrega desde los Casos de Pruebas
        }
        if (!tituloValido) {
            try {
                if (lblFiltroConsulta.isDisplayed() && lblFiltroConsulta.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblDatosVenta.isDisplayed() && lblDatosVenta.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        Assert.assertTrue("El título " + titulo + " no coincide", tituloValido);
    }
    public void abrirComboboxFiltroUsuario() {
        wait.until(ExpectedConditions.visibilityOf(cmbFiltroUsuario));
        cmbFiltroUsuario.click();
    }
    public void ingresarTicketDesde(String ticketdesde){
        inputTicketDesde.sendKeys(ticketdesde);
    }
    public void ingresarTicketHasta(String tickethasta){
        inputTicketHasta.sendKeys(tickethasta);
    }
    public void seleccionarTicketContingenciaA(String ticketa) {
        wait.until(ExpectedConditions.visibilityOf(checkTicketContigenciaA));
        if (ticketa.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkTicketContigenciaA));
            if (!checkTicketContigenciaA.isSelected()) {
                checkTicketContigenciaA.click();
            }
        } else if (ticketa.toLowerCase().equals("no")) {
            if (checkTicketContigenciaA.isSelected()) {
                checkTicketContigenciaA.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkTicketContigenciaA.isSelected());
        }
    }
    public void seleccionarTicketContingenciaB(String ticketb) {
        wait.until(ExpectedConditions.visibilityOf(checkTicketContigenciaB));
        if (ticketb.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkTicketContigenciaB));
            if (!checkTicketContigenciaB.isSelected()) {
                checkTicketContigenciaB.click();
            }
        } else if (ticketb.toLowerCase().equals("no")) {
            if (checkTicketContigenciaB.isSelected()) {
                checkTicketContigenciaB.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkTicketContigenciaB.isSelected());
        }
    }
    public void seleccionarTicketContingenciaC(String ticketc) {
        wait.until(ExpectedConditions.visibilityOf(checkTicketContigenciaC));
        if (ticketc.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkTicketContigenciaC));
            if (!checkTicketContigenciaC.isSelected()) {
                checkTicketContigenciaC.click();
            }
        } else if (ticketc.toLowerCase().equals("no")) {
            if (checkTicketContigenciaC.isSelected()) {
                checkTicketContigenciaC.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkTicketContigenciaC.isSelected());
        }
    }
    public void seleccionarTicketContingenciaD(String ticketd) {
        wait.until(ExpectedConditions.visibilityOf(checkTicketContigenciaD));
        if (ticketd.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkTicketContigenciaD));
            if (!checkTicketContigenciaD.isSelected()) {
                checkTicketContigenciaD.click();
            }
        } else if (ticketd.toLowerCase().equals("no")) {
            if (checkTicketContigenciaD.isSelected()) {
                checkTicketContigenciaD.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkTicketContigenciaD.isSelected());
        }
    }
    public void seleccionarAnulacionBcbpA(String anulara) {
        wait.until(ExpectedConditions.visibilityOf(checkAnulacionBcbp));
        if (anulara.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkAnulacionBcbp));
            if (!checkAnulacionBcbp.isSelected()) {
                checkAnulacionBcbp.click();
            }
        } else if (anulara.toLowerCase().equals("no")) {
            if (checkAnulacionBcbp.isSelected()) {
                checkAnulacionBcbp.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkAnulacionBcbp.isSelected());
        }
    }
    public void seleccionarCierreTurno(String cierreturno) {
        wait.until(ExpectedConditions.visibilityOf(checkCierreTurno));
        if (cierreturno.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCierreTurno));
            if (!checkCierreTurno.isSelected()) {
                checkCierreTurno.click();
            }
        } else if (cierreturno.toLowerCase().equals("no")) {
            if (checkCierreTurno.isSelected()) {
                checkCierreTurno.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCierreTurno.isSelected());
        }
    }
    public void abrirComboboxEstadoTurno(){
        wait.until(ExpectedConditions.visibilityOf(cmbEstadoturno));
        cmbEstadoturno.click();
    }
    public void ingresarCodigoTurno(String turno){
        inputTurno.sendKeys(turno);
    }
    public void clickBotonVerDetalleTurno(){
        btnVerDetalleTurno.click();
    }
    public void abrirComboboxTipoOperacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoOperacion));
        cmbTipoOperacion.click();
    }
    public void clickBotonExtornar(){
        wait.until(ExpectedConditions.visibilityOf(btnExtornar));
        btnExtornar.click();
    }
    public void ingresarMotivoExtorno(String motivo){
        inputMotivoExtorno.sendKeys(motivo);
    }
    public void ingresarTicketRehabilitacion(String ticketrehabilitacion){
        wait.until(ExpectedConditions.visibilityOf(inputTicketRehabilitacion));
        inputTicketRehabilitacion.sendKeys(ticketrehabilitacion);
    }
    public void ingresarTicketDesdeRehabilitacion(String ticketdesde){
        inputTicketDesdeRehabilitacion.sendKeys(ticketdesde);
    }
    public void ingresarTicketHastaRehabilitacion(String tickethasta){
        inputTicketHastaRehabilitacion.sendKeys(tickethasta);
    }
    public void ingresarNumeroVueloRehabilitacion(String numerovuelo){
        inputNumVueloRehabilitacion.sendKeys(numerovuelo);
    }
    public void seleccionarFiltroConsulta(){
        rdFiltroConsulta.click();
    }
    public void abrirComboboxEstadoTurnoAnulacion(){
        cmbEstadoTurnoAnulacion.click();
    }
    public void abrirComboboxTipoTicketAnulacion(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoTicketAnulacion));
        cmbTipoTicketAnulacion.click();
    }
    public void seleccionarRangoTicketAnulacion(){
        rdRangoTicketsAnulacion.click();
    }
    public void ingresarTicketDesdeAnulacion(String ticketdesdeanulacion){
        inputTicketDesdeAnulacion.sendKeys(ticketdesdeanulacion);
    }
    public void ingresarTicketHastaAnulacion(String tickethastaanulacion){
        inputTicketHastaAnulacion.sendKeys(tickethastaanulacion);
    }
    public void ingresarMotivoAnulacion(String motivoanulacion){
        inputMotivoAnulacion.sendKeys(motivoanulacion);
    }
    public void clickBontonAnular(){
        btnAnular.click();
    }
    public void abrirComboboxAerolineaBcbp(){
        cmbCompaniaAnulacionBcbp.click();
    }
    public void ingresarCantidadVentaMasiva(String cantidad){
       inputCantidadVentaMasiva.sendKeys(cantidad);
    }
    public void ingresarNumeroVueloVentaMasiva(String numerovuelo){
        inputNumeroVueloVentaMasiva.sendKeys(numerovuelo);
    }
    public void abrirComboboxRepresentanteVentaMasiva(){
        cmbRepresentanteVentaMasiva.click();
    }
    public void abrirComboboxTipoDocumentoGestionMolinete(){
        cmbTipoDocumentoGestionMolinete.click();
    }
    public void abrirComboboxTipoVueloGestionMolinete(){
        cmbTipoVueloGestionMolinete.click();
    }
    public void abrirComboboxTipoAccesoGestionMolinete(){
        cmbTipoAccesoGestionMolinete.click();
    }
    public void abrirComboboxTipoMolineteGestionMolinete(){
        cmbTipoMolineteGestionMolinete.click();
    }
    public void abrirComboboxEstadoGestionMolinete(){
        cmbEstadoGestionMolinete.click();
    }
    public void ingresarDescripcionGestionMolinete(String descripcion){
       limpiarCampo(txtDescripcionGestionMolinete);
       txtDescripcionGestionMolinete.sendKeys(descripcion);
    }
    public void abrirComboboxFormatoArchivoVenta(){
        cmbFormatoArchivoVenta.click();
    }
    public void seleccionarArchivoA(String archivoa) {
        wait.until(ExpectedConditions.visibilityOf(checkArchivoVentaA));
        if (archivoa.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkArchivoVentaA));
            if (!checkArchivoVentaA.isSelected()) {
                checkArchivoVentaA.click();
            }
        } else if (archivoa.toLowerCase().equals("no")) {
            if (checkArchivoVentaA.isSelected()) {
                checkArchivoVentaA.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkArchivoVentaA.isSelected());
        }
    }
    public void seleccionarArchivoB(String archivob) {
        wait.until(ExpectedConditions.visibilityOf(checkArchivoVentaB));
        if (archivob.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkArchivoVentaB));
            if (!checkArchivoVentaB.isSelected()) {
                checkArchivoVentaB.click();
            }
        } else if (archivob.toLowerCase().equals("no")) {
            if (checkArchivoVentaB.isSelected()) {
                checkArchivoVentaB.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkArchivoVentaB.isSelected());
        }
    }
    public void seleccionarArchivoC(String archivoc) {
        wait.until(ExpectedConditions.visibilityOf(checkArchivoVentaC));
        if (archivoc.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkArchivoVentaC));
            if (!checkArchivoVentaC.isSelected()) {
                checkArchivoVentaC.click();
            }
        } else if (archivoc.toLowerCase().equals("no")) {
            if (checkArchivoVentaC.isSelected()) {
                checkArchivoVentaC.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkArchivoVentaC.isSelected());
        }
    }
    public void ingresarFechaArchivoSeae(String fecha){
        wait.until(ExpectedConditions.visibilityOf(txtFechaArchivoSeae));
        limpiarCampo(txtFechaArchivoSeae);
       txtFechaArchivoSeae.sendKeys(fecha);
    }
    public void abrirComboboxTipoDocumentoArchivoSeae(){
        wait.until(ExpectedConditions.visibilityOf(cmbTipoDocumentoArchivoSeae));
        limpiarCampo(cmbTipoDocumentoArchivoSeae);
        cmbTipoDocumentoArchivoSeae.click();
    }
    public void clickBotonCerrarTurno(){
        btnCerrarTurno.click();
    }
    public void ingresarTicketExtension(String ticketextension){
        wait.until(ExpectedConditions.visibilityOf(inputTicketExtension));
        inputTicketExtension.sendKeys(ticketextension);
    }
    public void ingresarDiasExtension(String dias){
        wait.until(ExpectedConditions.visibilityOf(inputDiasExtension));
        inputDiasExtension.sendKeys(dias);
    }
    public void seleccionarTicketExtension(String ticket) {
        wait.until(ExpectedConditions.visibilityOf(checkTicketExtension));
        if (ticket.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkTicketExtension));
            if (!checkTicketExtension.isSelected()) {
                checkTicketExtension.click();
            }
        } else if (ticket.toLowerCase().equals("no")) {
            if (checkTicketExtension.isSelected()) {
                checkTicketExtension.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkTicketExtension.isSelected());
        }
    }
    public void seleccionarRangoTicketExtension(){
        rdRangoTicketsExtension.click();
    }
    public void ingresarTicketDesdeExtension(String ticketdesde){
        inputTicketDesdeExtension.sendKeys(ticketdesde);
    }
    public void ingresarTicketHastaExtension(String tickethasta){
        inputTicketHastaExtension.sendKeys(tickethasta);
    }
}