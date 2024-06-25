Feature: Funcionalidad del TUUA [Rol: Administrador Principal]

  Scenario: USUARIO(LAP)/CPF001 - Visualizacion de la pantalla principal (Sistema TUUA)
    Given abre la ruta del aplicativo web
    And visualizar la pantalla de acceso "INICIAR SESIÓN"


  Scenario: USUARIO(LAP)/CPF002 - Ingreso al aplicativo web
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And visualizar el "Sistema de Administración" tuua
    And visualizar el usuario del sistema "LAP"


  Scenario: USUARIO(LAP)/CPF003 - Visualización del menu principal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And visualizar modulo seguridad
    And visualizar modulo mantenimiento
    And visualizar modulo operacion
    And visualizar modulo consultas
    And visualizar modulo reportes

    ##################### MODULO SEGURIDAD #####################

  Scenario: USUARIO(LAP)/CPF004 - Visualizar modulo seguridad
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And visualizar la opcion "Roles"
    And visualizar la opcion "Usuarios"

######## Roles ########

  Scenario: USUARIO(LAP)/CPF005 - Roles/Visualizar lista de roles registrados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And visualizar lista de "Roles"
    And validar columna "Código"
    And validar columna "Nombre de rol"
    And validar columna "Rol padre"
    And validar columna "Fecha creación"
    And validar columna "Usuario creación"
    And validar columna "Acciones"


  Scenario: USUARIO(LAP)/CPF006 - Roles/Crear nuevo rol
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And click en el boton nuevo
    And ingresar nombre del rol "HHHTEST"
    And seleccionar rol padre "ADMIN"
    And configurar perfil "si"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"


  Scenario: USUARIO(LAP)/CPF007 - Roles/Modificar informacion de rol
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And click en el boton editar
    And click en el boton guardar
    And validar mensaje exito "Registro modificado correctamente"


  Scenario: USUARIO(LAP)/CPF008 - Roles/Eliminar rol
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo seguridad
    And ingresar a la opcion roles
    And click en el boton eliminar rol
    And validar alerta de confirmacion "¿Está seguro de eliminar este registro?"
    And click en el boton aceptar
    And validar mensaje "Registro eliminado correctamente"


  Scenario: USUARIO(LAP)/CPF009 - Moneda/Visualizar lista de monedas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And visualizar lista de "Moneda"
    And validar columna "Código"
    And validar columna "Descripción"
    And validar columna "Símbolo"
    And validar columna "Nemónico"
    And validar columna "Estado"
    And validar columna "Fecha modificación"
    And validar columna "Usuario modificación"
    And validar columna "Acciones"


  Scenario: USUARIO(LAP)/CPF010 - Moneda/Registrar tipo de moneda
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And click en el boton nuevo
    And seleccionar codigo de moneda "DOP"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"


  Scenario: USUARIO(LAP)/CPF011 - Moneda/Deshabilitar una moneda
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And click en el boton editar
    And seleccionar estado "Deshabilitado"
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"

######## Compañias ########

  Scenario: USUARIO(LAP)/CPF012 - Compania/Visualizar lista de companias
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And visualizar lista de "Compañías"
    And validar columna "Código"
    And validar columna "Tipo"
    And validar columna "Descripción"
    And validar columna "Fecha de modificación"
    And validar columna "Usuario modificación"
    And validar columna "Estado"
    And click en ver mas campos
    And validar datos de "Código aerolínea"
    And validar datos de "OACI"
    And validar datos de "IATA"
    And validar datos de "Tipo de transbordo"
    And validar datos de "Código interno"
    And validar datos de "Código SAP"
    And validar datos de "Fecha de creación"
    And validar datos de "RUC"
    And validar datos de "Venta Normal"
    And validar datos de "BCBP"
    And validar datos de "Venta Masiva Contado"
    And validar datos de "Venta Masiva Crédito"
    And visualizar el campo "Acciones"


  Scenario: USUARIO(LAP)/CPF013 - Compania/Registrar una compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And click en el boton nuevo
    And ingresar nombre "zCompGen10"
    And seleccionar tipo de compania "AEROLINEA"
    And ingresar ruc "2078965485"
    And ingresar codigo aerolinea "bbb"
    And ingresar codigo iata "ccc"
    And ingresar codigo sap "222"
    And ingresar codigo oaci "eee"
    And ingresar codigo interno "fff"
    And click en el boton agregar representante
    And ingresar nombre de representante "Testing"
    And ingresar apellido de representante "IDE"
    And ingresar tipo de documento "DNI"
    And ingresar numero de documento "72179974"
    And ingresar cargo "Analista"
    And seleccionar permisos "si"
    And click en boton guardar
    And validar mensaje "Representante registrado correctamente"
    And seleccionar venta normal "si"
    And click en el boton editar venta normal
    And seleccionar atributo activar rehabilitacion "si"
    And seleccionar atributo numero maximo de ticket para venta "si"
    And seleccionar atributo numero minimo de ticket para venta "si"
    And seleccionar atributo serie numero ticket fin "si"
    And seleccionar atributo serie numero ticket inicio "si"
    And click en boton guardar
    And seleccionar bcbp "si"
    And click en el boton editar bcbp
    And seleccionar atributo activar rehabilitacion "si"
    And seleccionar la serie numero ticket fin "no"
    And seleccionar la serie numero ticket inicio "no"
    And click en boton guardar
    And seleccionar venta masiva contado "si"
    And click en el boton editar venta masiva contado
    And seleccionar atributo activar rehabilitacion "si"
    And seleccionar atributo numero maximo de ticket para venta "si"
    And seleccionar atributo numero minimo de ticket para venta "si"
    And seleccionar atributo serie numero ticket fin "si"
    And seleccionar atributo serie numero ticket inicio "si"
    And click en boton guardar
    And seleccionar venta masiva credito "si"
    And click en el boton editar venta masiva credito
    And seleccionar atributo activar rehabilitacion "si"
    And seleccionar atributo numero maximo de ticket para venta "si"
    And seleccionar atributo numero minimo de ticket para venta "si"
    And seleccionar atributo serie numero ticket fin "si"
    And seleccionar atributo serie numero ticket inicio "si"
    And click en boton guardar
    And click en el boton guardar
    And validar el mensaje "La compañía se registró correctamente"


  Scenario: USUARIO(LAP)/CPF014 - Compania/Modificar una compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And click en el boton editar compania
    And modificar nombre "zCompGen01"
    And seleccionar tipo de compania "AEROLINEA"
    And modificar ruc "2078965485"
    And modificar codigo aerolinea "aaa"
    And modificar codigo iata "bbb"
    And modificar codigo sap "442"
    And modificar codigo oaci "ddd"
    And modificar codigo interno "eee"
    And click en el boton editar representante
    And modificar nombre de representante "Testing"
    And modificar apellido de representante "IDE"
    And ingresar tipo de documento "DNI"
    And modificar numero de documento "72178888"
    And modificar cargo "QAAA"
    And seleccionar permisos "no"
    And click en boton guardar
    And validar mensaje "Representante registrado correctamente"
    And seleccionar venta normal "si"
    And click en el boton editar venta normal
    And seleccionar atributo activar rehabilitacion "si"
    And seleccionar atributo numero maximo de ticket para venta "si"
    And seleccionar atributo numero minimo de ticket para venta "si"
    And seleccionar atributo serie numero ticket fin "si"
    And seleccionar atributo serie numero ticket inicio "si"
    And click en boton guardar
    And seleccionar bcbp "si"
    And click en el boton editar bcbp
    And seleccionar atributo activar rehabilitacion "si"
    And seleccionar la serie numero ticket fin "no"
    And seleccionar la serie numero ticket inicio "no"
    And click en boton guardar
    And seleccionar venta masiva contado "si"
    And click en el boton editar venta masiva contado
    And seleccionar atributo activar rehabilitacion "si"
    And seleccionar atributo numero maximo de ticket para venta "si"
    And seleccionar atributo numero minimo de ticket para venta "si"
    And seleccionar atributo serie numero ticket fin "si"
    And seleccionar atributo serie numero ticket inicio "si"
    And click en boton guardar
    And seleccionar venta masiva credito "si"
    And click en el boton editar venta masiva credito
    And seleccionar atributo activar rehabilitacion "si"
    And seleccionar atributo numero maximo de ticket para venta "si"
    And seleccionar atributo numero minimo de ticket para venta "si"
    And seleccionar atributo serie numero ticket fin "si"
    And seleccionar atributo serie numero ticket inicio "si"
    And click en boton guardar
    And click en el boton guardar
    And validar el mensaje "La compañía se actualizó correctamente"


  Scenario: USUARIO(LAP)/CPF015 - Compania/Deshabilitar una compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And click en el boton editar
    And seleccionar estado "DESHABILITADO"
    And click en el boton guardar
    And validar el mensaje "La compañía se actualizó correctamente"

