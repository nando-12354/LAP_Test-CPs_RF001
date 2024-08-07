Feature: Funcionalidad del modulo Rehabilitacion

  Scenario: CPF109 - Visualizar modulo rehabilitacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And visualizar la opcion ticket
    And visualizar la subopcion "Ticket Normal"
    And visualizar la subopcion "Tickets Masivo"
    And visualizar la subopcion "Tickets Por Salida"
    And visualizar la subopcion "Tickets Por Vuelo"
    And visualizar la subopcion "Tickets Por Rango"
    And visualizar la subopcion "Tickets Por Fecha"
    And visualizar la opcion boarding pass
    And visualizar la subopcion "Boarding Pass Normal"
    And visualizar la subopcion "Boarding Pass Masivo"
    And visualizar la subopcion "Boarding Pass Por Salida"
    And visualizar la subopcion "Boarding Pass Por Vuelo"
    And visualizar la subopcion "Boarding Pass Por Fecha"

######## TICKET NORMAL ########

  Scenario: CPF110 - Ticket normal/Agregar ticket normal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket normal
    And ingresar numero de ticket "1000602341073618"
    And click en el boton agregar ticket
    And visualizar el ticket agregado "1000602341073618"
    And validar columna "Número"
    And validar columna "Código de ticket"
    And validar columna "Observaciones"
    And validar columna "Motivo"
    And validar columna "Acciones"


  Scenario: CPF111 - Ticket normal/Consultar representante de ticket normal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket normal
    And click en el boton representante
    And elegir compania "AEROLINEA GENERICA"
    And visualizar "Representante" de la compania


  Scenario: CPF112 - Ticket normal/Ver detalle de ticket normal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket normal
    And ingresar numero de ticket "5000604359486400"
    And click en el boton agregar ticket
    And click en boton ver detalle
    And visualizar el "Detalle: Ticket"
    And click en el boton cerrar


  Scenario: CPF113 - Ticket normal/Rehabilitar ticket normal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket normal
    And ingresar numero de ticket "5000604332878316"
    And click en el boton agregar ticket
    And seleccionar ticket "si"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "¿Desea continuar con la Rehabilitación?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton excel
    And click en el boton imprimir
    And click en el boton aceptar

######## TICKET MASIVO ########

  Scenario: CPF114 - Ticket masivo/Agregar ticket masivo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket masivo
    And ingresar numero de ticket "1000602341073618"
    And click en el boton agregar ticket
    And visualizar el ticket agregado "1000602341073618"
    And validar columna "Número"
    And validar columna "Código de ticket"
    And validar columna "Observaciones"
    And validar columna "Acciones"


  Scenario: CPF115 - Ticket masivo/Consultar representante de ticket masivo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket masivo
    And click en el boton representante
    And elegir compania "AEROLINEA GENERICA"
    And visualizar "Representante" de la compania


  Scenario: CPF116 - Ticket masivo/Ver detalle de ticket masivo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket masivo
    And ingresar numero de ticket "1000602341074119"
    And click en el boton agregar ticket
    And click en boton ver detalle
    And visualizar el "Detalle: Ticket"
    And click en el boton cerrar


  Scenario: CPF117 - Ticket masivo/Rehabilitar ticket masivo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket masivo
    And ingresar numero de ticket "5000604332971314"
    And click en el boton agregar ticket
    And seleccionar ticket "si"
    And seleccionar un motivo "Cierre de aeropuerto de destino"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "¿Desea continuar con la Rehabilitación?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton excel
    And click en el boton imprimir
    And click en el boton aceptar

######## TICKET POR SALIDA ########

  Scenario: CPF118 - Ticket por salida/Agregar ticket por salida
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por salida
    And ingresar fecha de vuelo "03/07/2020"
    And click en el boton agregar ticket
    And visualizar lista de "Tickets Por Salida"
    And validar columna "Número de vuelo"
    And validar columna "Código ticket"
    And validar columna "Fecha de creación"
    And validar columna "Fecha de registro en tabla temporal"
    And validar columna "Acciones"


  Scenario: CPF119 - Ticket por salida/Ver detalle de ticket por salida
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por salida
    And ingresar fecha de vuelo "03/07/2020"
    And click en el boton agregar ticket
    And click en el boton ver detalle
    And visualizar el "Detalle: Ticket"
    And click en el boton cerrar


  Scenario: CPF120 - Ticket por salida/Rehabilitar ticket por salida
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por salida
    And ingresar fecha de vuelo "03/07/2020"
    And click en el boton agregar ticket
    And seleccionar ticket "si"
    And seleccionar motivo "Alertas de bomba en el AIJCh"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "¿Desea continuar con la Rehabilitación?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en boton excel
    And click en boton imprimir
    And click en el boton aceptar

