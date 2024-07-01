Feature: Funcionalidad del login


  Scenario: CPF002 - Ingreso al aplicativo web
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And visualizar el "Sistema de Administración" tuua
    And visualizar el usuario del sistema "Nando"


  Scenario: CPF004 - Ingreso al aplicativo web con 3 intentos fallidos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "pleon1"
    And ingresa la contrasena "pleon"
    And click en el boton iniciar sesion
    And ingresa la contrasena otra vez "pleon"
    And click en el boton iniciar sesion
    And ingresa la contrasena otra vez "pleon"
    And click en el boton iniciar sesion
    And validar mensaje de error "El Usuario se encuentra en situacion Bloqueado"


  Scenario: CPF005 - Ingreso al aplicativo web y cambiar contraseña
    Given abre la ruta del aplicativo web
    And ingresa el usuario "aflores"
    And ingresa la contrasena "aflores21"
    And click en cambiar mi contrasena
    And ingresar nueva contrasena "aflores22"
    And confirmar contraseña "aflores22"
    And click en el boton cambiar contrasena
    And validar la alerta de confirmacion "Confirmar el cambio de contraseña"
    And click en el boton aceptar
    And validar aviso "Contraseña actualizada correctamente"
    And click en el boton aceptar


  Scenario: CPF006 - Ingreso al aplicativo web y cambiar contraseña ya usada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "mvictor"
    And ingresa la contrasena "mvictor2"
    And click en cambiar mi contrasena
    And ingresar contrasena ya usada "mvictor1"
    And confirmar contrasena ya usada "mvictor1"
    And click en el boton cambiar contrasena
    And validar la alerta de confirmacion "Confirmar el cambio de contraseña"
    And click en el boton aceptar
    And validar el mensaje error "La contraseña se encuentra registrada dentro de los ultimos 4 ingresos de Clave"


  Scenario: CPF007 - Ingreso al aplicativo web y cambiar contraseña usada la 1ra vez
    Given abre la ruta del aplicativo web
    And ingresa el usuario "mprado"
    And ingresa la contrasena "mprado1"
    And click en el boton iniciar sesion
    And ingresar nueva contrasena "mprado2"
    And confirmar contraseña "mprado2"
    And click en el boton cambiar contrasena
    And validar la alerta de confirmacion "Confirmar el cambio de contraseña"
    And click en el boton aceptar
    And validar aviso "Contraseña actualizada correctamente"
    And click en el boton aceptar


  Scenario: CPF008 - Ingreso al aplicativo web, contraseña incorrecta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "wseleniu2"
    And ingresa la contrasena "passerror"
    And click en el boton iniciar sesion
    And validar mensaje de error "La credenciales no son válidas"