Feature: Funcionalidad del modulo Consultas

  Scenario: CPF151 - Visualizar modulo consultas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And visualizar la opcion usuario
    And visualizar la opcion companias
    And visualizar la option turnos
    And visualizar la opcion detalle de ticket bp
    And visualizar la opcion tickets bp por fecha
    And visualizar la opcion cuadre de stickers emitidos o bp usados
    And visualizar la opcion operacion compra venta
    And visualizar la opcion tickets bp usados
    And visualizar la opcion tickets bp anulados
    And visualizar la opcion auditoria
    And visualizar la opcion tickets procesados
    And visualizar la opcion log de errores de molinetes
    And visualizar la opcion sincronizacion
    And visualizar la opcion transaccion critica
    And visualizar la opcion depuracion

######## USUARIOS ########

  Scenario: CPF152 - Usuarios/Buscar usuarios
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion usuarios
    And seleccionar rol "ADMIN"
    And seleccionar estado "VIGENTE"
    And seleccionar grupo "TOTAL"
    And click en el boton buscar
    And visualizar lista de "Usuario"

  Scenario Outline: CPF152 - Usuarios/Buscar usuarios
    Given abre la ruta del aplicativo web
    And ingresa el usuario "<usuario>"
    And ingresa la contrasena "<contrasena>"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion usuarios
    And seleccionar rol "<rol>"
    And seleccionar estado "<estado>"
    And seleccionar grupo "<grupo>"
    And click en el boton buscar
    And visualizar lista de "<titulo>"
    Examples:
      | usuario | contrasena | rol         | estado  | grupo | titulo  |
      | fluyo   | fluyo987   | CAJERO TUUA | ANULADO | LAP   | Usuario |
      | fluyo   | fluyo987   | ADMIN       | VIGENTE | TOTAL | Users   |

  Scenario: CPF153 - Usuarios/Imprimir lista de usuarios
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion usuarios
    And seleccionar rol "ADMIN"
    And seleccionar estado "VIGENTE"
    And seleccionar grupo "TOTAL"
    And click en el boton buscar
    And click en imprimir

######## COMPAÑIAS ########

  Scenario: CPF154 - Companias/Buscar companias
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion companias
    And seleccionar rol "<Todos>"
    And seleccionar estado "<Todos>"
    And seleccionar grupo "<Todos>"
    And click en el boton buscar
    And visualizar lista de "Compañias"

  Scenario: CPF155 - Companias/Imprimir lista de companias
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion companias
    And seleccionar rol "<Todos>"
    And seleccionar estado "<Todos>"
    And seleccionar grupo "<Todos>"
    And click en el boton buscar
    And click en imprimir

######## TURNOS ########

  Scenario: CPF156 - Turnos/Buscar turnos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion turnos
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar usuario "Tamara Olaechea"
    And ingresar numero de caja ""
    And click en el boton buscar
    And visualizar lista de "Turnos"

  Scenario: CPF157 - Turnos/Ver detalle de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion turnos
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar usuario "Tamara Olaechea"
    And ingresar numero de caja "V00015"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el registro de detalle del turno
    And click en el boton cerrar

  Scenario: CPF158 - Turnos/Imprimir detalle de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion turnos
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar usuario "Tamara Olaechea"
    And ingresar numero de caja "V00015"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el registro de detalle del turno
    And click en el boton cerrar
    And click en imprimir

  Scenario: CPF159 - Turnos/Imprimir consulta de turnos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion turnos
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar usuario "Tamara Olaechea"
    And ingresar numero de caja "V00015"
    And click en el boton buscar
    And click en imprimir consulta

  Scenario: CPF160 - Turnos/Exportar excel consulta de turnos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion turnos
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar usuario "Tamara Olaechea"
    And ingresar numero de caja "V00015"
    And click en el boton buscar
    And click en exportar excel

