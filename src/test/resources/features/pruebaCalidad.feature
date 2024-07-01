Feature: Funcionalidad del TUUA [Rol: Admin Calidad]

  Scenario: Calidad(GyS)/CPF001 - Ingreso al aplicativo web con usuario no registrado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "nouser"
    And ingresa la contrasena "nopass"
    And click en el boton iniciar sesion
    And validar mensaje de error "Usuario no registrado"


  Scenario: Calidad(GyS)/CPF002 - Ingreso al aplicativo web con contraseña erronea
    Given abre la ruta del aplicativo web
    And ingresa el usuario "nmarcelo"
    And ingresa la contrasena "passerror"
    And click en el boton iniciar sesion
    And validar mensaje de error "La credenciales no son válidas"


  Scenario: Calidad(GyS)/CPF003 - Ingreso al aplicativo web con contraseña erronea e intentar cambiar contraseña
    Given abre la ruta del aplicativo web
    And ingresa el usuario "wselenium"
    And ingresa la contrasena "passerror"
    And click en cambiar mi contrasena
    And validar mensaje de error "La credenciales no son válidas"