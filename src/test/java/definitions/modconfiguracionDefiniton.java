package definitions;

import io.cucumber.java.en.And;
import pageobject.menuPage;
import pageobject.modconfiguracionPage;
import pageobject.titulosPage;

public class modconfiguracionDefiniton {
    menuPage menu;
    titulosPage titulos;
    modconfiguracionPage configuracion;
    public modconfiguracionDefiniton() {
        menu = new menuPage();
        titulos = new titulosPage();
        configuracion = new modconfiguracionPage();
    }

    @And("ingresar al modulo configuracion general")
    public void ingresarAlModuloConfiguracionGeneral() {
        menu.validarModConfgeneral();
    }

    @And("visualizar la opcion parametros generales")
    public void visualizarLaOpcionParametrosGenerales() {
        configuracion.ingresarOpcionParametros();
    }

    @And("visualizar la opcion lista de campos")
    public void visualizarLaOpcionListaDeCampos() {
        configuracion.ingresarOpcionListaCampos();
    }

    @And("ingresar a la opcion parametros generales")
    public void ingresarALaOpcionParametrosGenerales() {
        configuracion.ingresarOpcionParametros();
    }

    @And("ingresar a la opcion lista de campos")
    public void ingresarALaOpcionListaDeCampos() {
        configuracion.ingresarOpcionListaCampos();
    }

    @And("ingresar nombre del campo {string}")
    public void ingresarNombreDelCampo(String nombrecampo) {
        configuracion.ingresarNombreCampo(nombrecampo);
    }

    @And("ingresar codigo del campo asociado {string}")
    public void ingresarCodigoDelCampoAsociado(String codigoasociado) {
        configuracion.ingresarCodigoAsociado(codigoasociado);
    }

    @And("ingresar codigo {string}")
    public void ingresarCodigo(String codigo) {
        configuracion.ingresarCodigo(codigo);
    }

    @And("ingresar descripcion {string}")
    public void ingresarDescripcion(String descripcion) {
        configuracion.ingresarDescripcion(descripcion);
    }

    @And("validar nombre del campo {string}")
    public void validarNombreDelCampo(String valnombrecampo) {
        configuracion.validarNombreCampo(valnombrecampo);
    }

    @And("validar codigo del campo {string}")
    public void validarCodigoDelCampo(String valcodigo) {
        configuracion.validarCodigo(valcodigo);
    }

    @And("validar codigo del campo asociado {string}")
    public void validarCodigoDelCampoAsociado(String valcodigoasociado) {
        configuracion.validarCodigoAsociado(valcodigoasociado);
    }

    @And("editar descripcion del valor {string}")
    public void editarDescripcionDelValor(String editardescripcion) {
        configuracion.ingresarEditarDescripcion(editardescripcion);
    }

    @And("visualizar la {string}")
    public void visualizarLa(String subtitulo) {
        titulos.validarSubTitulo(subtitulo);
    }

    @And("visualizar la configuracion {string}")
    public void visualizarLaConfiguracion(String subtitulo) {
        titulos.validarSubTitulo(subtitulo);
    }

    @And("click en el boton ver configuracion de atributos generales")
    public void clickEnElBotonVerConfiguracionDeAtributosGenerales() {
        configuracion.clickBotonVerConfiguracionA();
    }

    @And("click en el boton ver configuracion de caja tuua")
    public void clickEnElBotonVerConfiguracionDeCajaTuua() {
        configuracion.clickBotonVerConfiguracionB();
    }

    @And("click en el boton ver configuracion comprobante seae")
    public void clickEnElBotonVerConfiguracionComprobanteSeae() {
        configuracion.clickBotonVerConfiguracionC();
    }

    @And("click en el boton ver configuracion de alarmas")
    public void clickEnElBotonVerConfiguracionDeAlarmas() {
        configuracion.clickBotonVerConfiguracionD();
    }

    @And("click en el boton ver configuracion de archivamiento")
    public void clickEnElBotonVerConfiguracionDeArchivamiento() {
        configuracion.clickBotonVerConfiguracionE();
    }

    @And("click en el boton ver configuracion de impresion")
    public void clickEnElBotonVerConfiguracionDeImpresion() {
        configuracion.clickBotonVerConfiguracionF();
    }

    @And("click en el boton ver configuracion de modulo web administrativo")
    public void clickEnElBotonVerConfiguracionDeModuloWebAdministrativo() {
        configuracion.clickBotonVerConfiguracionG();
    }

    @And("click en el boton ver configuracion de rehabilitacion")
    public void clickEnElBotonVerConfiguracionDeRehabilitacion() {
        configuracion.clickBotonVerConfiguracionH();
    }

    @And("click en el boton ver configuracion de seguridad")
    public void clickEnElBotonVerConfiguracionDeSeguridad() {
        configuracion.clickBotonVerConfiguracionI();
    }

    @And("click en el boton ver configuracion de tuua")
    public void clickEnElBotonVerConfiguracionDeTuua() {
        configuracion.clickBotonVerConfiguracionJ();
    }

    @And("click en el boton ver configuracion de estadistico")
    public void clickEnElBotonVerConfiguracionDeEstadistico() {
        configuracion.clickBotonVerConfiguracionK();
    }

    @And("click en el boton ver configuracion de servicio compania")
    public void clickEnElBotonVerConfiguracionDeServicioCompania() {
        configuracion.clickBotonVerConfiguracionL();
    }

    @And("click en el boton ver configuracion de servicio tasa cambio")
    public void clickEnElBotonVerConfiguracionDeServicioTasaCambio() {
        configuracion.clickBotonVerConfiguracionM();
    }

    @And("click en el boton ver configuracion de servicio vencimiento")
    public void clickEnElBotonVerConfiguracionDeServicioVencimiento() {
        configuracion.clickBotonVerConfiguracionN();
    }

    @And("click en el boton ver configuracion de servicio vuelo programado")
    public void clickEnElBotonVerConfiguracionDeServicioVueloProgramado() {
        configuracion.clickBotonVerConfiguracionO();
    }

    @And("click en el boton ver configuracion de servicio vuelo temporada")
    public void clickEnElBotonVerConfiguracionDeServicioVueloTemporada() {
        configuracion.clickBotonVerConfiguracionP();
    }

    @And("click en el boton ver configuracion de servicios generales")
    public void clickEnElBotonVerConfiguracionDeServiciosGenerales() {
        configuracion.clickBotonVerConfiguracionQ();
    }

    @And("click en el boton ver configuracion de archivo ventas")
    public void clickEnElBotonVerConfiguracionDeArchivoVentas() {
        configuracion.clickBotonVerConfiguracionR();
    }
}