######## DETALLE TICKET / BP ########

  Scenario: CPF161 - Detalle de ticket-bp/Buscar detalle de ticket-bp
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion detalle de ticket bp
    And seleccionar por numero de ticket
    And ingresar numero ticket "1000602350183940"
    And click en el boton buscar
    And seleccionar por rango de ticket
    And ingresar el numero de ticket desde "1000602350183940"
    And ingresar el numero de ticket hasta "1000602350183999"
    And click en el boton buscar
    And seleccionar por boarding
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "01/01/2024"
    And ingresar numero de vuelo "4A4001"
    And ingresar asiento "016A"
    And ingresar persona "ESCOBEDO FARJE MERCY"
    And click en el boton buscar

  Scenario: CPF16x - Detalle de ticket-bp/Exportar excel e imprimir detalle de ticket-bp por numero de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion detalle de ticket bp
    And seleccionar por numero de ticket
    And ingresar numero ticket "1000602350183940"
    And click en el boton buscar
    And click en exportar excel
    And click en imprimir consulta

  Scenario: CPF16x - Detalle de ticket-bp/Exportar excel e imprimir detalle de ticket-bp por rango de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion detalle de ticket bp
    And seleccionar por rango de ticket
    And ingresar el numero de ticket desde "1000602350183940"
    And ingresar el numero de ticket hasta "1000602350183999"
    And click en el boton buscar
    And click en exportar excel
    And click en imprimir consulta

  Scenario: CPF16x - Detalle de ticket-bp/Exportar excel e imprimir detalle de ticket-bp por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion detalle de ticket bp
    And seleccionar por boarding
    And seleccionar compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "01/01/2024"
    And ingresar numero de vuelo "4A4001"
    And ingresar asiento "016A"
    And ingresar persona "ESCOBEDO FARJE MERCY"
    And click en el boton buscar

######## TICKET / BP POR FECHA ########

  Scenario: CPF162 - Tickets-bp por fecha/Buscar tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    And seleccionar la fecha desde "01/01/2024"
    And seleccionar la fecha hasta "02/01/2024"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "Por Emision"
    And ingresar una compania "AERO TRANSPORTE  S. A."
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar cajero "Tamara Olaechea"
    And click en el boton buscar

  Scenario: CPF163 - Tickets-bp por fecha/Ver detalle de tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    And seleccionar la fecha desde "01/01/2024"
    And seleccionar la fecha hasta "02/01/2024"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "Por Emision"
    And ingresar una compania "AERO TRANSPORTE  S. A."
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el boton cerrar

  Scenario: CPF164 - Tickets-bp por fecha/Imprimir tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    And seleccionar la fecha desde "01/01/2024"
    And seleccionar la fecha hasta "02/01/2024"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "Por Emision"
    And ingresar una compania "AERO TRANSPORTE  S. A."
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en imprimir consulta

  Scenario: CPF165 - Tickets-bp por fecha/Exportar excel tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    And seleccionar la fecha desde "01/01/2024"
    And seleccionar la fecha hasta "02/01/2024"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "TODOS"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "Por Emision"
    And ingresar una compania "AERO TRANSPORTE  S. A."
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en exportar excel

######## CUADRE DE STICKERS EMITIDOS O BP USADOS ########

  Scenario: CPF166 - Cuadre de stickers emitidos o bp usados/Buscar por ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Ticket"
    And click en el boton buscar
    And visualizar informacion de "Cuadre de tickets emitidos"

  Scenario: CPF167 - Cuadre de stickers emitidos o bp usados/Buscar por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Boarding"
    And click en el boton buscar
    And visualizar informacion de "Cuadre de tickets emitidos"

  Scenario: CPF168 - Cuadre de stickers emitidos o bp usados/Imprimir por ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Ticket"
    And click en el boton buscar
    And click en imprimir consulta

  Scenario: CPF169 - Cuadre de stickers emitidos o bp usados/Imprimir por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Boarding"
    And click en el boton buscar
    And click en imprimir consulta

  Scenario: CPF170 - Cuadre de stickers emitidos o bp usados/Exportar excel por ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Ticket"
    And click en el boton buscar
    And click en exportar excel

  Scenario: CPF171 - Cuadre de stickers emitidos o bp usados/Exportar excel por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Boarding"
    And click en el boton buscar
    And click en exportar excel

