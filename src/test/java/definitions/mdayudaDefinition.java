package definitions;

import io.cucumber.java.en.And;
import pageobject.loginPage;
import pageobject.menuPage;

/**
 * Clase que contiene los pasos de definicion de Cucumber del modulo de Ayuda de TUUA
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
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
