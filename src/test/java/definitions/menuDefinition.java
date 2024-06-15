package definitions;

import io.cucumber.java.en.And;
import pageobject.menuPage;

public class menuDefinition {
    menuPage menu;
    public menuDefinition() {
        menu = new menuPage();
    }

    @And("visualizar modulo seguridad")
    public void visualizarModuloSeguridad() {
        menu.validarModSeguridad();
    }

    @And("visualizar modulo configuracion general")
    public void visualizarModuloConfiguracionGeneral() {
        menu.validarModConfgeneral();
    }

    @And("visualizar modulo mantenimiento")
    public void visualizarModuloMantenimiento() {
        menu.validarModMantenimiento();
    }

    @And("visualizar modulo operacion")
    public void visualizarModuloOperacion() {
        menu.validarModOperacion();
        menu.validarModOperacion();
    }

    @And("visualizar modulo rehabilitacion")
    public void visualizarModuloRehabilitacion() {
        menu.validarModRehabilitacion();
        menu.validarModRehabilitacion();
    }

    @And("visualizar modulo consultas")
    public void visualizarModuloConsultas() {
        menu.validarModConsultas();
        menu.validarModConsultas();
    }

    @And("visualizar modulo reportes")
    public void visualizarModuloReportes() {
        menu.validarModReportes();
        menu.validarModReportes();
    }

    @And("visualizar modulo alarmas")
    public void visualizarModuloAlarmas() {
        menu.validarModAlarmas();
    }

    @And("visualizar modulo ayuda")
    public void visualizarModuloAyuda() {
        menu.validarModAyuda();
    }
}