######## Modalidad de Venta ########

  Scenario: USUARIO(LAP)/CPF016 - Modalidad de venta/Visualizar lista de modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And visualizar lista de "Modalidades de Venta"
    And validar columna "Código"
    And validar columna "Descripción"
    And validar columna "Tipo"
    And validar columna "Tipo de Ticket Asociado"
    And validar columna "Estado"
    And validar columna "Fecha de Modificación"
    And validar columna "Usuario de Modificación"
    And validar columna "Acciones"


  Scenario: USUARIO(LAP)/CPF017 - Modalidad de venta/Registrar una modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton nuevo
    And seleccionar tipo de modalidad "Tipo Venta Masiva Credito"
    And ingresar descripcion "Testing"
    And click en el boton agregar modalidad de venta
    And seleccionar activar rehabilitacion "si"
    And seleccionar maximo de tickets emitidos por semana al credito "si"
    And seleccionar numero maximo tickets para venta "no"
    And seleccionar numero minimo tickets para venta "no"
    And seleccionar serie numero ticket fin "no"
    And seleccionar serie numero ticket inicio "no"
    And click en boton guardar
    And seleccionar el tipo ticket "T02 ( ADULTO NACIONAL NORMAL )"
    And click en el boton agregar modalidad tipo ticket
    And click en el boton agregar atributos tipo ticket
    And seleccionar el activar rehabilitacion "si"
    And seleccionar el maximo de tickets emitidos por semana al credito "si"
    And seleccionar el numero maximo tickets para venta "si"
    And seleccionar el numero minimo tickets para venta "si"
    And click en boton guardar
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"


  Scenario: USUARIO(LAP)/CPF018 - Modalidad de venta/Modificar una modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton editar
    And seleccionar estado "Vigente"
    And cambiar descripcion "Pruebas"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"


  Scenario: USUARIO(LAP)/CPF019 - Modalidad de venta/Modalidad de venta registrado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton nuevo
    And seleccionar tipo de modalidad "Tipo Venta Masiva Credito"
    And ingresar descripcion "Testing"
    And click en el boton agregar modalidad de venta
    And seleccionar activar rehabilitacion "si"
    And seleccionar maximo de tickets emitidos por semana al credito "si"
    And seleccionar numero maximo tickets para venta "si"
    And seleccionar numero minimo tickets para venta "si"
    And seleccionar serie numero ticket fin "si"
    And seleccionar serie numero ticket inicio "si"
    And click en boton guardar
    And seleccionar el tipo ticket "T02 ( ADULTO NACIONAL NORMAL )"
    And click en el boton agregar modalidad tipo ticket
    And click en el boton agregar atributos tipo ticket
    And seleccionar el activar rehabilitacion "si"
    And seleccionar el maximo de tickets emitidos por semana al credito "si"
    And seleccionar el numero maximo tickets para venta "si"
    And seleccionar el numero minimo tickets para venta "si"
    And click en boton guardar
    And click en el boton guardar
    And validar alerta de confirmacion "No se puede crear la modalidad del tipo escogido, ya se encuentra registrado"
    And click en el boton aceptar


  Scenario: USUARIO(LAP)/CPF020 - Modalidad de venta/Deshabilitar una modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton editar modalidad
    And seleccionar estado "Deshabilitado"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"

######## Tipo de Ticket ########

  Scenario: USUARIO(LAP)/CPF021 - Tipo de ticket/Visualizar lista de tipo de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion tipo de ticket
    And visualizar lista de "Lista de Tipos de Ticket"
    And validar columna "Codigo"
    And validar columna "Tipo"
    And validar columna "Precio"
    And validar columna "Moneda"
    And validar columna "Estado"
    And validar columna "Fecha modificación"
    And validar columna "Usuario modificación"
    And validar columna "Acciones"


  Scenario: USUARIO(LAP)/CPF022 - Tipo de ticket/Registrar un tipo de Ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion tipo de ticket
    And click en el boton nuevo
    And ingresar nombre de tipo ticket "Selenium IDE"
    And seleccionar tipo de pasajero "INFANTE"
    And seleccionar un tipo vuelo "INTERNACIONAL"
    And seleccionar un tipo transbordo "TRANSFERENCIA"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"


  Scenario: USUARIO(LAP)/CPF023 - Tipo de ticket/Modificar un tipo de Ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion tipo de ticket
    And click en el boton editar
    And ingresar nombre de tipo ticket "Selenium editado"
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"


  Scenario: USUARIO(LAP)/CPF024 - Tipo de ticket/Deshabilitar un tipo de Ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion tipo de ticket
    And click en el boton editar
    And seleccionar estado "Vigente"
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"


    ##################### MODULO OPERACION #####################

  Scenario: USUARIO(LAP)/CPF025 - Visualizar modulo operacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And visualizar la opcion "Ingresar Tasa de Cambio"
    And visualizar la opcion "Gestión Precio Tickets"
    And visualizar la opcion gestion tickets contingencia
    And visualizar la subopcion "Pre-Emisión Tickets Contingencia"
    And visualizar la subopcion "Registro Tickets Contingencia"
    And visualizar la opcion extorno
    And visualizar la subopcion "Extorno Operaciones"
    And visualizar la subopcion "Extorno Tickets"
    And visualizar la opcion anulacion
    And visualizar la subopcion "Anulación de Ticket"
    And visualizar la opcion "Venta Masiva Credito"
    And visualizar la opcion "Extensión Fecha Vigencia Tickets"
    And visualizar la opcion "Gestión de molinete"
    And visualizar la opcion "Generación Archivo Venta"
    And visualizar la opcion "Cerrar Turno"

    ######## Ingresar Tasa de Cambio ########

  Scenario: USUARIO(LAP)/CPF026 - Ingresar tasa de cambio/Visualizar lista de tasa de cambio
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF027 - Ingresar tasa de cambio/Registrar tasa de cambio con fecha actual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion ingresar tasa de cambio
    And click en el boton nuevo
    And seleccionar fecha actual
    And seleccionar tasas de cambio compra "si"
    And ingresar tasa de cambio compra "3.1/3.9/2.5/6.2/3.3"
    And seleccionar tasas de cambio venta "si"
    And ingresar tasa de cambio venta "1.2/2.2/3.2/1.3/2.5"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Está seguro de registrar la Tasa de Cambio?"
    And click en el boton aceptar
    And validar mensaje de confirmacion "Creacion de Tasa de Cambio"
    And click en el boton aceptar


  Scenario: USUARIO(LAP)/CPF028 - Ingresar tasa de cambio/Registrar tasa de cambio con fecha programada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And validar alerta de confirmacion "¿Está seguro de registrar la Tasa de Cambio?"
    And click en el boton aceptar
    And validar mensaje de confirmacion "Creacion de Tasa de Cambio"
    And click en el boton aceptar


  Scenario: USUARIO(LAP)/CPF029 - Ingresar tasa de cambio/Eliminar tasa de cambio programada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion ingresar tasa de cambio
    And seleccionar tasa de cambio programada
    And eliminar tasa de cambio programada
    And validar alerta de confirmacion "¿Está seguro de eliminar la Tasa de Cambio Programada?"
    And click en el boton aceptar
    And validar mensaje de eliminacion
    And click en el boton aceptar


  Scenario: USUARIO(LAP)/CPF030 - Ingresar tasa de cambio/Visualizar consulta de tasa de cambio historica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion ingresar tasa de cambio
    And seleccionar tasa de cambio historica
    And seleccionar tipo de operacion "Compra"
    And seleccionar fecha desde "01/03/2024"
    And seleccionar fecha hasta "31/03/2024"
    And click en el boton buscar

######## Gestion Precio Ticket ########

  Scenario: USUARIO(LAP)/CPF031 - Gestion precio ticket/Visualizar lista de precio de tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF032 - Gestion precio ticket/Registrar precio ticket con fecha actual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And validar alerta de confirmacion "¿Está seguro de registrar los precios de Ticket?"
    And click en el boton aceptar
    And validar mensaje de confirmacion "Creación de Precio de Ticket"
    And click en el boton aceptar


  Scenario: USUARIO(LAP)/CPF033 - Gestion precio ticket/Registrar precio ticket con fecha programada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion precio ticket
    And click en el boton nuevo
    And seleccionar fecha programada
    And ingresar fecha a programar "01/12/2024"
    And ingresar hora a programar "000000"
    And seleccionar monedas "si"
    And seleccionar codigo moneda "USD"
    And seleccionar precio de venta "si"
    And ingresar precio de venta "3/4/5"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Está seguro de registrar los precios de Ticket?"
    And click en el boton aceptar
    And validar mensaje de confirmacion "Creación de Precio de Ticket"
    And click en el boton aceptar


  Scenario: USUARIO(LAP)/CPF034 - Gestion precio ticket/Eliminiar precio de ticket programada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion precio ticket
    And seleccionar precio tickets programada
    And eliminar precio tickets programada
    And validar alerta de confirmacion "¿Está seguro de eliminar este registro?"
    And click en el boton aceptar
    And validar el mensaje de eliminacion
    And click en el boton aceptar


  Scenario: USUARIO(LAP)/CPF035 - Gestion precio ticket/Visualizar consulta de precio de tickets Historica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion precio ticket
    And seleccionar precio tickets historica
    And seleccionar fecha desde "01/04/2024"
    And seleccionar fecha hasta "30/04/2024"
    And click en el boton buscar

