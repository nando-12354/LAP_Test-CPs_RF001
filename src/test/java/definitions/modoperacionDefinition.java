package definitions;

import io.cucumber.java.en.And;
import pageobject.*;

public class modoperacionDefinition {
    menuPage menu;
    titulosPage titulos;
    comboboxPage combobox;
    alertasPage alertas;
    headPage head;
    botonPage boton;
    modoperacionPage operacion;
    public modoperacionDefinition() {
        menu = new menuPage();
        titulos = new titulosPage();
        combobox = new comboboxPage();
        alertas = new alertasPage();
        head = new headPage();
        boton = new botonPage();
        operacion = new modoperacionPage();
    }

    @And("ingresar al modulo operacion")
    public void ingresarAlModuloOperacion() {
        menu.validarModOperacion();
    }

    @And("visualizar la opcion ingresar tasa de cambio")
    public void visualizarLaOpcionIngresarTasaDeCambio() {
        operacion.ingresarOpcionTasaCambio();
    }

    @And("visualizar la opcion gestion precio ticket")
    public void visualizarLaOpcionGestionPrecioTicket() {
        operacion.ingresarOpcionGestionPrecioTicket();
    }

    @And("visualizar la opcion gestion tickets contingencia")
    public void visualizarLaOpcionGestionTicketsContingencia() {
        operacion.ingresarOpcionGestionTicketContingencia();
        operacion.ingresarSubOpcionPreTicketContingencia();
        operacion.ingresarSubOpcionTicketContingencia();
    }

    @And("visualizar la opcion extorno")
    public void visualizarLaOpcionExtorno() {
        operacion.ingresarOpcionExtorno();
        operacion.ingresarSubOpcionExtornoOperacion();
        operacion.ingresarSubOpcionExtornoTicket();
        operacion.ingresarSubOpcionExtornoRehabilitacion();
    }

    @And("visualizar la opcion anulacion")
    public void visualizarLaOpcionAnulacion() {
        operacion.ingresarOpcionAnulacion();
        operacion.ingresarSubOpcionAnulacionTicket();
        operacion.ingresarSubOpcionAnulacionBcbp();
    }

    @And("visualizar la opcion venta masiva credito")
    public void visualizarLaOpcionVentaMasivaCredito() {
        operacion.ingresarOpcionVentanMasivaCredito();
    }

    @And("visualizar la opcion extension fecha vigencia tickets")
    public void visualizarLaOpcionExtensionFechaVigenciaTickets() {
        operacion.ingresarOpcionExtensionFechaVigencia();
    }

    @And("visualizar la opcion gestion molinete")
    public void visualizarLaOpcionGestionMolinete() {
        operacion.ingresarOpcionGestionMolinete();
    }

    @And("visualizar la opcion generacion archivo venta")
    public void visualizarLaOpcionGeneracionArchivoVenta() {
        operacion.ingresarOpcionGeneracionArchivoVenta();
    }

    @And("visualizar la opcion cerrar turno")
    public void visualizarLaOpcionCerrarTurno() {
        operacion.ingresarOpcionCerrarTurno();
    }

    @And("visualizar la opcion generacion archivo seae")
    public void visualizarLaOpcionGeneracionArchivoSeae() {
        operacion.ingresarOpcionGeneracionArchivoSeae();
    }

    @And("ingresar a la opcion ingresar tasa de cambio")
    public void ingresarALaOpcionIngresarTasaDeCambio() {
        operacion.ingresarOpcionTasaCambio();
    }

    @And("visualizar tasa de cambio actual")
    public void visualizarTasaDeCambioActual() {
        operacion.clickTasaCambioActual();
    }

    @And("visualizar tasa de cambio programada")
    public void visualizarTasaDeCambioProgramada() {
        operacion.clickTasaCambioProgramada();
    }

    @And("visualizar tasa de cambio historica")
    public void visualizarTasaDeCambioHistorica() {
        operacion.clickTasaCambioHistorica();
    }

    @And("seleccionar fecha actual")
    public void seleccionarFechaActual() {
        operacion.clickTasaCambioActual();
    }

