Feature: Funcionalidad del modulo Alarmas
  #@reporte
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
  #@reporte
  Scenario: CPF301 - Configurar alarma/Visualizar pantalla de configuracion alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And visualizar informacion de "Configuración Alarmas"

  #@reporte
  Scenario: CPF302 - Configurar alarma/Configurar nueva alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el boton nuevo
    And seleccionar el modulo "Rehabilitación"
    And ingresar fin de mensaje "Test"
    And ingresar asunto de correo "Test"
    And seleccionar tipo de alarma "Proceso de rehabilitación Ticket por Vuelo"
    And click en el boton +agregar
    And seleccionar al usuario "AHUAQUI"
    And ingresar correo electronico "ahuaqui@gys.com"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Está Seguro de crear la configuración de la alarma?"
    And click en el boton aceptar
    And validar mensaje "Registro agregado correctamente"

  #@reporte
  Scenario: CPF303 - Configurar alarma/Editar configuracion de alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el boton editar
    And ingresar fin de mensaje "Edit"
    And ingresar asunto de correo "Edit"
    And click en el boton +agregar
    And seleccionar otro usuario "kfranco"
    And ingresar nuevo correo electronico "selenium@gys.com"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Está Seguro de Actualizar la configuración de la alarma?"
    And click en el boton aceptar
    And validar mensaje "Registro modificado correctamente"

  #@reporte
  Scenario: CPF304 - Configurar alarma/Eliminar configuracion de alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en boton eliminar
    And validar alerta de confirmacion "¿Está Seguro de Eliminar la alarma Seleccionada?"
    And click en el boton aceptar
    And validar mensaje "Registro eliminado correctamente"

  #@reporte
  Scenario: CPF305 - Configurar alarma/Actualizar configuracion de alarma
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el boton editar
    And ingresar fin de mensaje "Actualizado"
    And ingresar asunto de correo "Actualizado"
    And seleccionar al usuario "MBENITES"
    And ingresar otro correo electronico "email@gys.com"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Está Seguro de Actualizar la configuración de la alarma?"
    And click en el boton aceptar
    And validar mensaje "Registro modificado correctamente"

######## MONITOREAR ALARMAS ########
  #@reporte
  Scenario: CPF306 - Monitorear alarmas/Visualizar pantalla de monitorear alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion monitorear alarmas
    And visualizar informacion de "Monitorear Alarmas"
    And validar columna "Alarma"
    And validar columna "Módulo"
    And validar columna "Tipo Alarma"
    And validar columna "Equipo"
    And validar columna "Mensaje"
    And validar columna "Fecha Generación"
    And validar columna "Importancia"
    And validar columna "Acciones"

  #@reporte
  Scenario: CPF307 - Monitorear alarmas/Atender alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion monitorear alarmas
    And visualizar informacion de "Monitorear Alarmas"
    And click en el boton configuracion
    And validar popup "Atención de alarma generadas:"
    And ingresar descripcion de atencion "test"
    And click en el boton guardar
    And validar mensaje "Atención realizada correctamente"

######## ALARMAS GENERADAS ########
  #@reporte
  Scenario: CPF308 - Alarmas generadas/Visualizar pantalla de alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion alarmas generadas
    And visualizar informacion de "Alarmas Generadas"
    And seleccionar fecha desde "01/08/2024"
    And ingresar la hora desde "000000"
    And seleccionar fecha hasta "10/08/2024"
    And ingresar la hora hasta "235959"
    And seleccionar el modulo "Todos"
    And seleccionar el estado "Todos"
    And seleccionar tipo de alarma "Todos"
    And click en el boton buscar
    And validar columna "Alarma"
    And validar columna "Módulo"
    And validar columna "Tipo Alarma"
    And validar columna "Equipo"
    And validar columna "Mensaje"
    And validar columna "Fecha Generación"
    And validar columna "Importancia"
    And validar columna "Fecha Actualización"
    And validar columna "Descripción Actualización"
    And validar columna "Estado"

  #@reporte
  Scenario: CPF309 - Alarmas generadas/Consultar alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion alarmas generadas
    And seleccionar fecha desde "01/08/2024"
    And ingresar la hora desde "000000"
    And seleccionar fecha hasta "10/08/2024"
    And ingresar la hora hasta "235959"
    And seleccionar el modulo "Todos"
    And seleccionar el estado "Todos"
    And seleccionar tipo de alarma "Todos"
    And click en el boton buscar

  #@reporte
  Scenario: CPF310 - Alarmas generadas/Exportar excel, pdf e imprimir alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion alarmas generadas
    And seleccionar fecha desde "01/08/2024"
    And ingresar la hora desde "000000"
    And seleccionar fecha hasta "10/08/2024"
    And ingresar la hora hasta "235959"
    And seleccionar el modulo "Todos"
    And seleccionar el estado "Todos"
    And seleccionar tipo de alarma "Todos"
    And click en el boton buscar
    And click en el boton pdf
    And click en el boton excel
    And click en el boton imprimir