######## Pre-emision Ticket Contingencia ########

  Scenario: USUARIO(LAP)/CPF036 - Pre-emision tickets contingencia/Visualizar pre-emisión tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion tickets contingencia
    And ingresar a la opcion pre emision tickets contingencia
    And visualizar tipo de vuelo
    And visualizar tipo pasajero
    And visualizar fecha actual
    And visualizar precio ticket
    And visualizar cantidad


  Scenario: USUARIO(LAP)/CPF037 - Pre-emision tickets contingencia/Generar pre-emisión tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And click en el boton aceptar
    And validar mensaje "Registro agregado correctamente"

######## Registro Ticket Contingencia ########

  Scenario: USUARIO(LAP)/CPF038 - Registro tickets contingencia/Visualizar registro tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion tickets contingencia
    And ingresar a la opcion registro tickets contingencia
    And visualizar "Datos de Turno"
    And visualizar "Filtro consulta"
    And visualizar "Datos de venta"


  Scenario: USUARIO(LAP)/CPF039 - Registro tickets contingencia/Registro tickets contingencia con cierre de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion tickets contingencia
    And ingresar a la opcion registro tickets contingencia
    And filtrar usuario "Carmen Vera"
    And filtrar tipo de ticket "Internacional"
    And filtrar tipo de pasajero "Adulto"
    And ingresar ticket desde "9000600312484834"
    And ingresar ticket hasta "9000600312484836"
    And click en el boton buscar
    And seleccionar tickets requeridos "si"
    And seleccionar cierre de turno "si"
    And click en el boton guardar
    And validar alerta "¿Esta seguro de realizar esta operación con cierre de turno?"
    And click en el boton aceptar
    And validar mensaje "Registro realizado correctamente"


  Scenario: USUARIO(LAP)/CPF040 - Registro tickets contingencia/Registro tickets contingencia sin cierre de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And click en el boton aceptar
    And validar mensaje "Registro realizado correctamente"

######## Extorno Operaciones ########

  Scenario: USUARIO(LAP)/CPF041 - Extorno operaciones/Visualizar lista de extorno operaciones
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF042 - Extorno operaciones/Extornar operacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And seleccionar tipo operacion "Compra Moneda"
    And click en el boton buscar
    And seleccionar operacion a extornar "si"
    And click en el boton extornar
    And validar la alerta de confirmacion "¿Está seguro de realizar esta acción?"
    And click en boton aceptar
    And validar la alerta de confirmacion "Finalizó el proceso de impresión."
    And click en el boton aceptar

######## Extorno Tickets ########

  Scenario: USUARIO(LAP)/CPF043 - Extorno tickets/Visualizar lista de extorno tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF044 - Extorno tickets/Extornar tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extorno
    And ingresar a la opcion extorno tickets
    And filtrar estado turno "CERRADO"
    And filtrar turno "032205"
    And seleccionar fecha desde "01/02/2024"
    And seleccionar fecha hasta "28/02/2024"
    And click en el boton buscar
    And click en el boton detalle de turno
    And seleccionar ticket a extornar "si"
    And ingresar el motivo de extorno "Solo prueba"
    And click en el boton extornar
    And validar la alerta de confirmacion "¿Está seguro de realizar esta acción?"
    And click en el boton aceptar
    And validar la alerta de confirmacion "Finalizó el proceso de impresión."
    And click en el boton aceptar


    ######## Anulación de Tickets ########

  Scenario: USUARIO(LAP)/CPF045 - Anulacion de ticket/Visualizar lista de anulacion de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion anulacion
    And ingresar a la opcion anulacion de ticket
    And filtrar estado de turno "Cerrado"
    And filtrar el ticket "6000600318289951"
    And filtrar tipo ticket "Todos"
    And click en el boton buscar
    And seleccionar rango de ticket
    And filtrar estado de turno "Cerrado"
    And ingresar ticket del numero "1111111111111111"
    And ingresar ticket al numero "9999999999999999"
    And filtrar tipo ticket "Todos"
    And click en el boton buscar
    And visualizar lista de "Anulación Ticket"
    And validar columna "Número"
    And validar columna "Número de ticket"
    And validar columna "Tipo Ticket"
    And validar columna "Compañia"
    And validar columna "Fecha Vuelo"
    And validar columna "Nro. de Vuelo"
    And validar columna "Estado Actual"
    And validar columna "Acciones"


  Scenario: USUARIO(LAP)/CPF046 - Anulacion de ticket/Anular numero de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion anulacion
    And ingresar a la opcion anulacion de ticket
    And filtrar estado de turno "Cerrado"
    And filtrar el ticket "6000600318381058"
    And filtrar tipo ticket "Todos"
    And click en el boton buscar
    And seleccionar el ticket a anular "si"
    And ingresar el motivo de anulacion "Solo pruebas"
    And click en el boton anular
    And validar alerta de confirmacion "¿Está seguro de anular los tickets seleccionados?"
    And click en el boton aceptar
    And validar mensaje "Registro anulado correctamente"


  Scenario: USUARIO(LAP)/CPF047 - Anulacion de ticket/Anular rango de tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And validar alerta de confirmacion "¿Está seguro de anular los tickets seleccionados?"
    And click en el boton aceptar
    And validar mensaje "Registro anulado correctamente"


    ######## Venta Masiva Credito ########

  Scenario: USUARIO(LAP)/CPF048 - Venta masiva credito/Registrar venta masiva credito con cierre de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And click en el boton aceptar
    And validar mensaje "Registro agregado correctamente"


  Scenario: USUARIO(LAP)/CPF049 - Venta masiva credito/Registrar venta masiva credito sin cierre de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And click en el boton aceptar
    And validar mensaje "Registro agregado correctamente"

######## Extension Fecha de Vigencia Tickets ########

  Scenario: USUARIO(LAP)/CPF050 - Extension fecha vigencia tickets/Visualizar lista extensión fecha vigencia tickets
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extension fecha vigencia tickets
    And ingresar ticket "5000604355577796"
    And click en el boton buscar
    And seleccionar rango de tickets
    And filtrar ticket desde "1111111111111111"
    And filtrar ticket hasta "9999999999999999"
    And click en el boton buscar
    And visualizar lista de "Extensión fecha vigencia tickets"
    And validar columna "Número"
    And validar columna "Número ticket"
    And validar columna "Fecha de emisión"
    And validar columna "Tipo ticket"
    And validar columna "Fecha de vencimiento"
    And validar columna "Número de veces"
    And validar columna "Número de días"
    And validar columna "Estado"


  Scenario: USUARIO(LAP)/CPF051 - Extension fecha vigencia tickets/Extender fecha vigencia de numero de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extension fecha vigencia tickets
    And ingresar ticket "5000604355577797"
    And click en el boton buscar
    And seleccionar ticket a extender "si"
    And ingresar numero de dias a extender "30"
    And click en el boton extender
    And validar la alerta de confirmacion "¿Está seguro de realizar esta acción?"
    And click en el boton aceptar
    And validar el mensaje "Registro agregado correctamente"


  Scenario: USUARIO(LAP)/CPF052 - Extension fecha vigencia tickets/Extender fecha vigencia de rango de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion extension fecha vigencia tickets
    And seleccionar rango de tickets
    And filtrar ticket desde "1111111111111111"
    And filtrar ticket hasta "9999999999999999"
    And click en el boton buscar
    And seleccionar ticket a extender "si"
    And ingresar numero de dias a extender "30"
    And click en el boton extender
    And validar la alerta de confirmacion "¿Está seguro de realizar esta acción?"
    And click en el boton aceptar
    And validar el mensaje "Registro agregado correctamente"

######## Gestion de Molinete ########

  Scenario: USUARIO(LAP)/CPF053 - Gestion de molinete/Visualizar lista de gestion de molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion de molinete
    And visualizar lista de "Gestión de molinete"
    And validar columna "Código"
    And validar columna "Descripción"
    And validar columna "Tipo de Vuelo"
    And validar columna "Tipo de Acceso"
    And validar columna "Tipo de Molinete"
    And validar columna "Estado"
    And validar columna "Acción"


  Scenario: USUARIO(LAP)/CPF054 - Gestion de molinete/Modificar gestion de molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion de molinete
    And click en el boton editar
    And modificar tipo de documento "Ticket"
    And modificar tipo de vuelo "INTERNACIONAL"
    And modificar tipo de acceso "Normal"
    And modificar tipo de molinete "CONTIGENCIA"
    And modificar estado "ACTIVO"
    And modificar descripcion "NACIONAL NORMAL M4"
    And click en el boton guardar
    And validar alerta de confirmacion "¿Está seguro de realizar esta acción?"
    And click en el boton aceptar
    And validar mensaje "Se actualizaron los datos."


  Scenario: USUARIO(LAP)/CPF055 - Gestion de molinete/Activar estado de gestion de molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion gestion de molinete
    And click en el boton editar
    And modificar estado "ACTIVO"
    And click en el boton guardar
    And validar alerta "¿Está seguro de realizar esta acción?"
    And click en el boton aceptar
    And validar mensaje "Se actualizaron los datos."