    @And("seleccionar tasas de cambio compra {string}")
    public void seleccionarTasasDeCambioCompra(String compra) {
        operacion.seleccionarCompraA(compra);
        operacion.seleccionarCompraB(compra);
        operacion.seleccionarCompraC(compra);
        operacion.seleccionarCompraD(compra);
        operacion.seleccionarCompraE(compra);
    }

    @And("seleccionar tasas de cambio venta {string}")
    public void seleccionarTasasDeCambioVenta(String venta) {
        operacion.seleccionarVentaA(venta);
        operacion.seleccionarVentaB(venta);
        operacion.seleccionarVentaC(venta);
        operacion.seleccionarVentaD(venta);
        operacion.seleccionarVentaE(venta);
    }

    @And("ingresar tasa de cambio compra {string}")
    public void ingresarTasaDeCambioCompra(String tasacompra) {
        operacion.ingresarTasaCambioCompra(tasacompra);
    }

    @And("ingresar tasa de cambio venta {string}")
    public void ingresarTasaDeCambioVenta(String tasaventa) {
        operacion.ingresarTasaCambioVenta(tasaventa);
    }

    @And("seleccionar fecha programada")
    public void seleccionarFechaProgramada() {
        operacion.clickTasaCambioProgramada();
    }

    @And("ingresar fecha a programar {string}")
    public void ingresarFechaAProgramar(String fechaprogramada) {
        operacion.ingresarFechaProgramada(fechaprogramada);

    }

    @And("ingresar hora a programar {string}")
    public void ingresarHoraAProgramar(String horaprogramada) {
        operacion.ingresarHoraPagramada(horaprogramada);
    }

    @And("seleccionar tasa de cambio programada")
    public void seleccionarTasaDeCambioProgramada() {
        operacion.clickTasaCambioProgramada();
    }

    @And("eliminar tasa de cambio programada")
    public void eliminarTasaDeCambioProgramada() {
        boton.clickBotonEliminarB();
    }

    @And("seleccionar tasa de cambio historica")
    public void seleccionarTasaDeCambioHistorica() {
        operacion.clickTasaCambioHistorica();
    }

    @And("seleccionar tipo de operacion {string}")
    public void seleccionarTipoDeOperacion(String tipooperacion) {
        combobox.abrirComboboxTipoOperacionTasaCambio();
        combobox.seleccionarOpcion(tipooperacion);
    }

    @And("seleccionar fecha desde {string}")
    public void seleccionarFechaDesde(String fechadesde) {
        operacion.seleccionarFechaDesde(fechadesde);
    }

    @And("seleccionar fecha hasta {string}")
    public void seleccionarFechaHasta(String fechahasta) {
        operacion.seleccionarFechaHasta(fechahasta);
    }

    @And("ingresar a la opcion gestion precio ticket")
    public void ingresarALaOpcionGestionPrecioTicket() {
        operacion.ingresarOpcionGestionPrecioTicket();
    }

    @And("visualizar precio tickets actual")
    public void visualizarPrecioTicketsActual() {
        operacion.clickTasaCambioActual();
    }

    @And("visualizar precio tickets programada")
    public void visualizarPrecioTicketsProgramada() {
        operacion.clickTasaCambioProgramada();
    }

    @And("visualizar precio tickets historica")
    public void visualizarPrecioTicketsHistorica() {
        operacion.clickTasaCambioHistorica();
    }

    @And("seleccionar monedas {string}")
    public void seleccionarMonedas(String moneda) {
        operacion.seleccionarMonedaA(moneda);
        operacion.seleccionarMonedaB(moneda);
        operacion.seleccionarMonedaC(moneda);
    }

    @And("seleccionar precio de venta {string}")
    public void seleccionarPrecioDeVenta(String precio) {
        operacion.seleccionarMonedaVentaA(precio);
        operacion.seleccionarMonedaVentaB(precio);
        operacion.seleccionarMonedaVentaC(precio);
    }

    @And("ingresar precio de venta {string}")
    public void ingresarPrecioDeVenta(String precioventa) {
        operacion.ingresarPrecioVenta(precioventa);
    }

    @And("seleccionar codigo moneda {string}")
    public void seleccionarCodigoMoneda(String codigomoneda) {
        operacion.seleccionarCodigoMonedaA(codigomoneda);
        operacion.seleccionarCodigoMonedaB(codigomoneda);
        operacion.seleccionarCodigoMonedaC(codigomoneda);
    }

