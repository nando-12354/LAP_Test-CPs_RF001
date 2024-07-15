package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobject.principalPage;

/**
 * Clase que contiene los pasos de definicion de los escenarios de prueba del sistema principal
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class principalDefinition {
    principalPage principal;
    public principalDefinition() {
        principal = new principalPage();
    }

    @Given("abre la ruta del aplicativo web")
    public void abreLaRutaDelAplicativoWeb() {
        hooks.driver.get("http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/");
    }

    @And("visualizar la pantalla de acceso {string}")
    public void visualizarLaPantallaDeAcceso(String titulo) {
        principal.validarTitulo(titulo);
    }
}
