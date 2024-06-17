package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobject.principalPage;

public class principalDefinition {
    principalPage principal;
    public principalDefinition() {
        principal = new principalPage();
    }

    @Given("abre la ruta del aplicativo web")
    public void abreLaRutaDelAplicativoWeb() {
        hooks.driver.get("http://tuuaadministracionwebfrontend.k8sdevcp.lap.com.pe/");
    }

    @And("visualizar la pantalla de acceso {string}")
    public void visualizarLaPantallaDeAcceso(String titulo) {
        principal.validarTitulo(titulo);
    }
}