######## Generacion Archivo Venta ########

  Scenario: USUARIO(LAP)/CPF056 - Generacion archivo venta/Visualizar pantalla de generacion archivo venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion generacion archivo venta
    And visualizar pantalla de "Generación archivo venta"
    And se muestra rango de fechas de tickets o bp
    And se muestra formatos de salida excel y texto
    And se muestra los "Archivo a Generar"

  Scenario: USUARIO(LAP)/CPF057 - Generacion archivo venta/Generar archivo venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion generacion archivo venta
    And seleccionar fecha desde "01/02/2024"
    And seleccionar fecha hasta "04/02/2024"
    And seleccionar formato excel "Texto"
    And seleccionar archivo a generar "si"
    And click en el boton generar
    And validar alerta de confirmacion "¿Está seguro de realizar esta operacion?"
    And click en el boton aceptar
    And validar mensaje "Registro generado correctamente"

######## Cerrar Turno ########

  Scenario: USUARIO(LAP)/CPF058 - Cerrar turno/Visualizar lista de turnos abiertos o activos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion cerrar turno
    And visualizar lista de "Cerrar Turno"
    And validar columna "Seleccionar"
    And validar columna "Código Turno"
    And validar columna "Usuario"
    And validar columna "Número de caja"
    And validar columna "Fecha apertura"
    And validar columna "Fecha cierre"
    And validar columna de moneda "SOL"
    And validar columna de moneda "DOL"


  Scenario: USUARIO(LAP)/CPF059 - Cerrar turno/Cerrar turno abiertos o activos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo operacion
    And ingresar a la opcion cerrar turno
    And seleccionar turno a cerrar "si"
    And click en el boton cerrar turno
    And validar alerta "¿Está seguro de registrar esta acción?"
    And click en el boton aceptar
    And validar mensaje "Operación realizada correctamente"

    ##################### MODULO CONSULTAS #####################

  Scenario: USUARIO(LAP)/CPF060 - Visualizar modulo consultas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And visualizar la opcion usuarios
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
    And visualizar la opcion "Transacción Crítica"


    ######## Usuarios ########

  Scenario: USUARIO(LAP)/CPF061 - Usuarios/Buscar usuarios
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion usuarios
    And seleccionar rol "ADMIN"
    And seleccionar estado "VIGENTE"
    And seleccionar grupo "TOTAL"
    And click en el boton buscar
    And visualizar lista de "Usuario"
    And validar columna "Código"
    And validar columna "Cuenta"
    And validar columna "Nombre"
    And validar columna "Fecha Creación"
    And validar columna "Grupo"
    And validar columna "Roles asociados"
    And validar columna "Estado"
    And validar columna "Días por vencer cuenta usuario"
    And validar columna "Días por vencer clave"

  Scenario: USUARIO(LAP)/CPF062 - Usuarios/Imprimir lista de usuarios
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion usuarios
    And seleccionar rol "ADMIN"
    And seleccionar estado "VIGENTE"
    And seleccionar grupo "TOTAL"
    And click en el boton buscar
    And click en imprimir

######## Compañias ########

  Scenario: USUARIO(LAP)/CPF063 - Companias/Buscar companias
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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

  Scenario: USUARIO(LAP)/CPF064 - Companias/Imprimir lista de companias
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion companias
    And seleccionar rol "<Todos>"
    And seleccionar estado "<Todos>"
    And seleccionar grupo "<Todos>"
    And click en el boton buscar
    And click en imprimir

######## Turnos ########

  Scenario: USUARIO(LAP)/CPF065 - Turnos/Buscar turnos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF066 - Turnos/Ver detalle de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF067 - Turnos/Imprimir detalle de turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF068 - Turnos/Imprimir consulta de turnos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF069 - Turnos/Exportar excel consulta de turnos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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

######## Detalle Ticket / BP ########

  Scenario: USUARIO(LAP)/CPF070 - Detalle de ticket-bp/Buscar detalle de ticket-bp
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF071 - Detalle de ticket-bp/Exportar excel e imprimir detalle de ticket-bp por numero de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion detalle de ticket bp
    And seleccionar por numero de ticket
    And ingresar numero ticket "1000602350183940"
    And click en el boton buscar
    And click en exportar excel
    And click en imprimir consulta


  Scenario: USUARIO(LAP)/CPF072 - Detalle de ticket-bp/Exportar excel e imprimir detalle de ticket-bp por rango de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion detalle de ticket bp
    And seleccionar por rango de ticket
    And ingresar el numero de ticket desde "1000602350183940"
    And ingresar el numero de ticket hasta "1000602350183999"
    And click en el boton buscar
    And click en exportar excel
    And click en imprimir consulta


  Scenario: USUARIO(LAP)/CPF073 - Detalle de ticket-bp/Exportar excel e imprimir detalle de ticket-bp por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And click en exportar excel
    And click en imprimir consulta

######## TICKET / BP POR FECHA ########

  Scenario: USUARIO(LAP)/CPF074 - Tickets-bp por fecha/Buscar tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF075 - Tickets-bp por fecha/Ver detalle de tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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
    And seleccionar al cajero "Tamara Olaechea"
    And click en el boton buscar
    And click en boton ver detalle
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF076 - Tickets-bp por fecha/Imprimir tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF077 - Tickets-bp por fecha/Exportar excel tickets-bp por fecha
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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

######## Cuadre de Stickers Emitidos o BP Usados ########

  Scenario: USUARIO(LAP)/CPF078 - Cuadre de stickers emitidos o bp usados/Buscar por ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Ticket"
    And click en el boton buscar
    And visualizar informacion de "Cuadre de tickets emitidos"


  Scenario: USUARIO(LAP)/CPF079 - Cuadre de stickers emitidos o bp usados/Buscar por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Boarding"
    And click en el boton buscar
    And visualizar informacion de "Cuadre de tickets emitidos"


  Scenario: USUARIO(LAP)/CPF080 - Cuadre de stickers emitidos o bp usados/Imprimir por ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Ticket"
    And click en el boton buscar
    And click en imprimir consulta


  Scenario: USUARIO(LAP)/CPF081 - Cuadre de stickers emitidos o bp usados/Imprimir por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Boarding"
    And click en el boton buscar
    And click en imprimir consulta


  Scenario: USUARIO(LAP)/CPF082 - Cuadre de stickers emitidos o bp usados/Exportar excel por ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Ticket"
    And click en el boton buscar
    And click en exportar excel


  Scenario: USUARIO(LAP)/CPF083 - Cuadre de stickers emitidos o bp usados/Exportar excel por boarding
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion cuadre de stickers emitidos o bp usados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar tipo documento "Boarding"
    And click en el boton buscar
    And click en exportar excel

######## Operacion Compra / Venta ########

  Scenario: USUARIO(LAP)/CPF084 - Operacion compra-venta/Buscar operacion compra-venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF085 - Operacion compra-venta/Imprimir operacion compra-venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion operacion compra venta
    And ingresar fecha de proceso "01/01/2024"
    And seleccionar usuario "<Todos>"
    And click en el boton buscar
    And click en imprimir

    ######## Tickets / BP Usados ########

  Scenario: USUARIO(LAP)/CPF086 - Tickets-bp usados/Buscar tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar la fecha desde "01/05/2020"
    And seleccionar la fecha hasta "31/05/2020"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
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


  Scenario: USUARIO(LAP)/CPF087 - Tickets-bp usados/Ver detalle de tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar la fecha desde "01/05/2020"
    And seleccionar la fecha hasta "31/05/2020"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
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


  Scenario: USUARIO(LAP)/CPF088 - Tickets-bp usados/Imprimir tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar la fecha desde "01/05/2020"
    And seleccionar la fecha hasta "31/05/2020"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar el tipo de documento "Ticket"
    And seleccionar el tipo vuelo "<Todos>"
    And seleccionar estado "<Todos>"
    And seleccionar tipo de transbordo "<Todos>"
    And seleccionar una aerolinea "AEROLINEA GENERICA"
    And ingresar el numero de vuelo ""
    And ingresar tipo de persona "ADULTO"
    And click en el boton buscar
    And click en imprimir consulta


  Scenario: USUARIO(LAP)/CPF089 - Tickets-bp usados/Exportar excel de tickets-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets bp usados
    And seleccionar la fecha desde "01/01/2024"
    And seleccionar la fecha hasta "02/01/2024"
    And escribir la hora desde "00:00:00"
    And escribir la hora hasta "23:00:00"
    And seleccionar el tipo de documento "<Todos>"
    And seleccionar el tipo vuelo "<Todos>"
    And seleccionar estado "USADO"
    And seleccionar tipo de transbordo "NORMAL"
    And seleccionar una aerolinea "AERO TRANSPORTE  S. A."
    And ingresar el numero de vuelo "4A4001"
    And ingresar tipo de persona "ADULTO"
    And click en el boton buscar
    And click en exportar excel

     ######## Tickets / BP Anulados ########

  Scenario: USUARIO(LAP)/CPF090 - Tickets-bp anulados/Buscar tickets-bp anulados
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


  Scenario: USUARIO(LAP)/CPF091 - Tickets-bp anulados/Ver resumen de tickets-bp anulados
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


  Scenario: USUARIO(LAP)/CPF092 - Tickets-bp anulados/Exportar excel de consulta de tickets-bp anulados
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


  Scenario: USUARIO(LAP)/CPF093 - Tickets-bp anulados/Exportar pdf de consulta de tickets-bp anulados
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

  Scenario: USUARIO(LAP)/CPF094 - Tickets-bp anulados/Imprimir consulta de tickets-bp anulados
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

