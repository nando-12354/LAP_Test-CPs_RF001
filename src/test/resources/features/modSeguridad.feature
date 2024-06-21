Feature: Funcionalidad del modulo Seguridad

  ### Solucionado
  Scenario: CPF009 - Visualizar modulo seguridad
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And visualizar la opcion roles
    And visualizar la opcion usuarios

######## ROLES ########

  Scenario: CPF010 - Roles/Visualizar lista de roles registrados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And visualizar la opcion roles
    And validar columna "Código"
    And validar columna "Nombre de rol"
    And validar columna "Rol padre"
    And validar columna "Fecha creación"
    And validar columna "Usuario creación"
    And validar columna "Acciones"

  ### No pasa por que se elimina la configuración de perfil al agregar un nombre de rol
  Scenario: CPF011 - Roles/Crear nuevo rol
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And click en el boton nuevo
    And ingresar nombre del rol "HHHTEST"
    And seleccionar rol padre "ADMIN"
    And configurar perfil "si"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"

  Scenario: CPF012 - Roles/Modificar informacion de rol
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And click en el boton editar
    And click en el boton guardar
    And validar mensaje exito "Registro modificado correctamente"

  ### Solucionado
  Scenario: CPF013 - Roles/Eliminar rol
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And click en el boton eliminar rol
    And validar alerta de confirmacion "¿Está seguro de eliminar este registro?"
    And click en el boton aceptar
    And validar mensaje "Registro eliminado correctamente"

######## USUARIOS ########

  Scenario: CPF014 - Usuarios/Visualizar lista de usuarios registrados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And visualizar la opcion usuarios
    And validar columna "Código"
    And validar columna "Apellidos y nombres"
    And validar columna "Cuenta"
    And validar columna "Usuario Modificación"
    And validar columna "Fecha Modificación"
    And validar columna "Estado"
    And click en ver mas campos
    And validar datos de "Usuario creación"
    And validar datos de "Fecha de Creación"
    And validar datos de "Fecha de vigencia"
    And validar datos de "Grupo"
    And validar datos de "Roles asociados"
    And validar columna "Acciones"

  ### Solucionado
  Scenario: CPF015 - Usuarios/Filtrar lista de usuarios
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And ingresar usuario "mbenites"
    And ingresar nombre "Melissa, Benites"
    And ingresar rol "TODOS"
    And ingresar estado "VIGENTE"
    And click en el boton buscar

  ### Solucionado
  Scenario: CPF016 - Usuarios/Crear nuevo usuario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And click en el boton nuevo
    And ingresar apellidos "Barrios2"
    And ingresar nombres "Willy2"
    And ingresar nombre de usuario "wbarrios2"
    And ingresar contrasena "wbarrios2"
    And confirmar contrasena "wbarrios2"
    And ingresar privilegio "TOTAL"
    And ingresar rol disponible "si"
    And click en guardar
    And validar mensaje exito "Usuario registrado correctamente"

  ### Solucionado
  Scenario: CPF017 - Usuarios/Modificar informacion de usuario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And click en el boton editar
    And modificar el estado a "VIGENTE"
    And modificar apellidos "Miranda3"
    And modificar nombres "Joel3"
    And modificar nombre de usuario "jmiranda3"
    And modificar fecha vigencia "30/12/2025"
    And seleccionar habilitar campos "si"
    And ingresar contrasena "jmiranda3"
    And confirmar contrasena "jmiranda3"
    And ingresar rol disponible "no"
    And click en el boton guardar
    And validar mensaje exito "Registro actualizado correctamente"

  ### Solucionado
  Scenario: CPF018 - Usuarios/Desbloquear cuenta de usuario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And ingresar estado "BLOQUEADO"
    And click en el boton buscar
    And click en el boton editar
    And modificar el estado a "VIGENTE"
    And modificar fecha vigencia "30/12/2025"
    And click en el boton guardar
    And validar mensaje exito "Registro actualizado correctamente"