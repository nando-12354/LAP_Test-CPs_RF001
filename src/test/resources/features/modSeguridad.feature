Feature: Funcionalidad del modulo Seguridad


  Scenario: CPF009 - Visualizar modulo seguridad
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And visualizar la opcion "Roles"
    And visualizar la opcion "Usuarios"

######## ROLES ########

  Scenario: CPF010 - Roles/Visualizar lista de roles registrados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And visualizar lista de "Roles"
    And validar columna "Código"
    And validar columna "Nombre de rol"
    And validar columna "Rol padre"
    And validar columna "Fecha creación"
    And validar columna "Usuario creación"
    And validar columna "Acciones"


  Scenario: CPF011 - Roles/Crear nuevo rol
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And click en el boton nuevo
    And ingresar nombre del rol "Automatiza"
    And seleccionar rol padre "JEFE CAJA"
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
    And click en el boton editar rol
    And click en el boton guardar
    And validar mensaje exito "Registro modificado correctamente"


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
    And ingresa a la opcion usuarios
    And visualizar lista de "Usuarios"
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


  Scenario: CPF016 - Usuarios/Crear nuevo usuario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And click en el boton nuevo
    And ingresar apellidos "test22"
    And ingresar nombres "test22"
    And ingresar nombre de usuario "test22"
    And ingresar contrasena "test22"
    And confirmar contrasena "test22"
    And ingresar privilegio "TOTAL"
    And ingresar rol disponible "si"
    And click en guardar
    And validar mensaje exito "Usuario registrado correctamente"


  Scenario: CPF017 - Usuarios/Modificar informacion de usuario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And click en el boton editar
    And modificar el estado a "VIGENTE"
    And modificar apellidos "test50"
    And modificar nombres "test50"
    And modificar nombre de usuario "test50"
    And modificar fecha vigencia "30/12/2025"
    And seleccionar habilitar campos "si"
    And ingresar contrasena "test50"
    And confirmar contrasena "test50"
    And ingresar rol disponible "no"
    And click en el boton guardar
    And validar mensaje exito "Registro actualizado correctamente"


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