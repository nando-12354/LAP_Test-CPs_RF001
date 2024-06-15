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
    #And click en el boton imprimir

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
    And click en el boton imprimir

######## TURNOS ########

  Scenario: CPF156 - Turnos/Buscar turnos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion turnos
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
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
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar usuario "Tamara Olaechea"
    And ingresar numero de caja ""
    And click en el boton buscar
    And click en el boton ver detalle
    And click en el registro de detalle del turno
    And click en el boton cerrar

  Scenario: CPF158 - Turnos/Imprimir detalle de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion turnos
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar usuario "Tamara Olaechea"
    And ingresar numero de caja ""
    And click en el boton buscar
    And click en el boton ver detalle
    And click en el registro de detalle del turno
    And click en el boton cerrar
    #And click en el boton imprimir

  Scenario: CPF159 - Turnos/Imprimir consulta de turnos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion turnos
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar usuario "Tamara Olaechea"
    And ingresar numero de caja ""
    And click en el boton buscar
    #And click en el boton imprimir

  Scenario: CPF160 - Turnos/Exportar excel consulta de turnos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion turnos
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar usuario "Tamara Olaechea"
    And ingresar numero de caja ""
    And click en el boton buscar
    And click en el boton excel

######## DETALLE TICKET / BP ########

  Scenario: CPF161 - Detalle de ticket-bp/Buscar detalle de ticket-bp
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion detalle de ticket bp
    And seleccionar por numero de ticket
    #And ingresar numero de ticket "1000602350183940"
    And click en el boton buscar
    And seleccionar por rango de ticket
    #And ingresar numero ticket desde "1000602350183940"
    #And ingresar numero ticket hasta "1000602350183999"
    And click en el boton buscar
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
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "Por Emision"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
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
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "Por Emision"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en el boton ver detalle
    And click en el boton cerrar

  Scenario: CPF164 - Tickets-bp por fecha/Imprimir tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "Por Emision"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en el boton imprimir

  Scenario: CPF165 - Tickets-bp por fecha/Exportar informe tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "Por Emision"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en el boton excel

######## CUADRE DE STICKERS EMITIDOS O BP USADOS ########

  Scenario: CPF167 - Cuadre de stickers emitidos o bp usados/Buscar por ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And seleccionar tipo de documento "Ticket"
    And click en el boton buscar
    And visualizar informacion de "Cuadre de tickets emitidos"

  Scenario: CPF168 - Cuadre de stickers emitidos o bp usados/Buscar por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And seleccionar tipo de documento "Boarding"
    And click en el boton buscar
    And visualizar informacion de "Cuadre de tickets emitidos"

  Scenario: CPF169 - Cuadre de stickers emitidos o bp usados/Imprimir por ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And seleccionar tipo de documento "Ticket"
    And click en el boton buscar
    #And click en el boton imprimir

  Scenario: CPF170 - Cuadre de stickers emitidos o bp usados/Imprimir por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And seleccionar tipo de documento "Boarding"
    And click en el boton buscar
    #And click en el boton imprimir

  Scenario: CPF171 - Cuadre de stickers emitidos o bp usados/Exportar informe por ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And seleccionar tipo de documento "Ticket"
    And click en el boton buscar
    #And click en el boton excel

  Scenario: CPF172 - Cuadre de stickers emitidos o bp usados/Exportar informe por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "31/01/2024"
    #And seleccionar tipo de documento "Boarding"
    And click en el boton buscar
    #And click en el boton excel

######## OPERACION COMPRA / VENTA ########

  Scenario: CPF173 - Operacion compra-venta/Buscar operacion compra-venta
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

  Scenario: CPF174 - Operacion compra-venta/Imprimir operacion compra-venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion operacion compra venta
    And ingresar fecha de proceso "01/01/2024"
    And seleccionar usuario "Estefania Olivo"
    And click en el boton buscar
    #And click en el boton imprimir

  Scenario: CPF175 - Operacion compra-venta/Exportar informe de operacion compra-venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion operacion compra venta
    And ingresar fecha de proceso "01/01/2024"
    And seleccionar usuario "Estefania Olivo"
    And click en el boton buscar
    #And click en el boton excel

