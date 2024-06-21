package definitions;

import io.cucumber.java.en.And;
import pageobject.*;

public class modmantenimientoDefinition {
    menuPage menu;
    alertasPage alertas;
    comboboxPage combobox;
    botonPage boton;
    modmantenimientoPage mantenimiento;
    public modmantenimientoDefinition() {
        menu = new menuPage();
        alertas = new alertasPage();
        combobox = new comboboxPage();
        boton = new botonPage();
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
        combobox.abrirComboboxMoneda();
        combobox.seleccionarOpcion(codigomoneda);
    }

    @And("ingresar a la opcion compania")
    public void ingresarALaOpcionCompania() {
        mantenimiento.ingresarOpcionCompania();
    }

    @And("seleccionar tipo de compania {string}")
    public void seleccionarTipoDeCompania(String tipocompania) {
        combobox.abrirComboboxTipoCompania();
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

    @And("click en el boton agregar representante")
    public void clickEnElBotonAgregarRepresentante() {
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
        mantenimiento.seleccionarPermisoMasivaContado(permiso);
        mantenimiento.seleccionarPermisoMasivaCredito(permiso);
        mantenimiento.seleccionarPermisoRehabilitacion(permiso);
    }

    @And("ingresar a la opcion modalidad de venta")
    public void ingresarALaOpcionModalidadDeVenta() {
        mantenimiento.ingresarOpcionModalidadVenta();
    }

    @And("seleccionar tipo de modalidad {string}")
    public void seleccionarTipoDeModalidad(String tipomodalidad) {
        combobox.abrirComboboxTipoModalidad();
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
        combobox.abrirComboboxTipoTicketModalidad();
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
        combobox.abrirComboboxTipoPasajeroTipoTicket();
        combobox.seleccionarOpcion(pasajero);
    }

    @And("ingresar nombre de tipo ticket {string}")
    public void ingresarNombreDeTipoTicket(String nombretipoticket) {
        mantenimiento.ingresarNombreTipoTicket(nombretipoticket);
    }

    @And("click en boton guardar")
    public void clickEnBotonGuardar() {
        boton.clickBotonGuardarB();
    }

    @And("seleccionar venta normal {string}")
    public void seleccionarVentaNormal(String ventanormal) {
        mantenimiento.seleccionarModalidadVentaNormal(ventanormal);
    }

    @And("seleccionar atributo activar rehabilitacion {string}")
    public void seleccionarAtributoActivarRehabilitacion(String activarrehabilitacion) {
        mantenimiento.seleccionarCompActivarRehabilitacion(activarrehabilitacion);
    }

    @And("seleccionar atributo numero maximo de ticket para venta {string}")
    public void seleccionarAtributoNumeroMaximoDeTicketParaVenta(String maximoticket) {
        mantenimiento.seleccionarCompNumeroMaximoTicketVenta(maximoticket);
    }

    @And("seleccionar atributo numero minimo de ticket para venta {string}")
    public void seleccionarAtributoNumeroMinimoDeTicketParaVenta(String minimoticket) {
        mantenimiento.seleccionarCompNumeroMinimoTicketVenta(minimoticket);
    }

    @And("seleccionar atributo serie numero ticket fin {string}")
    public void seleccionarAtributoSerieNumeroTicketFin(String ticketfin) {
        mantenimiento.seleccionarCompSerieNumeroTicketFin(ticketfin);
    }

    @And("seleccionar atributo serie numero ticket inicio {string}")
    public void seleccionarAtributoSerieNumeroTicketInicio(String ticketinicio) {
        mantenimiento.seleccionarCompSerieNumeroTicketInicio(ticketinicio);
    }

    @And("seleccionar bcbp {string}")
    public void seleccionarBcbp(String modalidad) {
        mantenimiento.seleccionarModalidadBcbp(modalidad);
    }

    @And("click en el boton editar bcbp")
    public void clickEnElBotonEditarBcbp() {
        boton.clickBotonEditarC();
    }

    @And("seleccionar venta masiva contado {string}")
    public void seleccionarVentaMasivaContado(String modalidad) {
        mantenimiento.seleccionarModalidadVentaMasivaContado(modalidad);
    }

    @And("click en el boton editar venta masiva contado")
    public void clickEnElBotonEditarVentaMasivaContado() {
        boton.clickBotonEditarD();
    }

    @And("seleccionar venta masiva credito {string}")
    public void seleccionarVentaMasivaCredito(String modalidad) {
        mantenimiento.seleccionarModalidadVentaVentaMasivaCredito(modalidad);
    }

    @And("click en el boton editar venta masiva")
    public void clickEnElBotonEditarVentaMasiva() {
        boton.clickBotonEditarE();
    }

    @And("ingresar tipo de documento {string}")
    public void ingresarTipoDeDocumento(String documento) {
        combobox.abrirComboboxTipoDocumentoRepresentante();
        combobox.seleccionarOpcion(documento);
    }

    @And("click en el boton editar")
    public void clickEnElBotonEditar() {
        boton.clickBotonEditar();
    }

    @And("modificar nombre {string}")
    public void modificarNombre(String nombres) {
        mantenimiento.modificarNombreCompania(nombres);
    }

    @And("modificar ruc {string}")
    public void modificarRuc(String ruc) {
        mantenimiento.modificarRucCompania(ruc);
    }

    @And("modificar codigo aerolinea {string}")
    public void modificarCodigoAerolinea(String aerolinea) {
        mantenimiento.modificarCodigoAerolinea(aerolinea);
    }

    @And("modificar codigo iata {string}")
    public void modificarCodigoIata(String iata) {
        mantenimiento.modificarCodigoIata(iata);
    }

    @And("modificar codigo sap {string}")
    public void modificarCodigoSap(String sap) {
        mantenimiento.modificarCodigoSap(sap);
    }

    @And("modificar codigo oaci {string}")
    public void modificarCodigoOaci(String oaci) {
        mantenimiento.modificarCodigoOaci(oaci);
    }

    @And("modificar codigo interno {string}")
    public void modificarCodigoInterno(String interno) {
        mantenimiento.modificarCodigoInterno(interno);
    }

    @And("click en el boton editar representante")
    public void clickEnElBotonEditarRepresentante() {
        boton.clickBotonEditar();
    }

    @And("modificar nombre de representante {string}")
    public void modificarNombreDeRepresentante(String nombres) {
        mantenimiento.modificarNombreRepresentante(nombres);
    }

    @And("modificar apellido de representante {string}")
    public void modificarApellidoDeRepresentante(String apellidos) {
        mantenimiento.modificarApellidoRepresentante(apellidos);
    }

    @And("modificar numero de documento {string}")
    public void modificarNumeroDeDocumento(String documento) {
        mantenimiento.modificarDocumentoRepresentante(documento);
    }

    @And("modificar cargo {string}")
    public void modificarCargo(String cargo) {
        mantenimiento.modificarCargoRepresentante(cargo);
    }

    @And("click en el boton agregar modalidad de venta")
    public void clickEnElBotonAgregarModalidadDeVenta() {
        mantenimiento.clickBotonAgregarModalidadVenta();
    }

    @And("click en el boton agregar modalidad tipo ticket")
    public void clickEnElBotonAgregarModalidadipoTicket() {
        mantenimiento.clickBotonAgregarModalidadTipoTicket();
    }

    @And("click en el boton agregar atributos tipo ticket")
    public void clickEnElBotonAgregarAtributosTipoTicket() {
        mantenimiento.clickBotonAgregarAtributoTipoTicket();
    }

    @And("cambiar descripcion {string}")
    public void cambiarDescripcion(String descripcion) {
        mantenimiento.ingresarDescripcion(descripcion);
    }

    @And("seleccionar la serie numero ticket inicio {string}")
    public void seleccionarLaSerieNumeroTicketInicio(String inicio) {
        mantenimiento.seleccionarSerieNumInicio(inicio);
    }

    @And("seleccionar la serie numero ticket fin {string}")
    public void seleccionarLaSerieNumeroTicketFin(String fin) {
        mantenimiento.seleccionarSerieNumFin(fin);
    }

    @And("click en el boton editar venta masiva credito")
    public void clickEnElBotonEditarVentaMasivaCredito() {
        boton.clickBotonEditarD();
    }

    @And("click en el boton editar compania")
    public void clickEnElBotonEditarCompania() {
        boton.clickBotonEditarB();
    }

    @And("seleccionar el tipo ticket {string}")
    public void seleccionarElTipoTicket(String tipoticketmodalidad) {
        combobox.abrirComboboxTicketModalidaVenta();
        combobox.seleccionarOpcion(tipoticketmodalidad);
    }

    @And("seleccionar el activar rehabilitacion {string}")
    public void seleccionarElActivarRehabilitacion(String activara) {
        mantenimiento.seleccionarActivarModalidaA(activara);
    }

    @And("seleccionar el maximo de tickets emitidos por semana al credito {string}")
    public void seleccionarElMaximoDeTicketsEmitidosPorSemanaAlCredito(String activarb) {
        mantenimiento.seleccionarActivarModalidaB(activarb);
    }

    @And("seleccionar el numero maximo tickets para venta {string}")
    public void seleccionarElNumeroMaximoTicketsParaVenta(String activarc) {
        mantenimiento.seleccionarActivarModalidaC(activarc);
    }

    @And("seleccionar el numero minimo tickets para venta {string}")
    public void seleccionarElNumeroMinimoTicketsParaVenta(String activard) {
        mantenimiento.seleccionarActivarModalidaD(activard);
    }

    @And("seleccionar un tipo vuelo {string}")
    public void seleccionarUnTipoVuelo(String tipovuelo) {
        combobox.abrirComboboxTipoVueloTipoTicket();
        combobox.seleccionarOpcion(tipovuelo);
    }

    @And("seleccionar un tipo transbordo {string}")
    public void seleccionarUnTipoTransbordo(String tipotransbordo) {
        combobox.abrirComboboxTipoTransbordoTipoTicket();
        combobox.seleccionarOpcion(tipotransbordo);
    }

    @And("click en el boton editar modalidad")
    public void clickEnElBotonEditarModalidad() {
        boton.clickBotonEditarE();
    }
}