######## TICKET POR VUELO ########

  Scenario: CPF121 - Ticket por vuelo/Buscar ticket por vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por vuelo
    And seleccionar una compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "04/01/2024"
    And seleccionar vuelo "4A024"
    And click en el boton buscar
    And visualizar lista de "Tickets Por Vuelo"
    And validar columna "Nro"
    And validar columna "Código de ticket"
    And validar columna "Observaciones"
    And validar columna "Acciones"


  Scenario: CPF122 - Ticket por vuelo/Consultar representante de ticket por vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por vuelo
    And click en el boton representante
    And elegir compania "AEROLINEA GENERICA"
    And visualizar "Representante" de la compania


  Scenario: CPF123 - Ticket por vuelo/Ver detalle de ticket por vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por vuelo
    And seleccionar una compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "04/01/2024"
    And seleccionar vuelo "4A024"
    And click en el boton buscar
    And click en el boton ver detalle
    And visualizar el "Detalle: Ticket"
    And click en el boton cerrar


  Scenario: CPF124 - Ticket por vuelo/Rehabilitar ticket por vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por vuelo
    And seleccionar una compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "04/01/2024"
    And seleccionar vuelo "4A024"
    And click en el boton buscar
    And seleccionar ticket "si"
    And seleccionar motivo "Alertas de bomba en el AIJCh"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "Se rehabilitarán todos los tickets seleccionados."
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton imprimir
    And click en el boton aceptar

######## TICKET POR RANGO ########

  Scenario: CPF125 - Ticket por rango/Buscar ticket por rango
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por rango
    And ingresar numero ticket desde "5000604373685149"
    And ingresar numero ticket hasta "5000604373685999"
    And click en el boton buscar
    And visualizar lista de "Tickets Por Rango"
    And validar columna "Número"
    And validar columna "Código de ticket"
    And validar columna "Observaciones"
    And validar columna "Acciones"


  Scenario: CPF126 - Ticket por rango/Consultar representante de ticket por rango
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por rango
    And click en el boton representante
    And elegir compania "AEROLINEA GENERICA"
    And visualizar "Representante" de la compania


  Scenario: CPF127 - Ticket por rango/Ver detalle de ticket por rango
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por rango
    And ingresar numero ticket desde "5000604373685149"
    And ingresar numero ticket hasta "5000604373685999"
    And click en el boton buscar
    And click en el boton ver detalle
    And visualizar el "Detalle: Ticket"
    And click en el boton cerrar


  Scenario: CPF128 - Ticket por rango/Rehabilitar ticket por rango
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por rango
    And ingresar numero ticket desde "5000604373685149"
    And ingresar numero ticket hasta "5000604373685999"
    And click en el boton buscar
    And seleccionar ticket "si"
    And seleccionar motivo "Demora o Cancelación del vuelo X mal tiempo"
    And click en el boton rehabilitar
    And validar alerta de confirmacion "¿Desea Continuar con la Rehabilitacion?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton imprimir
    And click en el boton aceptar

######## TICKET POR FECHA ########

  Scenario: CPF129 - Ticket por fecha/Buscar ticket por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por fecha
    And ingresar fecha desde "01/01/2024"
    And ingresar fecha hasta "03/01/2024"
    And click en el boton buscar
    And visualizar lista de "Tickets Por Fecha"
    And validar columna "Número"
    And validar columna "Código de ticket"
    And validar columna "Observaciones"
    And validar columna "Acciones"


  Scenario: CPF130 - Ticket por fecha/Consultar representante de ticket por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por fecha
    And click en el boton representante
    And elegir compania "AEROLINEA GENERICA"
    And visualizar "Representante" de la compania


  Scenario: CPF131 - Ticket por fecha/Ver detalle de ticket por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por fecha
    And ingresar fecha desde "01/01/2024"
    And ingresar fecha hasta "03/01/2024"
    And click en el boton buscar
    And click en el boton ver detalle
    And visualizar el "Detalle: Ticket"
    And click en el boton cerrar


  Scenario: CPF132 - Ticket por fecha/Rehabilitar ticket por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por fecha
    And ingresar fecha desde "01/01/2024"
    And ingresar fecha hasta "03/01/2024"
    And click en el boton buscar
    And seleccionar ticket "si"
    And seleccionar motivo "Alertas de bomba en el AIJCh"
    And click en el boton rehabilitar
    And validar alerta de confirmacion "¿Desea Continuar con la Rehabilitacion?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton imprimir
    And click en el boton aceptar