######## TICKETS / BP USADOS ########

  Scenario: CPF176 - Tickets-bp usados/Buscar tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    #And seleccionar tipo de documento "Ticket"
    #And seleccionar tipo de vuelo "INTERNACIONAL"
    #And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    #And ingresar numero de vuelo "4A4001"
    #And seleccionar tipo de persona "ADULTO"
    #And ingresar fecha de vuelo "01/01/2024"
    And click en el boton buscar
    And visualizar lista de "Ticket / BP Usado"

  Scenario: CPF177 - Tickets-bp usados/Ver detalle de tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    #And seleccionar tipo de documento "Ticket"
    #And seleccionar tipo de vuelo "INTERNACIONAL"
    #And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    #And ingresar numero de vuelo "4A4001"
    #And seleccionar tipo de persona "ADULTO"
    #And ingresar fecha de vuelo "01/01/2024"
    And click en el boton buscar
    And click en el boton ver detalle
    And click en el boton cerrar

  Scenario: CPF178 - Tickets-bp usados/Imprimir tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    #And seleccionar tipo de documento "Ticket"
    #And seleccionar tipo de vuelo "INTERNACIONAL"
    #And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    #And ingresar numero de vuelo "4A4001"
    #And seleccionar tipo de persona "ADULTO"
    #And ingresar fecha de vuelo "01/01/2024"
    And click en el boton buscar
    #And click en el boton imprimir

  Scenario: CPF179 - Tickets-bp usados/Exportar excel de tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    #And seleccionar tipo de documento "Ticket"
    #And seleccionar tipo de vuelo "INTERNACIONAL"
    #And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    #And ingresar numero de vuelo "4A4001"
    #And seleccionar tipo de persona "ADULTO"
    #And ingresar fecha de vuelo "01/01/2024"
    And click en el boton buscar
    #And click en el boton excel

######## AUDITORIA ########

  Scenario: CPF181 - Auditoria/Buscar auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion auditoria
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar operacion "Inicio Sesion"
    And seleccionar tabla "<Todos>"
    And seleccionar modulo "Administracion Web"
    And seleccionar submodulo "Login Web"
    And seleccionar usuario "Nando Luyo"
    And click en el boton buscar
    And visualizar informacion de "Auditoría"

  Scenario: CPF182 - Auditoria/Ver detalle de auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion auditoria
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar operacion "Inicio Sesion"
    And seleccionar tabla "<Todos>"
    And seleccionar modulo "Administracion Web"
    And seleccionar submodulo "Login Web"
    And seleccionar usuario "Nando Luyo"
    And click en el boton buscar
    And click en el boton ver detalle
    And click en el boton cerrar

  Scenario: CPF183 - Auditoria/Imprimir auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion auditoria
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar operacion "Inicio Sesion"
    And seleccionar tabla "<Todos>"
    And seleccionar modulo "Administracion Web"
    And seleccionar submodulo "Login Web"
    And seleccionar usuario "Nando Luyo"
    And click en el boton buscar
    And click en el boton imprimir

  Scenario: CPF184 - Auditoria/Exportar excel de auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion auditoria
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar operacion "Inicio Sesion"
    And seleccionar tabla "<Todos>"
    And seleccionar modulo "Administracion Web"
    And seleccionar submodulo "Login Web"
    And seleccionar usuario "Nando Luyo"
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
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031969"
    And click en el boton buscar
    And visualizar informacion de "Tickets Procesados"

  Scenario: CPF186 - Tickets procesados/Imprimir tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031969"
    And click en el boton buscar
    #And click en el boton imprimir

  Scenario: CPF187 - Tickets procesados/Exportar excel de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031969"
    And click en el boton buscar
    #And click en el boton excel

  Scenario: CPF189 - Tickets procesados/Ver detalle de turno de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031969"
    And click en el boton buscar
    And click en el boton ver detalle

  Scenario: CPF190 - Tickets procesados/Ver detalle de tickets de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031969"
    And click en el boton buscar
    And click en el boton ver detalle
    And click en el boton ver detalle
    And click en el boton cerrar

  Scenario: CPF191 - Tickets procesados/Imprimir detalle de turno de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031969"
    And click en el boton buscar
    And click en el boton ver detalle
    #And click en el boton imprimir

  Scenario: CPF192 - Tickets procesados/Exportar excel de detalle de turno de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031969"
    And click en el boton buscar
    And click en el boton ver detalle
    #And click en el boton imprimir

  Scenario: CPF193 - Log de errores de molinetes/Buscar tipo de error funcional
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion log de errores de molinetes
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar tipo error "Funcional"
    And seleccionar error "Todos"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    And seleccionar molinete "Todos"
    #And ingresar fecha de vuelo "01/01/2024"
    #And ingresar numero de vuelo ""
    And ingresar asiento "008A"
    And ingresar persona ""
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
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar tipo error "No funcional"
    And seleccionar error "Todos"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    And seleccionar molinete "Todos"
    #And ingresar fecha de vuelo "01/01/2024"
    #And ingresar numero de vuelo ""
    And ingresar asiento "008A"
    And ingresar persona ""
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
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar tipo error "Funcional"
    And seleccionar error "Todos"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    And seleccionar molinete "Todos"
    #And ingresar fecha de vuelo "01/01/2024"
    #And ingresar numero de vuelo ""
    And ingresar asiento "008A"
    And ingresar persona ""
    And seleccionar tipo bp "2D"
    And seleccionar tipo ingreso "Todos"
    And click en el boton buscar
    #And click en el boton excel

  Scenario: CPF196 - Log de errores de molinetes/Exportar excel de error no funcional
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion log de errores de molinetes
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar tipo error "No funcional"
    And seleccionar error "Todos"
    #And seleccionar compania "AERO TRANSPORTE  S. A."
    And seleccionar molinete "Todos"
    #And ingresar fecha de vuelo "01/01/2024"
    #And ingresar numero de vuelo ""
    And ingresar asiento "008A"
    And ingresar persona ""
    And seleccionar tipo bp "2D"
    And seleccionar tipo ingreso "Todos"
    And click en el boton buscar
    #And click en el boton excel