######## Auditoria ########

  Scenario: USUARIO(LAP)/CPF095 - Auditoria/Buscar auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF096 - Auditoria/Ver detalle de auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF184 - Auditoria/Imprimir auditoria
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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

######## Tickets Procesados ########

  Scenario: USUARIO(LAP)/CPF185 - Tickets procesados/Buscar tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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

  Scenario: USUARIO(LAP)/CPF186 - Tickets procesados/Imprimir tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031962"
    And click en el boton buscar
    And click en imprimir consulta


  Scenario: USUARIO(LAP)/CPF187 - Tickets procesados/Exportar excel de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Carmen Vera"
    And ingresar codigo de turno "031962"
    And click en el boton buscar
    And click en exportar excel


  Scenario: USUARIO(LAP)/CPF188 - Tickets procesados/Ver detalle de turno de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Estefania Olivo"
    And ingresar codigo de turno "031963"
    And click en el boton buscar
    And click en boton ver detalle


  Scenario: USUARIO(LAP)/CPF189 - Tickets procesados/Ver detalle de tickets de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF190 - Tickets procesados/Imprimir detalle de turno de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Estefania Olivo"
    And ingresar codigo de turno "031963"
    And click en el boton buscar
    And click en imprimir consulta


  Scenario: USUARIO(LAP)/CPF191 - Tickets procesados/Exportar excel de detalle de turno de tickets procesados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
    And click en el boton iniciar sesion
    And ingresar al modulo consultas
    And ingresar a la opcion tickets procesados
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar cajero "Estefania Olivo"
    And ingresar codigo de turno "031963"
    And click en el boton buscar
    And click en exportar excel


    ######## Transaccion Critica ########


  Scenario: USUARIO(LAP)/CPF198 - Transaccion critica/Buscar transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF199 - Transaccion critica/Ver detalle de transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


  Scenario: USUARIO(LAP)/CPF200 - Transaccion critica/Imprimir transaccion critica
    Given abre la ruta del aplicativo web
    And ingresa el usuario "lapadmin"
    And ingresa la contrasena "lapadmin1"
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


        ##################### MODULO REPORTES #####################

  Scenario: USUARIO(LAP)/CPF203 - Visualizar modulo reportes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And visualizar la opcion "Liquidación Stickers"
    And visualizar la opcion "Resumen Diario"
    And visualizar la opcion "Movimiento Tickets Contingencia"
    And visualizar la opcion "Stock Tickets Contingencia"
    And visualizar la opcion "Detalle por Línea de Vuelo"
    And visualizar la opcion "BP leidos en el molinete"
    And visualizar la opcion "Tickets Vendidos a Crédito o al Contado"
    And visualizar la opcion "Detalle Compañía"
    And visualizar la opcion "Tickets / BP Usados por Media Hora, Hora, Día o Mes"
    And visualizar la opcion "Tickets / BP Usados por Día - Mes"
    And visualizar la opcion "Recaudación mensual"
    And visualizar la opcion "Liquidación Venta"
    And visualizar la opcion "Tickets Vencidos"
    And visualizar la opcion "Cuadre Stickers vendidos / BP usados"
    And visualizar la opcion "Ticket / BP Rehabilitados"
    And visualizar la opcion "BP Rehabilitados"
    And visualizar la opcion "Resumen Diario por Turno"
    And visualizar la opcion "Extranet BP Diarios (Usados/Rehabilitados)"


    ######## Liquidacion Stickers ########

  Scenario: USUARIO(LAP)/CPF204 - Liquidacion stickers/Visualizar pantalla de reporte de liquidacion de Stickers
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion stickers
    And visualizar pantalla de "Liquidación de Stickers"


  Scenario: USUARIO(LAP)/CPF205 - Liquidacion stickers/Consultar reporte de liquidacion de Stickers
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion stickers
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And click en el boton buscar
    And visualizar reporte de "Liquidación de Stickers"


  Scenario: USUARIO(LAP)/CPF206 - Liquidacion stickers/Exportar pdf de reporte liquidacion de Stickers
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion stickers
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And click en el boton buscar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF207 - Liquidacion stickers/Exportar excel de reporte de liquidacion de Stickers
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion stickers
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And click en el boton buscar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF208 - Liquidacion stickers/Imprimir reporte de liquidacion de Stickers
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion stickers
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And click en el boton buscar
    And click en el boton imprimir

######## Resumen Diario ########

  Scenario: USUARIO(LAP)/CPF209 - Resumen diario/Visualizar pantalla de reporte de resumen diario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario
    And visualizar pantalla de "Resumen Diario"


  Scenario: USUARIO(LAP)/CPF210 - Resumen diario/Consultar reporte de resumen diario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario
    And seleccionar fecha
    And seleccionar fecha desde "01/01/2024"
    And click en el boton buscar
    And seleccionar rango de fechas
    And seleccionar fecha desde "01/01/2024"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "05/01/2024"
    And ingresar hora hasta "230000"
    And click en el boton buscar


  Scenario: USUARIO(LAP)/CPF211 - Resumen diario/Exportar pdf de reporte de resumen diario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario
    And seleccionar rango de fechas
    And seleccionar fecha desde "01/01/2024"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "05/01/2024"
    And ingresar hora hasta "230000"
    And click en el boton buscar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF212 - Resumen diario/Exportar excel de reporte de resumen diario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario
    And seleccionar rango de fechas
    And seleccionar fecha desde "01/01/2024"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "05/01/2024"
    And ingresar hora hasta "230000"
    And click en el boton buscar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF213 - Resumen diario/Imprimir reporte de resumen diario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario
    And seleccionar rango de fechas
    And seleccionar fecha desde "01/01/2024"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "05/01/2024"
    And ingresar hora hasta "230000"
    And click en el boton buscar
    And click en el boton imprimir


######## Movimiento Tickets Contingencia ########


  Scenario: USUARIO(LAP)/CPF214 - Movimiento tickets contingencia/Visualizar pantalla de movimiento tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion movimiento tickets contingencia
    And visualizar pantalla de "Movimientos tickets contingencia"


  Scenario: USUARIO(LAP)/CPF215 - Movimiento tickets contingencia/Consultar reporte de movimiento tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion movimiento tickets contingencia
    And seleccionar indicador fecha "ANULADO"
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And seleccionar estado "ANULADO"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar numero de ticket desde "9000600312282707"
    And ingresar numero de ticket hasta "9000600312282805"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Movimiento Tickets Contingencia"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF216 - Movimiento tickets contingencia/Exportar pdf de reporte movimiento tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion movimiento tickets contingencia
    And seleccionar indicador fecha "EMITIDO"
    And seleccionar fecha desde "16/09/2023"
    And seleccionar fecha hasta "30/11/2023"
    And seleccionar estado "REHABILITADO"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar numero de ticket desde "9000600312282605"
    And ingresar numero de ticket hasta "9000600312282609"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Movimiento Tickets Contingencia"
    And click en el boton cerrar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF217 - Movimiento tickets contingencia/Exportar excel de reporte movimiento tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion movimiento tickets contingencia
    And seleccionar indicador fecha "EMITIDO"
    And seleccionar fecha desde "16/09/2023"
    And seleccionar fecha hasta "30/11/2023"
    And seleccionar estado "REHABILITADO"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar numero de ticket desde "9000600312282605"
    And ingresar numero de ticket hasta "9000600312282609"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Movimiento Tickets Contingencia"
    And click en el boton cerrar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF218 - Movimiento tickets contingencia/Imprimir reporte movimiento tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion movimiento tickets contingencia
    And seleccionar indicador fecha "EMITIDO"
    And seleccionar fecha desde "16/09/2023"
    And seleccionar fecha hasta "30/11/2023"
    And seleccionar estado "REHABILITADO"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar numero de ticket desde "9000600312282605"
    And ingresar numero de ticket hasta "9000600312282609"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Movimiento Tickets Contingencia"
    And click en el boton cerrar
    And click en el boton imprimir

