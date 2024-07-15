package definitions;

import io.cucumber.java.en.And;
import pageobject.*;

/**
 * Clase que contiene los pasos de definicion de los escenarios de prueba del modulo de seguridad
 * @author : Fernando Luyo Villafana
 * @version : 1.0
 * @since : 2024-07-12
 * @see <a href="http://tuua-administracionweb-prd.k8sdevcp.lap.com.pe/">Lima Airport Partners</a>
 * @see <a href="https://gestionysistemas.com/">GyS gestion y sistemas</a>
 * @see <a href="https://www.linkedin.com/in/fernando-luyo-a671062a7/">LinkedIn</a>
 */
public class modseguridadDefinition {
    menuPage menu;
    headPage head;
    bodyPage body;
    comboboxPage combobox;
    mensajesPage mensajes;
    botonPage boton;
    modseguridadPage seguridad;
    public modseguridadDefinition() {
        menu = new menuPage();
        head = new headPage();
        body = new bodyPage();
        combobox = new comboboxPage();
        mensajes = new mensajesPage();
        boton = new botonPage();
        seguridad = new modseguridadPage();
    }

    @And("ingresar al modulo seguridad")
    public void ingresarAlModuloSeguridad() {
        menu.validarModSeguridad();
    }

    @And("ingresar a la opcion roles")
    public void ingresarALaOpcionRoles() {
        seguridad.ingresarOpcionRoles();
    }

    @And("click en el boton nuevo")
    public void clickEnElBotonNuevo() {
        boton.clickBotonNuevo();
    }

    @And("ingresar nombre del rol {string}")
    public void ingresarNombreDelRol(String rol) {
        seguridad.ingresarRol(rol);
    }

    @And("seleccionar rol padre")
    public void seleccionarRolPadre() {
        seguridad.clickRolPadre();
        seguridad.ingresarRolPadre();
    }

    @And("click en el boton guardar")
    public void clickEnElBotonGuardar() {
        boton.clickBotonGuardar();
    }

    @And("click en el boton editar venta normal")
    public void clickEnElBotonEditarVentaNormal() {
        boton.clickBotonEditarB();
    }

    @And("ingresa a la opcion usuarios")
    public void ingresaALaOpcionUsuarios() {
        seguridad.ingresarOpcionUsuarios();
    }

    @And("ingresar usuario {string}")
    public void ingresarUsuario(String usuario) {
        seguridad.ingresarSegUsuario(usuario);
    }

    @And("ingresar nombre {string}")
    public void ingresarNombre(String nombre) {
        seguridad.ingresarSegNombre(nombre);
    }

    @And("ingresar rol {string}")
    public void ingresarRol(String rol) {
        combobox.abrirComboboxRolPadreUsuario();
        combobox.seleccionarOpcion(rol);
    }

    @And("ingresar estado {string}")
    public void ingresarEstado(String estado) {
        combobox.abrirComboboxEstadoUsuario();
        combobox.seleccionarOpcion(estado);
    }

    @And("click en el boton nuevo usuario")
    public void clickEnElBotonNuevoUsuario() {
        seguridad.clickBotonNuenoUsuario();
    }

    @And("ingresar apellidos {string}")
    public void ingresarApellidos(String apellidos) {
        seguridad.ingresarSegApellidos(apellidos);
    }

    @And("modificar fecha vigencia {string}")
    public void modificarFechaVigencia(String fecha) {
        seguridad.ingresarFechaVigencia(fecha);
    }

    @And("ingresar contrasena {string}")
    public void ingresarContrasena(String clave) {
        seguridad.ingresarSegClave(clave);
    }

    @And("confirmar contrasena {string}")
    public void confirmarContrasena(String claveconf) {
        seguridad.ingresarSegClaveConfirmar(claveconf);
    }

    @And("ingresar privilegio")
    public void ingresarPrivilegio() {
    }

    @And("seleccionar rol padre {string}")
    public void seleccionarRolPadre(String rolpadre) {
        combobox.abrirComboboxRolPadre();
        combobox.seleccionarOpcion(rolpadre);
    }

    @And("validar mensaje exito {string}")
    public void validarMensajeExito(String mensaje) {
        mensajes.validarMensajeExito(mensaje);
    }

    @And("click en el boton eliminar")
    public void clickEnElBotonEliminar() {
        boton.clickBotonEliminar();
    }

