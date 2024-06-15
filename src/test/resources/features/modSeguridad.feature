Feature: Funcionalidad del modulo Seguridad

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

  Scenario: CPF011 - Roles/Crear nuevo rol
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And click en el boton nuevo
    And ingresar nombre del rol "ADMINTEST"
    And seleccionar rol padre "ADMIN"
    #And configurar perfil "si"
    And click en el boton guardar
    #And validar mensaje de confirmacion “”
    #And click en el boton aceptar
    #And Validar mensaje “Registro agregado correctamente”

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

  Scenario: CPF013 - Roles/Eliminar rol
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And click en el boton eliminar
    #And validar mensaje de confirmacion ""
    #And click en el boton aceptar
    #And validar mensaje exito "Registro eliminado correctamente"

######## USUARIOS ########

  Scenario: CPF014 - Usuarios/Visualizar lista de usuarios registrados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And visualizar la opcion usuarios

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
    #And ingresar estado "VIGENTE"
    And click en el boton buscar

  Scenario: CPF016 - Usuarios/Crear nuevo usuario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And click en el boton nuevo usuario
    And ingresar apellidos "teste"
    And ingresar nombres "teste"
    And ingresar nombre de usuario "teste"
    And modificar fecha vigencia "30/12/2024"
    And ingresar contrasena "teste"
    And confirmar contrasena "teste"
    And ingresar privilegio "TOTAL"
    And ingresar rol disponible "si"
    And click en el boton guardar
    And validar mensaje exito "Usuario registrado correctamente"

  Scenario Outline: CPF016 - Usuarios/Crear nuevo usuario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And click en el boton nuevo usuario
    And ingresar apellidos "<apellido>"
    And ingresar nombres "<nombre>"
    And ingresar nombre de usuario "<usuario>"
    And modificar fecha vigencia "<vigencia>"
    And ingresar contrasena "<clave>"
    And confirmar contrasena "<confirmar clave>"
    And ingresar privilegio "TOTAL"
    And ingresar rol disponible "si"
    And click en el boton guardar
    And validar mensaje exito "Usuario registrado correctamente"
    Examples:
      | apellido | nombre | usuario | vigencia   | clave | confirmar clave |
      | test1    | test   | test1   | 30/12/2024 | test1 | test1           |
      | test1    | test   | test2   | 30/12/2024 | test2 | test2           |
      | test1    | test   | test3   | 30/12/2024 | test3 | test3           |
      | test1    | test   | test4   | 30/12/2024 | test4 | test4           |
      | test1    | test   | test5   | 30/12/2024 | test5 | test5           |

  Scenario: CPF017 - Usuarios/Modificar informacion de usuario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And click en el boton editar
    And ingresar estado "VIGENTE"
    And ingresar apellidos ""
    And ingresar nombres ""
    And ingresar nombre de usuario ""
    And modificar fecha vigencia "30/12/2025"
    And ingresar contrasena ""
    And confirmar contrasena ""
    And ingresar rol disponible "no"
    And click en el boton guardar
    And validar mensaje exito "Usuario actualizado correctamente"

  Scenario: CPF018 - Usuarios/Desbloquear cuenta de usuario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresa a la opcion usuarios
    And seleccionar estado "BLOQUEADO"
    And click en el boton buscar
    And click en el boton editar
    And ingresar estado "VIGENTE"
    And modificar fecha vigencia "30/12/2025"
    And click en el boton guardar
    And validar mensaje exito "Usuario actualizado correctamente"