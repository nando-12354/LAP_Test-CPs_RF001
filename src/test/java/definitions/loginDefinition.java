package definitions;

import io.cucumber.java.en.And;
import pageobject.loginPage;

public class loginDefinition {
    loginPage login;
    public loginDefinition() {
        login = new loginPage();
    }

    @And("ingresa el usuario {string}")
    public void ingresaElUsuario(String usuario) {
        login.ingresarUsuario(usuario);
    }

    @And("ingresa la contrasena {string}")
    public void ingresaLaContrasena(String clave) {
        login.ingresarClave(clave);
    }

    @And("click en el boton iniciar sesion")
    public void clickEnElBotonIniciarSesion() {
        login.clickBotonLogin();
    }

    @And("visualizar el {string} tuua")
    public void visualizarElTuua(String tuua) {
        login.validarTituloTuua(tuua);
    }

    @And("click en cambiar mi contrasena")
    public void clickEnCambiarMiContrasena() {
        login.ingresarCambioClave();
    }

    @And("visualizar el usuario del sistema {string}")
    public void visualizarElUsuarioDelSistema(String logueado) {
        login.validarUsuario(logueado);
    }
}