######## Stock Tickets Contingencia ########

  Scenario: USUARIO(LAP)/CPF219 - Stock Tickets Contingencia/Visualizar pantalla de stock tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion stock tickets contingencia
    And visualizar pantalla de "Stock Tickets Contingencia"

  Scenario: USUARIO(LAP)/CPF220 - Stock Tickets Contingencia/Consultar reporte de stock tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion stock tickets contingencia
    And ingresar fecha al "01/01/2024"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Stock Tickets Contingencia"
    And click en el boton cerrar

  Scenario: USUARIO(LAP)/CPF221 - Stock Tickets Contingencia/Exportar pdf de reporte de stock tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion stock tickets contingencia
    And ingresar fecha al "01/01/2024"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Stock Tickets Contingencia"
    And click en el boton cerrar
    And click en el boton pdf

  Scenario: USUARIO(LAP)/CPF222 - Stock Tickets Contingencia/Exportar excel de reporte de stock tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion stock tickets contingencia
    And ingresar fecha al "01/01/2024"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Stock Tickets Contingencia"
    And click en el boton cerrar
    And click en el boton excel

  Scenario: USUARIO(LAP)/CPF223 - Stock Tickets Contingencia/Imprimir reporte de stock tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion stock tickets contingencia
    And ingresar fecha al "01/01/2024"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Stock Tickets Contingencia"
    And click en el boton cerrar
    And click en el boton imprimir

######## Detalle por Linea de Vuelo ########

  Scenario: USUARIO(LAP)/CPF224 - Detalle por linea de vuelo/Visualizar pantalla de detalle por linea de vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle por linea de vuelo
    And visualizar pantalla de "Detalle Linea Vuelo"


  Scenario: USUARIO(LAP)/CPF225 - Detalle por linea de vuelo/Consultar reporte de detalle por linea de vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle por linea de vuelo
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "07/01/2024"
    And seleccionar aerolinea "AEROVIAS DE MEXICO SUCURSAL PERU C.V. S.A."
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Resumen: Detalle por Linea de Vuelo"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF226 - Detalle por Linea de Vuelo/Exportar excel de reporte de detalle por linea de vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle por linea de vuelo
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "07/01/2024"
    And seleccionar aerolinea "AEROVIAS DE MEXICO SUCURSAL PERU C.V. S.A."
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Resumen: Detalle por Linea de Vuelo"
    And click en el boton cerrar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF227 - Detalle por Linea de Vuelo/Imprimir reporte de detalle por linea de vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle por linea de vuelo
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "07/01/2024"
    And seleccionar aerolinea "AEROVIAS DE MEXICO SUCURSAL PERU C.V. S.A."
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Resumen: Detalle por Linea de Vuelo"
    And click en el boton cerrar
    And click en el boton imprimir


  Scenario: USUARIO(LAP)/CPF228 - Detalle por Linea de Vuelo/Imprimir resumen de reporte de detalle por linea de vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle por linea de vuelo
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "07/01/2024"
    And seleccionar aerolinea "AEROVIAS DE MEXICO SUCURSAL PERU C.V. S.A."
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Resumen: Detalle por Linea de Vuelo"
    And click en el boton cerrar
    And click en el boton imprimir resumen

    ######## BP Leidos en el Molinete ########

  Scenario: USUARIO(LAP)/CPF229 - BP leidos en el molinete/Visualizar pantalla de bp leidos en el molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp leidos en el molinete
    And visualizar pantalla de "BP leidos en el Molinete"


  Scenario: USUARIO(LAP)/CPF230 - BP leidos en el molinete/Consultar reporte de bp leidos en el molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp leidos en el molinete
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar aerolinea "JETBLUE AIRWAYS CORPORATION SUCURSAL DEL PERU"
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha de vuelo "01/01/2024"
    And ingresar numero de vuelo "B61824"
    And ingresar numero de boarding "7000695335988534"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "BP leidos en el Molinete"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF231 - BP leidos en el molinete/Exportar pdf de reporte de bp leidos en el molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp leidos en el molinete
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar aerolinea "JETBLUE AIRWAYS CORPORATION SUCURSAL DEL PERU"
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha de vuelo "01/01/2024"
    And ingresar numero de vuelo "B61824"
    And ingresar numero de boarding "7000695335988534"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "BP leidos en el Molinete"
    And click en el boton cerrar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF232 - BP leidos en el molinete/Exportar excel de reporte de bp leidos en el molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp leidos en el molinete
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar aerolinea "JETBLUE AIRWAYS CORPORATION SUCURSAL DEL PERU"
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha de vuelo "01/01/2024"
    And ingresar numero de vuelo "B61824"
    And ingresar numero de boarding "7000695335988534"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "BP leidos en el Molinete"
    And click en el boton cerrar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF233 - BP leidos en el molinete/Imprimir reporte de bp leidos en el molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp leidos en el molinete
    And seleccionar fecha hasta "02/01/2024"
    And seleccionar aerolinea "JETBLUE AIRWAYS CORPORATION SUCURSAL DEL PERU"
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha de vuelo "01/01/2024"
    And ingresar numero de vuelo "B61824"
    And ingresar numero de boarding "7000695335988534"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "BP leidos en el Molinete"
    And click en el boton cerrar
    And click en el boton imprimir

######## Tickets Vendidos al Credito o al Contado ########

  Scenario: USUARIO(LAP)/CPF234 - Tickets vendidos al credito o al contado/Visualizar pantalla de tickets vendidos al credito o al contado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vendidos al credito o al contado
    And visualizar pantalla de "Tickets Vendidos a Credito o al Contado"


  Scenario: USUARIO(LAP)/CPF235 - Tickets vendidos al credito/Consultar reporte de tickets vendidos al credito o al contado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vendidos al credito o al contado
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar tipo de pago "Todos"
    And ingresar numero de vuelo "H25137"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets Vendidos a Credito o al Contado"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF236 - Tickets vendidos al credito o al contado/Exportar pdf de reporte de tickets vendidos al credito o al contado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vendidos al credito o al contado
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar tipo de pago "Todos"
    And ingresar numero de vuelo "H25137"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets Vendidos a Credito o al Contado"
    And click en el boton cerrar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF237 - Tickets vendidos al credito o al contado/Exportar excel de reporte de tickets vendidos al credito o al contado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vendidos al credito o al contado
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar tipo de pago "Todos"
    And ingresar numero de vuelo "H25137"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets Vendidos a Credito o al Contado"
    And click en el boton cerrar
    And click en el boton excel

  Scenario: CPF238 - Tickets vendidos al credito o al contado/Imprimir reporte de tickets vendidos al credito o al contado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vendidos al credito o al contado
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "31/01/2024"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar tipo de pago "Todos"
    And ingresar numero de vuelo "H25137"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets Vendidos a Credito o al Contado"
    And click en el boton cerrar
    And click en el boton imprimir

######## Detalle Compañia ########

  Scenario: USUARIO(LAP)/CPF239 - Detalle compania/Visualizar pantalla de detalle compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle compania
    And visualizar pantalla de "Detalle Compañia"

  Scenario: USUARIO(LAP)/CPF240 - Detalle compania/Consultar reporte de detalle compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle compania
    And seleccionar fecha desde "01/11/2023"
    And ingresar hora desde "013000"
    And seleccionar fecha hasta "02/11/2023"
    And ingresar hora hasta "023000"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Detalle Compañia"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF241 - Detalle compania/Exportar pdf de reporte de detalle compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle compania
    And seleccionar fecha desde "01/11/2023"
    And ingresar hora desde "013000"
    And seleccionar fecha hasta "02/11/2023"
    And ingresar hora hasta "023000"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Detalle Compañia"
    And click en el boton cerrar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF242 - Detalle compania/Exportar excel de reporte de detalle compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle compania
    And seleccionar fecha desde "01/11/2023"
    And ingresar hora desde "013000"
    And seleccionar fecha hasta "02/11/2023"
    And ingresar hora hasta "023000"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Detalle Compañia"
    And click en el boton cerrar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF243 - Detalle compania/Imprimir reporte de detalle compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle compania
    And seleccionar fecha desde "01/11/2023"
    And ingresar hora desde "013000"
    And seleccionar fecha hasta "02/11/2023"
    And ingresar hora hasta "023000"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Detalle Compañia"
    And click en el boton cerrar
    And click en el boton imprimir

