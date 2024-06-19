Feature: Funcionalidad del modulo Operacion

  Scenario: CPF068 - Visualizar modulo operacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And visualizar la opcion ingresar tasa de cambio
    And visualizar la opcion gestion precio ticket
    And visualizar la opcion gestion tickets contingencia
    And visualizar la opcion extorno
    And visualizar la opcion anulacion
    And visualizar la opcion venta masiva credito
    And visualizar la opcion extension fecha vigencia tickets
    And visualizar la opcion gestion molinete
    And visualizar la opcion generacion archivo venta
    And visualizar la opcion cerrar turno
    And visualizar la opcion generacion archivo seae

######## INGRESAR TASA DE CAMBIO ########

  Scenario: CPF069 - Ingresar tasa de cambio/Visualizar lista de tasa de cambio
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion ingresar tasa de cambio
    And visualizar tasa de cambio actual
    And validar columna "Código"
    And validar columna "Tipo Cambio"
    And validar columna "Moneda"
    And validar columna "Valor Tasa"
    And validar columna "Fecha de inicio de vigencia"
    And validar columna "Usuario modificación"
    And visualizar tasa de cambio programada
    And validar columna "Código"
    And validar columna "Tipo Cambio"
    And validar columna "Moneda"
    And validar columna "Valor Tasa"
    And validar columna "Fecha Programada"
    And validar columna "Usuario modificación"
    And validar columna "Acciones"
    And visualizar tasa de cambio historica
    And seleccionar tipo de operacion "Compra"
    And seleccionar fecha desde "01/03/2024"
    And seleccionar fecha hasta "31/03/2024"
    And click en el boton buscar
    And validar columna "Código"
    And validar columna "Tipo Cambio"
    And validar columna "Moneda"
    And validar columna "Valor Tasa"
    And validar columna "Fecha Inicio de vigencia"
    And validar columna "Fecha Fin de vigencia"
    And validar columna "Usuario modificación"

  Scenario: CPF070 - Ingresar tasa de cambio/Registrar tasa de cambio con fecha actual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion ingresar tasa de cambio
    And click en el boton nuevo
    And seleccionar fecha actual
    And seleccionar tasas de cambio compra "si"
    And ingresar tasa de cambio compra "2.5/3.5/4.4/5.5/6.5"
    And seleccionar tasas de cambio venta "si"
    And ingresar tasa de cambio venta "1.5/2.5/3.4/1.5/8.5"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Esta seguro de realizar esta acción?"
    And click en el boton si
    And click en ok

  Scenario: CPF071 - Ingresar tasa de cambio/Registrar tasa de cambio con fecha programada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion ingresar tasa de cambio
    And click en el boton nuevo
    And seleccionar fecha programada
    And ingresar fecha a programar "01/12/2024"
    And ingresar hora a programar "000000"
    And seleccionar tasas de cambio compra "si"
    And ingresar tasa de cambio compra "2.5/3.5/4.4/5.5/6.5"
    And seleccionar tasas de cambio venta "si"
    And ingresar tasa de cambio venta "1.5/2.5/3.4/1.5/8.5"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Esta seguro de realizar esta acción?"
    And click en el boton si
    And click en ok

  Scenario: CPF072 - Ingresar tasa de cambio/Eliminar tasa de cambio programada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion ingresar tasa de cambio
    And seleccionar tasa de cambio programada
    And eliminar tasa de cambio programada
    And validar alerta de confirmacion "¿Esta seguro de realizar esta acción?"
    And click en el boton si
    And validar mensaje "copiar le mensaje aqui"

  Scenario: CPF073 - Ingresar tasa de cambio/Visualizar consulta de tasa de cambio historica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion ingresar tasa de cambio
    And seleccionar tasa de cambio historica
    And seleccionar tipo de operacion "Compra"
    And seleccionar fecha desde "01/03/2024"
    And seleccionar fecha hasta "31/03/2024"
    And click en el boton buscar

