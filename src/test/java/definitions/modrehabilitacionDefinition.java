package definitions;

import io.cucumber.java.en.And;
import pageobject.*;

public class modrehabilitacionDefinition {
    menuPage menu;
    titulosPage titulos;
    comboboxPage combobox;
    excelPage excel;
    pdfPage imprimir;
    voucherPage voucher;
    mensajesPage mensajes;
    modrehabilitacionPage rehabilitacion;
    public modrehabilitacionDefinition() {
        menu = new menuPage();
        titulos = new titulosPage();
        combobox = new comboboxPage();
        excel = new excelPage();
        imprimir = new pdfPage();
        voucher = new voucherPage();
        mensajes = new mensajesPage();
        rehabilitacion = new modrehabilitacionPage();
    }

    @And("ingresar al modulo rehabilitacion")
    public void ingresarAlModuloRehabilitacion() {
        menu.validarModRehabilitacion();
    }

    @And("visualizar la opcion ticket")
    public void visualizarLaOpcionTicket() {
        rehabilitacion.ingresarOpcionTicket();
    }

    @And("visualizar la subopcion ticket normal")
    public void visualizarLaSubopcionTicketNormal() {
        rehabilitacion.ingresarSubOpcionTicketNormal();
    }

    @And("visualizar la subopcion ticket masivo")
    public void visualizarLaSubopcionTicketMasivo() {
        rehabilitacion.ingresarSubOpcionTicketMasivo();
    }

    @And("visualizar la subopcion ticket por salida")
    public void visualizarLaSubopcionTicketPorSalida() {
        rehabilitacion.ingresarSubOpcionTicketSalida();
    }

    @And("visualizar la subopcion ticket por vuelo")
    public void visualizarLaSubopcionTicketPorVuelo() {
        rehabilitacion.ingresarSubOpcionTicketVuelo();
    }

    @And("visualizar la subopcion ticket por rango")
    public void visualizarLaSubopcionTicketPorRango() {
        rehabilitacion.ingresarSubOpcionTicketRango();
    }

    @And("visualizar la subopcion ticket por fecha")
    public void visualizarLaSubopcionTicketPorFecha() {
        rehabilitacion.ingresarSubOpcionTicketFecha();
    }

    @And("visualizar la opcion boarding pass")
    public void visualizarLaOpcionBoardingPass() {
        rehabilitacion.ingresarOpcionBoarding();
    }

    @And("visualizar la subopcion boarding pass normal")
    public void visualizarLaSubopcionBoardingPassNormal() {
        rehabilitacion.ingresarSubOpcionBoardingNormal();
    }

    @And("visualizar la subopcion boarding pass masivo")
    public void visualizarLaSubopcionBoardingPassMasivo() {
        rehabilitacion.ingresarSubOpcionBoardingMasivo();
    }

    @And("visualizar la subopcion boarding pass por salida")
    public void visualizarLaSubopcionBoardingPassPorSalida() {
        rehabilitacion.ingresarSubOpcionBoardingSalida();
    }

    @And("visualizar la subopcion boarding pass por vuelo")
    public void visualizarLaSubopcionBoardingPassPorVuelo() {
        rehabilitacion.ingresarSubOpcionBoardingVuelo();
    }

    @And("visualizar la subopcion boarding pass por fecha")
    public void visualizarLaSubopcionBoardingPassPorFecha() {
        rehabilitacion.ingresarSubOpcionBoardingFecha();
    }

    @And("ingresar a la opcion ticket")
    public void ingresarALaOpcionTicket() {
        rehabilitacion.ingresarOpcionTicket();
    }

    @And("ingresar a la subopcion ticket normal")
    public void ingresarALaSubopcionTicketNormal() {
        rehabilitacion.ingresarSubOpcionTicketNormal();
    }

    @And("ingresar numero de ticket {string}")
    public void ingresarNumeroDeTicket(String ticket) {
        rehabilitacion.ingresarNumeroTicket(ticket);
    }

    @And("click en el boton agregar ticket")
    public void clickEnElBotonAgregarTicket() {
        rehabilitacion.clickBotonAgregarTicket();
    }

    @And("visualizar el ticket agregado {string}")
    public void visualizarElTicketAgregado(String ticketagregado) {
        rehabilitacion.validarTicketAgregado(ticketagregado);
    }

    @And("click en el boton representante")
    public void clickEnElBotonRepresentante() {
        rehabilitacion.clickBotonRepresentante();
    }

    @And("elegir compania {string}")
    public void elegirCompania(String compania) {
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(compania);
    }

    @And("visualizar {string} de la compania")
    public void visualizarDeLaCompania(String representante) {
        rehabilitacion.validarTituloRepresentante(representante);
    }

    @And("click en el boton ver detalle")
    public void clickEnElBotonVerDetalle() {
        rehabilitacion.clickBotonVerDetalle();
    }

    @And("visualizar el {string}")
    public void visualizarEl(String detalle) {
        rehabilitacion.validarTituloDetalle(detalle);
    }

    @And("click en el boton cerrar")
    public void clickEnElBotonCerrar() {
        rehabilitacion.clickBotonCerrar();
    }

    @And("seleccionar ticket {string}")
    public void seleccionarTicket(String selecticket) {
        rehabilitacion.seleccionarTicket(selecticket);
    }

    @And("click en el boton rehabilitar")
    public void clickEnElBotonRehabilitar() {
        rehabilitacion.clickBotonRehabilitar();
    }

    @And("validar alerta de confirmacion {string}")
    public void validarAlertaDeConfirmacion(String alerta) {
        rehabilitacion.validarTituloAlerta(alerta);
    }

