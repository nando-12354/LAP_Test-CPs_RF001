Feature: Funcionalidad del modulo Consultas

  Scenario: CPF152 - Visualizar modulo consultas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And visualizar opcion "Usuarios"
    And visualizar la opcion "Compañías"
    And visualizar la opcion "Turnos"
    And visualizar la opcion "Detalle de Ticket / BP"
    And visualizar la opcion "Tickets / BP Por Fecha"
    And visualizar la opcion "Cuadre de Stickers Emitidos o BP usados"
    And visualizar la opcion "Operación Compra / Venta"
    And visualizar la opcion "Ticket / BP usados"
    And visualizar la opcion "Tickets / BP Anulados"
    And visualizar la opcion "Auditoría"
    And visualizar la opcion "Tickets Procesados"
    And visualizar la opcion "Log de Errores de Molinetes"
    And visualizar la opcion "Sincronización"
    And visualizar la opcion "Transacción Crítica"
    And visualizar la opcion "Depuración"
    And visualizar la opcion "Busqueda pasajeros fiscalia"

######## USUARIOS ########

  Scenario: CPF153 - Usuarios/Buscar usuarios
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
    And validar columna "Código"
    And validar columna "ffff"
    And validar columna "Nombre"
    And validar columna "Fecha Creación"
    And validar columna "Grupo"
    And validar columna "Roles asociados"
    And validar columna "Estado"
    And validar columna "Días por vencer cuenta usuario"
    And validar columna "Días por vencer clave"


  Scenario: CPF154 - Usuarios/Imprimir lista de usuarios
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

  Scenario: CPF155 - Companias/Buscar companias
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
    And validar columna "Código"
    And validar columna "Cuenta"
    And validar columna "Nombre"
    And validar columna "Fecha creación"
    And validar columna "Grupo"
    And validar columna "Roles asociados"
    And validar columna "Estado"
    And validar columna "Días por vencer cuenta usuario"
    And validar columna "Días por vencer clave"


  Scenario: CPF156 - Companias/Imprimir lista de companias
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

  Scenario: CPF157 - Turnos/Buscar turnos
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
    And seleccionar usuario "fer"
    And ingresar numero de caja ""
    And click en el boton buscar
    And visualizar lista de "Turnos"
    And validar la columna "Código Turno"
    And validar la columna "Usuario"
    And validar la columna "Número de caja"
    And validar la columna "Fecha apertura"
    And validar la columna "Fecha cierre"
    And validar columna de moneda inicio "SOL"
    And validar columna de moneda inicio "DOL"
    And validar columna de moneda fin "SOL"
    And validar columna de moneda fin "DOL"
    And validar el campo "Acciones"


  Scenario: CPF158 - Turnos/Ver detalle de turno
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
    And seleccionar usuario "Carmen Vera"
    And ingresar numero de caja "V00015"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el registro de detalle del turno
    And click en el boton cerrar


  Scenario: CPF159 - Turnos/Imprimir detalle de turno
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
    And seleccionar usuario "Carmen Vera"
    And ingresar numero de caja "V00015"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el registro de detalle del turno
    And click en el boton cerrar
    And click en imprimir


  Scenario: CPF160 - Turnos/Imprimir consulta de turnos
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
    And seleccionar usuario "Carmen Vera"
    And ingresar numero de caja "V00015"
    And click en el boton buscar
    And click en imprimir consulta


  Scenario: CPF161 - Turnos/Exportar excel consulta de turnos
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

  Scenario: CPF162 - Detalle de ticket-bp/Buscar detalle de ticket-bp
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
    And seleccionar aerolinea "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "01/01/2024"
    And ingresar numero de vuelo "4A4001"
    And ingresar asiento "016A"
    And ingresar persona "ESCOBEDO FARJE MERCY"
    And click en el boton buscar


  Scenario: CPF163 - Detalle de ticket-bp/Exportar excel e imprimir detalle de ticket-bp por numero de ticket
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


  Scenario: CPF164 - Detalle de ticket-bp/Exportar excel e imprimir detalle de ticket-bp por rango de ticket
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


  Scenario: CPF165 - Detalle de ticket-bp/Exportar excel e imprimir detalle de ticket-bp por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion detalle de ticket bp
    And seleccionar por boarding
    And seleccionar aerolinea "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "01/01/2024"
    And ingresar numero de vuelo "4A4001"
    And ingresar asiento "016A"
    And ingresar persona "ESCOBEDO FARJE MERCY"
    And click en el boton buscar
    And click en exportar excel
    And click en imprimir consulta