    @And("seleccionar precio tickets programada")
    public void seleccionarPrecioTicketsProgramada() {
        operacion.clickTasaCambioProgramada();
    }

    @And("eliminar precio tickets programada")
    public void eliminarPrecioTicketsProgramada() {
        boton.clickBotonEliminar();
    }

    @And("seleccionar precio tickets historica")
    public void seleccionarPrecioTicketsHistorica() {
        operacion.clickTasaCambioHistorica();
    }

    @And("ingresar a la opcion gestion tickets contingencia")
    public void ingresarALaOpcionGestionTicketsContingencia() {
        operacion.ingresarOpcionGestionTicketContingencia();
    }

    @And("ingresar a la opcion pre emision tickets contingencia")
    public void ingresarALaOpcionPreEmisionTicketsContingencia() {
        operacion.ingresarSubOpcionPreTicketContingencia();
    }

    @And("visualizar tipo de vuelo")
    public void visualizarTipoDeVuelo() {
        operacion.abrirComboboxTipoVuelo();
    }

    @And("visualizar tipo pasajero")
    public void visualizarTipoPasajero() {
        operacion.abrirComboboxTipoPasajero();
    }

    @And("visualizar fecha actual")
    public void visualizarFechaActual() {
    }

    @And("visualizar precio ticket")
    public void visualizarPrecioTicket() {
        operacion.abrirComboboxPrecioTicket();
    }

    @And("visualizar cantidad")
    public void visualizarCantidad() {
    }

    @And("ingresar tipo de vuelo {string}")
    public void ingresarTipoDeVuelo(String tipovuelo) {
        operacion.abrirComboboxTipoVuelo();
        operacion.seleccionarOpcion(tipovuelo);
    }

    @And("ingresar tipo de transbordo {string}")
    public void ingresarTipoDeTransbordo(String tipotransbordo) {
        operacion.abrirComboboxTipoTransbordo();
        operacion.seleccionarOpcion(tipotransbordo);
    }

    @And("ingresar precio ticket {string}")
    public void ingresarPrecioTicket(String precioticket) {
        operacion.abrirComboboxPrecioTicket();
        operacion.seleccionarOpcion(precioticket);
    }

    @And("ingresar tipo de pasajero {string}")
    public void ingresarTipoDePasajero(String tipopasajero) {
        operacion.abrirComboboxTipoPasajero();
        operacion.seleccionarOpcion(tipopasajero);
    }

    @And("ingresar cantidad {string}")
    public void ingresarCantidad(String cantidad) {
        operacion.ingresarCantidad(cantidad);
    }

    @And("click en el boton generar")
    public void clickEnElBotonGenerar() {
        boton.clickBotonGenerar();
    }

    @And("ingresar a la opcion registro tickets contingencia")
    public void ingresarALaOpcionRegistroTicketsContingencia() {
        operacion.ingresarSubOpcionTicketContingencia();
    }

    @And("visualizar {string}")
    public void visualizar(String titulo) {
        operacion.validarTitulo(titulo);
    }

    @And("filtrar usuario {string}")
    public void filtrarUsuario(String usuario) {
        operacion.abrirComboboxFiltroUsuario();
        operacion.seleccionarOpcion(usuario);
    }

    @And("filtrar tipo de ticket {string}")
    public void filtrarTipoDeTicket(String tipoticket) {
        operacion.abrirComboboxTipoVuelo();
        operacion.seleccionarOpcion(tipoticket);
    }

    @And("filtrar tipo de pasajero {string}")
    public void filtrarTipoDePasajero(String tipopasajero) {
        operacion.abrirComboboxTipoTransbordo();
        operacion.seleccionarOpcion(tipopasajero);
    }

    @And("ingresar ticket desde {string}")
    public void ingresarTicketDesde(String ticketdesde) {
        operacion.ingresarTicketDesde(ticketdesde);
    }

    @And("ingresar ticket hasta {string}")
    public void ingresarTicketHasta(String tickethasta) {
        operacion.ingresarTicketHasta(tickethasta);
    }

