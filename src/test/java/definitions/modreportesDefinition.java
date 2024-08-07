package definitions;

import io.cucumber.java.en.And;
import pageobject.*;

/**
 * Clase modreportesDefinition que contiene los metodos de los pasos a seguir para el modulo de reportes
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class modreportesDefinition {
    menuPage menu;
    titulosPage titulos;
    pdfPage pdf;
    imprimirPage imprimir;
    resumenPage resumen;
    modreportesPage reportes;
    public modreportesDefinition() {
        menu = new menuPage();
        titulos = new titulosPage();
        pdf = new pdfPage();
        imprimir = new imprimirPage();
        resumen = new resumenPage();
        reportes = new modreportesPage();
    }

    @And("ingresar al modulo reportes")
    public void ingresarAlModuloReportes() {
        menu.validarModReportes();
    }

    @And("visualizar la opcion liquidacion stickers")
    public void visualizarLaOpcionLiquidacionStickers() {
        reportes.ingresarOpcionLiquidacionStickers();
    }

    @And("visualizar la opcion resumen diario")
    public void visualizarLaOpcionResumenDiario() {
        reportes.ingresarOpcionResumenDiario();
    }

    @And("visualizar la opcion movimiento tickets contingencia")
    public void visualizarLaOpcionMovimientoTicketsContingencia() {
        reportes.ingresarOpcionMovimientoTicketContingencia();
    }

    @And("visualizar la opcion stock tickets contingencia")
    public void visualizarLaOpcionStockTicketsContingencia() {
        reportes.ingresarOpcionStockTicketContingencia();
    }

    @And("visualizar la opcion detalle por linea de vuelo")
    public void visualizarLaOpcionDetallePorLineaDeVuelo() {
        reportes.ingresarOpcionDetalleLineaVuelo();
    }

    @And("visualizar la opcion bp leidos en el molinete")
    public void visualizarLaOpcionBpLeidosEnElMolinete() {
        reportes.ingresarOpcionBpLeidosMolinete();
    }

    @And("visualizar la opcion tickets vendidos a credito o al contado")
    public void visualizarLaOpcionTicketsVendidosACreditoOAlContado() {
        reportes.ingresarOpcionTicketVendidosCreditoContado();
    }

    @And("visualizar la opcion detalle compania")
    public void visualizarLaOpcionDetalleCompania() {
        reportes.ingresarOpcionDetalleCompania();
    }

    @And("visualizar la opcion ticket bp usados por media hora hora dia o mes")
    public void visualizarLaOpcionTicketBpUsadosPorMediaHoraHoraDiaOMes() {
        reportes.ingresarOpcionTicketBpUsadoDiaMesHora();
    }

    @And("visualizar la opcion tickets bp usados por dia mes")
    public void visualizarLaOpcionTicketsBpUsadosPorDiaMes() {
        reportes.ingresarOpcionTicketBpUsadoDiaMes();
    }

    @And("visualizar la opcion liquidacion venta")
    public void visualizarLaOpcionLiquidacionVenta() {
        reportes.ingresarOpcionLiquidacionVenta();
    }

    @And("visualizar la opcion tickets vencidos")
    public void visualizarLaOpcionTicketsVencidos() {
        reportes.ingresarOpcionTicketVencidos();
    }

    @And("visualizar la opcion cuadre stickers vendidos bp usados")
    public void visualizarLaOpcionCuadreStickersVendidosBpUsados() {
        reportes.ingresarOpcionCuadreStickersVendidosBpUsados();
    }

    @And("visualizar la opcion ticket bp rehabilitados")
    public void visualizarLaOpcionTicketBpRehabilitados() {
        reportes.ingresarOpcionTicketBpRehabilitados();
    }

    @And("visualizar la opcion bp rehabilitados")
    public void visualizarLaOpcionBpRehabilitados() {
        reportes.ingresarOpcionBpRehabilitados();
    }

    @And("visualizar la opcion resumen diario por turno")
    public void visualizarLaOpcionResumenDiarioPorTurno() {
        reportes.ingresarOpcionResumenDiarioTurno();
    }

    @And("visualizar la opcion extranet bp diarios usados rehabilitados")
    public void visualizarLaOpcionExtranetBpDiariosUsadosRehabilitados() {
        reportes.ingresarOpcionExtranetBpDiario();
    }

    @And("visualizar la opcion extranet bp mensual usados rehabilitados")
    public void visualizarLaOpcionExtranetBpMensualUsadosRehabilitados() {
        reportes.ingresarOpcionExtranetBpMensual();
    }

    @And("ingresar a la opcion liquidacion stickers")
    public void ingresarALaOpcionLiquidacionStickers() {
        reportes.ingresarOpcionLiquidacionStickers();
    }

    @And("visualizar pantalla de {string}")
    public void visualizarPantallaDe(String titulo) {
        titulos.validarTitulo(titulo);
    }

    @And("visualizar reporte de {string}")
    public void visualizarReporteDe(String reporte) {
        titulos.validarTitulo(reporte);
    }

    @And("click en el boton pdf")
    public void clickEnElBotonPdf() throws InterruptedException {
        pdf.clickBotonPdf();
    }

    @And("ingresar a la opcion resumen diario")
    public void ingresarALaOpcionResumenDiario() {
        reportes.ingresarOpcionResumenDiario();
    }

    @And("seleccionar fecha")
    public void seleccionarFecha() {
        reportes.seleccionarFechaResumenDiario();
    }

    @And("seleccionar rango de fechas")
    public void seleccionarRangoDeFechas() {
        reportes.seleccionarRangoFechaResumenDiario();
    }

    @And("ingresar hora desde {string}")
    public void ingresarHoraDesde(String horadesde) {
        reportes.ingresarHoraDesde(horadesde);
    }

    @And("ingresar hora hasta {string}")
    public void ingresarHoraHasta(String horahasta) {
        reportes.ingresarHoraHasta(horahasta);
    }

    @And("ingresar a la opcion movimiento tickets contingencia")
    public void ingresarALaOpcionMovimientoTicketsContingencia() {
        reportes.ingresarOpcionMovimientoTicketContingencia();
    }

    @And("seleccionar indicador fecha {string}")
    public void seleccionarIndicadorFecha(String indicador) {
        reportes.abrirComboboxIndicadorFecha();
        reportes.seleccionarOpcion(indicador);
    }

    @And("ingresar numero de ticket desde {string}")
    public void ingresarNumeroDeTicketDesde(String ticketdesde) {
        reportes.ingresarTicketDesde(ticketdesde);
    }

    @And("ingresar numero de ticket hasta {string}")
    public void ingresarNumeroDeTicketHasta(String tickethasta) {
        reportes.ingresarTicketHasta(tickethasta);
    }

    @And("click en el boton resumen")
    public void clickEnElBotonResumen() {
        reportes.clickBotonResumne();
    }

    @And("visualizar resumen {string}")
    public void visualizarResumen(String validar) {
        resumen.validarResumen(validar);
    }

    @And("ingresar tipo ticket {string}")
    public void ingresarTipoTicket(String tipoticket) {
        reportes.abrirComboboxTipoTicket();
        reportes.seleccionarOpcion(tipoticket);
    }

    @And("ingresar a la opcion stock tickets contingencia")
    public void ingresarALaOpcionStockTicketsContingencia() {
        reportes.ingresarOpcionStockTicketContingencia();
    }

    @And("ingresar fecha al {string}")
    public void ingresarFechaAl(String fechaal) {
        reportes.ingresarFechaAl(fechaal);
    }

    @And("ingresar a la opcion detalle por linea de vuelo")
    public void ingresarALaOpcionDetallePorLineaDeVuelo() {
        reportes.ingresarOpcionDetalleLineaVuelo();
    }

    @And("ingresar a la opcion bp leidos en el molinete")
    public void ingresarALaOpcionBpLeidosEnElMolinete() {
        reportes.ingresarOpcionBpLeidosMolinete();
    }

    @And("seleccionar fecha de vuelo {string}")
    public void seleccionarFechaDeVuelo(String fechavuelo) {
        reportes.seleccionarFechaVuelo(fechavuelo);
    }

    @And("ingresar numero de boarding {string}")
    public void ingresarNumeroDeBoarding(String numeroboarding) {
        reportes.ingresarNumeroBoarding(numeroboarding);
    }

    @And("ingresar a la opcion tickets vendidos al credito o al contado")
    public void ingresarALaOpcionTicketsVendidosAlCreditoOAlContado() {
        reportes.ingresarOpcionTicketVendidosCreditoContado();
    }

    @And("ingresar aerolinea {string}")
    public void ingresarAerolinea(String aerolinea) {
        reportes.abriComboboxCompania();
        reportes.seleccionarOpcion(aerolinea);
    }

    @And("seleccionar tipo de pago {string}")
    public void seleccionarTipoDePago(String tipopago) {
        reportes.abriComboboxTipoPago();
        reportes.seleccionarOpcion(tipopago);
    }

    @And("ingresar a la opcion detalle compania")
    public void ingresarALaOpcionDetalleCompania() {
        reportes.ingresarOpcionDetalleCompania();
    }

    @And("ingresar a la opcion tickets bp usados por media hora, hora, dia o mes")
    public void ingresarALaOpcionTicketsBpUsadosPorMediaHoraHoraDiaOMes() {
        reportes.ingresarOpcionTicketBpUsadoDiaMesHora();
    }

    @And("ingresar destino {string}")
    public void ingresarDestino(String destino) {
        reportes.ingresarDestino(destino);
    }

    @And("seleccionar tipo rango {string}")
    public void seleccionarTipoRango(String tiporango) {
        reportes.abriComboboxTipoRango();
        reportes.seleccionarOpcion(tiporango);
    }

    @And("seleccionar tipo de documento boarding {string}")
    public void seleccionarTipoDeDocumentoBoarding(String boarding) {
        reportes.seleccionarTipoDocumentoBoarding(boarding);
    }

    @And("seleccionar tipo de documento ticket {string}")
    public void seleccionarTipoDeDocumentoTicket(String ticket) {
        reportes.seleccionarTipoDocumentoTicket(ticket);
    }

    @And("ingreser numero vuelo {string}")
    public void ingreserNumeroVuelo(String vuelo) {
        reportes.ingresarNumeroVuelo(vuelo);
    }

    @And("ingresar a la opcion tickets bp usados por dia mes")
    public void ingresarALaOpcionTicketsBpUsadosPorDiaMes() {
        reportes.ingresarOpcionTicketBpUsadoDiaMes();
    }

    @And("ingresar a la opcion recaudacion mensual")
    public void ingresarALaOpcionRecaudacionMensual() {
        reportes.ingresarOpcionRecaudacionMensual();
    }

    @And("ingresar a la opcion liquidacion venta")
    public void ingresarALaOpcionLiquidacionVenta() {
        reportes.ingresarOpcionLiquidacionVenta();
    }

    @And("ingresar a la opcion tickets vencidos")
    public void ingresarALaOpcionTicketsVencidos() {
        reportes.ingresarOpcionTicketVencidos();
    }

    @And("ingresar a la opcion cuadre stickers vendidos-bp usados")
    public void ingresarALaOpcionCuadreStickersVendidosBpUsados() {
        reportes.ingresarOpcionCuadreStickersVendidosBpUsados();
    }

    @And("ingresar a la opcion ticket bp rehabilitados")
    public void ingresarALaOpcionTicketBpRehabilitados() {
        reportes.ingresarOpcionTicketBpRehabilitados();
    }

    @And("ingresar a la opcion bp rehabilitados")
    public void ingresarALaOpcionBpRehabilitados() {
        reportes.ingresarOpcionBpRehabilitados();
    }

    @And("ingresar a la opcion resumen diario por turno")
    public void ingresarALaOpcionResumenDiarioPorTurno() {
        reportes.ingresarOpcionResumenDiarioTurno();
    }

    @And("ingresar a la opcion extranet bp diarios usados rehabilitados")
    public void ingresarALaOpcionExtranetBpDiariosUsadosRehabilitados() {
        reportes.ingresarOpcionExtranetBpDiario();
    }

    @And("ingresar a la opcion extranet bp mensual usados rehabilitados")
    public void ingresarALaOpcionExtranetBpMensualUsadosRehabilitados() {
        reportes.ingresarOpcionExtranetBpMensual();
    }

    @And("ingresar anio {string}")
    public void ingresarAnio(String anio) {
        reportes.ingresarAnio(anio);
    }

    @And("seleccionar motivo de rehabilitacion {string}")
    public void seleccionarMotivoDeRehabilitacion(String motivo) {
        reportes.abriComboboxMotivoRehabilitacion();
        reportes.seleccionarOpcion(motivo);
    }

    @And("seleccionar tipo vuelo {string}")
    public void seleccionarTipoVuelo(String tipovuelo) {
        reportes.abrirComboboxTipoVuelo();
        reportes.seleccionarOpcion(tipovuelo);
    }

    @And("seleccionar tipo persona {string}")
    public void seleccionarTipoPersona(String tipopersona) {
        reportes.abrirComboboxTipoPersona();
        reportes.seleccionarOpcion(tipopersona);
    }

    @And("seleccionar turno")
    public void seleccionarTurno() {
        reportes.seleccionarTurno();
    }

    @And("seleccionar rango de turnos")
    public void seleccionarRangoDeTurnos() {
        reportes.seleccionarRangoTurno();
    }

    @And("ingresar codigo de turno desde {string}")
    public void ingresarCodigoDeTurnoDesde(String turnodesde) {
        reportes.ingresarTurnoDesde(turnodesde);
    }

    @And("ingresar codigo de turno hasta {string}")
    public void ingresarCodigoDeTurnoHasta(String turnohasta) {
        reportes.ingresarTurnoHasta(turnohasta);
    }

    @And("seleccionar tipo transbordo {string}")
    public void seleccionarTipoTransbordo(String tipotransbordo) {
        reportes.abrirComboboxTipoTransbordo();
        reportes.seleccionarOpcion(tipotransbordo);
    }

    @And("visualizar boarding pass usados")
    public void visualizarBoardingPassUsados() {
        reportes.ingresarPestanaBoardingPassUsados();
    }

    @And("visualizar boarding pass rehabilitados")
    public void visualizarBoardingPassRehabilitados() {
        reportes.ingresarPestanaBoardingPassRehabilitados();
    }

    @And("visualizar boarding pass anulados")
    public void visualizarBoardingPassAnulados() {
        reportes.ingresarPestanaBoardingPassAnulados();
    }

    @And("visualizar resumen boarding neto")
    public void visualizarResumenBoardingNeto() {
        reportes.ingresarPestanaBoardingPassNeto();
    }

    @And("seleccionar fecha de uso")
    public void seleccionarFechaDeUso() {
        reportes.seleccionarTurno();
    }

    @And("seleccionar mes de uso")
    public void seleccionarMesDeUso() {
        reportes.seleccionarRangoTurno();
    }

    @And("ingreser numero de vuelo {string}")
    public void ingreserNumeroDeVuelo(String vuelob) {
        reportes.ingresarNumeroVueloB(vuelob);
    }

    @And("ingresar el destino {string}")
    public void ingresarElDestino(String destinob) {
        reportes.ingresarDestinoB(destinob);
    }

    @And("seleccionar mes de uso {string}")
    public void seleccionarMesDeUso(String mes) {
        reportes.ingresarMesUso(mes);
    }

    @And("click en el boton imprimir resumen")
    public void clickEnElBotonImprimirResumen() {
        imprimir.clickBotonImprimirResumen();
    }

    @And("validar el {string}")
    public void validarEl(String registros) {
        reportes.validarTotalRegistrosLabel(registros);
    }

    @And("ingresar a la opcion busqueda pasajero fiscalia")
    public void ingresarALaOpcionBusquedaPasajeroFiscalia() {
        reportes.ingresarOpcionPasajeroFiscalia();
    }

    @And("ingreser el numero de vuelo {string}")
    public void ingreserElNumeroDeVuelo(String vuelo) {
        reportes.ingresarNumeroVueloC(vuelo);
    }
}