######## GESTION PRECIO TICKET ########

  Scenario: CPF074 - Gestion precio ticket/Visualizar lista de precio de tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion precio ticket
    And visualizar precio tickets actual
    And validar columna "Código"
    And validar columna "Tipo ticket"
    And validar columna "Moneda"
    And validar columna "Precio"
    And validar columna "Fecha de inicio de vigencia"
    And validar columna "Usuario modificación"
    And visualizar precio tickets programada
    And validar columna "Código"
    And validar columna "Tipo ticket"
    And validar columna "Moneda"
    And validar columna "Precio"
    And validar columna "Fecha Programada"
    And validar columna "Usuario modificación"
    And validar columna "Acciones"
    And visualizar precio tickets historica
    And seleccionar fecha desde "01/04/2024"
    And seleccionar fecha hasta "30/04/2024"
    And click en el boton buscar
    And validar columna "Código"
    And validar columna "Tipo ticket"
    And validar columna "Moneda"
    And validar columna "Precio"
    And validar columna "Fecha de inicio de vigencia"
    And validar columna "Fecha de fin de vigencia"
    And validar columna "Usuario modificación"

  Scenario: CPF075 - Gestion precio ticket/Registrar precio ticket con fecha actual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion precio ticket
    And click en el boton nuevo
    And seleccionar fecha actual
    And seleccionar monedas "si"
    And seleccionar codigo moneda "USD"
    And seleccionar precio de venta "si"
    And ingresar precio de venta "3/4/5"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Esta seguro de realizar esta acción?"
    And click en el boton si
    And click en ok

  Scenario: CPF076 - Gestion precio ticket/Registrar precio ticket con fecha programada
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
    And seleccionar codigo moneda "USD"
    And seleccionar precio de venta "si"
    And ingresar precio de venta "3/4/5"
    And click en el boton guardar
    #And validar alerta de confirmacion ""
    #And click en el boton si
    #And click en ok

  Scenario: CPF077 - Gestion precio ticket/Eliminiar precio de ticket programada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion precio ticket
    And seleccionar precio tickets programada
    And eliminar precio tickets programada
    #And click en el boton si
    #And validar mensaje ""

  Scenario: CPF078 - Gestion precio ticket/Visualizar consulta de precio de tickets Historica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion precio ticket
    And seleccionar precio tickets historica
    And seleccionar fecha desde "01/04/2024"
    And seleccionar fecha hasta "30/04/2024"
    And click en el boton buscar

######## PRE-EMISION TICKET CONTINGENCIA ########

  Scenario: CPF079 - Pre-emision tickets contingencia/Visualizar pre-emisión tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion tickets contingencia
    And ingresar a la opcion pre emision tickets contingencia
    And visualizar tipo de vuelo
    And visualizar tipo pasajero
    And visualizar fecha actual
    And visualizar precio ticket
    And visualizar cantidad

  Scenario: CPF080 - Pre-emision tickets contingencia/Generar pre-emisión tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion tickets contingencia
    And ingresar a la opcion pre emision tickets contingencia
    And ingresar tipo de vuelo "Internacional"
    And ingresar tipo de transbordo "Normal"
    And ingresar tipo de pasajero "Adulto"
    And ingresar precio ticket "$ 34.00 (Actual)"
    And ingresar cantidad "5"
    And click en el boton generar
    And validar alerta "¿Está seguro de realizar esta acción?"
    And click en el boton si
    And validar mensaje "Registro agregado correctamente"

######## REGISTRO TICKET CONTINGENCIA ########

  Scenario: CPF081 - Registro tickets contingencia/Visualizar registro tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion tickets contingencia
    And ingresar a la opcion registro tickets contingencia
    And visualizar "Datos de Turno"
    And visualizar "Filtro consulta"
    And visualizar "Datos de venta"

  Scenario: CPF082 - Registro tickets contingencia/Registro tickets contingencia con cierre de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion tickets contingencia
    And ingresar a la opcion registro tickets contingencia
    And filtrar usuario "Carmen Vera"
    And filtrar tipo de ticket "Internacional"
    And filtrar tipo de pasajero "Adulto"
    And ingresar ticket desde "9000600312684339"
    And ingresar ticket hasta "9000600312684432"
    And click en el boton buscar
    And seleccionar tickets requeridos "si"
    And seleccionar cierre de turno "si"
    And click en el boton guardar
    And validar alerta "¿Esta seguro de realizar esta operación con cierre de turno?"
    And click en el boton si
    And validar mensaje "Registro realizado correctamente"

  Scenario: CPF083 - Registro tickets contingencia/Registro tickets contingencia sin cierre de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion tickets contingencia
    And ingresar a la opcion registro tickets contingencia
    And filtrar usuario "ADMIN ADMIN"
    And filtrar tipo de ticket "Internacional"
    And filtrar tipo de pasajero "Adulto"
    And ingresar ticket desde "9000600312884348"
    And ingresar ticket hasta "9000600312884440"
    And click en el boton buscar
    And seleccionar tickets requeridos "si"
    And seleccionar cierre de turno "no"
    And click en el boton guardar
    And validar alerta "¿Esta seguro de realizar esta operación sin cierre de turno?"
    And click en el boton si
    And validar mensaje "Registro realizado correctamente"

