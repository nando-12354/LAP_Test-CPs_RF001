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

    @And("click en el boton ver configuracion")
    public void clickEnElBotonVerConfiguracion() {
        configuracion.clickBotonConfiguracion();
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
}