######## OPERACION COMPRA / VENTA ########

  Scenario: CPF172 - Operacion compra-venta/Buscar operacion compra-venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion operacion compra venta
    And ingresar fecha de proceso "01/01/2024"
    And seleccionar usuario "Estefania Olivo"
    And click en el boton buscar
    And visualizar operacion compra
    And visualizar operacion venta

  Scenario: CPF173 - Operacion compra-venta/Imprimir operacion compra-venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion operacion compra venta
    And ingresar fecha de proceso "01/01/2024"
    And seleccionar usuario "Estefania Olivo"
    And click en el boton buscar
    And click en imprimir

######## TICKETS / BP USADOS ########

  Scenario: CPF174 - Tickets-bp usados/Buscar tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar la fecha desde "01/01/2024"
    And seleccionar la fecha hasta "02/01/2024"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar el tipo de documento "Ticket"
    And seleccionar el tipo vuelo "INTERNACIONAL"
    And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    And seleccionar una aerolinea "AERO TRANSPORTE  S. A."
    And ingresar el numero de vuelo "4A4001"
    And ingresar tipo de persona "ADULTO"
    #And seleccionar fecha vuelo "01/01/2024"
    And click en el boton buscar
    And visualizar lista de "Ticket / BP Usado"

  Scenario: CPF175 - Tickets-bp usados/Ver detalle de tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar la fecha desde "01/01/2024"
    And seleccionar la fecha hasta "02/01/2024"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar el tipo de documento "Ticket"
    And seleccionar el tipo vuelo "INTERNACIONAL"
    And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    And seleccionar una aerolinea "AERO TRANSPORTE  S. A."
    And ingresar el numero de vuelo "4A4001"
    And ingresar tipo de persona "ADULTO"
    #And seleccionar fecha vuelo "01/01/2024"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el boton cerrar

  Scenario: CPF176 - Tickets-bp usados/Imprimir tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar la fecha desde "01/01/2024"
    And seleccionar la fecha hasta "02/01/2024"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar el tipo de documento "Ticket"
    And seleccionar el tipo vuelo "INTERNACIONAL"
    And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    And seleccionar una aerolinea "AERO TRANSPORTE  S. A."
    And ingresar el numero de vuelo "4A4001"
    And ingresar tipo de persona "ADULTO"
    #And seleccionar fecha vuelo "01/01/2024"
    And click en el boton buscar
    And click en imprimir consulta

  Scenario: CPF177 - Tickets-bp usados/Exportar excel de tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar la fecha desde "01/01/2024"
    And seleccionar la fecha hasta "02/01/2024"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar el tipo de documento "Ticket"
    And seleccionar el tipo vuelo "INTERNACIONAL"
    And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    And seleccionar una aerolinea "AERO TRANSPORTE  S. A."
    And ingresar el numero de vuelo "4A4001"
    And ingresar tipo de persona "ADULTO"
    #And seleccionar fecha vuelo "01/01/2024"
    And click en el boton buscar
    And click en exportar excel

######## AUDITORIA ########

  Scenario: CPF181 - Auditoria/Buscar auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion auditoria
    And seleccionar fecha desde "16/06/2024"
    And seleccionar fecha hasta "17/06/2024"
    And escribir hora desde "000000"
    And ingresar hora hasta "100000"
    And seleccionar operacion "Inicio Sesion"
    And seleccionar tabla "<Todos>"
    And seleccionar modulo "Administracion Web"
    And seleccionar submodulo "Login Web"
    And seleccionar al usuario "Nando Luyo"
    And click en el boton buscar
    And visualizar informacion de "Auditoría"

  Scenario: CPF182 - Auditoria/Ver detalle de auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion auditoria
    And seleccionar fecha desde "16/06/2024"
    And seleccionar fecha hasta "17/06/2024"
    And escribir hora desde "000000"
    And ingresar hora hasta "100000"
    And seleccionar operacion "Inicio Sesion"
    And seleccionar tabla "<Todos>"
    And seleccionar modulo "Administracion Web"
    And seleccionar submodulo "Login Web"
    And seleccionar al usuario "Nando Luyo"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el boton cerrar

  Scenario: CPF183 - Auditoria/Imprimir auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion auditoria
    And seleccionar fecha desde "16/06/2024"
    And seleccionar fecha hasta "17/06/2024"
    And escribir hora desde "000000"
    And ingresar hora hasta "100000"
    And seleccionar operacion "Inicio Sesion"
    And seleccionar tabla "<Todos>"
    And seleccionar modulo "Administracion Web"
    And seleccionar submodulo "Login Web"
    And seleccionar al usuario "Nando Luyo"
    And click en el boton buscar
    And click en el boton imprimir

