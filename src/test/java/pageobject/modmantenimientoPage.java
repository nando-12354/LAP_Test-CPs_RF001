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
    @FindBy(xpath = "//input[@inputid='nombre']") protected WebElement inputNombreCompania;
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
    @FindBy(xpath = "(//table//tbody/tr//p-checkbox)[1]") protected WebElement checkModalidadVentaNormal;
    @FindBy(xpath = "(//table//tbody/tr//p-checkbox)[2]") protected WebElement checkModalidaBCBP;
    @FindBy(xpath = "(//table//tbody/tr//p-checkbox)[3]") protected WebElement checkModalidadVentaMasivaContado;
    @FindBy(xpath = "(//table//tbody/tr//p-checkbox)[4]") protected WebElement checkModalidadVentaMasivaCredito;
    @FindBy(xpath = "(//div/app-editar-atributo//table//tbody/tr//p-checkbox)[1]") protected WebElement checkCompActivarRehabilitacion;
    @FindBy(xpath = "(//div/app-editar-atributo//table//tbody/tr//p-checkbox)[2]") protected WebElement checkCompNumemroMaximoTicketVenta;
    @FindBy(xpath = "(//div/app-editar-atributo//table//tbody/tr//p-checkbox)[3]") protected WebElement checkCompNumemroMinimoTicketVenta;
    @FindBy(xpath = "(//div/app-editar-atributo//table//tbody/tr//p-checkbox)[4]") protected WebElement checkCompSerieNumeroTicketFin;
    @FindBy(xpath = "(//div/app-editar-atributo//table//tbody/tr//p-checkbox)[5]") protected WebElement checkCompSerieNumeroTicketInicio;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[1]") protected WebElement checkActivarRehabilitacion;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[3]") protected WebElement checkMaximoTicketsEmitidos;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[4]") protected WebElement checkMaximoTicketVenta;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[5]") protected WebElement checkMinimoTicketVenta;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[6]") protected WebElement checkSerieNumeroFin;
    @FindBy(xpath = "(//div/app-listado-atributos//table//tbody/tr//p-checkbox)[7]") protected WebElement checkSerieNumeroInicio;
    @FindBy(xpath = "(//div/app-button-primary[@icon='pi pi-plus']/p-button/button)[1]") protected WebElement btnAgregarAtributos;
    @FindBy(xpath = "//input[@id='input']") protected WebElement inputNombreTipoTicket;
    @FindBy(xpath = "(//div/app-button-primary[@icon='pi pi-plus']/p-button/button)[1]") protected WebElement btnAgregarModalidadVenta;
    @FindBy(xpath = "(//div/app-button-primary[@icon='pi pi-plus']/p-button/button)[2]") protected WebElement btnAgregarModalidadTipoTicket;
    @FindBy(xpath = "(//div/app-button-primary/p-button/button)[5]") protected WebElement btnAgregarAtributoTipoTicket;
    @FindBy(xpath = "//textarea[@inputid='textarea']") protected WebElement inputDescripcion;
    @FindBy(xpath = "(//div/app-editar-atributo//table//tbody/tr//p-checkbox)[2]") protected WebElement checkCompActivarSerieNumFin;
    @FindBy(xpath = "(//div/app-editar-atributo//table//tbody/tr//p-checkbox)[3]") protected WebElement checkCompActivarSerieNumInicio;
    @FindBy(xpath = "(//div/app-listado-atributos-tipoticket//table//tbody/tr//p-checkbox)[1]") protected WebElement checkActivarA;
    @FindBy(xpath = "(//div/app-listado-atributos-tipoticket//table//tbody/tr//p-checkbox)[3]") protected WebElement checkActivarB;
    @FindBy(xpath = "(//div/app-listado-atributos-tipoticket//table//tbody/tr//p-checkbox)[4]") protected WebElement checkActivarC;
    @FindBy(xpath = "(//div/app-listado-atributos-tipoticket//table//tbody/tr//p-checkbox)[5]") protected WebElement checkActivarD;


    public modmantenimientoPage() {
        PageFactory.initElements(slowDriver, this);
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
    public void modificarNombreCompania(String modificarnombre){
        wait.until(ExpectedConditions.visibilityOf(inputNombreCompania));
        limpiarCampo(inputNombreCompania);
        inputNombreCompania.sendKeys(modificarnombre);
    }
    public void ingresarRucCompania(String ruc){
        inputRuc.sendKeys(ruc);
    }
    public void modificarRucCompania(String modificarruc){
        limpiarCampo(inputRuc);
        inputRuc.sendKeys(modificarruc);
    }
    public void ingresarCodigoAerolinea(String aerolinea){
        inputCodigoAerolinea.sendKeys(aerolinea);
    }
    public void modificarCodigoAerolinea(String modificaraerolinea){
        limpiarCampo(inputCodigoAerolinea);
        inputCodigoAerolinea.sendKeys(modificaraerolinea);
    }
    public void ingresarCodigoIata(String iata){
        inputCodigoIata.sendKeys(iata);
    }
    public void modificarCodigoIata(String modificariata){
        inputCodigoIata.sendKeys(modificariata);
    }
    public void ingresarCodigoSap(String sap){
        inputCodigoSap.sendKeys(sap);
    }
    public void modificarCodigoSap(String modificarsap){
        inputCodigoSap.sendKeys(modificarsap);
    }
    public void ingresarCodigoOaci(String oaci){
        inputCodigoOaci.sendKeys(oaci);
    }
    public void modificarCodigoOaci(String modificaroaci){
        inputCodigoOaci.sendKeys(modificaroaci);
    }
    public void ingresarCodigoInterno(String interno){
        inputCodigoInterno.sendKeys(interno);
    }
    public void modificarCodigoInterno(String modificarinterno){
        inputCodigoInterno.sendKeys(modificarinterno);
    }
    public void clickBotonAgregarRepresentante(){
        btnAgregarRepresentante.click();
    }
    public void ingresarNombreRepresentante(String nombre){
        inputNombreRepresentante.sendKeys(nombre);
    }
    public void modificarNombreRepresentante(String modificarnombre){
        wait.until(ExpectedConditions.visibilityOf(inputNombreRepresentante));
        limpiarCampo(inputNombreRepresentante);
        inputNombreRepresentante.sendKeys(modificarnombre);
    }
    public void ingresarApellidoRepresentante(String apellido){
        inputApellidoRepresentante.sendKeys(apellido);
    }
    public void modificarApellidoRepresentante(String modificarapellido){
        limpiarCampo(inputApellidoRepresentante);
        inputApellidoRepresentante.sendKeys(modificarapellido);
    }
    public void ingresarDocumentoRepresentante(String documento){
        inputDocumentoRepresentante.sendKeys(documento);
    }
    public void modificarDocumentoRepresentante(String modificardocumento){
        limpiarCampo(inputDocumentoRepresentante);
        inputDocumentoRepresentante.sendKeys(modificardocumento);
    }
    public void ingresarCargoRepresentante(String cargo){
        inputCargoRepresentante.sendKeys(cargo);
    }
    public void modificarCargoRepresentante(String modificarcargo){
        limpiarCampo(inputCargoRepresentante);
        inputCargoRepresentante.sendKeys(modificarcargo);
    }
    public void seleccionarPermisoMasivaContado(String permiso){
        wait.until(ExpectedConditions.visibilityOf(checkPermisoMasivaContado));
        if (permiso.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkPermisoMasivaContado));
            if (!checkPermisoMasivaContado.isSelected()) {
                checkPermisoMasivaContado.click();
            }
        } else if (permiso.toLowerCase().equals("no")) {
            if (checkPermisoMasivaContado.isSelected()) {
                checkPermisoMasivaContado.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPermisoMasivaContado.isSelected());
        }
    }
    public void seleccionarPermisoMasivaCredito(String permiso){
        wait.until(ExpectedConditions.visibilityOf(checkPermisoMasivaCredito));
        if (permiso.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkPermisoMasivaCredito));
            if (!checkPermisoMasivaCredito.isSelected()) {
                checkPermisoMasivaCredito.click();
            }
        } else if (permiso.toLowerCase().equals("no")) {
            if (checkPermisoMasivaCredito.isSelected()) {
                checkPermisoMasivaCredito.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPermisoMasivaCredito.isSelected());
        }
    }
    public void seleccionarPermisoRehabilitacion(String permiso){
        wait.until(ExpectedConditions.visibilityOf(checkPermisoRehabilitacion));
        if (permiso.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkPermisoRehabilitacion));
            if (!checkPermisoRehabilitacion.isSelected()) {
                checkPermisoRehabilitacion.click();
            }
        } else if (permiso.toLowerCase().equals("no")) {
            if (checkPermisoRehabilitacion.isSelected()) {
                checkPermisoRehabilitacion.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkPermisoRehabilitacion.isSelected());
        }
    }
    public void seleccionarModalidadVentaNormal(String modalidad){
        wait.until(ExpectedConditions.visibilityOf(checkModalidadVentaNormal));
        if (modalidad.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkModalidadVentaNormal));
            if (!checkModalidadVentaNormal.isSelected()) {
                checkModalidadVentaNormal.click();
            }
        } else if (modalidad.toLowerCase().equals("no")) {
            if (checkModalidadVentaNormal.isSelected()) {
                checkModalidadVentaNormal.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkModalidadVentaNormal.isSelected());
        }
    }
    public void seleccionarModalidadBcbp(String modalidad){
        wait.until(ExpectedConditions.visibilityOf(checkModalidaBCBP));
        if (modalidad.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkModalidaBCBP));
            if (!checkModalidaBCBP.isSelected()) {
                checkModalidaBCBP.click();
            }
        } else if (modalidad.toLowerCase().equals("no")) {
            if (checkModalidaBCBP.isSelected()) {
                checkModalidaBCBP.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkModalidaBCBP.isSelected());
        }
    }
    public void seleccionarModalidadVentaMasivaContado(String modalidad){
        wait.until(ExpectedConditions.visibilityOf(checkModalidadVentaMasivaContado));
        if (modalidad.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkModalidadVentaMasivaContado));
            if (!checkModalidadVentaMasivaContado.isSelected()) {
                checkModalidadVentaMasivaContado.click();
            }
        } else if (modalidad.toLowerCase().equals("no")) {
            if (checkModalidadVentaMasivaContado.isSelected()) {
                checkModalidadVentaMasivaContado.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkModalidadVentaMasivaContado.isSelected());
        }
    }
    public void seleccionarModalidadVentaVentaMasivaCredito(String modalidad){
        wait.until(ExpectedConditions.visibilityOf(checkModalidadVentaMasivaCredito));
        if (modalidad.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkModalidadVentaMasivaCredito));
            if (!checkModalidadVentaMasivaCredito.isSelected()) {
                checkModalidadVentaMasivaCredito.click();
            }
        } else if (modalidad.toLowerCase().equals("no")) {
            if (checkModalidadVentaMasivaCredito.isSelected()) {
                checkModalidadVentaMasivaCredito.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkModalidadVentaMasivaCredito.isSelected());
        }
    }
    public void seleccionarCompActivarRehabilitacion(String atributos){
        wait.until(ExpectedConditions.visibilityOf(checkCompActivarRehabilitacion));
        if (atributos.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompActivarRehabilitacion));
            if (!checkCompActivarRehabilitacion.isSelected()) {
                checkCompActivarRehabilitacion.click();
            }
        } else if (atributos.toLowerCase().equals("no")) {
            if (checkCompActivarRehabilitacion.isSelected()) {
                checkCompActivarRehabilitacion.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompActivarRehabilitacion.isSelected());
        }
    }
    public void seleccionarCompNumeroMaximoTicketVenta(String atributos){
        wait.until(ExpectedConditions.visibilityOf(checkCompNumemroMaximoTicketVenta));
        if (atributos.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompNumemroMaximoTicketVenta));
            if (!checkCompNumemroMaximoTicketVenta.isSelected()) {
                checkCompNumemroMaximoTicketVenta.click();
            }
        } else if (atributos.toLowerCase().equals("no")) {
            if (checkCompNumemroMaximoTicketVenta.isSelected()) {
                checkCompNumemroMaximoTicketVenta.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompNumemroMaximoTicketVenta.isSelected());
        }
    }
    public void seleccionarCompNumeroMinimoTicketVenta(String atributos){
        wait.until(ExpectedConditions.visibilityOf(checkCompNumemroMinimoTicketVenta));
        if (atributos.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompNumemroMinimoTicketVenta));
            if (!checkCompNumemroMinimoTicketVenta.isSelected()) {
                checkCompNumemroMinimoTicketVenta.click();
            }
        } else if (atributos.toLowerCase().equals("no")) {
            if (checkCompNumemroMinimoTicketVenta.isSelected()) {
                checkCompNumemroMinimoTicketVenta.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompNumemroMinimoTicketVenta.isSelected());
        }
    }
    public void seleccionarCompSerieNumeroTicketFin(String atributos){
        wait.until(ExpectedConditions.visibilityOf(checkCompSerieNumeroTicketFin));
        if (atributos.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompSerieNumeroTicketFin));
            if (!checkCompSerieNumeroTicketFin.isSelected()) {
                checkCompSerieNumeroTicketFin.click();
            }
        } else if (atributos.toLowerCase().equals("no")) {
            if (checkCompSerieNumeroTicketFin.isSelected()) {
                checkCompSerieNumeroTicketFin.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompSerieNumeroTicketFin.isSelected());
        }
    }
    public void seleccionarCompSerieNumeroTicketInicio(String atributos){
        wait.until(ExpectedConditions.visibilityOf(checkCompSerieNumeroTicketInicio));
        if (atributos.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompSerieNumeroTicketInicio));
            if (!checkCompSerieNumeroTicketInicio.isSelected()) {
                checkCompSerieNumeroTicketInicio.click();
            }
        } else if (atributos.toLowerCase().equals("no")) {
            if (checkCompSerieNumeroTicketInicio.isSelected()) {
                checkCompSerieNumeroTicketInicio.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompSerieNumeroTicketInicio.isSelected());
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
    public void clickBotonAgregarModalidadVenta(){
        btnAgregarModalidadVenta.click();
    }
    public void clickBotonAgregarModalidadTipoTicket(){
        btnAgregarModalidadTipoTicket.click();
    }
    public void clickBotonAgregarAtributoTipoTicket(){
        btnAgregarAtributoTipoTicket.click();
    }
    public void ingresarDescripcion(String descripcion){
        wait.until(ExpectedConditions.visibilityOf(inputDescripcion));
        limpiarCampo(inputDescripcion);
        inputDescripcion.sendKeys(descripcion);
    }
    public void seleccionarSerieNumFin(String fin){
        wait.until(ExpectedConditions.visibilityOf(checkCompActivarSerieNumFin));
        if (fin.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompActivarSerieNumFin));
            if (!checkCompActivarSerieNumFin.isSelected()) {
                checkCompActivarSerieNumFin.click();
            }
        } else if (fin.toLowerCase().equals("no")) {
            if (checkCompActivarSerieNumFin.isSelected()) {
                checkCompActivarSerieNumFin.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompActivarSerieNumFin.isSelected());
        }
    }
    public void seleccionarSerieNumInicio(String inicio){
        wait.until(ExpectedConditions.visibilityOf(checkCompActivarSerieNumInicio));
        if (inicio.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkCompActivarSerieNumInicio));
            if (!checkCompActivarSerieNumInicio.isSelected()) {
                checkCompActivarSerieNumInicio.click();
            }
        } else if (inicio.toLowerCase().equals("no")) {
            if (checkCompActivarSerieNumInicio.isSelected()) {
                checkCompActivarSerieNumInicio.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkCompActivarSerieNumInicio.isSelected());
        }
    }
    public void seleccionarActivarModalidaA(String activara){
        wait.until(ExpectedConditions.visibilityOf(checkActivarA));
        if (activara.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkActivarA));
            if (!checkActivarA.isSelected()) {
                checkActivarA.click();
            }
        } else if (activara.toLowerCase().equals("no")) {
            if (checkActivarA.isSelected()) {
                checkActivarA.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkActivarA.isSelected());
        }
    }
    public void seleccionarActivarModalidaB(String activarb){
        wait.until(ExpectedConditions.visibilityOf(checkActivarB));
        if (activarb.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkActivarB));
            if (!checkActivarB.isSelected()) {
                checkActivarB.click();
            }
        } else if (activarb.toLowerCase().equals("no")) {
            if (checkActivarB.isSelected()) {
                checkActivarB.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkActivarB.isSelected());
        }
    }
    public void seleccionarActivarModalidaC(String activarc){
        wait.until(ExpectedConditions.visibilityOf(checkActivarC));
        if (activarc.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkActivarC));
            if (!checkActivarC.isSelected()) {
                checkActivarC.click();
            }
        } else if (activarc.toLowerCase().equals("no")) {
            if (checkActivarC.isSelected()) {
                checkActivarC.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkActivarC.isSelected());
        }
    }
    public void seleccionarActivarModalidaD(String activard){
        wait.until(ExpectedConditions.visibilityOf(checkActivarD));
        if (activard.toLowerCase().equals("si")) {
            wait.until(ExpectedConditions.visibilityOf(checkActivarD));
            if (!checkActivarD.isSelected()) {
                checkActivarD.click();
            }
        } else if (activard.toLowerCase().equals("no")) {
            if (checkActivarD.isSelected()) {
                checkActivarD.click();
            }
            Assert.assertFalse("El checkbox no debería estar seleccionado.", checkActivarD.isSelected());
        }
    }
}
