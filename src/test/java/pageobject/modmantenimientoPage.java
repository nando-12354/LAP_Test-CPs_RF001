package pageobject;

import io.cucumber.java.ro.Si;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;


public class modmantenimientoPage extends util {
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/mantenimiento/estacion-punto-venta']") protected WebElement opEstacionPuntoVenta;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/mantenimiento/moneda']") protected WebElement opMoneda;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/mantenimiento/compania']") protected WebElement opCompania;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/mantenimiento/modalidad-venta']") protected WebElement opModalidadVenta;
    @FindBy(xpath = "//div/ul/li/a[@href='#/principal/mantenimiento/tipo-tickets']") protected WebElement opTipoTickets;
    @FindBy(xpath = "(//input[@type='number'])[1]") protected WebElement inputIpA;
    @FindBy(xpath = "(//input[@type='number'])[2]") protected WebElement inputIpB;
    @FindBy(xpath = "(//input[@type='number'])[3]") protected WebElement inputIpC;
    @FindBy(xpath = "(//input[@type='number'])[4]") protected WebElement inputIpD;
    @FindBy(xpath = "//input[@inputid='ruc']") protected WebElement inputRuc;
    @FindBy(xpath = "//input[contains(@inputid,'codigo')]") protected WebElement inputCodigoAerolinea;
    @FindBy(xpath = "//input[@inputid='iata']") protected WebElement inputCodigoIata;
    @FindBy(xpath = "//input[@inputid='sap']") protected WebElement inputCodigoSap;
    @FindBy(xpath = "//input[@inputid='oaci']") protected WebElement inputCodigoOaci;
    @FindBy(xpath = "//input[@inputid='interno']") protected WebElement inputCodigoInterno;
    @FindBy(xpath = "//div/app-button-primary[@icon='pi pi-plus']/p-button/button") protected WebElement btnAgregarRepresentante;
    @FindBy(xpath = "//input[@inputid='nombres']") protected WebElement inputNombreRepresentante;
    @FindBy(xpath = "//input[@inputid='apellidos']") protected WebElement inputApellidoRepresentante;
    @FindBy(xpath = "//input[@inputid='numero']") protected WebElement inputDocumentoRepresentante;
    @FindBy(xpath = "//input[@inputid='cargo']") protected WebElement inputCargoRepresentante;
    @FindBy(xpath = "(//div/p-checkbox/div)[1]") protected WebElement checkPermisoMasivaContado;
    @FindBy(xpath = "(//div/p-checkbox/div)[2]") protected WebElement checkPermisoMasivaCredito;
    @FindBy(xpath = "(//div/p-checkbox/div)[3]") protected WebElement checkPermisoRehabilitacion;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[1]") protected WebElement checkActivarRehabilitacion;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[3]") protected WebElement checkMaximoTicketsEmitidos;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[4]") protected WebElement checkMaximoTicketVenta;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[5]") protected WebElement checkMinimoTicketVenta;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[6]") protected WebElement checkSerieNumeroFin;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[7]") protected WebElement checkSerieNumeroInicio;
    @FindBy(xpath = "(//div/app-button-primary[@icon='pi pi-plus']/p-button/button)[1]") protected WebElement btnAgregarAtributos;
    @FindBy(xpath = "//input[@id='input']") protected WebElement inputNombreTipoTicket;
    public modmantenimientoPage() {
        PageFactory.initElements(driver, this);
    }
    public void ingresarOpcionEstacionPuntoVenta(){
        wait.until(ExpectedConditions.visibilityOf(opEstacionPuntoVenta));
        opEstacionPuntoVenta.click();
    }
    public void ingresarOpcionMoneda(){
        wait.until(ExpectedConditions.visibilityOf(opMoneda));
        opMoneda.click();
    }
    public void ingresarOpcionCompania(){
        wait.until(ExpectedConditions.visibilityOf(opCompania));
        opCompania.click();
    }
    public void ingresarOpcionModalidadVenta(){
        wait.until(ExpectedConditions.visibilityOf(opModalidadVenta));
        opModalidadVenta.click();
    }
    public void ingresarOpcionTipoTickets(){
        wait.until(ExpectedConditions.visibilityOf(opTipoTickets));
        opTipoTickets.click();
    }
    public void ingresarIp(String ip) {
        String[] ipSegments = ip.split("\\.");
        limpiarCampo(inputIpA);
        inputIpA.sendKeys(ipSegments[0]);
        limpiarCampo(inputIpB);
        inputIpB.sendKeys(ipSegments[1]);
        limpiarCampo(inputIpC);
        inputIpC.sendKeys(ipSegments[2]);
        limpiarCampo(inputIpD);
        inputIpD.sendKeys(ipSegments[3]);
    }
    public void ingresarRucCompania(String ruc){
        inputRuc.sendKeys(ruc);
    }
    public void ingresarCodigoAerolinea(String aerolinea){
        inputCodigoAerolinea.sendKeys(aerolinea);
    }
    public void ingresarCodigoIata(String iata){
        inputCodigoIata.sendKeys(iata);
    }
    public void ingresarCodigoSap(String sap){
        inputCodigoSap.sendKeys(sap);
    }
    public void ingresarCodigoOaci(String oaci){
        inputCodigoOaci.sendKeys(oaci);
    }
    public void ingresarCodigoInterno(String interno){
        inputCodigoInterno.sendKeys(interno);
    }
    public void clickBotonAgregarRepresentante(){
        btnAgregarRepresentante.click();
    }
    public void ingresarNombreRepresentante(String nombre){
        inputNombreRepresentante.sendKeys(nombre);
    }
    public void ingresarApellidoRepresentante(String apellido){
        inputApellidoRepresentante.sendKeys(apellido);
    }
    public void ingresarDocumentoRepresentante(String documento){
        inputDocumentoRepresentante.sendKeys(documento);
    }
    public void ingresarCargoRepresentante(String cargo){
        inputCargoRepresentante.sendKeys(cargo);
    }
    public void seleccionarPermisoRepresenante(String permiso){
        if (permiso.toLowerCase().equals("si")) {
            if (!checkPermisoMasivaContado.isSelected()) {
                checkPermisoMasivaContado.click();
            }
            if (!checkPermisoMasivaCredito.isSelected()) {
                checkPermisoMasivaCredito.click();
            }
            if (!checkPermisoRehabilitacion.isSelected()) {
                checkPermisoRehabilitacion.click();
            }
        } else if (permiso.toLowerCase().equals("no")) {
            if (checkPermisoMasivaContado.isSelected()) {
                checkPermisoMasivaContado.click();
            }
            if (checkPermisoMasivaCredito.isSelected()) {
                checkPermisoMasivaCredito.click();
            }
            if (checkPermisoRehabilitacion.isSelected()) {
                checkPermisoRehabilitacion.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPermisoMasivaContado.isSelected());
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPermisoMasivaCredito.isSelected());
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPermisoRehabilitacion.isSelected());
        }
    }
    public void seleccionarActivarRehabilitacion(String activar){
        wait.until(ExpectedConditions.visibilityOf(checkActivarRehabilitacion));
        if (activar.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkActivarRehabilitacion));
            if (!checkActivarRehabilitacion.isSelected()) {
                checkActivarRehabilitacion.click();
            }
        } else if (activar.toLowerCase().equals("no")) {
            if (checkActivarRehabilitacion.isSelected()) {
                checkActivarRehabilitacion.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkActivarRehabilitacion.isSelected());
        }
    }
    public void seleccionarMaximoTicketEmitidos(String emitido){
        wait.until(ExpectedConditions.visibilityOf(checkMaximoTicketsEmitidos));
        if (emitido.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkMaximoTicketsEmitidos));
            if (!checkMaximoTicketsEmitidos.isSelected()) {
                checkMaximoTicketsEmitidos.click();
            }
        } else if (emitido.toLowerCase().equals("no")) {
            if (checkMaximoTicketsEmitidos.isSelected()) {
                checkMaximoTicketsEmitidos.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkMaximoTicketsEmitidos.isSelected());
        }
    }
    public void seleccionarMaximoTicketVenta(String maximo){
        wait.until(ExpectedConditions.visibilityOf(checkMaximoTicketVenta));
        if (maximo.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkMaximoTicketVenta));
            if (!checkMaximoTicketVenta.isSelected()) {
                checkMaximoTicketVenta.click();
            }
        } else if (maximo.toLowerCase().equals("no")) {
            if (checkMaximoTicketVenta.isSelected()) {
                checkMaximoTicketVenta.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkMaximoTicketVenta.isSelected());
        }
    }
    public void seleccionarMinimoTicketVenta(String minimo){
        wait.until(ExpectedConditions.visibilityOf(checkMinimoTicketVenta));
        if (minimo.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkMinimoTicketVenta));
            if (!checkMinimoTicketVenta.isSelected()) {
                checkMinimoTicketVenta.click();
            }
        } else if (minimo.toLowerCase().equals("no")) {
            if (checkMinimoTicketVenta.isSelected()) {
                checkMinimoTicketVenta.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkMinimoTicketVenta.isSelected());
        }
    }
    public void seleccionarSerieNumeroFin(String fin){
        wait.until(ExpectedConditions.visibilityOf(checkSerieNumeroFin));
        if (fin.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkSerieNumeroFin));
            if (!checkSerieNumeroFin.isSelected()) {
                checkSerieNumeroFin.click();
            }
        } else if (fin.toLowerCase().equals("no")) {
            if (checkSerieNumeroFin.isSelected()) {
                checkSerieNumeroFin.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkSerieNumeroFin.isSelected());
        }
    }
    public void seleccionarSerieNumeroInicio(String inicio){
        wait.until(ExpectedConditions.visibilityOf(checkSerieNumeroInicio));
        if (inicio.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkSerieNumeroInicio));
            if (!checkSerieNumeroInicio.isSelected()) {
                checkSerieNumeroInicio.click();
            }
        } else if (inicio.toLowerCase().equals("no")) {
            if (checkSerieNumeroInicio.isSelected()) {
                checkSerieNumeroInicio.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkSerieNumeroInicio.isSelected());
        }
    }
    public void clickBotonAgregarAtributos(){
        btnAgregarAtributos.click();
    }
    public void ingresarNombreTipoTicket(String tipoticket){
        wait.until(ExpectedConditions.visibilityOf(inputNombreTipoTicket));
        limpiarCampo(inputNombreTipoTicket);
        inputNombreTipoTicket.sendKeys(tipoticket);
    }
}