######## TRANSACCION CRITICA ########

  Scenario: CPF200 - Transaccion critica/Buscar transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion transaccion critica
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar operacion "Eliminación"
    And seleccionar tabla "TUA_ModVentaCompAtr"
    And seleccionar modulo "Mantenimiento"
    And seleccionar submodulo "Compañía"
    And seleccionar usuario "<Todos>"
    And click en el boton buscar
    And visualizar informacion de "Transaccion crítica"

  Scenario: CPF201 - Transaccion critica/Ver detalle de transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion transaccion critica
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar operacion "Eliminación"
    And seleccionar tabla "TUA_ModVentaCompAtr"
    And seleccionar modulo "Mantenimiento"
    And seleccionar submodulo "Compañía"
    And seleccionar usuario "<Todos>"
    And click en el boton buscar
    And click en el boton ver detalle
    And click en el boton cerrar

  Scenario: CPF202 - Transaccion critica/Imprimir transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion transaccion critica
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "02/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar operacion "Eliminación"
    And seleccionar tabla "TUA_ModVentaCompAtr"
    And seleccionar modulo "Mantenimiento"
    And seleccionar submodulo "Compañía"
    And seleccionar usuario "<Todos>"
    And click en el boton buscar
   #And click en el boton imprimir

######## DEPURACION ########

  Scenario: CPF204 - Depuracion/Buscar depuracion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion depuracion
    #And ingresar fecha desde "01/03/2022"
    #And ingresar fecha hasta "31/12/2023"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "23:00:00"
    And seleccionar molinete "NORMAL INTER M4"
    And seleccionar tabla "Ticket"
    And seleccionar estado "En Proceso"
    And click en el boton buscar
    And visualizar informacion de "Depuración"

  Scenario: CPF207 - Depuracion/Exportar informe depuracion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion depuracion
    #And ingresar fecha desde "01/03/2022"
    #And ingresar fecha hasta "31/12/2023"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "23:00:00"
    And seleccionar molinete "NORMAL INTER M4"
    And seleccionar tabla "Ticket"
    And seleccionar estado "En Proceso"
    And click en el boton buscar
    #And click en el boton excel

######## SINCRONIZACION ########

  Scenario: CPF20x - Sincronizacion/Buscar sincronizacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion sincronizacion
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "01/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    #And seleccionar molinete "NORMAL INTER M4"
    #And seleccionar estado "Terminado"
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
    #And ingresar fecha desde "01/01/2024"
    #And ingresar fecha hasta "01/01/2024"
    #And ingresar hora desde "00:00:00"
    #And ingresar hora hasta "10:00:00"
    And seleccionar molinete "NORMAL INTER M4"
    And seleccionar estado "Terminado"
    And seleccionar tabla de sincronizacion "Boarding"
    And seleccionar tipo de sincronizacion "<Todos>"
    And click en el boton buscar
    #And click en el boton excel
