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
    And ingresa el usuario "intellij"
    And ingresa la contrasena "pass1"
    And click en el boton iniciar sesion
    And ingresa la contrasena otra vez "pass2"
    And click en el boton iniciar sesion
    And ingresa la contrasena otra vez "pass3"
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
    And ingresa el usuario "dcastillo"
    And ingresa la contrasena "passerror"
    And click en el boton iniciar sesion
    And validar mensaje error "La credenciales no son válidas"

  Scenario: CPFadicional3 - Ingreso al aplicativo web con contrasena erronea e intentar cambiar contrasena
    Given abre la ruta del aplicativo web
    And ingresa el usuario "dcastillo"
    And ingresa la contrasena "passerror"
    And click en el boton cambiar contrasena
    And validar mensaje error "La credenciales no son válidas"
    #################################################

  Scenario: CPF005 - Ingreso al aplicativo web y cambiar contraseña
    Given abre la ruta del aplicativo web
    And ingresa el usuario "intellij"
    And ingresa la contrasena "prueba2"
    And click en cambiar mi contrasena
    And ingresar nueva contrasena "intellij2"
    And confirmar contraseña "intellij2"
    And click en el boton cambiar contrasena
    And validar alerta de confirmacion "¿Está seguro de realizar esta acción?"
    And validar mensaje "Contraseña actualizada correctamente"

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