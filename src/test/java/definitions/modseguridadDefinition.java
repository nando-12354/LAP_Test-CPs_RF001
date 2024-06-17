package definitions;

import io.cucumber.java.en.And;
import pageobject.*;

public class modseguridadDefinition {
    menuPage menu;
    comboboxPage combobox;
    mensajesPage mensajes;
    botonPage boton;
    modseguridadPage seguridad;
    public modseguridadDefinition() {
        menu = new menuPage();
        combobox = new comboboxPage();
        mensajes = new mensajesPage();
        boton = new botonPage();
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
        boton.clickBotonGuardar();
    }

    @And("validar mensaje de confirmacion “”")
    public void validarMensajeDeConfirmacion() {
    }

    @And("Validar mensaje “”")
    public void validarMensaje() {
    }

    @And("click en el boton editar venta normal")
    public void clickEnElBotonEditarVentaNormal() {
        boton.clickBotonEditar();
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
}
