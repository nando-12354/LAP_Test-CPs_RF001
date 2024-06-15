package definitions;

import io.cucumber.java.en.And;
import pageobject.menuPage;
import pageobject.modconsultasPage;
import pageobject.titulosPage;

public class modconsultasDefinition {
    menuPage menu;
    titulosPage titulos;
    modconsultasPage consultas;
    public modconsultasDefinition() {
        menu = new menuPage();
        titulos = new titulosPage();
        consultas = new modconsultasPage();
    }

    @And("ingresar al modulo consultas")
    public void ingresarAlModuloConsultas() {
        menu.validarModConsultas();
    }

    @And("visualizar la opcion usuario")
    public void visualizarLaOpcionUsuario() {
        consultas.ingresarOpcionUsuarios();
    }

    @And("visualizar la opcion companias")
    public void visualizarLaOpcionCompanias() {
        consultas.ingresarOpcionCompanias();
    }

    @And("visualizar la option turnos")
    public void visualizarLaOptionTurnos() {
        consultas.ingresarOpcionTurnos();
    }

    @And("visualizar la opcion detalle de ticket bp")
    public void visualizarLaOpcionDetalleDeTicketBp() {
        consultas.ingresarOpcionDetalleTicketBp();
    }

    @And("visualizar la opcion tickets bp por fecha")
    public void visualizarLaOpcionTicketsBpPorFecha() {
        consultas.ingresarOpcionTicketBpFecha();
    }

    @And("visualizar la opcion cuadre de stickers emitidos o bp usados")
    public void visualizarLaOpcionCuadreDeStickersEmitidosOBpUsados() {
        consultas.ingresarOpcionCuadreTicketBp();
    }

    @And("visualizar la opcion operacion compra venta")
    public void visualizarLaOpcionOperacionCompraVenta() {
        consultas.ingresarOpcionOperacionCompraVenta();
    }

    @And("visualizar la opcion tickets bp usados")
    public void visualizarLaOpcionTicketsBpUsados() {
        consultas.ingresarOpcionTicketBpUsados();
    }

    @And("visualizar la opcion tickets bp anulados")
    public void visualizarLaOpcionTicketsBpAnulados() {
        consultas.ingresarOpcionTicketBpAnulados();
    }

    @And("visualizar la opcion auditoria")
    public void visualizarLaOpcionAuditoria() {
        consultas.ingresarOpcionAuditoria();
    }

    @And("visualizar la opcion tickets procesados")
    public void visualizarLaOpcionTicketsProcesados() {
        consultas.ingresarOpcionTicketsProcesados();
    }

    @And("visualizar la opcion log de errores de molinetes")
    public void visualizarLaOpcionLogDeErroresDeMolinetes() {
        consultas.ingresarOpcionLogErrores();
    }

    @And("visualizar la opcion sincronizacion")
    public void visualizarLaOpcionSincronizacion() {
        consultas.ingresarOpcionSincronizacion();
    }

    @And("visualizar la opcion transaccion critica")
    public void visualizarLaOpcionTransaccionCritica() {
        consultas.ingresarOpcionTransaccionCritica();
    }

    @And("visualizar la opcion depuracion")
    public void visualizarLaOpcionDepuracion() {
        consultas.ingresarOpcionDepuracion();
    }

    @And("ingresar a la opcion usuarios")
    public void ingresarALaOpcionUsuarios() {
        consultas.ingresarOpcionUsuarios();
    }

    @And("seleccionar rol {string}")
    public void seleccionarRol(String rol) {
        consultas.abrirComboRol();
        consultas.seleccionarRol(rol);
    }

    @And("seleccionar estado {string}")
    public void seleccionarEstado(String estado) {
        consultas.abrirComboEstado();
        consultas.seleccionarEstado(estado);
    }

    @And("seleccionar grupo {string}")
    public void seleccionarGrupo(String grupo) {
        consultas.abrirComboGrupo();
        consultas.seleccionarGrupo(grupo);
    }