######## BOARDING PASS NORMAL ########

  Scenario: CPF133 - Boarding pass normal/Agregar boarding pass normal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass normal
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "05/01/2024"
    And ingresar numero de vuelo "4A4041"
    And ingresar asiento "011D"
    And ingresar persona "CORDOVA ALIAGA LUCER"
    And click en el boton agregar bp
    And visualizar lista de "Boarding Pass Normal"
    And validar columna "Número"
    And validar columna "Descripción BCBP"
    And validar columna "Observaciones"
    And validar columna "Motivo"
    And validar columna "Asociar"
    And validar columna "BCBP Asociado"
    And validar columna checkbox "Bloquear"
    And validar columna checkbox "Seleccionar"
    And validar columna "Acciones"


  Scenario: CPF134 - Boarding pass normal/Consultar representante de boarding pass normal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass normal
    And click en el boton representante
    And elegir compania "AEROLINEA GENERICA"
    And visualizar "Representante" de la compania


  Scenario: CPF135 - Boarding pass normal/Ver detalle de boarding pass normal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass normal
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "05/01/2024"
    And click en el boton agregar bp
    And click en el boton ver detalle
    And visualizar el "Detalle: Boarding"
    And click en el boton cerrar


  Scenario: CPF136 - Boarding pass normal/Rehabilitar boarding pass normal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass normal
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "05/01/2024"
    And click en el boton agregar bp
    And seleccionar boarding "si"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "¿Desea continuar con la Rehabilitación?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton excel
    And click en el boton pdf
    And click en el boton imprimir voucher
    And click en el boton aceptar

######## BOARDING PASS MASIVO ########

  Scenario: CPF137 - Boarding pass masivo/Agregar boarding pass masivo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass masivo
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "05/01/2024"
    And ingresar numero de vuelo "4A4041"
    And ingresar asiento "011A"
    And ingresar persona "FIGUEROA ATENCIA NEL"
    And click en el boton agregar bp
    And visualizar lista de "Boarding pass masivo"
    And validar columna "Número"
    And validar columna "Descripción BCBP"
    And validar columna "Observaciones"
    And validar columna "Asociar"
    And validar columna "BCBP Asociado"
    And validar columna checkbox "Bloquear"
    And validar columna checkbox "Seleccionar"
    And validar columna "Acciones"


  Scenario: CPF138 - Boarding pass masivo/Consultar representante de boarding pass masivo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass masivo
    And click en el boton representante
    And elegir compania "AEROLINEA GENERICA"
    And visualizar "Representante" de la compania


  Scenario: CPF139 - Boarding pass masivo/Ver detalle de boarding pass masivo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass masivo
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "31/01/2024"
    And click en el boton agregar bp
    And click en el boton ver detalle
    And visualizar el "Detalle: Boarding"
    And click en el boton cerrar


  Scenario: CPF140 - Boarding pass masivo/Rehabilitar boarding pass masivo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass masivo
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "31/01/2024"
    And click en el boton agregar bp
    And seleccionar boarding "si"
    And seleccionar motivo "Alertas de bomba en el AIJCh"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "¿Desea continuar con la Rehabilitación?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton excel
    And click en el boton imprimir
    And click en el boton voucher
    And click en el boton aceptar

