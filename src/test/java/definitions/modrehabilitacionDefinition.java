package definitions;

import io.cucumber.java.en.And;
import pageobject.*;
import support.util;

/**
 * Clase para definir los pasos de los escenarios de la funcionalidad de rehabilitacion
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class modrehabilitacionDefinition {
    menuPage menu;
    headPage head;
    titulosPage titulos;
    comboboxPage combobox;
    botonPage boton;
    excelPage excel;
    pdfPage pdf;
    voucherPage voucher;
    imprimirPage imprimir;
    mensajesPage mensajes;
    alertasPage alerta;
    modrehabilitacionPage rehabilitacion;
    util ventana;
    public modrehabilitacionDefinition() {
        menu = new menuPage();
        head = new headPage();
        titulos = new titulosPage();
        combobox = new comboboxPage();
        boton = new botonPage();
        excel = new excelPage();
        pdf = new pdfPage();
        voucher = new voucherPage();
        imprimir = new imprimirPage();
        mensajes = new mensajesPage();
        alerta = new alertasPage();
        rehabilitacion = new modrehabilitacionPage();
        ventana = new util();
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
        boton.clickBotonAgregarTicket();
    }

    @And("visualizar el ticket agregado {string}")
    public void visualizarElTicketAgregado(String ticketagregado) {
        rehabilitacion.validarTicketAgregado(ticketagregado);
    }

    @And("click en el boton representante")
    public void clickEnElBotonRepresentante() {
        boton.clickBotonRepresentante();
    }

    @And("elegir compania {string}")
    public void elegirCompania(String compania) {
        combobox.abrirComboboxRepresentanteCompania();
        combobox.seleccionarOpcion(compania);
    }

    @And("visualizar {string} de la compania")
    public void visualizarDeLaCompania(String representante) {
        titulos.validarTituloRepresentante(representante);
    }

    @And("click en el boton ver detalle")
    public void clickEnElBotonVerDetalle() {
        boton.clickBotonVerDetalle();
    }

    @And("visualizar el {string}")
    public void visualizarEl(String detalle) {
        titulos.validarTituloDetalle(detalle);
    }

    @And("click en el boton cerrar")
    public void clickEnElBotonCerrar() {
        boton.clickBotonCerrar();
    }

    @And("seleccionar ticket {string}")
    public void seleccionarTicket(String selecticket) {
        rehabilitacion.seleccionarTicket(selecticket);
    }

    @And("click en el boton rehabilitar")
    public void clickEnElBotonRehabilitar() {
        boton.clickBotonRehabilitar();
    }

    @And("validar alerta de confirmacion {string}")
    public void validarAlertaDeConfirmacion(String confirmacion) {
        alerta.validarAlerta(confirmacion);
    }

    @And("click en el boton si")
    public void clickEnElBotonSi() {
        boton.clickBotonSi();
    }

    @And("validar mensaje {string}")
    public void validarMensaje(String mensaje) {
        mensajes.validarMensajeExito(mensaje);
    }

    @And("click en el boton excel")
    public void clickEnElBotonExcel() {
        excel.clickBotonExcel();
    }

    @And("click en el boton imprimir")
    public void clickEnElBotonImprimir() {
        imprimir.clickBotonImprimir();
        ventana.manejarNuevaPestana(5);
    }

    @And("click en el boton aceptar")
    public void clickEnElBotonAceptar() {
        boton.clickBotonAceptar();
    }

    @And("ingresar a la subopcion ticket masivo")
    public void ingresarALaSubopcionTicketMasivo() {
        rehabilitacion.ingresarSubOpcionTicketMasivo();
    }

    @And("seleccionar un motivo {string}")
    public void seleccionarUnMotivo(String motivo) {
        combobox.abrirComboboxMotivoTicketMasivo();
        combobox.seleccionarOpcion(motivo);
    }

    @And("ingresar a la subopcion ticket por vuelo")
    public void ingresarALaSubopcionTicketPorVuelo() {
        rehabilitacion.ingresarSubOpcionTicketVuelo();
    }

    @And("seleccionar compania {string}")
    public void seleccionarCompania(String compania) {
        combobox.abrirComboboxCompaniaBoarding();
        combobox.seleccionarOpcion(compania);
    }

    @And("ingresar fecha de vuelo {string}")
    public void ingresarFechaDeVuelo(String fecha) {
        rehabilitacion.ingresarFechaVuelo(fecha);
    }

    @And("seleccionar vuelo {string}")
    public void seleccionarVuelo(String vuelo) {
        combobox.abrirComboboxVueloTicketVueloBpVuelo();
        combobox.seleccionarOpcionVuelo(vuelo);
    }

    @And("click en el boton buscar")
    public void clickEnElBotonBuscar() {
        boton.clickBotonBuscar();
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
        boton.clickBotonAgregarBoarding();
    }

    @And("seleccionar boarding {string}")
    public void seleccionarBoarding(String selectbp) {
        rehabilitacion.seleccionarBoarding(selectbp);
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

    @And("click en boton ver detalle")
    public void clickEnBotonVerDetalle() {
        boton.clickBotonVerDetalleB();
    }
    @And("validar el mensaje {string}")
    public void validarElMensaje(String mensaje) {
        alerta.validarAlertaConfirmacion(mensaje);
    }

    @And("seleccionar motivo {string}")
    public void seleccionarMotivo(String motivos) {
        combobox.abrirComboboxMotivos();
        combobox.seleccionarOpcion(motivos);
    }

    @And("seleccionar una compania {string}")
    public void seleccionarUnaCompania(String compania) {
        combobox.abrirComboboxCompaniaTicketVuelo();
        combobox.seleccionarOpcion(compania);
    }

    @And("ingresar la fecha desde {string}")
    public void ingresarLaFechaDesde(String fechadesde) {
        rehabilitacion.ingresarFechaDesdeBpFecha(fechadesde);
    }

    @And("ingresar la fecha hasta {string}")
    public void ingresarLaFechaHasta(String fechahasta) {
        rehabilitacion.ingresarFechaHastaBpFecha(fechahasta);
    }

    @And("click en boton excel")
    public void clickEnBotonExcel() {
        excel.clickBotonExcelB();
    }

    @And("click en boton imprimir")
    public void clickEnBotonImprimir() {
        imprimir.clickBotonImprimirB();
        ventana.manejarNuevaPestana(5);
    }

    @And("click en el boton imprimir voucher")
    public void clickEnElBotonImprimirVoucher() {
        voucher.clickBotonVoucher();
        ventana.manejarNuevaPestana(5);
    }

    @And("click en el boton voucher")
    public void clickEnElBotonVoucher() {
        voucher.clickBotonVoucherB();
        ventana.manejarNuevaPestana(5);
    }

    @And("validar mensaje exitoso {string}")
    public void validarMensajeExitoso(String mensaje) {
        alerta.validarAlerta(mensaje);
    }

    @And("visualizar la subopcion {string}")
    public void visualizarLaSubopcion(String opcion) {
        rehabilitacion.validarOpcionesRehabilitacion(opcion);
    }

    @And("validar columna checkbox {string}")
    public void validarColumnaCheckbox(String cabecerac) {
        head.validarCabeceraGrillaC(cabecerac);
    }

    @And("ingresar la fecha de vuelo {string}")
    public void ingresarLaFechaDeVuelo(String fecha) {
        rehabilitacion.ingresarLaFechaVuelo(fecha);
        rehabilitacion.darClickCalendario();
    }

    @And("validar el ticket no rehabilitado {string}")
    public void validarElTicketNoRehabilitado(String norehab) {
        mensajes.validarMensajeTicketNoRehabilitado(norehab);
    }

    @And("click en el boton eliminar ticket")
    public void clickEnElBotonEliminarTicket() {
        boton.clickBotonEliminarTicket();
    }

    @And("validar el reseteo de la grilla y campos de {string}")
    public void validarElReseteoDeLaGrillaYCamposDe(String reseteo) {
        titulos.validarTitulo(reseteo);
    }

    @And("validar que los datos de la grilla {string} no se borren")
    public void validarQueLosDatosDeLaGrillaNoSeBorren(String grilla) {
        titulos.validarTitulo(grilla);
    }

    @And("seleccionar los boarding disponibles {string}")
    public void seleccionarLosBoardingDisponibles(String bpdisponibles) {
        rehabilitacion.seleccionarBoarding(bpdisponibles);
        rehabilitacion.seleccionarBoardingB(bpdisponibles);
        rehabilitacion.seleccionarBoardingC(bpdisponibles);
        rehabilitacion.seleccionarBoardingD(bpdisponibles);
        rehabilitacion.seleccionarBoardingE(bpdisponibles);
        rehabilitacion.seleccionarBoardingF(bpdisponibles);
        rehabilitacion.seleccionarBoardingG(bpdisponibles);
        rehabilitacion.seleccionarBoardingH(bpdisponibles);
        rehabilitacion.seleccionarBoardingI(bpdisponibles);
        rehabilitacion.seleccionarBoardingJ(bpdisponibles);

    }

    @And("validar que el botón eliminar sea color rojo")
    public void validarQueElBotonEliminarSeaColorRojo() {
        boton.clickBotonEliminar();
    }

    @And("Validar que el botón buscar sea color azul")
    public void validarQueElBotonBuscarSeaColorAzul() {
        boton.clickBotonBuscar();
    }

    @And("validar la estandarizacion del popup {string}")
    public void validarLaEstandarizacionDelPopup(String repre) {
        titulos.validarTituloRepresentante(repre);
    }

    @And("visualizar el popup {string}")
    public void visualizarElPopup(String popup) {
        titulos.validarTituloDetalle(popup);
    }

    @And("click en la cabecera de la grilla ver detalle o eliminar")
    public void clickEnLaCabeceraDeLaGrillaVerDetalleOEliminar() {
        rehabilitacion.clickCabeceraDeLaGrilla();
    }

    @And("ingresar un numero de vuelo {string}")
    public void ingresarUnNumeroDeVuelo(String vuelo) {
        rehabilitacion.ingresarNumeroVueloBpSalida(vuelo);
    }

    @And("ingresar una fecha de vuelo {string}")
    public void ingresarUnaFechaDeVuelo(String fechavuelo) {
        rehabilitacion.ingresarFechaVuelo(fechavuelo);
        rehabilitacion.darClickCalendarioBpSalida();
    }
}