######## TICKET / BP POR FECHA ########

  Scenario: CPF166 - Tickets-bp por fecha/Buscar tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "230000"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "TODOS"
    And ingresar la compania "TODOS"
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar al cajero "Tamara Olaechea"
    And click en el boton buscar
    And validar columna "Número ticket"
    And validar columna "Tipo ticket"
    And validar columna "Compañia"
    And validar columna "Cajero Emisión"
    And validar columna "Fecha Creación"
    And validar columna "Estado actual"
    And click en ver mas campos
    And validar datos de "Secuencial"
    And validar datos de "Fecha de vuelo"
    And validar datos de "Número Vuelo"
    And validar datos de "Fecha Emisión"
    And validar datos de "Fecha Uso"
    And validar datos de "Fecha Rehabilitación"
    And validar datos de "Estado Turno"
    And validar el campo "Acciones"


  Scenario: CPF167 - Tickets-bp por fecha/Ver detalle de tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "230000"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "TODOS"
    And ingresar la compania "TODOS"
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar al cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el boton cerrar


  Scenario: CPF168 - Tickets-bp por fecha/Imprimir tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "230000"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "TODOS"
    And ingresar la compania "TODOS"
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en imprimir consulta


  Scenario: CPF169 - Tickets-bp por fecha/Exportar excel tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "230000"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "TODOS"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "TODOS"
    And ingresar la compania "TODOS"
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en exportar excel

######## CUADRE DE STICKERS EMITIDOS O BP USADOS ########

  Scenario: CPF170 - Cuadre de stickers emitidos o bp usados/Buscar por ticket
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


  Scenario: CPF171 - Cuadre de stickers emitidos o bp usados/Buscar por boarding
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


  Scenario: CPF172 - Cuadre de stickers emitidos o bp usados/Imprimir por ticket
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


  Scenario: CPF173 - Cuadre de stickers emitidos o bp usados/Imprimir por boarding
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


  Scenario: CPF174 - Cuadre de stickers emitidos o bp usados/Exportar excel por ticket
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


  Scenario: CPF175 - Cuadre de stickers emitidos o bp usados/Exportar excel por boarding
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

  Scenario: CPF176 - Operacion compra-venta/Buscar operacion compra-venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion operacion compra venta
    And ingresar fecha de proceso "01/01/2024"
    And seleccionar usuario "<Todos>"
    And click en el boton buscar
    And visualizar operacion compra
    And visualizar operacion venta
    And validar columna "Turno"
    And validar columna "Hora"
    And validar columna "Tasa de cambio"
    And validar columna "Monto moneda"
    And validar columna "Nuevo soles"
    And validar columna "Usuario"


  Scenario: CPF177 - Operacion compra-venta/Imprimir operacion compra-venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion operacion compra venta
    And ingresar fecha de proceso "01/01/2024"
    And seleccionar usuario "<Todos>"
    And click en el boton buscar
    And click en imprimir

