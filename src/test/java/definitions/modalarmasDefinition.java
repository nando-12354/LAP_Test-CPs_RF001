package definitions;

import io.cucumber.java.en.And;
import pageobject.menuPage;
import pageobject.modalarmasPage;

/**
 * Clase modalarmasDefinition que contiene los metodos de los pasos a seguir en el archivo modalarmasfeature
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
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

    @And("seleccionar el modulo {string}")
    public void seleccionarElModulo(String modulo) {
        alarmas.abrirComboboxModulo();
        alarmas.seleccionarOpcion(modulo);
    }

    @And("ingresar fin de mensaje {string}")
    public void ingresarFinDeMensaje(String mensaje) {
        alarmas.ingresarFinMensaje(mensaje);
    }

    @And("ingresar asunto de correo {string}")
    public void ingresarAsuntoDeCorreo(String asunto) {
        alarmas.ingresarAsuntoCorreo(asunto);
    }

    @And("seleccionar tipo de alarma {string}")
    public void seleccionarTipoDeAlarma(String tipoalarma) {
        alarmas.abrirComboboxTipoAlarma();
        alarmas.seleccionarOpcion(tipoalarma);
    }

    @And("click en el boton +agregar")
    public void clickEnElBotonAgregar() {
        alarmas.clickBotonAgregar();
    }

    @And("seleccionar al usuario {string}")
    public void seleccionarAlUsuario(String usuario) {
        alarmas.abrirComboboxUsuarioA();
        alarmas.seleccionarOpcion(usuario);
    }

    @And("ingresar correo electronico {string}")
    public void ingresarCorreoElectronico(String correo) {
        alarmas.ingresarCorreo(correo);
    }

    @And("click en el codigo")
    public void clickEnElCodigo() {
        alarmas.clickBotonEditarA();
    }

    @And("seleccionar otro usuario {string}")
    public void seleccionarOtroUsuario(String usuariob) {
        alarmas.abrirComboboxUsuarioB();
        alarmas.seleccionarOpcion(usuariob);
    }

    @And("click en el boton actualizar")
    public void clickEnElBotonActualizar() {
        alarmas.clickBotonActualizar();
    }

    @And("click en boton eliminar")
    public void clickEnBotonEliminar() {
        alarmas.clickBotonEliminar();
    }

    @And("ingresar otro correo electronico {string}")
    public void ingresarOtroCorreoElectronico(String actualizarcorreo) {
        alarmas.ingresarActualizacionCorreo(actualizarcorreo);
    }

    @And("ingresar la hora desde {string}")
    public void ingresarLaHoraDesde(String horadesde) {
        alarmas.ingresarHoraDesde(horadesde);
    }

    @And("ingresar la hora hasta {string}")
    public void ingresarLaHoraHasta(String horahasta) {
        alarmas.ingresarHoraHasta(horahasta);
    }

    @And("seleccionar el estado {string}")
    public void seleccionarElEstado(String estado) {
        alarmas.abrirComboboxEstado();
        alarmas.seleccionarOpcion(estado);
    }
}
