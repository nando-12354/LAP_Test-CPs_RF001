Feature: Casos de Pruebas de Usuario LAP

  Scenario: CPF001 - Visualizacion de la pantalla principal (Sistema TUUA)
    Given abre la ruta del aplicativo web
    And visualizar la pantalla de acceso "INICIAR SESIÓN"

  Scenario: CPF002 - Ingreso al aplicativo web
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And visualizar el "Sistema de Administración" tuua
    And visualizar el usuario del sistema "Nando"

  Scenario: CPF003 - Visualización del menu principal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And visualizar modulo seguridad
    And visualizar modulo configuracion general
    And visualizar modulo mantenimiento
    And visualizar modulo operacion
    And visualizar modulo rehabilitacion
    And visualizar modulo consultas
    And visualizar modulo reportes
    And visualizar modulo alarmas
    And visualizar modulo ayuda

  Scenario Outline: CPF004 - Ingreso al aplicativo web con 3 intentos fallidos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "intellij"
    And ingresa la contrasena "<contrasena>"
    And click en el boton iniciar sesion
    And visualizar alerta "El Usuario se encuentra en situacion Bloqueado"
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
    And click en el boton cambiar contraseña
    #And validar alerta de confirmacion "¿Está seguro de realizar esta acción?"
    #And validar mensaje "Contraseña actualizada correctamente"

  Scenario: CPF006 - Ingreso al aplicativo web y cambiar contraseña ya usada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "intellij"
    And ingresa la contrasena "prueba2"
    And click en cambiar mi contrasena
    And ingresar contrasena ya usada "intellij1"
    And confirmar contrasena ya usada "intellij1"
    #And validar alerta de confirmacion "La contraseña se encuentra registrada dentro de los ultimos 4 ingresos de Clave"

  Scenario: CPF007 - Ingreso al aplicativo web y cambiar contraseña usada la 1ra vez
    Given abre la ruta del aplicativo web
    And ingresa el usuario "intellij"
    And ingresa la contrasena "prueba2"
    And click en cambiar mi contrasena
    And ingresar contrasena usada la primera vez "intellij1"
    And confirmar contrasena usada la primera vez "intellij1"
    #And validar mensaje de confirmacion "La contraseña se encuentra registrada dentro de los ultimos 4 ingresos de Clave"

  Scenario: CPF008 - Ingreso al aplicativo web, contraseña incorrecta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    #And validar alerta de confirmacion "La credenciales no son válidas"

  ##########################################################
   ##################### MANTENIMIENTO ####################
  ##########################################################
  Scenario: CPF045 - Visualizar modulo mantenimiento
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And visualizar la opcion moneda
    And visualizar la opcion compania
    And visualizar la opcion modalidad de venta
    And visualizar la opcion tipo de ticket

                 ######## Moneda ########

  Scenario: CPF052 - Moneda/Visualizar lista de monedas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And visualizar lista de "Moneda"
    And validar "Total de Registros:" de monedas

  Scenario: CPF053 - Moneda/Registrar tipo de moneda
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And click en el boton nuevo
    And seleccionar codigo de moneda "DOP"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"

  Scenario: CPF054 - Moneda/Deshabilitar una moneda
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And click en el boton editar
    And seleccionar estado "Vigente"
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"

                 ######## Compañias ########

  Scenario: CPF055 - Compania/Visualizar lista de companias
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And visualizar lista de "Compañías"