######## TICKETS / BP USADOS ########

  Scenario: CPF178 - Tickets-bp usados/Buscar tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar fecha desde "01/05/2020"
    And seleccionar fecha hasta "31/05/2020"
    And escribir hora desde "000000"
    And escribir hora hasta "230000"
    And seleccionar el tipo de documento "Ticket"
    And seleccionar el tipo vuelo "<Todos>"
    And seleccionar estado "<Todos>"
    And seleccionar tipo de transbordo "<Todos>"
    And seleccionar una aerolinea "AEROLINEA GENERICA"
    And ingresar el numero de vuelo ""
    And ingresar tipo de persona "<Todos>"
    And click en el boton buscar
    And visualizar lista de "Ticket / BP Usado"
    And validar columna "Número documento"
    And validar columna "Secuencial"
    And validar columna "Tipo documento"
    And validar columna "Destino"
    And validar columna "Modalidad Venta"
    And validar columna "Aerolinea"
    And validar columna "Nro. Vuelo"
    And validar columna "Fecha Vuelo"
    And validar columna "Fecha uso"
    And validar columna "Nro. Asiento"
    And validar columna "Tipo Vuelo"
    And validar columna "Tipo Persona"
    And click en ver mas campos
    And validar datos del "Tipo Trasbordo"
    And validar datos del "Estado Actual"
    And validar datos del "Secuencia"
    And validar datos del "Asociado"
    And validar columna "Acciones"


  Scenario: CPF179 - Tickets-bp usados/Ver detalle de tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar fecha desde "01/05/2020"
    And seleccionar fecha hasta "31/05/2020"
    And escribir hora desde "000000"
    And escribir hora hasta "230000"
    And seleccionar el tipo de documento "Ticket"
    And seleccionar el tipo vuelo "<Todos>"
    And seleccionar estado "<Todos>"
    And seleccionar tipo de transbordo "<Todos>"
    And seleccionar una aerolinea "AEROLINEA GENERICA"
    And ingresar el numero de vuelo ""
    And ingresar tipo de persona "ADULTO"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el boton cerrar


  Scenario: CPF180 - Tickets-bp usados/Imprimir tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar fecha desde "01/05/2020"
    And seleccionar fecha hasta "31/05/2020"
    And escribir hora desde "000000"
    And escribir hora hasta "230000"
    And seleccionar el tipo de documento "Ticket"
    And seleccionar el tipo vuelo "<Todos>"
    And seleccionar estado "<Todos>"
    And seleccionar tipo de transbordo "<Todos>"
    And seleccionar una aerolinea "AEROLINEA GENERICA"
    And ingresar el numero de vuelo ""
    And ingresar tipo de persona "ADULTO"
    And click en el boton buscar
    And click en imprimir consulta


  Scenario: CPF181 - Tickets-bp usados/Exportar excel de tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And escribir hora desde "000000"
    And escribir hora hasta "230000"
    And seleccionar el tipo de documento "<Todos>"
    And seleccionar el tipo vuelo "<Todos>"
    And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    And seleccionar una aerolinea "AERO TRANSPORTE  S. A."
    And ingresar el numero de vuelo "4A4001"
    And ingresar tipo de persona "ADULTO"
    And click en el boton buscar
    And click en exportar excel


    ######## TICKETS / BP ANULADOS ########

  Scenario: CPF182 - Tickets-bp anulados/Buscar tickets-bp anulados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp anulados
    And seleccionar fecha desde "01/05/2020"
    And seleccionar fecha hasta "31/05/2020"
    And click en el boton buscar
    And visualizar lista de "Tickets anulados"
    And validar la "Información procesada con fecha de corte: 18/03/2024 05:01:24"
    And validar columna de tabla "Fecha anulación"
    And validar columna de tabla "Modalidad"
    And validar columna de tabla "Usuario"
    And validar columna de tabla "Motivo"
    And validar columna de tabla "Adulto internacional normal"
    And validar columna de tabla "Adulto nacional normal"


  Scenario: CPF183 - Tickets-bp anulados/Ver resumen de tickets-bp anulados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp anulados
    And seleccionar fecha desde "01/05/2020"
    And seleccionar fecha hasta "31/05/2020"
    And click en el boton buscar
    And seleccionar resumen
    And validar la "Información procesada con fecha de corte: 18/03/2024 05:01:24"
    And validar columna de tabla "Tipo Documento"
    And validar columna de tabla "Tipo Vuelo"
    And validar columna de tabla "Tipo Pasajero"
    And validar columna de tabla "Tipo Trasbordo"
    And validar columna de tabla "Cantidad"


  Scenario: CPF184 - Tickets-bp anulados/Exportar excel de consulta de tickets-bp anulados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp anulados
    And seleccionar fecha desde "01/05/2020"
    And seleccionar fecha hasta "31/05/2020"
    And click en el boton buscar
    And validar la "Información procesada con fecha de corte: 18/03/2024 05:01:24"
    And click en el boton excel


  Scenario: CPF185 - Tickets-bp anulados/Exportar pdf de consulta de tickets-bp anulados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp anulados
    And seleccionar fecha desde "01/05/2020"
    And seleccionar fecha hasta "31/05/2020"
    And click en el boton buscar
    And validar la "Información procesada con fecha de corte: 18/03/2024 05:01:24"
    And click en el boton pdf


  Scenario: CPF186 - Tickets-bp anulados/Imprimir consulta de tickets-bp anulados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp anulados
    And seleccionar fecha desde "01/05/2020"
    And seleccionar fecha hasta "31/05/2020"
    And click en el boton buscar
    And validar la "Información procesada con fecha de corte: 18/03/2024 05:01:24"
    And click en el boton imprimir

######## AUDITORIA ########

  Scenario: CPF187 - Auditoria/Buscar auditoria
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
    And validar columna "Detalle"
    And validar columna "Fecha"
    And validar columna "Modulo"
    And validar columna "Submodulo"
    And validar columna "Tabla"
    And validar columna "Operacion"
    And validar columna "Usuario"
    And validar columna "Acciones"


  Scenario: CPF188 - Auditoria/Ver detalle de auditoria
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


  Scenario: CPF189 - Auditoria/Imprimir auditoria
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
    And seleccionar el usuario "Nando Luyo"
    And click en el boton buscar
    And click en el boton imprimir

######## TICKES PROCESADOS ########

  Scenario: CPF190 - Tickets procesados/Buscar tickets procesados
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
    And validar columna "Código Turno"
    And validar columna "Cajero"
    And validar columna "Equipo"
    And validar columna "Fecha de Apertura"
    And validar columna "Número de Tickets Vendidos"
    And validar columna "Acciones"


  Scenario: CPF191 - Tickets procesados/Imprimir tickets procesados
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


  Scenario: CPF192 - Tickets procesados/Exportar excel de tickets procesados
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


  Scenario: CPF193 - Tickets procesados/Ver detalle de turno de tickets procesados
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


  Scenario: CPF194 - Tickets procesados/Ver detalle de tickets de tickets procesados
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


  Scenario: CPF195 - Tickets procesados/Imprimir detalle de turno de tickets procesados
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


  Scenario: CPF196 - Tickets procesados/Exportar excel de detalle de turno de tickets procesados
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
    And click en exportar excel