    @And("ingresar a la opcion companias")
    public void ingresarALaOpcionCompanias() {
        consultas.ingresarOpcionCompanias();
    }

    @And("ingresar a la opcion turnos")
    public void ingresarALaOpcionTurnos() {
        consultas.ingresarOpcionTurnos();
    }

    @And("seleccionar usuario {string}")
    public void seleccionarUsuario(String usuario) {
        consultas.abrirComboUsuario();
        consultas.seleccionarUsuario(usuario);
    }

    @And("ingresar numero de caja {string}")
    public void ingresarNumeroDeCaja(String caja) {

    }

    @And("click en el registro de detalle del turno")
    public void clickEnElRegistroDeDetalleDelTurno() {
        consultas.clickBotonTablas();
    }

    @And("ingresar a la opcion detalle de ticket bp")
    public void ingresarALaOpcionDetalleDeTicketBp() {
        consultas.ingresarOpcionDetalleTicketBp();
    }

    @And("seleccionar por numero de ticket")
    public void seleccionarPorNumeroDeTicket() {
        consultas.clickPorNumeroTicket();
    }

    @And("seleccionar por rango de ticket")
    public void seleccionarPorRangoDeTicket() {
        consultas.clickPorRangoTicket();
    }

    @And("seleccionar por boarding")
    public void seleccionarPorBoarding() {
        consultas.clickPorBoarding();
    }

    @And("ingresar a la opcion tickets bp por fecha")
    public void ingresarALaOpcionTicketsBpPorFecha() {
        consultas.ingresarOpcionTicketBpFecha();
    }

    @And("seleccionar tipo de documento {string}")
    public void seleccionarTipoDeDocumento(String documento) {
        consultas.abrirComboTipoDocumento();
        consultas.seleccionarTipoDocumento(documento);
    }

    @And("seleccionar tipo de ticket {string}")
    public void seleccionarTipoDeTicket(String tipoticket) {
        consultas.abrirComboTipoTicket();
        consultas.seleccionarTipoTicket(tipoticket);
    }

    @And("seleccionar indicador de cobro {string}")
    public void seleccionarIndicadorDeCobro(String indicador) {
        consultas.abrirComboIndicadorCobro();
        consultas.seleccionarIndicadorCobro(indicador);
    }

    @And("seleccionar tipo de persona {string}")
    public void seleccionarTipoDePersona(String tipopersona) {
        consultas.abrirComboTipoPersona();
        consultas.seleccionarTipoPersona(tipopersona);
    }

    @And("seleccionar tipo de vuelo {string}")
    public void seleccionarTipoDeVuelo(String tipovuelo) {
        consultas.abrirComboTipoVuelo();
        consultas.seleccionarTipoVuelo(tipovuelo);
    }

    @And("seleccionar estado turno {string}")
    public void seleccionarEstadoTurno(String estadoturno) {
        consultas.abrirComboEstado();
        consultas.seleccionarEstadoTurno(estadoturno);
    }

    @And("seleccionar cajero {string}")
    public void seleccionarCajero(String cajero) {
        consultas.abrirComboCajero();
        consultas.seleccionarCajero(cajero);
    }

    @And("ingresar a la opcion cuadre de stickers emitidos o bp usados")
    public void ingresarALaOpcionCuadreDeStickersEmitidosOBpUsados() {
        consultas.ingresarOpcionCuadreTicketBp();
    }

    @And("visualizar informacion de {string}")
    public void visualizarInformacionDe(String titulo) {
        titulos.validarTitulo(titulo);
    }

    @And("ingresar a la opcion operacion compra venta")
    public void ingresarALaOpcionOperacionCompraVenta() {
        consultas.ingresarOpcionOperacionCompraVenta();
    }

    @And("ingresar fecha de proceso {string}")
    public void ingresarFechaDeProceso(String fechaproceso) {
        consultas.ingresarFechaProceso(fechaproceso);
    }

    @And("visualizar operacion compra")
    public void visualizarOperacionCompra() {
        consultas.clickRadioBotonCompra();
    }