    @And("seleccionar tickets requeridos {string}")
    public void seleccionarTicketsRequeridos(String ticketcontingencia) {
        operacion.seleccionarTicketContingenciaA(ticketcontingencia);
        operacion.seleccionarTicketContingenciaB(ticketcontingencia);
        operacion.seleccionarTicketContingenciaC(ticketcontingencia);
        operacion.seleccionarTicketContingenciaD(ticketcontingencia);
    }

    @And("seleccionar cierre de turno {string}")
    public void seleccionarCierreDeTurno(String cierreturno) {
        operacion.seleccionarCierreTurno(cierreturno);
    }

    @And("ingresar a la opcion extorno")
    public void ingresarALaOpcionExtorno() {
        operacion.ingresarOpcionExtorno();
    }

    @And("ingresar a la opcion extorno operaciones")
    public void ingresarALaOpcionExtornoOperaciones() {
        operacion.ingresarSubOpcionExtornoOperacion();
    }

    @And("filtrar estado turno {string}")
    public void filtrarEstadoTurno(String estadoturno) {
        operacion.abrirComboboxEstadoTurno();
        operacion.seleccionarOpcion(estadoturno);
    }

    @And("filtrar turno {string}")
    public void filtrarTurno(String turno) {
        operacion.ingresarCodigoTurno(turno);
    }

    @And("click en el boton detalle de turno")
    public void clickEnElBotonDetalleDeTurno() {
        operacion.clickBotonVerDetalleTurno();
    }

    @And("seleccionar tipo operacion {string}")
    public void seleccionarTipoOperacion(String tipooeperacion) {
        operacion.abrirComboboxTipoOperacion();
        operacion.seleccionarOpcion(tipooeperacion);
    }

    @And("seleccionar operacion a extornar {string}")
    public void seleccionarOperacionAExtornar(String operacionextorno) {
        operacion.seleccionarTicketContingenciaA(operacionextorno);
    }

    @And("click en el boton extornar")
    public void clickEnElBotonExtornar() {
        boton.clickBotonExtornar();
    }

    @And("ingresar a la opcion extorno tickets")
    public void ingresarALaOpcionExtornoTickets() {
        operacion.ingresarSubOpcionExtornoTicket();
    }

    @And("seleccionar ticket a extornar {string}")
    public void seleccionarTicketAExtornar(String ticketextorno) {
        operacion.seleccionarMonedaA(ticketextorno);
    }

    @And("ingresar el motivo de extorno {string}")
    public void ingresarElMotivoDeExtorno(String motivo) {
        operacion.ingresarMotivoExtorno(motivo);
    }

    @And("ingresar a la opcion extorno rehabilitacion")
    public void ingresarALaOpcionExtornoRehabilitacion() {
        operacion.ingresarSubOpcionExtornoRehabilitacion();
    }

    @And("filtrar ticket {string}")
    public void filtrarTicket(String ticketrehabilitacion) {
        operacion.ingresarTicketRehabilitacion(ticketrehabilitacion);
    }

    @And("seleccionar filtros de consulta")
    public void seleccionarFiltrosDeConsulta() {
        operacion.seleccionarFiltroConsulta();
    }

    @And("filtrar ticket del numero {string}")
    public void filtrarTicketDelNumero(String ticketdel) {
        operacion.ingresarTicketDesdeRehabilitacion(ticketdel);
    }

    @And("filtrar ticket al numero {string}")
    public void filtrarTicketAlNumero(String ticketal) {
        operacion.ingresarTicketHastaRehabilitacion(ticketal);
    }

    @And("seleccionar ticket rehabilitado a extornar {string}")
    public void seleccionarTicketRehabilitadoAExtornar(String ticketrehabilitado) {
        operacion.seleccionarTicketContingenciaA(ticketrehabilitado);
    }

    @And("ingresar a la opcion anulacion")
    public void ingresarALaOpcionAnulacion() {
        operacion.ingresarOpcionAnulacion();
    }

    @And("ingresar a la opcion anulacion de ticket")
    public void ingresarALaOpcionAnulacionDeTicket() {
        operacion.ingresarSubOpcionAnulacionTicket();
    }

    @And("filtrar estado de turno {string}")
    public void filtrarEstadoDeTurno(String turnoanulacion) {
        operacion.abrirComboboxEstadoTurnoAnulacion();
        operacion.seleccionarOpcion(turnoanulacion);
    }

