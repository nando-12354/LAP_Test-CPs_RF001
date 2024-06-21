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
    And ingresa el usuario "tleon"
    And ingresa la contrasena "leon123"
    And click en el boton iniciar sesion
    And ingresa la contrasena otra vez "leon123"
    And click en el boton iniciar sesion
    And ingresa la contrasena otra vez "leon123"
    And click en el boton iniciar sesion
    And validar mensaje error "El Usuario se encuentra en situacion Bloqueado"

    ########### CASO DE PRUEBAS ADICIONALES ##########

  Scenario: CPFadicional1 - Ingreso al aplicativo web con usuario no registrado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "nouser"
    And ingresa la contrasena "nopass"
    And click en el boton iniciar sesion
    And validar mensaje error "Usuario no registrado"


  Scenario: CPFadicional2 - Ingreso al aplicativo web con contrasena erronea
    Given abre la ruta del aplicativo web
    And ingresa el usuario "aflores002"
    And ingresa la contrasena "passerror"
    And click en el boton iniciar sesion
    And validar mensaje error "La credenciales no son válidas"


  Scenario: CPFadicional3 - Ingreso al aplicativo web con contrasena erronea e intentar cambiar contrasena
    Given abre la ruta del aplicativo web
    And ingresa el usuario "aflores002"
    And ingresa la contrasena "passerror"
    And click en cambiar mi contrasena
    And validar mensaje error "La credenciales no son válidas"
    #################################################


  Scenario: CPF005 - Ingreso al aplicativo web y cambiar contraseña
    Given abre la ruta del aplicativo web
    And ingresa el usuario "aflores"
    And ingresa la contrasena "aflores12"
    And click en cambiar mi contrasena
    And ingresar nueva contrasena "aflores13"
    And confirmar contraseña "aflores13"
    And click en el boton cambiar contrasena
    And validar la alerta de confirmacion "Confirmar el cambio de contraseña"
    And click en el boton si
    And validar aviso "Contraseña actualizada correctamente"


  Scenario: CPF006 - Ingreso al aplicativo web y cambiar contraseña ya usada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "aflores"
    And ingresa la contrasena "aflores12"
    And click en cambiar mi contrasena
    And ingresar contrasena ya usada "aflores"
    And confirmar contrasena ya usada "aflores"
    And click en el boton cambiar contrasena
    And validar la alerta de confirmacion "Confirmar el cambio de contraseña"
    And click en el boton si
    And validar mensaje error "La contraseña se encuentra registrada dentro de los ultimos 4 ingresos de Clave"


  Scenario: CPF007 - Ingreso al aplicativo web y cambiar contraseña usada la 1ra vez
    Given abre la ruta del aplicativo web
    And ingresa el usuario "aflores"
    And ingresa la contrasena "aflores12"
    And click en cambiar mi contrasena
    And ingresar contrasena usada la primera vez "aflores"
    And confirmar contrasena usada la primera vez "aflores"
    And click en el boton cambiar contrasena
    And validar la alerta de confirmacion "Confirmar el cambio de contraseña"
    And click en el boton si
    And validar mensaje error "La contraseña se encuentra registrada dentro de los ultimos 4 ingresos de Clave"


  Scenario: CPF008 - Ingreso al aplicativo web, contraseña incorrecta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "hvallejo"
    And ingresa la contrasena "passerror"
    And click en el boton iniciar sesion
    And validar mensaje error "La credenciales no son válidas"