    @And("visualizar operacion venta")
    public void visualizarOperacionVenta() {
        consultas.clickRadioBotonCVenta();
    }

    @And("ingresar a la opcion tickets bp usados")
    public void ingresarALaOpcionTicketsBpUsados() {
        consultas.ingresarOpcionTicketBpUsados();
    }

    @And("seleccionar tipo de transbordo {string}")
    public void seleccionarTipoDeTransbordo(String transbordo) {
        consultas.abrirComboTipoTransbordo();
        consultas.seleccionarTipoTransbordo(transbordo);
    }

    @And("ingresar a la opcion auditoria")
    public void ingresarALaOpcionAuditoria() {
        consultas.ingresarOpcionAuditoria();
    }

    @And("seleccionar operacion {string}")
    public void seleccionarOperacion(String operacion) {
        consultas.abrirComboOperacion();
        consultas.seleccionarOperacion(operacion);
    }

    @And("seleccionar tabla {string}")
    public void seleccionarTabla(String tabla) {
        consultas.abrirComboTabla();
        consultas.seleccionarTabla(tabla);
    }

    @And("seleccionar modulo {string}")
    public void seleccionarModulo(String modulo) {
        consultas.abrirComboModulo();
        consultas.seleccionarModulo(modulo);
    }

    @And("seleccionar submodulo {string}")
    public void seleccionarSubmodulo(String submodulo) {
        consultas.abrirComboSubModulo();
        consultas.seleccionarSubModulo(submodulo);
    }

    @And("ingresar a la opcion tickets procesados")
    public void ingresarALaOpcionTicketsProcesados() {
        consultas.ingresarOpcionTicketsProcesados();
    }

    @And("ingresar codigo de turno {string}")
    public void ingresarCodigoDeTurno(String codigoturno) {
        consultas.ingresarCodigoTurno(codigoturno);
    }

    @And("ingresar a la opcion log de errores de molinetes")
    public void ingresarALaOpcionLogDeErroresDeMolinetes() {
        consultas.ingresarOpcionLogErrores();
    }

    @And("seleccionar tipo error {string}")
    public void seleccionarTipoError(String tipoerror) {
        consultas.abrirComboTipoError();
        consultas.seleccionarTipoError(tipoerror);
    }

    @And("seleccionar error {string}")
    public void seleccionarError(String error) {
        consultas.abrirComboError();
        consultas.seleccionarError(error);
    }

    @And("seleccionar molinete {string}")
    public void seleccionarMolinete(String molinete) {
        consultas.abrirComboMolineteError();
        consultas.seleccionarMolineteError(molinete);
    }

    @And("seleccionar tipo bp {string}")
    public void seleccionarTipoBp(String tipobp) {
        consultas.abrirComboTipoBoarding();
        consultas.seleccionarTipoBoarding(tipobp);
    }

    @And("seleccionar tipo ingreso {string}")
    public void seleccionarTipoIngreso(String tipoingreso) {
        consultas.abrirComboTipoIngredoError();
        consultas.seleccionarTipoIngresoError(tipoingreso);
    }

    @And("ingresar a la opcion transaccion critica")
    public void ingresarALaOpcionTransaccionCritica() {
        consultas.ingresarOpcionTransaccionCritica();
    }

    @And("ingresar a la opcion depuracion")
    public void ingresarALaOpcionDepuracion() {
        consultas.ingresarOpcionDepuracion();
    }

    @And("ingresar a la opcion sincronizacion")
    public void ingresarALaOpcionSincronizacion() {
        consultas.ingresarOpcionSincronizacion();
    }

    @And("seleccionar tabla de sincronizacion {string}")
    public void seleccionarTablaDeSincronizacion(String tabla) {
        consultas.abrirComboTablaSincronizacion();
        consultas.seleccionarTablaSincronizacion(tabla);
    }

    @And("seleccionar tipo de sincronizacion {string}")
    public void seleccionarTipoDeSincronizacion(String tipo) {
        consultas.abrirComboTipoSincronizacion();
        consultas.seleccionarTipoSincronizacion(tipo);
    }
}
