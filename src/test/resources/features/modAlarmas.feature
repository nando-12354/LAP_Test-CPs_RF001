Feature: Funcionalidad del modulo Alarmas

  Scenario: CPF300 - Visualizar modulo alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And visualizar la opcion "Configurar Alarmas"
    And visualizar la opcion "Monitorear Alarmas"
    And visualizar la opcion "Alarmas Generadas"

######## CONFIGURAR ALARMAS ########

  Scenario: CPF301 - Configurar alarma/Visualizar pantalla de configuracion alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And visualizar informacion de "Configuración Alarmas"


  Scenario: CPF302 - Configurar alarma/Configurar nueva alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el boton +agregar
    And seleccionar el modulo "Mantenimiento"
    And ingresar fin de mensaje "Test LAP"
    And ingresar asunto de correo "Test LAP selenium"
    And seleccionar tipo de alarma "Caducidad de Clave"
    And click en el boton +agregar
    And seleccionar al usuario "fvanessa"
    And ingresar correo electronico "fvanessa@gys.com"
    And click en el boton guardar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""


  Scenario: CPF303 - Configurar alarma/Editar configuracion de alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el codigo
    And ingresar fin de mensaje "Test LAP editado"
    And ingresar asunto de correo "Test LAP selenium editado"
    And click en el boton +agregar
    And seleccionar otro usuario "kfranco"
    And ingresar correo electronico "selenium@gys.com"
    And click en el boton actualizar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""


  Scenario: CPF304 - Configurar alarma/Eliminar configuracion de alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el codigo
    And click en boton eliminar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""


  Scenario: CPF305 - Configurar alarma/Actualizar configuracion de alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el codigo
    And ingresar fin de mensaje "Test LAP actualizado"
    And ingresar asunto de correo "Test LAP selenium actualizado"
    And seleccionar al usuario "MBENITES"
    And ingresar otro correo electronico "selenium@gys.com"
    And click en el boton actualizar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""

######## MONITOREAR ALARMAS ########

  Scenario: CPF306 - Monitorear alarmas/Visualizar pantalla de monitorear alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion monitorear alarmas
    And visualizar informacion de "Monitorear Alarmas"

######## ALARMAS GENERADAS ########

  Scenario: CPF307 - Alarmas generadas/Visualizar pantalla de alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion alarmas generadas
    And visualizar informacion de "Alarmas Generadas"


  Scenario: CPF308 - Alarmas generadas/Consultar alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion alarmas generadas
    And seleccionar fecha desde "01/06/2022"
    And ingresar la hora desde "000000"
    And seleccionar fecha hasta "08/07/2022"
    And ingresar la hora hasta "230000"
    And seleccionar el modulo "Modulo Servicios"
    And seleccionar el estado "Todos"
    And seleccionar tipo de alarma "Error en conexión al Web Service de Tasa Cambio del Banco"
    And click en el boton buscar


  Scenario: CPF309 - Alarmas generadas/Exportar excel, pdf e imprimir alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion alarmas generadas
    And seleccionar fecha desde "01/09/2022"
    And ingresar la hora desde "000000"
    And seleccionar fecha hasta "03/09/2022"
    And ingresar la hora hasta "230000"
    And seleccionar el modulo "Modulo Servicios"
    And seleccionar el estado "Todos"
    And seleccionar tipo de alarma "Error en conexión al Web Service de Tasa Cambio del Banco"
    And click en el boton buscar
    And click en el boton pdf
    And click en el boton excel
    And click en el boton imprimir