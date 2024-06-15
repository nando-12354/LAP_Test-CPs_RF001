package definitions;

import io.cucumber.java.en.And;
import pageobject.loginPage;
import pageobject.menuPage;

public class mdayudaDefinition {
    menuPage menu;
    loginPage login;
    public mdayudaDefinition() {
        menu = new menuPage();
        login = new loginPage();
    }

    @And("ingresar al modulo ayuda")
    public void ingresarAlModuloAyuda() {
        menu.validarModAyuda();
    }

    @And("visualizar documento del {string}")
    public void visualizarDocumentoDel(String documento) {
        login.validarTituloTuua(documento);
    }
}