    @And("filtrar tipo ticket {string}")
    public void filtrarTipoTicket(String tipoticketanulacion) {
        operacion.abrirComboboxTipoTicketAnulacion();
        operacion.seleccionarOpcion(tipoticketanulacion);
    }

    @And("seleccionar rango de ticket")
    public void seleccionarRangoDeTicket() {
        operacion.seleccionarRangoTicketAnulacion();
    }

    @And("ingresar ticket del numero {string}")
    public void ingresarTicketDelNumero(String ticketdesde) {
        operacion.ingresarTicketDesdeAnulacion(ticketdesde);
    }

    @And("ingresar ticket al numero {string}")
    public void ingresarTicketAlNumero(String tickethasta) {
        operacion.ingresarTicketHastaAnulacion(tickethasta);
    }

    @And("seleccionar el ticket a anular {string}")
    public void seleccionarElTicketAAnular(String ticketanular) {
        operacion.seleccionarTicketContingenciaA(ticketanular);
    }

    @And("ingresar el motivo de anulacion {string}")
    public void ingresarElMotivoDeAnulacion(String motivoanulacion) {
        operacion.ingresarMotivoAnulacion(motivoanulacion);
    }

    @And("click en el boton anular")
    public void clickEnElBotonAnular() {
        boton.clickBotonAnular();
    }

    @And("ingresar a la opcion anulacion bcbp")
    public void ingresarALaOpcionAnulacionBcbp() {
        operacion.ingresarSubOpcionAnulacionBcbp();
    }

    @And("seleccionar aerolinea {string}")
    public void seleccionarAerolinea(String aerolinea) {
        operacion.abrirComboboxAerolineaBcbp();
        operacion.seleccionarOpcion(aerolinea);
    }

    @And("seleccionar el bcbp a anular {string}")
    public void seleccionarElBcbpAAnular(String bcbpanular) {
        operacion.seleccionarAnulacionBcbpA(bcbpanular);
    }

    @And("ingresar a la opcion venta masiva credito")
    public void ingresarALaOpcionVentaMasivaCredito() {
        operacion.ingresarOpcionVentanMasivaCredito();
    }

    @And("ingresar cantidad para venta {string}")
    public void ingresarCantidadParaVenta(String cantidad) {
        operacion.ingresarCantidadVentaMasiva(cantidad);
    }

    @And("ingresar compania {string}")
    public void ingresarCompania(String compania) {
        operacion.abrirComboboxPrecioTicket();
        operacion.seleccionarOpcion(compania);
    }

    @And("ingresar numero vuelo {string}")
    public void ingresarNumeroVuelo(String numerovuelo) {
        operacion.ingresarNumeroVueloVentaMasiva(numerovuelo);
    }

    @And("seleccionar representante {string}")
    public void seleccionarRepresentante(String representante) {
        operacion.abrirComboboxRepresentanteVentaMasiva();
        operacion.seleccionarOpcion(representante);
    }

    @And("ingresar a la opcion gestion de molinete")
    public void ingresarALaOpcionGestionDeMolinete() {
        operacion.ingresarOpcionGestionMolinete();
    }

    @And("modificar tipo de documento {string}")
    public void modificarTipoDeDocumento(String documento) {
        operacion.abrirComboboxTipoDocumentoGestionMolinete();
        operacion.seleccionarOpcion(documento);
    }

    @And("modificar tipo de vuelo {string}")
    public void modificarTipoDeVuelo(String vuelo) {
        operacion.abrirComboboxTipoVueloGestionMolinete();
        operacion.seleccionarOpcion(vuelo);
    }

    @And("modificar tipo de acceso {string}")
    public void modificarTipoDeAcceso(String acceso) {
        operacion.abrirComboboxTipoAccesoGestionMolinete();
        operacion.seleccionarOpcion(acceso);
    }

    @And("modificar tipo de molinete {string}")
    public void modificarTipoDeMolinete(String molinete) {
        operacion.abrirComboboxTipoMolineteGestionMolinete();
        operacion.seleccionarOpcion(molinete);
    }