    @And("click en el boton si")
    public void clickEnElBotonSi() {
        rehabilitacion.clickBotonSi();
    }

    @And("validar mensaje {string}")
    public void validarMensaje(String mensaje) {
        mensajes.validarMensajeExito(mensaje);
    }

    @And("click en el boton excel")
    public void clickEnElBotonExcel() {
        rehabilitacion.clickBotonExcel();
    }

    @And("click en el boton imprimir")
    public void clickEnElBotonImprimir() {
        rehabilitacion.clickBotonImprimir();
    }

    @And("click en el boton aceptar")
    public void clickEnElBotonAceptar() {
        rehabilitacion.clickBotonAceptar();
    }

    @And("ingresar a la subopcion ticket masivo")
    public void ingresarALaSubopcionTicketMasivo() {
        rehabilitacion.ingresarSubOpcionTicketMasivo();
    }

    @And("seleccionar motivo {string}")
    public void seleccionarMotivo(String motivo) {
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(motivo);
    }

    @And("ingresar a la subopcion ticket por vuelo")
    public void ingresarALaSubopcionTicketPorVuelo() {
        rehabilitacion.ingresarSubOpcionTicketVuelo();
    }

    @And("seleccionar compania {string}")
    public void seleccionarCompania(String compania) {
        rehabilitacion.abrirCompaniaVuelo();
        rehabilitacion.seleccionarCompaniaVuelo(compania);
    }

    @And("ingresar fecha de vuelo {string}")
    public void ingresarFechaDeVuelo(String fecha) {
        rehabilitacion.ingresarFechaVuelo(fecha);
    }

    @And("seleccionar vuelo {string}")
    public void seleccionarVuelo(String vuelo) {
        rehabilitacion.abrirNumeroVuelo();
        rehabilitacion.seleccionarNumeroVuelo(vuelo);
    }

    @And("click en el boton buscar")
    public void clickEnElBotonBuscar() {
        rehabilitacion.clickBotonBuscar();
    }

    @And("visualizar lista de {string}")
    public void visualizarListaDe(String titulo) {
        titulos.validarTitulo(titulo);
    }

    @And("ingresar a la subopcion ticket por salida")
    public void ingresarALaSubopcionTicketPorSalida() {
        rehabilitacion.ingresarSubOpcionTicketSalida();
    }

    @And("ingresar a la subopcion ticket por rango")
    public void ingresarALaSubopcionTicketPorRango() {
        rehabilitacion.ingresarSubOpcionTicketRango();
    }

    @And("ingresar numero ticket desde {string}")
    public void ingresarNumeroTicketDesde(String ticketdesde) {
        rehabilitacion.ingresarTicketDesde(ticketdesde);
    }

    @And("ingresar numero ticket hasta {string}")
    public void ingresarNumeroTicketHasta(String tickethasta) {
        rehabilitacion.ingresarTicketHasta(tickethasta);
    }

    @And("ingresar a la subopcion ticket por fecha")
    public void ingresarALaSubopcionTicketPorFecha() {
        rehabilitacion.ingresarSubOpcionTicketFecha();
    }

    @And("ingresar fecha desde {string}")
    public void ingresarFechaDesde(String fechadesde) {
        rehabilitacion.ingresarFechaDesde(fechadesde);
    }

    @And("ingresar fecha hasta {string}")
    public void ingresarFechaHasta(String fechahasta) {
        rehabilitacion.ingresarFechaHasta(fechahasta);
    }

    @And("ingresar a la opcion boarding")
    public void ingresarALaOpcionBoarding() {
        rehabilitacion.ingresarOpcionBoarding();
    }

    @And("ingresar a la subopcion boarding pass normal")
    public void ingresarALaSubopcionBoardingPassNormal() {
        rehabilitacion.ingresarSubOpcionBoardingNormal();
    }

    @And("ingresar numero de vuelo {string}")
    public void ingresarNumeroDeVuelo(String vuelo) {
        rehabilitacion.ingresarNumeroVuelo(vuelo);
    }

    @And("ingresar asiento {string}")
    public void ingresarAsiento(String asiento) {
        rehabilitacion.ingresarAsiento(asiento);
    }

    @And("ingresar persona {string}")
    public void ingresarPersona(String persona) {
        rehabilitacion.ingresarPersona(persona);
    }

    @And("click en el boton agregar bp")
    public void clickEnElBotonAgregarBp() {
        rehabilitacion.clickBotonAgregarTicket();
    }

    @And("seleccionar boarding {string}")
    public void seleccionarBoarding(String selectbp) {
        rehabilitacion.seleccionarBoarding(selectbp);
    }

    @And("click en el boton voucher")
    public void clickEnElBotonVoucher() {
        rehabilitacion.clickBotonVoucher();
    }

    @And("ingresar a la subopcion boarding pass masivo")
    public void ingresarALaSubopcionBoardingPassMasivo() {
        rehabilitacion.ingresarSubOpcionBoardingMasivo();
    }

    @And("ingresar a la subopcion boarding pass por salida")
    public void ingresarALaSubopcionBoardingPassPorSalida() {
        rehabilitacion.ingresarSubOpcionBoardingSalida();
    }

    @And("ingresar a la subopcion boarding pass por vuelo")
    public void ingresarALaSubopcionBoardingPassPorVuelo() {
        rehabilitacion.ingresarSubOpcionBoardingVuelo();
    }

    @And("ingresar a la subopcion boarding pass por fecha")
    public void ingresarALaSubopcionBoardingPassPorFecha() {
        rehabilitacion.ingresarSubOpcionBoardingFecha();
    }
}
