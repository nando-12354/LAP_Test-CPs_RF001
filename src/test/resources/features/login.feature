Feature: Funcionalidad del login

  Scenario: CPF002 - Ingreso al aplicativo web
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And visualizar el "Sistema de Administración" tuua
    And visualizar el usuario del sistema "Nando"

  Scenario Outline: CPF004 - Ingreso al aplicativo web con 3 intentos fallidos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "intellij"
    And ingresa la contrasena "<contrasena>"
    And click en el boton iniciar sesion
    And visualizar alerta "Su cuenta esta Bloqueada debido al exceso de intentos"
    Examples:
      | contrasena |
      | passfail1  |
      | passfail2  |
      | passfail3  |

  Scenario: CPF005 - Ingreso al aplicativo web y cambiar contraseña
    Given abre la ruta del aplicativo web
    And ingresa el usuario "intellij"
    And ingresa la contrasena "prueba2"
    And click en cambiar mi contrasena
    And ingresar nueva contrasena "intellij2"
    And confirmar contraseña "intellij2"
    And validar alerta de confirmacion "Contraseña actualizada correctamente"
    And validar mensaje ""

  Scenario: CPF006 - Ingreso al aplicativo web y cambiar contraseña ya usada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "intellij"
    And ingresa la contrasena "prueba2"
    And click en cambiar mi contrasena
    And ingresar contrasena ya usada "intellij1"
    And confirmar contrasena ya usada "intellij1"
    And validar alerta de confirmacion "La contraseña se encuentra registrada dentro de los ultimos 4 ingresos de Clave"

  Scenario: CPF007 - Ingreso al aplicativo web y cambiar contraseña usada la 1ra vez
    Given abre la ruta del aplicativo web
    And ingresa el usuario "intellij"
    And ingresa la contrasena "prueba2"
    And click en cambiar mi contrasena
    And ingresar contrasena usada la primera vez "intellij1"
    And confirmar contrasena usada la primera vez "intellij1"
    And validar mensaje de confirmacion "La contraseña se encuentra registrada dentro de los ultimos 4 ingresos de Clave"

  Scenario: CPF008 - Ingreso al aplicativo web, contraseña incorrecta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And validar alerta de confirmacion "La credenciales no son válidas"