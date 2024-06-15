package pageobject;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.util;

public class titulosPage extends util {
    @FindBy(xpath = "//h1[text()='Roles']") protected WebElement lblTituloRoles;
    @FindBy(xpath = "//h1[text()='Usuarios']") protected WebElement lblTituloUsuarios;
    @FindBy(xpath = "//h1[text()='Parámetros Generales']") protected WebElement lblTituloParametros;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION ATRIBUTOS GENERALES']") protected WebElement lblTituloConfAtributos;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION CAJA TUUA']") protected WebElement lblTituloConfCajaTuua;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION COMPROBANTE SEAE']") protected WebElement lblTituloConfComprobante;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION DE ALARMAS']") protected WebElement lblTituloConfAlarmas;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION DEL ARCHIVAMIENTO']") protected WebElement lblTituloConfArchivamiento;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION IMPRESIÓN']") protected WebElement lblTituloConfImpresion;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION MODULO WEB ADMINISTRATIVO']") protected WebElement lblTituloConfAdministrar;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION REHABILITACIÓN']") protected WebElement lblTituloConfRehabilitacion;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION SEGURIDAD']") protected WebElement lblTituloConfSeguridad;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION TUUA']") protected WebElement lblTituloConfTuua;
    @FindBy(xpath = "//h2/span[text()='ESTADISTICO']") protected WebElement lblTituloConfEstadistico;
    @FindBy(xpath = "//h2/span[text()='SERVICIO COMPAÑÍA']") protected WebElement lblTituloConfCompania;
    @FindBy(xpath = "//h2/span[text()='SERVICIO TASA CAMBIO']") protected WebElement lblTituloConfTasaCambio;
    @FindBy(xpath = "//h2/span[text()='SERVICIO VENCIMIENTO']") protected WebElement lblTituloConfVencimiento;
    @FindBy(xpath = "//h2/span[text()='SERVICIO VUELO PROGRAMADO']") protected WebElement lblTituloConfVueloProgramado;
    @FindBy(xpath = "//h2/span[text()='SERVICIO VUELO TEMPORADA']") protected WebElement lblTituloConfConfVueloTemporada;
    @FindBy(xpath = "//h2/span[text()='SERVICIOS GENERALES']") protected WebElement lblTituloConfGenerales;
    @FindBy(xpath = "//h2/span[text()='CONFIGURACION ARCHIVO VENTAS']") protected WebElement lblTituloConfArchivoVentas;
    @FindBy(xpath = "//h1[text()='Lista de campos']") protected WebElement lblTituloListaCampos;
    @FindBy(xpath = "//h1[text()='Estación de punto de venta']") protected WebElement lblTituloEstacionVenta;
    @FindBy(xpath = "//h1[text()='Moneda']") protected WebElement lblTituloMoneda;
    @FindBy(xpath = "//h1[text()='Compañías']") protected WebElement lblTituloCompania;
    @FindBy(xpath = "//h1[text()='Modalidades de Venta']") protected WebElement lblTituloModalidadVenta;
    @FindBy(xpath = "//h1[text()='Lista de Tipos de Ticket']") protected WebElement lblTituloTipoTicket;
    @FindBy(xpath = "//h1[text()='Ingresar tasa de cambio']") protected WebElement lblTituloTasaCambio;
    @FindBy(xpath = "//h1[text()='Gestión precio tickets']") protected WebElement lblTituloPrecioTicket;
    @FindBy(xpath = "//h1[text()='Pre-Emisión de Tickets Contingencia']") protected WebElement lblTituloPreemisionTicket;
    @FindBy(xpath = "//h1[text()='Registro tickets contingencia']") protected WebElement lblTituloTicketContingencia;
    @FindBy(xpath = "//h1[text()='Extorno operación']") protected WebElement lblTituloExtornoOperacion;
    @FindBy(xpath = "//h1[text()='Extorno tickets']") protected WebElement lblTituloExtornoTicket;
    @FindBy(xpath = "//h1[text()='Extorno de Rehabilitación']") protected WebElement lblTituloExtornoRehabilitacion;
    @FindBy(xpath = "//h1[text()='Anulación Ticket']") protected WebElement lblTituloAnulacionTicket;
    @FindBy(xpath = "//h1[text()='Anulación BCBP']") protected WebElement lblTituloAnulacionBcbp;
    @FindBy(xpath = "//h1[text()='Venta Masiva Crédito']") protected WebElement lblTituloVentaMasiva;
    @FindBy(xpath = "//h1[text()='Extensión fecha vigencia tickets']") protected WebElement lblTituloExtensionFecha;
    @FindBy(xpath = "//h1[text()='Gestión de molinete']") protected WebElement lblTituloGestionMolinete;
    @FindBy(xpath = "//h1[text()='Generación archivo venta']") protected WebElement lblTituloArchivoVenta;
    @FindBy(xpath = "//h1[text()='Cerrar Turno']") protected WebElement lblTituloCerrarTurno;
    @FindBy(xpath = "//h1[text()='Generacion Comprobante SEAE']") protected WebElement lblTituloArchivoSeae;
    @FindBy(xpath = "//h1[text()='Ticket normal']") protected WebElement lblTituloTicketNormal;
    @FindBy(xpath = "//h1[text()='Tickets masivo']") protected WebElement lblTituloTicketMasivo;
    @FindBy(xpath = "//h1[text()='Tickets por salida']") protected WebElement lblTituloTicketSalida;
    @FindBy(xpath = "//h1[text()='Tickets por vuelo']") protected WebElement lblTituloTicketVuelo;
    @FindBy(xpath = "//h1[text()='Tickets por Rango']") protected WebElement lblTituloTicketRango;
    @FindBy(xpath = "//h1[text()='Tickets por Fecha']") protected WebElement lblTituloTicketFecha;
    @FindBy(xpath = "//h1[text()='Boarding Pass Normal']") protected WebElement lblTituloBpNormal;
    @FindBy(xpath = "//h1[text()='Boarding pass masivo']") protected WebElement lblTituloBpMasivo;
    @FindBy(xpath = "//h1[text()='Boarding Pass por Salida']") protected WebElement lblTituloBpSalida;
    @FindBy(xpath = "//h1[text()='Boarding Pass por Vuelo']") protected WebElement lblTituloBpVuelo;
    @FindBy(xpath = "//h1[text()='Boarding pass por fecha']") protected WebElement lblTituloBpFecha;
    @FindBy(xpath = "//h1[text()='Usuario']") protected WebElement lblTituloUsuario;
    @FindBy(xpath = "//h1[text()='Compañias']") protected WebElement lblTituloCompanias;
    @FindBy(xpath = "//h1[text()='Turnos']") protected WebElement lblTituloTurnos;
    @FindBy(xpath = "//h1[text()='Cuadre de tickets emitidos']") protected WebElement lblTituloCuadre;
    @FindBy(xpath = "//h1[text()='Operación compra / Venta']") protected WebElement lblTituloOpeCompraVenta;
    @FindBy(xpath = "//h1[text()='Ticket / BP Usado']") protected WebElement lblTituloTicketBpUsados;
    @FindBy(xpath = "//h1[text()='Tickets anulados']") protected WebElement lblTituloTicketAnulados;
    @FindBy(xpath = "//h1[text()='Auditoría']") protected WebElement lblTituloAuditoria;
    @FindBy(xpath = "//h1[text()='Tickets Procesados']") protected WebElement lblTituloTicketProcesados;
    @FindBy(xpath = "//h1[text()='Log de errores molinete']") protected WebElement lblTituloLogErrores;
    @FindBy(xpath = "//h1[text()='Sincronización']") protected WebElement lblTituloSincronizacion;
    @FindBy(xpath = "//h1[text()='Transacción crítica']") protected WebElement lblTituloTransCritica;
    @FindBy(xpath = "//h1[text()='Depuración']") protected WebElement lblTituloDepuracion;
    @FindBy(xpath = "//h1[text()='Búsqueda de pasajeros para la fiscalía']") protected WebElement lblTituloPasajeroFiscalia;

    public titulosPage() {
        PageFactory.initElements(driver, this);
    }
    public void validarTitulo(String titulo){
        boolean tituloValido = false;
        try {
            if (lblTituloRoles.isDisplayed() && lblTituloRoles.getText().equals(titulo)){
                tituloValido = true;
            }
        } catch (NoSuchElementException e){
            //El titulo se agrega desde los Casos de Pruebas
        }
        if (!tituloValido) {
            try {
                if (lblTituloUsuarios.isDisplayed() && lblTituloUsuarios.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloParametros.isDisplayed() && lblTituloParametros.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfAtributos.isDisplayed() && lblTituloConfAtributos.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfCajaTuua.isDisplayed() && lblTituloConfCajaTuua.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfComprobante.isDisplayed() && lblTituloConfComprobante.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfAlarmas.isDisplayed() && lblTituloConfAlarmas.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfArchivamiento.isDisplayed() && lblTituloConfArchivamiento.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfImpresion.isDisplayed() && lblTituloConfImpresion.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfAdministrar.isDisplayed() && lblTituloConfAdministrar.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfRehabilitacion.isDisplayed() && lblTituloConfRehabilitacion.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfSeguridad.isDisplayed() && lblTituloConfSeguridad.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfTuua.isDisplayed() && lblTituloConfTuua.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfEstadistico.isDisplayed() && lblTituloConfEstadistico.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfCompania.isDisplayed() && lblTituloConfCompania.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfTasaCambio.isDisplayed() && lblTituloConfTasaCambio.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfVencimiento.isDisplayed() && lblTituloConfVencimiento.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfVueloProgramado.isDisplayed() && lblTituloConfVueloProgramado.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfConfVueloTemporada.isDisplayed() && lblTituloConfConfVueloTemporada.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfGenerales.isDisplayed() && lblTituloConfGenerales.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloConfArchivoVentas.isDisplayed() && lblTituloConfArchivoVentas.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloListaCampos.isDisplayed() && lblTituloListaCampos.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloEstacionVenta.isDisplayed() && lblTituloEstacionVenta.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloMoneda.isDisplayed() && lblTituloMoneda.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloCompania.isDisplayed() && lblTituloCompania.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloModalidadVenta.isDisplayed() && lblTituloModalidadVenta.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTipoTicket.isDisplayed() && lblTituloTipoTicket.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTasaCambio.isDisplayed() && lblTituloTasaCambio.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloPrecioTicket.isDisplayed() && lblTituloPrecioTicket.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloPreemisionTicket.isDisplayed() && lblTituloPreemisionTicket.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTicketContingencia.isDisplayed() && lblTituloTicketContingencia.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloExtornoOperacion.isDisplayed() && lblTituloExtornoOperacion.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloExtornoTicket.isDisplayed() && lblTituloExtornoTicket.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloExtornoRehabilitacion.isDisplayed() && lblTituloExtornoRehabilitacion.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloAnulacionTicket.isDisplayed() && lblTituloAnulacionTicket.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloAnulacionBcbp.isDisplayed() && lblTituloAnulacionBcbp.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloVentaMasiva.isDisplayed() && lblTituloVentaMasiva.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloExtensionFecha.isDisplayed() && lblTituloExtensionFecha.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloGestionMolinete.isDisplayed() && lblTituloGestionMolinete.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloArchivoVenta.isDisplayed() && lblTituloArchivoVenta.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloCerrarTurno.isDisplayed() && lblTituloCerrarTurno.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloArchivoSeae.isDisplayed() && lblTituloArchivoSeae.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTicketNormal.isDisplayed() && lblTituloTicketNormal.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTicketMasivo.isDisplayed() && lblTituloTicketMasivo.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido){
            try {
                if (lblTituloTicketSalida.isDisplayed() && lblTituloTicketSalida.getText().equals(titulo)){
                    tituloValido = true;
                }
            } catch (NoSuchElementException e){
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido){
            try {
                if (lblTituloTicketVuelo.isDisplayed() && lblTituloTicketVuelo.getText().equals(titulo)){
                    tituloValido = true;
                }
            } catch (NoSuchElementException e){
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido){
            try {
                if (lblTituloTicketRango.isDisplayed() && lblTituloTicketRango.getText().equals(titulo)){
                    tituloValido = true;
                }
            } catch (NoSuchElementException e){
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTicketFecha.isDisplayed() && lblTituloTicketFecha.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloBpNormal.isDisplayed() && lblTituloBpNormal.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloBpMasivo.isDisplayed() && lblTituloBpMasivo.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloBpSalida.isDisplayed() && lblTituloBpSalida.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloBpVuelo.isDisplayed() && lblTituloBpVuelo.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloBpFecha.isDisplayed() && lblTituloBpFecha.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloUsuario.isDisplayed() && lblTituloUsuario.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloCompanias.isDisplayed() && lblTituloCompanias.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTurnos.isDisplayed() && lblTituloTurnos.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloCuadre.isDisplayed() && lblTituloCuadre.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloOpeCompraVenta.isDisplayed() && lblTituloOpeCompraVenta.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTicketBpUsados.isDisplayed() && lblTituloTicketBpUsados.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTicketAnulados.isDisplayed() && lblTituloTicketAnulados.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloAuditoria.isDisplayed() && lblTituloAuditoria.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTicketProcesados.isDisplayed() && lblTituloTicketProcesados.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloLogErrores.isDisplayed() && lblTituloLogErrores.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloSincronizacion.isDisplayed() && lblTituloSincronizacion.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloTransCritica.isDisplayed() && lblTituloTransCritica.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloDepuracion.isDisplayed() && lblTituloDepuracion.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        if (!tituloValido) {
            try {
                if (lblTituloPasajeroFiscalia.isDisplayed() && lblTituloPasajeroFiscalia.getText().equals(titulo)) {
                    tituloValido = true;
                }
            } catch (NoSuchElementException e) {
                //El titulo se agrega desde los Casos de Pruebas
            }
        }
        Assert.assertTrue("El título " + titulo + " no coincide", tituloValido);
    }
}
