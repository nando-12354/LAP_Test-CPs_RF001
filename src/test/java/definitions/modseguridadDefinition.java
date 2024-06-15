package definitions;

import io.cucumber.java.en.And;
import pageobject.comboboxPage;
import pageobject.mensajesPage;
import pageobject.menuPage;
import pageobject.modseguridadPage;

public class modseguridadDefinition {
    menuPage menu;
    comboboxPage combobox;
    mensajesPage mensajes;
    modseguridadPage seguridad;
    public modseguridadDefinition() {
        menu = new menuPage();
        combobox = new comboboxPage();
        mensajes = new mensajesPage();
        seguridad = new modseguridadPage();
    }

    @And("ingresar al modulo seguridad")
    public void ingresarAlModuloSeguridad() {
        menu.validarModSeguridad();
    }

    @And("visualizar la opcion roles")
    public void visualizarLaOpcionRoles() {
        seguridad.ingresarOpcionRoles();
    }

    @And("visualizar la opcion usuarios")
    public void visualizarLaOpcionUsuarios() {
        seguridad.ingresarOpcionUsuarios();
    }

    @And("ingresar a la opcion roles")
    public void ingresarALaOpcionRoles() {
        seguridad.ingresarOpcionRoles();
    }

    @And("click en el boton nuevo")
    public void clickEnElBotonNuevo() {
        seguridad.botonNuevoRol();
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
/*
    @And("configurar perfil")
    public void configurarPerfil() {
        seguridad.checkPerfilSeguridad();
        seguridad.checkPerfilConfGeneral();
        seguridad.checkPerfilMantenimiento();
        seguridad.checkPerfilOperacion();
        seguridad.checkPerfilRehabilitacion();
        seguridad.checkPerfilConsultas();
        seguridad.checkPerfilReportes();
        seguridad.checkPerfilAlarmas();
        seguridad.checkPerfilOperaciones();
        seguridad.checkPerfilTurno();
        seguridad.checkPerfilAyuda();
        seguridad.checkPerfilArchivamiento();
    }
*/
    @And("click en el boton guardar")
    public void clickEnElBotonGuardar() {
        seguridad.clickbotonGuardar();
    }

    @And("validar mensaje de confirmacion “”")
    public void validarMensajeDeConfirmacion() {
    }

    @And("Validar mensaje “”")
    public void validarMensaje() {
    }

    @And("click en el boton editar")
    public void clickEnElBotonEditar() {
        seguridad.clickBotonEditarRol();
    }

    @And("validar mensaje de confirmacion {string}")
    public void validarMensajeDeConfirmacion(String arg0) {
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
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(rol);
    }

    @And("ingresar estado {string}")
    public void ingresarEstado(String estado) {
        combobox.abrirCombobox();
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
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(rolpadre);
    }

    @And("validar mensaje exito {string}")
    public void validarMensajeExito(String mensaje) {
        mensajes.validarMensajeExito(mensaje);
    }

    @And("click en el boton eliminar")
    public void clickEnElBotonEliminar() {
        seguridad.clickBotonEliminarRol();
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
        combobox.abrirCombobox();
        combobox.seleccionarOpcion(privilegio);
    }

    @And("ingresar rol disponible {string}")
    public void ingresarRolDisponible(String roldisponible) {
        seguridad.seleccionarRolDisponible(roldisponible);
    }
}
