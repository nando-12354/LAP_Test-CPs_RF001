package definitions;

import io.cucumber.java.en.And;
import pageobject.alertasPage;
import pageobject.comboboxPage;
import pageobject.menuPage;
import pageobject.modmantenimientoPage;

public class modmantenimientoDefinition {
    menuPage menu;
    alertasPage alertas;
    comboboxPage combobox;
    modmantenimientoPage mantenimiento;
    public modmantenimientoDefinition() {
        menu = new menuPage();
        alertas = new alertasPage();
        combobox = new comboboxPage();
        mantenimiento = new modmantenimientoPage();
    }

    @And("ingresar al modulo mantenimiento")
    public void ingresarAlModuloMantenimiento() {
        menu.validarModMantenimiento();
    }

    @And("visualizar la opcion estacion de punto de venta")
    public void visualizarLaOpcionEstacionDePuntoDeVenta() {
        mantenimiento.ingresarOpcionEstacionPuntoVenta();
    }

    @And("visualizar la opcion moneda")
    public void visualizarLaOpcionMoneda() {
        mantenimiento.ingresarOpcionMoneda();
    }

    @And("visualizar la opcion compania")
    public void visualizarLaOpcionCompania() {
        mantenimiento.ingresarOpcionCompania();
    }

    @And("visualizar la opcion modalidad de venta")
    public void visualizarLaOpcionModalidadDeVenta() {
        mantenimiento.ingresarOpcionModalidadVenta();
    }

    @And("visualizar la opcion tipo de ticket")
    public void visualizarLaOpcionTipoDeTicket() {
        mantenimiento.ingresarOpcionTipoTickets();
    }

    @And("ingresar a la opcion estacion de punto de venta")
    public void ingresarALaOpcionEstacionDePuntoDeVenta() {
        mantenimiento.ingresarOpcionEstacionPuntoVenta();
    }

    @And("ingresar ip {string}")
    public void ingresarIp(String ip) {
        mantenimiento.ingresarIp(ip);
    }

    @And("validar alerta {string}")
    public void validarAlerta(String alertafuerarango) {
        alertas.validarAlerta(alertafuerarango);
    }

    @And("validar aviso {string}")
    public void validarAviso(String avisofuerarango) {
        alertas.validarAviso(avisofuerarango);
    }

    @And("ingresar a la opcion moneda")
    public void ingresarALaOpcionMoneda() {
        mantenimiento.ingresarOpcionMoneda();
    }

    @And("seleccionar codigo de moneda {string}")
    public void seleccionarCodigoDeMoneda(String codigomoneda) {
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(codigomoneda);
    }

    @And("ingresar a la opcion compania")
    public void ingresarALaOpcionCompania() {
        mantenimiento.ingresarOpcionCompania();
    }

    @And("seleccionar tipo de compania {string}")
    public void seleccionarTipoDeCompania(String tipocompania) {
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(tipocompania);
    }

    @And("ingresar ruc {string}")
    public void ingresarRuc(String ruc) {
        mantenimiento.ingresarRucCompania(ruc);
    }

    @And("ingresar codigo aerolinea {string}")
    public void ingresarCodigoAerolinea(String aerolina) {
        mantenimiento.ingresarCodigoAerolinea(aerolina);
    }

    @And("ingresar codigo iata {string}")
    public void ingresarCodigoIata(String iata) {
        mantenimiento.ingresarCodigoIata(iata);
    }

    @And("ingresar codigo sap {string}")
    public void ingresarCodigoSap(String sap) {
        mantenimiento.ingresarCodigoSap(sap);
    }

    @And("ingresar codigo oaci {string}")
    public void ingresarCodigoOaci(String oaci) {
        mantenimiento.ingresarCodigoOaci(oaci);
    }

    @And("ingresar codigo interno {string}")
    public void ingresarCodigoInterno(String interno) {
        mantenimiento.ingresarCodigoInterno(interno);
    }

    @And("click en el boton agregar")
    public void clickEnElBotonAgregar() {
        mantenimiento.clickBotonAgregarRepresentante();
    }

    @And("ingresar nombre de representante {string}")
    public void ingresarNombreDeRepresentante(String nombre) {
        mantenimiento.ingresarNombreRepresentante(nombre);
    }

    @And("ingresar apellido de representante {string}")
    public void ingresarApellidoDeRepresentante(String apellido) {
        mantenimiento.ingresarApellidoRepresentante(apellido);
    }

    @And("ingresar numero de documento {string}")
    public void ingresarNumeroDeDocumento(String documento) {
        mantenimiento.ingresarDocumentoRepresentante(documento);
    }

    @And("ingresar cargo {string}")
    public void ingresarCargo(String cargo) {
        mantenimiento.ingresarCargoRepresentante(cargo);
    }

    @And("seleccionar permisos {string}")
    public void seleccionarPermisos(String permiso) {
        mantenimiento.seleccionarPermisoRepresenante(permiso);
    }

    @And("ingresar a la opcion modalidad de venta")
    public void ingresarALaOpcionModalidadDeVenta() {
        mantenimiento.ingresarOpcionModalidadVenta();
    }

    @And("seleccionar tipo de modalidad {string}")
    public void seleccionarTipoDeModalidad(String tipomodalidad) {
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(tipomodalidad);
    }

    @And("seleccionar activar rehabilitacion {string}")
    public void seleccionarActivarRehabilitacion(String activar) {
        mantenimiento.seleccionarActivarRehabilitacion(activar);
    }

    @And("seleccionar maximo de tickets emitidos por semana al credito {string}")
    public void seleccionarMaximoDeTicketsEmitidosPorSemanaAlCredito(String emitido) {
        mantenimiento.seleccionarMaximoTicketEmitidos(emitido);
    }

    @And("seleccionar numero maximo tickets para venta {string}")
    public void seleccionarNumeroMaximoTicketsParaVenta(String maximo) {
        mantenimiento.seleccionarMaximoTicketVenta(maximo);
    }

    @And("seleccionar numero minimo tickets para venta {string}")
    public void seleccionarNumeroMinimoTicketsParaVenta(String minimo) {
        mantenimiento.seleccionarMinimoTicketVenta(minimo);
    }

    @And("seleccionar serie numero ticket fin {string}")
    public void seleccionarSerieNumeroTicketFin(String fin) {
        mantenimiento.seleccionarSerieNumeroFin(fin);
    }

    @And("seleccionar serie numero ticket inicio {string}")
    public void seleccionarSerieNumeroTicketInicio(String inicio) {
        mantenimiento.seleccionarSerieNumeroInicio(inicio);
    }

    @And("seleccionar tipo ticket {string}")
    public void seleccionarTipoTicket(String tipoticket) {
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(tipoticket);
    }

    @And("click en el boton agregar atributos")
    public void clickEnElBotonAgregarAtributos() {
        mantenimiento.clickBotonAgregarAtributos();
    }

    @And("ingresar a la opcion tipo de ticket")
    public void ingresarALaOpcionTipoDeTicket() {
        mantenimiento.ingresarOpcionTipoTickets();
    }

    @And("seleccionar tipo de pasajero {string}")
    public void seleccionarTipoDePasajero(String pasajero) {
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(pasajero);
    }

    @And("ingresar nombre de tipo ticket {string}")
    public void ingresarNombreDeTipoTicket(String nombretipoticket) {
        mantenimiento.ingresarNombreTipoTicket(nombretipoticket);
    }
}