######## EXTORNO OPERACIONES ########

  Scenario: CPF084 - Extorno operaciones/Visualizar lista de extorno operaciones
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extorno
    And ingresar a la opcion extorno operaciones
    And filtrar estado turno "CERRADO"
    And seleccionar fecha desde "01/01/2020"
    And seleccionar fecha hasta "31/01/2020"
    And click en el boton buscar
    And visualizar lista de "Extorno operación"
    And validar columna "Turno"
    And validar columna "Estación de venta"
    And validar columna "Usuario"
    And validar columna "Fecha inicio"
    And validar columna "Acciones"

  Scenario: CPF085 - Extorno operaciones/Extornar operacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extorno
    And ingresar a la opcion extorno operaciones
    And filtrar estado turno "CERRADO"
    And filtrar turno "026635"
    And seleccionar fecha desde "01/01/2020"
    And seleccionar fecha hasta "31/01/2020"
    And click en el boton buscar
    And click en el boton detalle de turno
    And seleccionar tipo operacion "Venta Moneda"
    And click en el boton buscar
    And seleccionar operacion a extornar "si"
    And click en el boton extornar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And click en el boton imprimir
    And validar alerta de confirmacion ""

######## EXTORNO TICKETS ########

  Scenario: CPF086 - Extorno tickets/Visualizar lista de extorno tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extorno
    And ingresar a la opcion extorno tickets
    And filtrar estado turno "CERRADO"
    And seleccionar fecha desde "01/01/2020"
    And seleccionar fecha hasta "31/01/2020"
    And click en el boton buscar
    And visualizar lista de "Extorno tickets"
    And validar columna "Turno"
    And validar columna "Número IP"
    And validar columna "Usuario"
    And validar columna "Fecha inicio"
    And validar columna "Acciones"

  Scenario: CPF087 - Extorno tickets/Extornar tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extorno
    And ingresar a la opcion extorno tickets
    And filtrar estado turno "CERRADO"
    And filtrar turno "031966"
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And click en el boton buscar
    And click en el boton detalle de turno
    And seleccionar ticket a extornar "si"
    And ingresar el motivo de extorno ""
    And click en el boton extornar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And click en el boton imprimir
    And validar alerta de confirmacion ""

######## EXTORNO REHABILITACION ########

  Scenario: CPF088 - Extorno rehabilitacion/Visualizar lista de extorno rehabilitacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extorno
    And ingresar a la opcion extorno rehabilitacion
    And filtrar ticket "1000602350183946"
    And click en el boton buscar
    And seleccionar filtros de consulta
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And filtrar ticket del numero "1111111111111111"
    And filtrar ticket al numero "9999999999999999"
    And click en el boton buscar
    And validar columna "Turno ticket"
    And validar columna "Compania"
    And validar columna "Num. Vuelo"
    And validar columna "Num. Ticket"
    And validar columna "Fecha Proceso"
    And validar columna "Estado"

  Scenario: CPF089 - Extorno rehabilitacion/Extonar rehabilitacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extorno
    And ingresar a la opcion extorno rehabilitacion
    And filtrar ticket "5000604354376193"
    And click en el boton buscar
    And seleccionar filtros de consulta
    And seleccionar fecha desde "01/01/2024"
    And escribir hora desde "000000"
    And seleccionar fecha hasta "31/01/2024"
    And ingresar hora hasta "230000"
    And filtrar ticket del numero "1111111111111111"
    And filtrar ticket al numero "9999999999999999"
    And click en el boton buscar
    And seleccionar ticket rehabilitado a extornar "si"
    And click en el boton extornar
    And validar alerta de confirmacion ""
    And click en el boton aceptar

