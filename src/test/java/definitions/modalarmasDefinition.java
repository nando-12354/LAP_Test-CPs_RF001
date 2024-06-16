package definitions;

import io.cucumber.java.en.And;
import pageobject.menuPage;
import pageobject.modalarmasPage;

public class modalarmasDefinition {
    menuPage menu;
    modalarmasPage alarmas;
    public modalarmasDefinition() {
        menu = new menuPage();
        alarmas = new modalarmasPage();
    }

    @And("ingresar al modulo alarmas")
    public void ingresarAlModuloAlarmas() {
        menu.validarModAlarmas();
    }
    @And("visualizar la opcion configurar alarmas")
    public void visualizarLaOpcionConfigurarAlarmas() {
        alarmas.ingresarOpcionConfigurarAlarmas();
    }
    @And("visualizar la opcion monitorear alarmas")
    public void visualizarLaOpcionMonitorearAlarmas() {
        alarmas.ingresarOpcionMonitorearAlarmas();
    }
    @And("visualizar la opcion alarmas generadas")
    public void visualizarLaOpcionAlarmasGeneradas() {
        alarmas.ingresarOpcionAlarmasGeneradas();
    }

    @And("ingresar a la opcion configurar alarmas")
    public void ingresarALaOpcionConfigurarAlarmas() {
        alarmas.ingresarOpcionConfigurarAlarmas();
    }

    @And("ingresar a la opcion monitorear alarmas")
    public void ingresarALaOpcionMonitorearAlarmas() {
        alarmas.ingresarOpcionMonitorearAlarmas();
    }

    @And("ingresar a la opcion alarmas generadas")
    public void ingresarALaOpcionAlarmasGeneradas() {
        alarmas.ingresarOpcionAlarmasGeneradas();
    }
}
