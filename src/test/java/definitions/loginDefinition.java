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

    @And("ingresar nueva contrasena {string}")
    public void ingresarNuevaContrasena(String nuevaclave) {
        login.ingresarNuevaClave(nuevaclave);
    }

    @And("confirmar contraseña {string}")
    public void confirmarContraseña(String claveconf) {
        login.ingresarNuevaClaveConfirmar(claveconf);
    }

    @And("click en el boton cambiar contraseña")
    public void clickEnElBotonCambiarContraseña() {
        login.clickBotonCambiarClave();
    }

    @And("ingresar contrasena ya usada {string}")
    public void ingresarContrasenaYaUsada(String claveusada) {
        login.ingresarNuevaClave(claveusada);
    }

    @And("confirmar contrasena ya usada {string}")
    public void confirmarContrasenaYaUsada(String claveusadaconf) {
        login.ingresarNuevaClaveConfirmar(claveusadaconf);
    }

    @And("confirmar contrasena usada la primera vez {string}")
    public void confirmarContrasenaUsadaLaPrimeraVez(String claveprimeravezconf) {
        login.ingresarNuevaClaveConfirmar(claveprimeravezconf);
    }

    @And("ingresar contrasena usada la primera vez {string}")
    public void ingresarContrasenaUsadaLaPrimeraVez(String claveprimeravez) {
        login.ingresarNuevaClaveConfirmar(claveprimeravez);
    }
}
