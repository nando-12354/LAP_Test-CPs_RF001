Feature: Funcionalidad del TUUA [Rol: TI Admin]

  Scenario: TI(LAP)/CPF001 - Registrar precio ticket con fecha actual con valores negativos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion precio ticket
    And click en el boton nuevo
    And seleccionar fecha programada
    And ingresar fecha a programar "01/12/2024"
    And ingresar hora a programar "000000"
    And seleccionar codigo moneda "Dólar Estadounidense"
    And seleccionar precio de venta "si"
    And ingresar precio de venta en negativo "-3/-4/-5"


  Scenario: TI(LAP)/CPF002 - Gestion precio ticket/Registrar precio ticket con fecha programada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion precio ticket
    And click en el boton nuevo
    And seleccionar fecha programada
    And ingresar fecha a programar "01/12/2024"
    And ingresar hora a programar "000000"
    And seleccionar codigo moneda "Dólar Estadounidense"
    And seleccionar precio de venta "si"
    And ingresar precio de venta "5/3/2"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Está seguro de registrar los precios de Ticket?"
    And click en el boton aceptar
    And validar mensaje de confirmacion "Creación de Precio de Ticket"
    And click en el boton aceptar


  Scenario: TI(LAP)/CPF003 - Cerrar turno/Validar mensaje
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion cerrar turno
    And click en el boton cerrar turno sin seleccionar un turno previamente
    And validar el mensaje de error "Seleccione al menos un turno para realizar la operacion."


  Scenario: TI(LAP)/CPF004 - Generacion archivo venta/Colapsar las opciones con checkbox
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion generacion archivo venta
    And click en colapsar las opciones de los checkbox


  Scenario: TI(LAP)/CPF005 - Pre-emision tickets contingencia/Validar mensaje error
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion pre emision tickets contingencia
    And ingresar tipo de transbordo "Transferencia"
    And validar el mensaje de error "Tipo Ticket No DISPONIBLE EN SISTEMA."


  Scenario: TI(LAP)/CPF006 - Registro tickets contingencia/Ingresar rango de tickets aleatorios
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion registro tickets contingencia
    And filtrar usuario "ADMIN"
    And filtrar tipo de ticket "Internacional"
    And filtrar tipo de pasajero "Adulto"
    And ingresar ticket desde "1111111111111111"
    And ingresar ticket hasta "9999999999999999"
    And click en el boton buscar


  Scenario: TI(LAP)/CPF007 - Generación comprobante seae/Colapsar las opciones con checkbox
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion generacion archivo seae
    And click en colapsar las opciones de los checkbox


  Scenario: TI(LAP)/CPF008 - Generación comprobante seae/Validar mensaje error
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion generacion archivo seae
    And ingresar fecha "Enero-2024"
    And seleccionar tipo documento "Boarding"
    And seleccionar archivo a generar "no"
    And click en el boton generar
    And validar el mensaje de error "No hay data para generar el archivo."


  Scenario: TI(LAP)/CPF009 - Consultas/Buscar companias
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


  Scenario: TI(LAP)/CPF010 - Consultas/Deplegar los combobox
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion companias
    And seleccionar rol "ADMIN"
    And seleccionar estado "ANULADO"
    And seleccionar grupo "LAP"


  Scenario: TI(LAP)/CPF011 - Ticket normal/Validar valor de ticket no rehabilitado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket normal
    And ingresar numero de ticket "1000602341073618"
    And click en el boton agregar ticket
    And seleccionar ticket "si"
    And click en el boton rehabilitar
    And validar la alerta de confirmacion "¿Desea continuar con la Rehabilitación?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And validar el ticket no rehabilitado "Total de Tickets Rehabilitados: 0"


  Scenario: TI(LAP)/CPF012 - Ticket normal/Eliminar ticket temporalmente
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket normal
    And ingresar numero de ticket "1000602341073618"
    And click en el boton agregar ticket
    And click en el boton eliminar ticket
    And ingresar numero de ticket "1000602341073618"
    And click en el boton agregar ticket


  Scenario: TI(LAP)/CPF013 - Ticket masivo/Eliminar ticket temporalmente
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket masivo
    And ingresar numero de ticket "1000602341073618"
    And click en el boton agregar ticket
    And click en el boton eliminar ticket
    And ingresar numero de ticket "1000602341073618"
    And click en el boton agregar ticket


  Scenario: TI(LAP)/CPF014 - Ticket por vuelo/Eliminar ticket temporalmente
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
    And click en el boton eliminar
    And seleccionar una compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "04/01/2024"
    And seleccionar vuelo "4A024"
    And click en el boton buscar


  Scenario: TI(LAP)/CPF015 - Ticket por salida/Validar la data mostrada en la grilla
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion ticket
    And ingresar a la subopcion ticket por salida
    And ingresar fecha de vuelo "03/07/2020"
    And click en el boton agregar bp
    And visualizar lista de "Tickets por salida"
    And validar columna "Número de vuelo"
    And validar columna "Código ticket"
    And validar columna "Fecha de creación"
    And validar columna "Fecha de registro en tabla temporal"
    And validar columna "Acciones"


  Scenario: TI(LAP)/CPF016 - Boarding pass normal/Validar reseteo de la grilla y campos
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
    And click en el boton aceptar
    And validar el reseteo de la grilla y campos de "Boarding Pass Normal"
    And validar columna "Número"
    And validar columna "Descripción BCBP"
    And validar columna "Observaciones"
    And validar columna "Motivo"
    And validar columna "Asociar"
    And validar columna "BCBP Asociado"
    And validar columna checkbox "Bloquear"
    And validar columna checkbox "Seleccionar"
    And validar columna "Acciones"


  Scenario: TI(LAP)/CPF017 - Boarding pass masivo/Validar reseteo de la grilla y campos
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
    And validar la alerta de confirmacion "¿Desea Continuar con la Rehabilitacion?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton aceptar
    And validar el reseteo de la grilla y campos de "Boarding Pass Normal"
    And validar columna "Número"
    And validar columna "Descripción BCBP"
    And validar columna "Observaciones"
    And validar columna "Asociar"
    And validar columna "BCBP Asociado"
    And validar columna checkbox "Bloquear"
    And validar columna checkbox "Seleccionar"
    And validar columna "Acciones"


  Scenario: TI(LAP)/CPF018 - Boarding pass por salida/Validar la data mostrada en la grilla
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por salida
    And seleccionar la compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "18/01/2024"
    And ingresar numero de vuelo "4A4001"
    And click en el boton agregar bp
    And visualizar lista de "Boarding Pass por Salida"
    And validar columna "Número Vuelo"
    And validar columna "Código BCBP"
    And validar columna "Fecha Creación"
    And validar columna "Fecha de registro en tabla temporal"
    And validar columna "Acciones"


  Scenario: TI(LAP)/CPF019 - Boarding pass por vuelo/Validar el detalle de boarding pass vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por vuelo
    And seleccionar la compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha de vuelo "31/01/2024"
    And seleccionar vuelo "4A4091"
    And click en el boton buscar
    And click en boton ver detalle
    And visualizar el "Detalle: Boarding"
    And click en el boton cerrar


  Scenario: TI(LAP)/CPF020 - Boarding pass por vuelo/Validar los datos de la grilla no se borren
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por vuelo
    And seleccionar la compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha de vuelo "31/01/2024"
    And seleccionar vuelo "4A4091"
    And click en el boton buscar
    And click en boton ver detalle
    And visualizar el "Detalle: Boarding"
    And click en el boton cerrar
    And validar que los datos de la grilla "Boarding Pass por Vuelo" no se borren
    And validar columna "Nro."
    And validar columna "Descripcion BCBP"
    And validar columna "Observaciones"
    And validar columna checkbox "Bloquear"
    And validar columna checkbox "Seleccionar"
    And validar columna "Acciones"


  Scenario: TI(LAP)/CPF021 - Boarding pass por vuelo/Validar columna de selección de boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por vuelo
    And seleccionar la compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha de vuelo "31/01/2024"
    And seleccionar vuelo "4A4091"
    And click en el boton buscar
    And seleccionar los boarding disponibles "si"


  Scenario: TI(LAP)/CPF022 - Boarding pass por vuelo/Validar boton eliminar color rojo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por vuelo
    And seleccionar la compania "AERO TRANSPORTE  S. A."
    And ingresar la fecha de vuelo "31/01/2024"
    And seleccionar vuelo "4A4091"
    And click en el boton buscar
    And validar que el botón eliminar sea color rojo


  Scenario: TI(LAP)/CPF023 - Boarding pass por fecha/Validar botón buscar color azul
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por fecha
    And Validar que el botón buscar sea color azul


  Scenario: TI(LAP)/CPF024 - Boarding pass por fecha/Validar reseteo de la grilla y campos
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
    And validar la alerta de confirmacion "¿Desea Continuar con la Rehabilitacion?"
    And click en el boton aceptar
    And validar mensaje exitoso "La Rehabilitación concluyó satisfactoriamente"
    And click en el boton aceptar
    And validar el reseteo de la grilla y campos de "Boarding pass por fecha"
    And validar columna "Número"
    And validar columna "Descripción BCBP"
    And validar columna "Observaciones"
    And validar columna checkbox "Bloquear"
    And validar columna checkbox "Seleccionar"
    And validar columna "Acciones"


  Scenario: TI(LAP)/CPF025 - Boarding pass por fecha/Validar estandarización de popup representante
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por fecha
    And click en el boton representante
    And validar la estandarizacion del popup "Representante"
    And validar columna "Número"
    And validar columna "Nombres"
    And validar columna "Estado"


  Scenario: TI(LAP)/CPF026 - Boarding pass por fecha/Validar estandarizacion de botón cerrar "X" de popup detalle
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
    And click en boton ver detalle
    And visualizar el popup "Detalle: Boarding"


  Scenario: TI(LAP)/CPF027 - Boarding pass por fecha/Validar estandarización de popup detalle
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
    And click en boton ver detalle
    And visualizar el popup "Detalle: Boarding"


  Scenario: TI(LAP)/CPF028 - Boarding pass por salida/Validar que los mensajes de error desaparezcan
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo rehabilitacion
    And ingresar a la opcion boarding
    And ingresar a la subopcion boarding pass por salida
    And click en el boton agregar bp
    And validar el mensaje de error "Seleccione una Compañía."
    And click en la cabecera de la grilla ver detalle o eliminar
    And seleccionar la compania "AERO TRANSPORTE  S. A."
    And ingresar fecha de vuelo "18/01/2024"
    And ingresar numero de vuelo "4A4001"
    And click en el boton agregar bp
    And visualizar lista de "Boarding Pass por Salida"
    And seleccionar motivo "Demora o Cancelación del vuelo, X Peligro Aviario"
    And click en el boton rehabilitar
    And validar el mensaje de error "Debe de seleccionar al menos un boarding para rehabilitar."
    And click en el boton ver detalle
    And click en el boton rehabilitar
    And validar el mensaje de error "Debe de seleccionar al menos un boarding para rehabilitar."
    And click en el boton eliminar


  Scenario: TI(LAP)/CPF029 - Companias/Validar mensaje de error
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion companias
    And seleccionar rol "ADMIN"
    And seleccionar estado "VIGENTE"
    And seleccionar grupo "LAP"
    And click en el boton buscar
    And click en imprimir
    And validar el mensaje de error "La búsqueda no retorna resultado"


  Scenario: TI(LAP)/CPF030 - Tickets-bp por fecha/Buscar tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp por fecha
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And escribir hora desde "00:00:00"
    And escribir hora hasta "23:00:00"
    And seleccionar tipo de documento "Ticket"
    And seleccionar tipo de ticket "ADULTO INTERNACIONAL NORMAL"
    And seleccionar estado "ANULADO"
    And seleccionar indicador de cobro "Por Emision"
    And ingresar una compania "AERO TRANSPORTE  S. A."
    And seleccionar tipo de persona "ADULTO"
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar estado turno "TODOS"
    And seleccionar al cajero "Tamara Olaechea"
    And click en el boton buscar
    And validar columna "Número ticket"
    And validar columna "Secuencial"
    And validar columna "Tipo ticket"
    And validar columna "Compañia"
    And validar columna "Fch. Creación"
    And validar columna "Fch. Vuelo"
    And validar columna "Nro. Vuelo"
    And validar columna "Fch. Emisión"
    And validar columna "Fch. Uso"
    And validar columna "Fch. Rehab."
    And validar columna "Estado Turno"
    And validar columna "Cajero Emisión"
    And validar columna "Estado actual"
    And validar el campo "Acciones"


  Scenario: TI(LAP)/CPF031 - Auditoria/Ver detalle de auditoria
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


  Scenario: TI(LAP)/CPF032 - Tickets procesados/Ver detalle de tickets de tickets procesados
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


  Scenario: TI(LAP)/CPF033 - Ticket-bp por fecha/Validar el cambio de estados
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
    And click en el boton buscar
    And seleccionar estado "EMITIDO"
    And seleccionar estado "PREEMITIDO"
    And seleccionar estado "REHABILITADO"
    And seleccionar estado "USADO"
    And seleccionar estado "VENCIDO"


  Scenario: TI(LAP)/CPF034 - Tickets procesados/Validar data de la grilla de ticket procesados al retroceder
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
    And click en boton ver detalle
    And click en el boton atras
    And visualizar informacion de "Tickets Procesados"
    And validar columna "Código Turno"
    And validar columna "Cajero"
    And validar columna "Equipo"
    And validar columna "Fecha de Apertura"
    And validar columna "Número de Tickets Vendidos"
    And validar columna "Acciones"


  Scenario: TI(LAP)/CPF035 - Extranet BP diarios usados-rehabilitados/Validar el total de boarding pass usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion extranet bp diarios usados rehabilitados
    And seleccionar fecha desde "01/11/2023"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "02/11/2023"
    And ingresar hora hasta "230000"
    And seleccionar fecha de vuelo "03/11/2023"
    And seleccionar tipo transbordo "NORMAL"
    And seleccionar tipo persona "ADULTO"
    And seleccionar tipo vuelo "INTERNACIONAL"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And ingresar numero de vuelo "H25560"
    And ingresar asiento "022B"
    And ingresar persona "LLAMACPONCCA MARINA"
    And click en el boton buscar
    And visualizar boarding pass usados
    And visualizar boarding pass rehabilitados
    And visualizar boarding pass anulados
    And visualizar resumen boarding neto
    And validar el "Total de Boarding Pass Usados:"


  Scenario: TI(LAP)/CPF036 - Extranet BP diarios usados-rehabilitados/Validar calendarios desbloqueados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion extranet bp diarios usados rehabilitados
    And seleccionar fecha desde "10/11/2023"
    And seleccionar fecha hasta "01/11/2023"
    And click en el boton buscar
    And validar el mensaje de error "Error. Rango de Fechas ingresado es inválido"


  Scenario: TI(LAP)/CPF037 - Configurar alarmas/Validar combobox modulo, tipo de alarma, usuaio
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion configurar alarmas
    And click en el boton +agregar
    And seleccionar el modulo "Mantenimiento"
    And seleccionar tipo de alarma "Caducidad de Clave"
    And click en el boton +agregar
    And seleccionar al usuario "fvanessa"


  Scenario: TI(LAP)/CPF038 - Monitorear alarmas/Visualizar pantalla de monitoreo de alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion monitorear alarmas
    And visualizar informacion de "Monitorear Alarmas"


  Scenario: TI(LAP)/CPF039 - Alarmas generadas/Visualizar pantalla de alarmas generadas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo alarmas
    And ingresar a la opcion alarmas generadas
    And visualizar informacion de "Alarmas Generadas"