######## ANULACION DE TICKET ########

  Scenario: CPF090 - Anulacion de ticket/Visualizar lista de anulacion de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion anulacion
    And ingresar a la opcion anulacion de ticket
    And filtrar estado de turno "Cerrado"
    And filtrar ticket "6000600318289951"
    And filtrar tipo ticket "Todos"
    And click en el boton buscar
    And seleccionar rango de ticket
    And filtrar estado de turno "Cerrado"
    And ingresar ticket del numero "1111111111111111"
    And ingresar ticket al numero "9999999999999999"
    And filtrar tipo ticket "Todos"
    And click en el boton buscar
    And visualizar lista de "Anulación Ticket"

  Scenario: CPF091 - Anulacion de ticket/Anular numero de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion anulacion
    And ingresar a la opcion anulacion de ticket
    And filtrar estado de turno "Cerrado"
    And filtrar ticket "6000600318289951"
    And filtrar tipo ticket "Todos"
    And click en el boton buscar
    And seleccionar el ticket a anular "si"
    And ingresar el motivo de anulacion "Solo pruebas"
    And click en el boton anular
    #And validar alerta de confirmacion ""
    #And click en el boton aceptar
    #And validar mensaje ""

  Scenario: CPF092 - Anulacion de ticket/Anular rango de tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion anulacion
    And ingresar a la opcion anulacion de ticket
    And seleccionar rango de ticket
    And filtrar estado de turno "Cerrado"
    And ingresar ticket del numero "1111111111111111"
    And ingresar ticket al numero "9999999999999999"
    And filtrar tipo ticket "Todos"
    And click en el boton buscar
    And seleccionar el ticket a anular "si"
    And ingresar el motivo de anulacion "Solo pruebas"
    And click en el boton anular
    #And validar alerta de confirmacion ""
    #And click en el boton aceptar
    #And validar mensaje ""

######## ANULACION BCBP ########

  Scenario: CPF093 - Anulacion de bcbp/Visualizar lista de anulacion bcbp
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion anulacion
    And ingresar a la opcion anulacion bcbp
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar aerolinea "UNITED AIRLINES INC. SUCURSAL PERU"
    And click en el boton buscar
    And visualizar lista de "Anulación BCBP"

  Scenario: CPF094 - Anulacion de bcbp/Anular numero de bcbp
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion anulacion
    And ingresar a la opcion anulacion bcbp
    And ingresar fecha desde "01/01/2024"
    And ingresar fecha hasta "02/01/2024"
    And seleccionar aerolinea "UNITED AIRLINES INC. SUCURSAL PERU"
    And click en el boton buscar
    And seleccionar el bcbp a anular "si"
    And ingresar el motivo de anulacion "Testeo"
    And click en el boton anular
    #And validar alerta de confirmacion ""
    #And click en el boton aceptar
    #And validar mensaje ""

######## VENTA MASIVA CREDITO ########

  Scenario: CPF095 - Venta masiva credito/Registrar venta masiva credito con cierre de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion venta masiva credito
    And seleccionar cierre de turno "si"
    And ingresar tipo de vuelo "Nacional"
    And ingresar tipo de transbordo "Normal"
    And ingresar tipo de pasajero "Adulto"
    And ingresar cantidad para venta "5"
    And ingresar numero vuelo "RR559"
    And ingresar compania "AEROLINEA GENERICA"
    And seleccionar representante "Octavio Villafana"
    And click en el boton guardar
    And validar aviso "¿Esta seguro de realizar esta operación con cierre de turno?"
    And click en el boton si
    And validar mensaje "Registro agregado correctamente"

  Scenario: CPF096 - Venta masiva credito/Registrar venta masiva credito sin cierre de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion venta masiva credito
    And seleccionar cierre de turno "no"
    And ingresar tipo de vuelo "Nacional"
    And ingresar tipo de transbordo "Normal"
    And ingresar tipo de pasajero "Adulto"
    And ingresar cantidad para venta "5"
    And ingresar numero vuelo "RR559"
    And ingresar compania "AEROLINEA GENERICA"
    And seleccionar representante "Octavio Villafana"
    And click en el boton guardar
    And validar aviso "¿Esta seguro de realizar esta operación sin cierre de turno?"
    And click en el boton si
    And validar mensaje "Registro agregado correctamente"