######## Tickets/BP Usados por Media Hora, Hora, Día o Mes ########

  Scenario: USUARIO(LAP)/CPF244 - Tickets-BP usados por media hora, hora, dia o mes/Visualizar pantalla de tickets-bp usados por media hora, hora, dia o mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por media hora, hora, dia o mes
    And visualizar pantalla de "Tickets / BP Usados por Media Hora, Hora, Día o Mes"


  Scenario: USUARIO(LAP)/CPF245 - Tickets-BP usados por media hora, hora, dia o mes/Consultar reporte de tickets-bp usados por media hora, hora, dia o mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por media hora, hora, dia o mes
    And seleccionar fecha desde "01/05/2022"
    And ingresar hora desde "070000"
    And seleccionar fecha hasta "01/05/2022"
    And ingresar hora hasta "100000"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "si"
    And ingresar aerolinea "LATAM AIRLINES GROUP S.A SUCURSAL DEL PERU"
    And ingresar tipo ticket "Todos"
    And seleccionar tipo rango "Por cada Media Hora"
    And ingresar destino "IT"
    And ingreser numero vuelo "LA2188"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Media Hora, Hora, Día o Mes"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF246 - Tickets-BP usados por media hora, hora, dia o mes/Exportar pdf de reporte de tickets-bp usados por media hora, hora, dia o mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por media hora, hora, dia o mes
    And seleccionar fecha desde "01/05/2022"
    And ingresar hora desde "070000"
    And seleccionar fecha hasta "01/05/2022"
    And ingresar hora hasta "100000"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "si"
    And ingresar aerolinea "LATAM AIRLINES GROUP S.A SUCURSAL DEL PERU"
    And ingresar tipo ticket "Todos"
    And seleccionar tipo rango "Por cada Media Hora"
    And ingresar destino "IT"
    And ingreser numero vuelo "LA2188"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Media Hora, Hora, Día o Mes"
    And click en el boton cerrar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF247 - Tickets-BP usados por media hora, hora, dia o mes/Exportar excel de reporte de tickets-bp usados por media hora, hora, dia o mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por media hora, hora, dia o mes
    And seleccionar fecha desde "01/05/2022"
    And ingresar hora desde "070000"
    And seleccionar fecha hasta "01/05/2022"
    And ingresar hora hasta "100000"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "si"
    And ingresar aerolinea "LATAM AIRLINES GROUP S.A SUCURSAL DEL PERU"
    And ingresar tipo ticket "Todos"
    And seleccionar tipo rango "Por cada Media Hora"
    And ingresar destino "IT"
    And ingreser numero vuelo "LA2188"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Media Hora, Hora, Día o Mes"
    And click en el boton cerrar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF248 - Tickets-BP usados por media hora, hora, dia o mes/Imprimir reporte de tickets-bp usados por media hora, hora, dia o mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por media hora, hora, dia o mes
    And seleccionar fecha desde "01/05/2022"
    And ingresar hora desde "070000"
    And seleccionar fecha hasta "01/05/2022"
    And ingresar hora hasta "100000"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "si"
    And ingresar aerolinea "LATAM AIRLINES GROUP S.A SUCURSAL DEL PERU"
    And ingresar tipo ticket "Todos"
    And seleccionar tipo rango "Por cada Media Hora"
    And ingresar destino "IT"
    And ingreser numero vuelo "LA2188"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Media Hora, Hora, Día o Mes"
    And click en el boton cerrar
    And click en el boton imprimir

######## Tickets / BP Usados por Día - Mes ########

  Scenario: USUARIO(LAP)/CPF249 - Tickets-BP usados por dia, mes/Visualizar pantalla de tickets-bp usados por dia, mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por dia mes
    And visualizar pantalla de "Tickets / BP Usados por Día - Mes"


  Scenario: USUARIO(LAP)/CPF250 - Tickets-BP usados por dia, mes/Consultar reporte de tickets-bp usados por dia, mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por dia mes
    And seleccionar fecha desde "02/08/2020"
    And seleccionar fecha hasta "31/08/2020"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "STAR UP S.A."
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar el destino ""
    And ingreser numero de vuelo "generico"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Día - Mes"
    And click en el boton cerrar
    And seleccionar mes de uso
    And seleccionar mes de uso "12/2022"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "KLM CIA REAL HOLANDESA DE AVIACION"
    And ingresar tipo ticket "Todos"
    And ingresar el destino ""
    And ingreser numero de vuelo "KL744"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Día - Mes"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF251 - Tickets-BP usados por dia, mes/Exportar pdf de reporte de tickets-bp usados por dia, mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por dia mes
    And seleccionar fecha desde "02/08/2020"
    And seleccionar fecha hasta "31/08/2020"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "STAR UP S.A."
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar el destino ""
    And ingreser numero de vuelo "generico"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Día - Mes"
    And click en el boton cerrar
    And seleccionar mes de uso
    And seleccionar mes de uso "12/2022"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "KLM CIA REAL HOLANDESA DE AVIACION"
    And ingresar tipo ticket "Todos"
    And ingresar el destino ""
    And ingreser numero de vuelo "KL744"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Día - Mes"
    And click en el boton cerrar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF252 - Tickets-BP usados por dia, mes/Exportar excel de reporte de tickets-bp usados por dia, mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por dia mes
    And seleccionar fecha desde "02/08/2020"
    And seleccionar fecha hasta "31/08/2020"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "STAR UP S.A."
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar el destino ""
    And ingreser numero de vuelo "generico"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Día - Mes"
    And click en el boton cerrar
    And seleccionar mes de uso
    And seleccionar mes de uso "12/2022"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "KLM CIA REAL HOLANDESA DE AVIACION"
    And ingresar tipo ticket "Todos"
    And ingresar el destino ""
    And ingreser numero de vuelo "KL744"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Día - Mes"
    And click en el boton cerrar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF253 - Tickets-BP usados por dia, mes/Imprimir reporte de tickets-bp usados por dia, mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por dia mes
    And seleccionar fecha desde "02/08/2020"
    And seleccionar fecha hasta "31/08/2020"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "STAR UP S.A."
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And ingresar el destino ""
    And ingreser numero de vuelo "generico"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Día - Mes"
    And click en el boton cerrar
    And seleccionar mes de uso
    And seleccionar mes de uso "12/2022"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "KLM CIA REAL HOLANDESA DE AVIACION"
    And ingresar tipo ticket "Todos"
    And ingresar el destino ""
    And ingreser numero de vuelo "KL744"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets / BP Usados por Día - Mes"
    And click en el boton cerrar
    And click en el boton imprimir

######## Recaudacion Mensual ########

  Scenario: USUARIO(LAP)/CPF254 - Recaudacion mensual/Visualizar pantalla de recaudacion mensual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion recaudacion mensual
    And visualizar pantalla de "Recaudación Mensual"


  Scenario: USUARIO(LAP)/CPF255 - Recaudacion mensual/Consultar reporte de recaudacion mensual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion recaudacion mensual
    And ingresar anio "2023"
    And click en el boton buscar


  Scenario: USUARIO(LAP)/CPF256 - Recaudacion mensual/Exportar pdf de reporte de recaudacion mensual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion recaudacion mensual
    And ingresar anio "2023"
    And click en el boton buscar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF257 - Recaudacion mensual/Exportar excel de reporte de recaudacion mensual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion recaudacion mensual
    And ingresar anio "2023"
    And click en el boton buscar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF258 - Recaudacion mensual/Imprimir reporte de recaudacion mensual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion recaudacion mensual
    And ingresar anio "2023"
    And click en el boton buscar
    And click en el boton imprimir

######## Liquidación Venta ########

  Scenario: USUARIO(LAP)/CPF259 - Liquidacion venta/Visualizar pantalla de liquidacion venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion venta
    And visualizar pantalla de "Liquidación Venta"

  Scenario: USUARIO(LAP)/CPF260 - Liquidacion venta/Consultar reporte de liquidacion venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion venta
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Liquidación Venta"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF261 - Liquidacion venta/Exportar pdf de reporte de liquidacion venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion venta
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Liquidación Venta"
    And click en el boton cerrar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF262 - Liquidacion venta/Exportar excel de reporte de liquidacion venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion venta
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Liquidación Venta"
    And click en el boton cerrar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF263 - Liquidacion venta/Imprimir reporte de liquidacion venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion venta
    And seleccionar fecha desde "01/01/2024"
    And seleccionar fecha hasta "02/01/2024"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Liquidación Venta"
    And click en el boton cerrar
    And click en el boton imprimir

######## Tickets Vencidos ########

  Scenario: USUARIO(LAP)/CPF264 - Tickets vencidos/Visualizar pantalla de tickets vencidos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vencidos
    And visualizar pantalla de "Tickets Vencidos"


  Scenario: USUARIO(LAP)/CPF265 - Tickets vencidos/Consultar reporte de tickets vencidos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vencidos
    And seleccionar fecha desde "04/05/2022"
    And seleccionar fecha hasta "31/05/2022"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets Vencidos"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF266 - Tickets vencidos/Exportar pdf de reporte de tickets vencidos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vencidos
    And seleccionar fecha desde "04/05/2022"
    And seleccionar fecha hasta "31/05/2022"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets Vencidos"
    And click en el boton cerrar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF267 - Tickets vencidos/Exportar excel de reporte de tickets vencidos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vencidos
    And seleccionar fecha desde "04/05/2022"
    And seleccionar fecha hasta "31/05/2022"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets Vencidos"
    And click en el boton cerrar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF268 - Tickets vencidos/Imprimir reporte de tickets vencidos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vencidos
    And seleccionar fecha desde "04/05/2022"
    And seleccionar fecha hasta "31/05/2022"
    And ingresar tipo ticket "ADULTO NACIONAL NORMAL"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Tickets Vencidos"
    And click en el boton cerrar
    And click en el boton imprimir