######## TICKES PROCESADOS ########

  Scenario: CPF185 - Tickets procesados/Buscar tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031962"
    And click en el boton buscar
    And visualizar informacion de "Tickets Procesados"

  Scenario: CPF186 - Tickets procesados/Imprimir tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031962"
    And click en el boton buscar
    And click en imprimir consulta

  Scenario: CPF187 - Tickets procesados/Exportar excel de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031962"
    And click en el boton buscar
    And click en exportar excel

  Scenario: CPF189 - Tickets procesados/Ver detalle de turno de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Estefania Olivo"
    And ingresar codigo de turno "031963"
    And click en el boton buscar
    And click en boton ver detalle

  Scenario: CPF190 - Tickets procesados/Ver detalle de tickets de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Estefania Olivo"
    And ingresar codigo de turno "031963"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el boton ver detalle de ticket
    And click en el boton cerrar

  Scenario: CPF191 - Tickets procesados/Imprimir detalle de turno de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Estefania Olivo"
    And ingresar codigo de turno "031963"
    And click en el boton buscar
    And click en imprimir consulta

  Scenario: CPF192 - Tickets procesados/Exportar excel de detalle de turno de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Estefania Olivo"
    And ingresar codigo de turno "031963"
    And click en el boton buscar
    And click en el boton ver detalle
    And click en exportar excel

######## LOG DE ERRORES MOLINETE ########

  Scenario: CPF193 - Log de errores de molinetes/Buscar tipo de error funcional
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion log de errores de molinetes
    And seleccionar la fecha desde "03/12/2023"
    And seleccionar la fecha hasta "04/12/2023"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar tipo error "Funcional"
    And seleccionar error "Todos"
    And seleccionar compania "AVIANCA-AEROVIAS DEL CONTINENTE AMERICANO"
    And seleccionar molinete "Todos"
    And ingresar fecha vuelo "03/12/2023"
    And ingresar numero de vuelo "AV696"
    And ingresar asiento "016C"
    And ingresar persona "CARRASCO"
    And seleccionar tipo bp "2D"
    And seleccionar tipo ingreso "Todos"
    And click en el boton buscar
    And visualizar informacion de "Log de errores molinete"

  Scenario: CPF194 - Log de errores de molinetes/Buscar tipo de error no funcional
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion log de errores de molinetes
    And seleccionar la fecha desde "03/12/2023"
    And seleccionar la fecha hasta "04/12/2023"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar tipo error "No Funcional"
    And seleccionar error "Todos"
    And seleccionar compania "AVIANCA-AEROVIAS DEL CONTINENTE AMERICANO"
    And seleccionar molinete "Todos"
    And ingresar fecha vuelo "03/12/2023"
    And ingresar numero de vuelo "AV696"
    And ingresar asiento "016C"
    And ingresar persona "CARRASCO"
    And seleccionar tipo bp "2D"
    And seleccionar tipo ingreso "Todos"
    And click en el boton buscar
    And visualizar informacion de "Log de errores molinete"

  Scenario: CPF195 - Log de errores de molinetes/Exportar excel de error funcional
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion log de errores de molinetes
    And seleccionar la fecha desde "03/12/2023"
    And seleccionar la fecha hasta "04/12/2023"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar tipo error "Funcional"
    And seleccionar error "Todos"
    And seleccionar compania "AVIANCA-AEROVIAS DEL CONTINENTE AMERICANO"
    And seleccionar molinete "Todos"
    And ingresar fecha vuelo "03/12/2023"
    And ingresar numero de vuelo "AV696"
    And ingresar asiento "016C"
    And ingresar persona "CARRASCO"
    And seleccionar tipo bp "2D"
    And seleccionar tipo ingreso "Todos"
    And click en el boton buscar
    And click en el boton reporte

  Scenario: CPF196 - Log de errores de molinetes/Exportar excel de error no funcional
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion log de errores de molinetes
    And seleccionar la fecha desde "03/12/2023"
    And seleccionar la fecha hasta "04/12/2023"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar tipo error "No Funcional"
    And seleccionar error "Todos"
    And seleccionar compania "AVIANCA-AEROVIAS DEL CONTINENTE AMERICANO"
    And seleccionar molinete "Todos"
    And ingresar fecha vuelo "03/12/2023"
    And ingresar numero de vuelo "AV696"
    And ingresar asiento "016C"
    And ingresar persona "CARRASCO"
    And seleccionar tipo bp "2D"
    And seleccionar tipo ingreso "Todos"
    And click en el boton buscar
    And click en el boton reporte