######## LOG DE ERRORES MOLINETE ########


  Scenario: CPF197 - Log de errores de molinetes/Buscar tipo de error funcional
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
    And validar columna "Identificador"
    And validar columna "Fecha Error"
    And validar columna "Molinete"
    And validar columna "Descripción Error"
    And validar columna "Tipo Ingreso"
    And validar columna "Tipo BP"
    And validar columna "Aerolínea"
    And validar columna "Fecha Vuelo"
    And validar columna "Nro Vuelo"
    And validar columna "Nro asiento"
    And validar columna "Pasajero"
    And validar columna "Log Error"


  Scenario: CPF198 - Log de errores de molinetes/Buscar tipo de error no funcional
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
    And seleccionar tipo error "No funcional"
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


  Scenario: CPF199 - Log de errores de molinetes/Exportar excel de error funcional
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
    And click en el boton excel


  Scenario: CPF200 - Log de errores de molinetes/Exportar excel de error no funcional
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
    And seleccionar tipo error "No funcional"
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
    And click en el boton excel

######## SINCRONIZACION ########

  Scenario: CPF201 - Sincronizacion/Buscar sincronizacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion sincronizacion
    And seleccionar fecha desde "01/07/2023"
    And seleccionar fecha hasta "01/07/2023"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar el molinete "NORMAL INTER M4"
    And seleccionar un estado "Terminado"
    And seleccionar tabla de sincronizacion "Boarding"
    And seleccionar tipo de sincronizacion "<Todos>"
    And click en el boton buscar
    And visualizar informacion de "Sincronización"
    And validar columna "Código"
    And validar columna "Tabla de Sincronización"
    And validar columna "Código de Molinete"
    And validar columna "Tipo de Estado"
    And validar columna "Descripción del Estado"
    And validar columna "Fecha Inicio"
    And validar columna "Fecha Fin"
    And validar columna "Tipo de Sincronización"
    And validar columna "Número de Registro"
    And validar columna "Número Registro Error"


  Scenario: CPF202 - Sincronizacion/Exportar informe de sincronizacion
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

  Scenario: CPF203 - Transaccion critica/Buscar transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion transaccion critica
    And seleccionar fecha desde "01/11/2023"
    And seleccionar fecha hasta "01/11/2023"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar operacion "<Todos>"
    And seleccionar tabla "<Todos>"
    And seleccionar un modulo "<Todos>"
    And seleccionar submodulo "<Todos>"
    And seleccionar el usuario "<Todos>"
    And click en el boton buscar
    And visualizar informacion de "Transacción crítica"
    And validar la columna "Detalle"
    And validar la columna "Fecha"
    And validar la columna "Modulo"
    And validar la columna "SubModulo"
    And validar la columna "Tabla"
    And validar la columna "Operacion"
    And validar la columna "Usuario"
    And validar columna "Acciones"


  Scenario: CPF204 - Transaccion critica/Ver detalle de transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion transaccion critica
    And seleccionar fecha desde "01/11/2023"
    And seleccionar fecha hasta "01/11/2023"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar operacion "<Todos>"
    And seleccionar tabla "<Todos>"
    And seleccionar un modulo "<Todos>"
    And seleccionar submodulo "<Todos>"
    And seleccionar el usuario "<Todos>"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el boton cerrar


  Scenario: CPF205 - Transaccion critica/Imprimir transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion transaccion critica
    And seleccionar fecha desde "01/11/2023"
    And seleccionar fecha hasta "01/11/2023"
    And escribir hora desde "000000"
    And escribir hora hasta "100000"
    And seleccionar operacion "<Todos>"
    And seleccionar tabla "<Todos>"
    And seleccionar un modulo "<Todos>"
    And seleccionar submodulo "<Todos>"
    And seleccionar el usuario "<Todos>"
    And click en el boton buscar
    And click en imprimir

######## DEPURACION ########

  Scenario: CPF206 - Depuracion/Buscar depuracion
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
    And validar columna "Código"
    And validar columna "Tabla de Depuración"
    And validar columna "Código de Molinete"
    And validar columna "Tipo Estado"
    And validar columna "Descripción Estado"
    And validar columna "Fecha Inicio"
    And validar columna "Fecha Fin"
    And validar columna "Tipo de Depuración"
    And validar columna "Nro Registro"


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