######## BOARDING PASS POR SALIDA ########

  Scenario: CPF141 - Boarding pass por salida/Agregar boarding pass por salida
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por salida
    And seleccionar compania "VIVA AIRLINES S.A.C."
    And ingresar fecha de vuelo "08/12/2018"
    And ingresar un numero de vuelo "VV400"
    And click en el boton agregar bp
    And visualizar lista de "Boarding Pass por Salida"
    And validar columna "Número Vuelo"
    And validar columna "Código BCBP"
    And validar columna "Fecha Creación"
    And validar columna "Fecha de registro en tabla temporal"
    And validar columna "Acciones"


  Scenario: CPF142 - Boarding pass por salida/Ver detalle de boarding pass por salida
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por salida
    And seleccionar compania "VIVA AIRLINES S.A.C."
    And ingresar fecha de vuelo "08/12/2018"
    And ingresar un numero de vuelo "VV400"
    And click en el boton agregar bp
    And click en boton ver detalle
    And visualizar el "Detalle: Boarding"
    And click en el boton cerrar


  Scenario: CPF143 - Boarding pass por salida/Rehabilitar boarding pass por salida
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por salida
    And seleccionar compania "VIVA AIRLINES S.A.C."
    And ingresar fecha de vuelo "08/12/2018"
    And ingresar un numero de vuelo "VV400"
    And click en el boton agregar bp
    And seleccionar boardings "si"
    And seleccionar motivo "Demora o Cancelación del vuelo, X Peligro Aviario"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "¿Desea continuar con la Rehabilitación?"
    And click en el boton aceptar
    And validar mensaje exitoso "La rehabilitación concluyó satisfactoriamente"
    And click en el boton excel
    And click en boton pdf
    And click en el boton aceptar

######## BOARDING PASS POR VUELO ########

  Scenario: CPF144 - Boarding pass por vuelo/Buscar boarding pass por vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por vuelo
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha de vuelo "31/01/2024"
    And seleccionar vuelo "4A4091"
    And click en el boton buscar
    And visualizar lista de "Boarding Pass por Vuelo"
    And validar columna "Nro."
    And validar columna "Descripcion BCBP"
    And validar columna "Observaciones"
    And validar columna checkbox "Bloquear"
    And validar columna checkbox "Seleccionar"
    And validar columna "Acciones"


  Scenario: CPF145 - Boarding pass por vuelo/Consultar representante de boarding pass por vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por vuelo
    And click en el boton representante
    And elegir compania "AEROLINEA GENERICA"
    And visualizar "Representante" de la compania


  Scenario: CPF146 - Boarding pass por vuelo/Ver detalle de boarding pass por vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por vuelo
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha de vuelo "31/01/2024"
    And seleccionar vuelo "4A4091"
    And click en el boton buscar
    And click en boton ver detalle
    And visualizar el "Detalle: Boarding"
    And click en el boton cerrar


  Scenario: CPF147 - Boarding pass por vuelo/Rehabilitar boarding pass por vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por vuelo
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha de vuelo "01/01/2024"
    And seleccionar vuelo "4A4091"
    And click en el boton buscar
    And seleccionar boarding "si"
    And seleccionar motivo "Demora o Cancelación del vuelo X NOTAM"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "¿Desea continuar con la Rehabilitación?"
    And click en el boton aceptar
    And validar mensaje exitoso "Rehabilitación con éxito"
    And click en el boton imprimir
    And click en boton voucher
    And click en el boton aceptar

######## BOARDING PASS POR FECHA ########

  Scenario: CPF148 - Boarding pass por fecha/Buscar boarding pass por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por fecha
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha desde "01/01/2024"
    And ingresar la fecha hasta "07/01/2024"
    And click en el boton buscar
    And visualizar lista de "Boarding pass por fecha"
    And validar columna "Número"
    And validar columna "Descripción BCBP"
    And validar columna "Observaciones"
    And validar columna checkbox "Bloquear"
    And validar columna checkbox "Seleccionar"
    And validar columna "Acciones"


  Scenario: CPF149 - Boarding pass por fecha/Consultar representante de boarding pass por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por fecha
    And click en el boton representante
    And elegir compania "AEROLINEA GENERICA"
    And visualizar "Representante" de la compania


  Scenario: CPF150 - Boarding pass por fecha/Ver detalle de boarding pass por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por fecha
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha desde "01/01/2024"
    And ingresar la fecha hasta "07/01/2024"
    And click en el boton buscar
    And click en el boton ver detalle
    And visualizar el "Detalle: Boarding"
    And click en el boton cerrar


  Scenario: CPF151 - Boarding pass por fecha/Rehabilitar boarding pass por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por fecha
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha desde "01/01/2024"
    And ingresar la fecha hasta "07/01/2024"
    And click en el boton buscar
    And seleccionar boarding "si"
    And seleccionar motivo "Demora o Cancelación del vuelo, X Peligro Aviario"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "¿Desea continuar con la Rehabilitación?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton pdf
    And click en el boton imprimir
    And click en el boton aceptar