    @And("ingresar nombres {string}")
    public void ingresarNombres(String nombres) {
        seguridad.ingresarSegNombres(nombres);
    }

    @And("ingresar nombre de usuario {string}")
    public void ingresarNombreDeUsuario(String usuario) {
        seguridad.ingresarSegUsuarioCrear(usuario);
    }

    @And("ingresar privilegio {string}")
    public void ingresarPrivilegio(String privilegio) {
        combobox.abrirComboboxPrivilegioUsuario();
        combobox.seleccionarOpcion(privilegio);
    }

    @And("ingresar rol disponible {string}")
    public void ingresarRolDisponible(String roldisponible) {
        seguridad.seleccionarRolDisponible(roldisponible);
    }

    @And("ingresar fecha vigencia {string}")
    public void ingresarFechaVigencia(String fechavigencia) {
        seguridad.ingresarFechaVigencia(fechavigencia);
    }

    @And("modificar apellidos {string}")
    public void modificarApellidos(String apellidos) {
        seguridad.ingresarApellidosEditar(apellidos);
    }

    @And("modificar nombres {string}")
    public void modificarNombres(String nombres) {
        seguridad.ingresarNombresEditar(nombres);
    }

    @And("modificar nombre de usuario {string}")
    public void modificarNombreDeUsuario(String usuario) {
        seguridad.ingresarUsuarioEditar(usuario);
    }

    @And("modificar el estado a {string}")
    public void modificarElEstadoA(String estado) {
        combobox.abrirComboboxEstadoUsuarioEditar();
        combobox.seleccionarOpcion(estado);
    }

    @And("seleccionar habilitar campos {string}")
    public void seleccionarHabilitarCampos(String habilitar) {
        seguridad.seleccionarHabilitarCampos(habilitar);
    }

    @And("validar columna {string}")
    public void validarColumna(String cabecera) {
        head.validarCabeceraGrilla(cabecera);
    }

    @And("click en ver mas campos")
    public void clickEnVerMasCampos() {
        boton.clickBotonVerCampos();
    }

    @And("validar datos de {string}")
    public void validarDatosDe(String cuerpo) {
        body.validarCuerpoGrilla(cuerpo);
    }

    @And("visualizar el campo {string}")
    public void visualizarElCampo(String acciones) {
        head.validarCabeceraGrilla(acciones);
    }

    @And("configurar perfil {string}")
    public void configurarPerfil(String perfil) {
        seguridad.clickDesplegarPerfilA();
        seguridad.clickDesplegarPerfilB();
        seguridad.clickDesplegarPerfilC();
        seguridad.clickDesplegarPerfilD();
        seguridad.clickDesplegarPerfilE();
        seguridad.clickDesplegarPerfilF();
        seguridad.clickDesplegarPerfilG();
        seguridad.clickDesplegarPerfilH();
        seguridad.clickDesplegarPerfilI();
        seguridad.clickDesplegarPerfilJ();
        seguridad.clickDesplegarPerfilK();
        seguridad.seleccionarCheckPerfilA(perfil);
        seguridad.seleccionarCheckPerfilB(perfil);
        seguridad.seleccionarCheckPerfilC(perfil);
        seguridad.seleccionarCheckPerfilD(perfil);
        seguridad.seleccionarCheckPerfilE(perfil);
        seguridad.seleccionarCheckPerfilF(perfil);
        seguridad.seleccionarCheckPerfilG(perfil);
        seguridad.seleccionarCheckPerfilH(perfil);
        seguridad.seleccionarCheckPerfilI(perfil);
        seguridad.seleccionarCheckPerfilJ(perfil);
        seguridad.seleccionarCheckPerfilK(perfil);
    }

    @And("validar notificacion exito {string}")
    public void validarNotificacionExito(String notificacion) {
        mensajes.validarNotificacionExito(notificacion);
    }

    @And("click en guardar")
    public void clickEnGuardar() {
        boton.clickBotonGuardarC();
    }

    @And("click en el boton eliminar rol")
    public void clickEnElBotonEliminarRol() {
        boton.clickBotonEliminarJ();
    }

    @And("visualizar la opcion {string}")
    public void visualizarLaOpcion(String opciones) {
        seguridad.validarOpcionesSeguridad(opciones);
    }
}