######## SINCRONIZACION ########

  Scenario: CPF20x - Sincronizacion/Buscar sincronizacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion sincronizacion
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "01/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar el molinete "NORMAL INTER M4"
    And seleccionar un estado "Terminado"
    And seleccionar tabla de sincronizacion "Boarding"
    And seleccionar tipo de sincronizacion "<Todos>"
    And click en el boton buscar
    And visualizar informacion de "Sincronización"

  Scenario: CPF20x - Sincronizacion/Exportar informe de sincronizacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion sincronizacion
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "01/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar el molinete "NORMAL INTER M4"
    And seleccionar un estado "Terminado"
    And seleccionar tabla de sincronizacion "Boarding"
    And seleccionar tipo de sincronizacion "<Todos>"
    And click en el boton buscar
    And click en exportar excel

######## TRANSACCION CRITICA ########

  Scenario: CPF200 - Transaccion critica/Buscar transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion transaccion critica
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar operacion "Eliminación"
    And seleccionar tabla "TUA_ModVentaCompAtr"
    And seleccionar modulo "Mantenimiento"
    And seleccionar submodulo "Compañía"
    And seleccionar el usuario "<Todos>"
    And click en el boton buscar
    And visualizar informacion de "Transaccion crítica"

  Scenario: CPF201 - Transaccion critica/Ver detalle de transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion transaccion critica
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar operacion "Eliminación"
    And seleccionar tabla "TUA_ModVentaCompAtr"
    And seleccionar modulo "Mantenimiento"
    And seleccionar submodulo "Compañía"
    And seleccionar el usuario "<Todos>"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el boton cerrar

  Scenario: CPF202 - Transaccion critica/Imprimir transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion transaccion critica
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar operacion "Eliminación"
    And seleccionar tabla "TUA_ModVentaCompAtr"
    And seleccionar modulo "Mantenimiento"
    And seleccionar submodulo "Compañía"
    And seleccionar el usuario "<Todos>"
    And click en el boton buscar
    And click en imprimir

######## DEPURACION ########

  Scenario: CPF204 - Depuracion/Buscar depuracion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion depuracion
    And seleccionar fecha desde "01/03/2022"
    And seleccionar fecha hasta "31/12/2023"
    And escribir hora desde "00:00:00"
    And escribir hora hasta "23:00:00"
    And ingresar molinete "NORMAL INTER M4"
    And ingresar tabla "Ticket"
    And ingresar el estado "En Proceso"
    And click en el boton buscar
    And visualizar informacion de "Depuración"

  Scenario: CPF207 - Depuracion/Exportar informe depuracion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion depuracion
    And seleccionar fecha desde "01/03/2022"
    And seleccionar fecha hasta "31/12/2023"
    And escribir hora desde "00:00:00"
    And escribir hora hasta "23:00:00"
    And ingresar molinete "NORMAL INTER M4"
    And ingresar tabla "Ticket"
    And ingresar el estado "En Proceso"
    And click en el boton buscar
    And click en el boton excel