    @And("modificar estado {string}")
    public void modificarEstado(String estado) {
        operacion.abrirComboboxEstadoGestionMolinete();
        operacion.seleccionarOpcion(estado);
    }

    @And("modificar descripcion {string}")
    public void modificarDescripcion(String descripcion) {
        operacion.ingresarDescripcionGestionMolinete(descripcion);
    }

    @And("ingresar a la opcion generacion archivo venta")
    public void ingresarALaOpcionGeneracionArchivoVenta() {
        operacion.ingresarOpcionGeneracionArchivoVenta();
    }

    @And("seleccionar formato excel {string}")
    public void seleccionarFormatoExcel(String formato) {
        operacion.abrirComboboxFormatoArchivoVenta();
        operacion.seleccionarOpcion(formato);
    }

    @And("seleccionar archivo a generar {string}")
    public void seleccionarArchivoAGenerar(String archivo) {
        operacion.seleccionarArchivoA(archivo);
        operacion.seleccionarArchivoB(archivo);
        operacion.seleccionarArchivoC(archivo);
    }

    @And("ingresar a la opcion generacion archivo seae")
    public void ingresarALaOpcionGeneracionArchivoSeae() {
        operacion.ingresarOpcionGeneracionArchivoSeae();
    }

    @And("ingresar fecha {string}")
    public void ingresarFecha(String fecha) {
        operacion.ingresarFechaArchivoSeae(fecha);
    }

    @And("seleccionar tipo documento {string}")
    public void seleccionarTipoDocumento(String tipodocumento) {
        operacion.abrirComboboxTipoDocumentoArchivoSeae();
        operacion.seleccionarOpcion(tipodocumento);
    }

    @And("ingresar a la opcion cerrar turno")
    public void ingresarALaOpcionCerrarTurno() {
        operacion.ingresarOpcionCerrarTurno();
    }

    @And("seleccionar turno a cerrar {string}")
    public void seleccionarTurnoACerrar(String cerrarturno) {
        operacion.seleccionarTicketContingenciaA(cerrarturno);
    }

    @And("click en el boton cerrar turno")
    public void clickEnElBotonCerrarTurno() {
        boton.clickBotonCerrarTurno();
    }

    @And("ingresar a la opcion extension fecha vigencia tickets")
    public void ingresarALaOpcionExtensionFechaVigenciaTickets() {
        operacion.ingresarOpcionExtensionFechaVigencia();
    }

    @And("click en el boton extender")
    public void clickEnElBotonExtender() {
        boton.clickBotonExtender();
    }

    @And("ingresar ticket {string}")
    public void ingresarTicket(String ticketextension) {
        operacion.ingresarTicketExtension(ticketextension);
    }

    @And("seleccionar ticket a extender {string}")
    public void seleccionarTicketAExtender(String ticket) {
        operacion.seleccionarTicketExtension(ticket);
    }

    @And("ingresar numero de dias a extender {string}")
    public void ingresarNumeroDeDiasAExtender(String dias) {
        operacion.ingresarDiasExtension(dias);
    }

    @And("validar alerta confirmacion {string}")
    public void validarAlertaConfirmacion(String confirmacion) {
        alertas.validarAlertaConfirmacion(confirmacion);
    }

    @And("seleccionar rango de ticket extension")
    public void seleccionarRangoDeTicketExtension() {
        operacion.seleccionarRangoTicketExtension();
    }

    @And("filtrar ticket desde {string}")
    public void filtrarTicketDesde(String ticketdesde) {
        operacion.ingresarTicketDesdeExtension(ticketdesde);
    }

    @And("filtrar ticket hasta {string}")
    public void filtrarTicketHasta(String tickethasta) {
        operacion.ingresarTicketHastaExtension(tickethasta);
    }

    @And("ingresar hora emision desde {string}")
    public void ingresarHoraEmisionDesde(String horadesde) {
        operacion.ingresarHoraEmisionDesde(horadesde);
    }

    @And("ingresar hora emision hasta {string}")
    public void ingresarHoraEmisionHasta(String horahasta) {
        operacion.ingresarHoraEmisionHasta(horahasta);
    }

    @And("validar columna de moneda {string}")
    public void validarColumnaDeMoneda(String moneda) {
        head.validarCabeceraGrilla(moneda);
    }
}