######## EXTENSION FECHA VIGENCIA TICKETS ########

  Scenario: CPF097 - Extension fecha vigencia tickets/Visualizar lista extensión fecha vigencia tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extension fecha vigencia tickets
    And filtrar ticket "5000604355577796"
    And click en el boton buscar
    And seleccionar rango de ticket
    And filtrar ticket del numero "1111111111111111"
    And filtrar ticket al numero "9999999999999999"
    And click en el boton buscar
    And visualizar lista de "Extensión fecha vigencia tickets"

  Scenario: CPF098 - Extension fecha vigencia tickets/Extender fecha vigencia de numero de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extension fecha vigencia tickets
    And ingresar ticket "5000604355577796"
    And click en el boton buscar
    And seleccionar ticket a extender "si"
    And ingresar numero de dias a extender "30"
    And click en el boton extender
    And validar alerta confirmacion "¿Está seguro de realizar esta acción?"
    And click en el boton si
    And validar el mensaje "Se registró la información correctamente"
    And click en el boton aceptar

  Scenario: CPF099 - Extension fecha vigencia tickets/Extender fecha vigencia de rango de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extension fecha vigencia tickets
    And seleccionar rango de ticket extension
    And filtrar ticket desde "1111111111111111"
    And filtrar ticket hasta "9999999999999999"
    And click en el boton buscar
    And seleccionar ticket a extender "si"
    And ingresar numero de dias a extender "30"
    And click en el boton extender
    And validar alerta confirmacion "¿Está seguro de realizar esta acción?"
    And click en el boton si
    And validar el mensaje "Se registró la información correctamente"
    And click en el boton aceptar

######## GESTION DE MOLINETE ########

  Scenario: CPF100 - Gestion de molinete/Visualizar lista de gestion de molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion de molinete
    And visualizar lista de "Gestión de molinete"
    And visualizar datos de "Código"
    And visualizar datos de "Descripción"
    And visualizar datos de "Tipo de Vuelo"
    And visualizar datos de "Tipo de Acceso"
    And visualizar datos de "Tipo de Molinete"
    And visualizar datos de "Estado"
    And visualizar el campo "Acción"

  Scenario: CPF101 - Gestion de molinete/Modificar gestion de molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion de molinete
    And click en el boton editar
    And modificar tipo de documento "Ticket"
    And modificar tipo de vuelo "INTERNACIONAL"
    And modificar tipo de acceso "Normal"
    And modificar tipo de molinete "CONTINGENCIA"
    And modificar estado "ACTIVO"
    And modificar descripcion "NACIONAL NORMAL M4"
    And click en el boton guardar
    And validar alerta "¿Está seguro de realizar esta acción?"
    And click en el boton si
    And validar aviso "Se actualizaron los datos."
    And click en el boton aceptar

  Scenario: CPF102 - Gestion de molinete/Activar estado de gestion de molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion de molinete
    And click en el boton editar
    And modificar estado "ANULADO"
    And click en el boton guardar
    And validar alerta "¿Está seguro de realizar esta acción?"
    And click en el boton si
    And validar aviso "Se actualizaron los datos."
    And click en el boton aceptar

######## GENERACION ARCHIVO VENTA ########

  Scenario: CPF103 - Generacion archivo venta/Visualizar pantalla de generacion archivo venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion generacion archivo venta
    And visualizar lista de "Generación archivo venta"

  Scenario: CPF104 - Generacion archivo venta/Generar archivo venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion generacion archivo venta
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar formato excel "Excel"
    And seleccionar archivo a generar "si"
    And click en el boton generar
    #And validar alerta de confirmacion ""
    #And click en el boton aceptar
    #And validar mensaje ""

######## CERRAR TURNO ########

  Scenario: CPF105 - Cerrar turno/Visualizar lista de turnos abiertos o activos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion cerrar turno
    And visualizar lista de "Cerrar Turno"
    And visualizar datos de "Usuario"
    And visualizar datos de "Número de caja"
    And visualizar datos de "Fecha apertura"
    And visualizar datos de "Fecha cierre"

  Scenario: CPF106 - Cerrar turno/Cerrar turno abiertos o activos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion cerrar turno
    And seleccionar turno a cerrar "si"
    And click en el boton cerrar turno
    And validar alerta "¿Está seguro de registrar esta acción?"
    And click en el boton si
    And validar aviso "Operación realizada correctamente"
    And click en el boton aceptar

    ######## GENERACION COMPROBANTE SEAE ########

  Scenario: CPF107 - Generacion comprobante seae/Visualizar pantalla de generacion comprobante seae
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion generacion archivo seae
    And visualizar lista de "Generacion Comprobante SEAE"

  Scenario: CPF108 - Generacion archivo seae/Generar archivo seae
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion generacion archivo seae
    And ingresar fecha "Enero-2024"
    And seleccionar tipo documento "Boarding"
    And click en el boton generar