######## Cuadre Stickers vendidos / BP usados ########

  Scenario: USUARIO(LAP)/CPF269 - Cuadre stickers vendidos-bp usados/Visualizar pantalla de cuadre stickers vendidos-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion cuadre stickers vendidos-bp usados
    And visualizar pantalla de "Cuadre Stickers vendidos / BP usados"


  Scenario: USUARIO(LAP)/CPF270 - Cuadre stickers vendidos-bp usados/Consultar reporte de cuadre stickers vendidos-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion cuadre stickers vendidos-bp usados
    And seleccionar fecha desde "09/12/2021"
    And seleccionar fecha hasta "16/12/2021"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And click en el boton buscar


  Scenario: USUARIO(LAP)/CPF271 - Cuadre stickers vendidos-bp usados/Exportar pdf de reporte de cuadre stickers vendidos-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion cuadre stickers vendidos-bp usados
    And seleccionar fecha desde "09/12/2021"
    And seleccionar fecha hasta "16/12/2021"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And click en el boton buscar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF272 - Cuadre stickers vendidos-bp usados/Exportar excel de reporte de cuadre stickers vendidos-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion cuadre stickers vendidos-bp usados
    And seleccionar fecha desde "09/12/2021"
    And seleccionar fecha hasta "16/12/2021"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And click en el boton buscar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF273 - Cuadre stickers vendidos-bp usados/Imprimir reporte de cuadre stickers vendidos-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion cuadre stickers vendidos-bp usados
    And seleccionar fecha desde "09/12/2021"
    And seleccionar fecha hasta "16/12/2021"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And click en el boton buscar
    And click en el boton imprimir

######## Ticket / BP Rehabilitados ########

  Scenario: USUARIO(LAP)/CPF274 - Ticket-bp rehabilitados/Visualizar pantalla de ticket-bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion ticket bp rehabilitados
    And visualizar pantalla de "Ticket / BP Rehabilitados"


  Scenario: USUARIO(LAP)/CPF275 - Ticket-bp rehabilitados/Consultar reporte de ticket-bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion ticket bp rehabilitados
    And seleccionar fecha desde "22/12/2023"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "29/12/2023"
    And ingresar hora hasta "230000"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "AEROLINEA GENERICA"
    And ingresar tipo ticket "Todos"
    And seleccionar motivo de rehabilitacion "Demora o Cancelación del vuelo X mal tiempo"
    And ingresar numero de vuelo "GENERICO"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Ticket / BP Rehabilitados"
    And click en el boton cerrar


  Scenario: USUARIO(LAP)/CPF276 - Ticket-bp rehabilitados/Exportar pdf de reporte de ticket-bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion ticket bp rehabilitados
    And seleccionar fecha desde "22/12/2023"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "29/12/2023"
    And ingresar hora hasta "230000"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "AEROLINEA GENERICA"
    And ingresar tipo ticket "Todos"
    And seleccionar motivo de rehabilitacion "Demora o Cancelación del vuelo X mal tiempo"
    And ingresar numero de vuelo "GENERICO"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Ticket / BP Rehabilitados"
    And click en el boton cerrar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF277 - Ticket-bp rehabilitados/Exportar excel de reporte de ticket-bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion ticket bp rehabilitados
    And seleccionar fecha desde "22/12/2023"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "29/12/2023"
    And ingresar hora hasta "230000"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "AEROLINEA GENERICA"
    And ingresar tipo ticket "Todos"
    And seleccionar motivo de rehabilitacion "Demora o Cancelación del vuelo X mal tiempo"
    And ingresar numero de vuelo "GENERICO"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Ticket / BP Rehabilitados"
    And click en el boton cerrar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF278 - Ticket-bp rehabilitados/Imprimir reporte de ticket-bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion ticket bp rehabilitados
    And seleccionar fecha desde "22/12/2023"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "29/12/2023"
    And ingresar hora hasta "230000"
    And seleccionar tipo de documento boarding "si"
    And seleccionar tipo de documento ticket "no"
    And ingresar aerolinea "AEROLINEA GENERICA"
    And ingresar tipo ticket "Todos"
    And seleccionar motivo de rehabilitacion "Demora o Cancelación del vuelo X mal tiempo"
    And ingresar numero de vuelo "GENERICO"
    And click en el boton buscar
    And click en el boton resumen
    And visualizar resumen "Ticket / BP Rehabilitados"
    And click en el boton cerrar
    And click en el boton imprimir

######## BP Rehabilitados ########

  Scenario: USUARIO(LAP)/CPF279 - BP rehabilitados/Visualizar pantalla de bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp rehabilitados
    And visualizar pantalla de "BP Rehabilitados"


  Scenario: USUARIO(LAP)/CPF280 - BP rehabilitados/Consultar reporte de bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp rehabilitados
    And seleccionar fecha desde "01/01/2021"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "31/01/2021"
    And ingresar hora hasta "230000"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar motivo de rehabilitacion "Demora o Cancelación del vuelo X mal tiempo"
    And seleccionar tipo vuelo "NACIONAL"
    And seleccionar tipo persona "ADULTO"
    And ingresar numero de vuelo "H25079"
    And click en el boton buscar


  Scenario: USUARIO(LAP)/CPF281 - BP rehabilitados/Exportar pdf de reporte de bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp rehabilitados
    And seleccionar fecha desde "01/01/2021"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "31/01/2021"
    And ingresar hora hasta "230000"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar motivo de rehabilitacion "Demora o Cancelación del vuelo X mal tiempo"
    And seleccionar tipo vuelo "NACIONAL"
    And seleccionar tipo persona "ADULTO"
    And ingresar numero de vuelo "H25079"
    And click en el boton buscar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF282 - BP rehabilitados/Exportar excel de reporte de bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp rehabilitados
    And seleccionar fecha desde "01/01/2021"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "31/01/2021"
    And ingresar hora hasta "230000"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar motivo de rehabilitacion "Demora o Cancelación del vuelo X mal tiempo"
    And seleccionar tipo vuelo "NACIONAL"
    And seleccionar tipo persona "ADULTO"
    And ingresar numero de vuelo "H25079"
    And click en el boton buscar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF283 - BP rehabilitados/Imprimir reporte de bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp rehabilitados
    And seleccionar fecha desde "01/01/2021"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "31/01/2021"
    And ingresar hora hasta "230000"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar motivo de rehabilitacion "Demora o Cancelación del vuelo X mal tiempo"
    And seleccionar tipo vuelo "NACIONAL"
    And seleccionar tipo persona "ADULTO"
    And ingresar numero de vuelo "H25079"
    And click en el boton buscar
    And click en el boton imprimir

######## Resumen Diario por Turno ########

  Scenario: USUARIO(LAP)/CPF284 - Resumen diario por turno/Visualizar pantalla de resumen diario por turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario por turno
    And visualizar pantalla de "Resumen Diario por Turno"


  Scenario: USUARIO(LAP)/CPF285 - Resumen diario por turno/Consultar reporte de resumen diario por turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario por turno
    And seleccionar turno
    And ingresar codigo de turno "032200"
    And click en el boton buscar
    And seleccionar rango de turnos
    And ingresar codigo de turno desde "032200"
    And ingresar codigo de turno hasta "032230"
    And click en el boton buscar


  Scenario: USUARIO(LAP)/CPF286 - Resumen diario por turno/Exportar pdf de reporte de resumen diario por turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario por turno
    And seleccionar turno
    And ingresar codigo de turno "032200"
    And click en el boton buscar
    And click en el boton pdf
    And click en el boton excel
    And click en el boton imprimir
    And seleccionar rango de turnos
    And ingresar codigo de turno desde "032200"
    And ingresar codigo de turno hasta "032230"
    And click en el boton buscar
    And click en el boton pdf


  Scenario: USUARIO(LAP)/CPF287 - Resumen diario por turno/Exportar excel de reporte de resumen diario por turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario por turno
    And seleccionar turno
    And ingresar codigo de turno "032200"
    And click en el boton buscar
    And click en el boton pdf
    And click en el boton excel
    And click en el boton imprimir
    And seleccionar rango de turnos
    And ingresar codigo de turno desde "032200"
    And ingresar codigo de turno hasta "032230"
    And click en el boton buscar
    And click en el boton excel


  Scenario: USUARIO(LAP)/CPF288 - Resumen diario por turno/Imprimir reporte de resumen diario por turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario por turno
    And seleccionar turno
    And ingresar codigo de turno "032200"
    And click en el boton buscar
    And click en el boton pdf
    And click en el boton excel
    And click en el boton imprimir
    And seleccionar rango de turnos
    And ingresar codigo de turno desde "032200"
    And ingresar codigo de turno hasta "032230"
    And click en el boton buscar
    And click en el boton imprimir

######## Extranet BP Diarios (Usados/Rehabilitados) ########

  Scenario: USUARIO(LAP)/CPF289 - Extranet BP diarios usados-rehabilitados/Visualizar pantalla de extranet bp diarios usados-rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion extranet bp diarios usados rehabilitados
    And visualizar pantalla de "Extranet BP Diarios (Usados/Rehabilitados)"


  Scenario: USUARIO(LAP)/CPF290 - Extranet BP diarios usados-rehabilitados/Consultar reporte de extranet bp diarios usados-rehabilitados
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


  Scenario: USUARIO(LAP)/CPF291 - Extranet BP diarios usados-rehabilitados/Exportar excel reporte de extranet bp diarios usados-rehabilitados
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
    And click en el boton excel