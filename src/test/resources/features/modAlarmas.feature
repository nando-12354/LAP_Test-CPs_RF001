Feature: Funcionalidad del modulo Alarmas

  Scenario: CPF29x - Visualizar modulo alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And visualizar la opcion configurar alarmas
    And visualizar la opcion monitorear alarmas
    And visualizar la opcion alarmas generadas

######## CONFIGURAR ALARMAS ########

  Scenario: CPF291 - Configurar alarma/Visualizar pantalla de configuracion alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And visualizar informacion de "Configuración Alarmas"

  Scenario: CPF292 - Configurar alarma/Configurar nueva alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el boton nuevo
    And seleccionar modulo
    And ingresar fin de mensaje "Test LAP"
    And ingresar asunto de correo "Test LAP selenium"
    And seleccionar tipo de alarma
    And click en el boton agregar
    And seleccionar usuario
    And ingresar correo electronico "selenium@gys.com"
    And click en el boton guardar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""

  Scenario: CPF293 - Configurar alarma/Editar configuracion de alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el boton editar
    And ingresar fin de mensaje "Test LAP editado"
    And ingresar asunto de correo "Test LAP selenium editado"
    And click en el boton agregar
    And seleccionar usuario
    And ingresar correo electronico "selenium@gys.com"
    And click en el boton actualizar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""

  Scenario: CPF294 - Configurar alarma/Eliminar configuracion de alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el boton editar
    And click en el boton eliminar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""

  Scenario: CPF295 - Configurar alarma/Actualizar configuracion de alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el boton editar
    And ingresar fin de mensaje "Test LAP actualizado"
    And ingresar asunto de correo "Test LAP selenium actualizado"
    And click en el boton agregar
    And seleccionar usuario
    And ingresar correo electronico "selenium@gys.com"
    And click en el boton actualizar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""

######## MONITOREAR ALARMAS ########

  Scenario: CPF296 - Monitorear alarmas/Visualizar pantalla de monitorear alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion monitorear alarmas
    And visualizar informacion de "Monitorear Alarmas"

######## ALARMAS GENERADAS ########

  Scenario: CPF298 - Alarmas generadas/Visualizar pantalla de alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion alarmas generadas
    And visualizar informacion de "Alarmas Generadas"

  Scenario: CPF299 - Alarmas generadas/Consultar alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion alarmas generadas
    And ingresar fecha desde "01/01/2023"
    And ingresar fecha hasta "09/06/2024"
    And ingresar hora desde "00:00:00"
    And ingresar hora hasta "23:00:00"
    And seleccionar modulo
    And seleccionar estado
    And seleccionar tipo de alarma
    And click en el boton buscar