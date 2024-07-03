Feature: Funcionalidad del modulo Mantenimiento


  Scenario: CPF045 - Visualizar modulo mantenimiento
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And visualizar la opcion "Estación de punto de venta"
    And visualizar la opcion "Moneda"
    And visualizar la opcion "Compañía"
    And visualizar la opcion "Modalidad de venta"
    And visualizar la opcion "Tipo de ticket"

######## ESTACION DE PUNTO DE VENTA ########

  Scenario: CPF046 - Estacion de punto de venta/Visualizar estacion de punto de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion estacion de punto de venta
    And visualizar lista de "Estación de punto de venta"
    And validar columna "Código"
    And validar columna "Número IP"
    And validar columna "Descripción"
    And validar columna "Usuario Logueado"
    And validar columna "Fecha modificación"
    And validar columna "Usuario Modificación"
    And validar columna "Estado"
    And validar columna "Acciones"


  Scenario: CPF047 - Estacion de punto de venta/Registrar estacion de punto de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion estacion de punto de venta
    And click en el boton nuevo
    And ingresar descripcion "CAJA TEST002"
    And ingresar ip "192.168.1.152"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"


  Scenario: CPF048 - Estacion de punto de venta/Registrar con ip fuera de rango
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion estacion de punto de venta
    And click en el boton nuevo
    And ingresar descripcion "CAJA TEST"
    And ingresar ip "300.168.1.1"
    And click en el boton guardar
    And validar mensaje error "Debe ingresar un IP entre 1 y 255"


  Scenario: CPF049 - Estacion de punto de venta/Registrar con ip ya registrada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion estacion de punto de venta
    And click en el boton nuevo
    And ingresar descripcion "CAJA IDE1"
    And ingresar ip "112.113.114.115"
    And click en el boton guardar
    And validar el mensaje de error "La dirección IP ya se encuentra registrada"


  Scenario: CPF050 - Estacion de punto de venta/Deshabilitar estacion de punto de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion estacion de punto de venta
    And click en el boton editar
    And seleccionar estado "Deshabilitado"
    And click en el boton guardar
    And validar mensaje "Registro actualizado correctamente"


  Scenario: CPF051 - Estacion de punto de venta/Modificar estacion de punto de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion estacion de punto de venta
    And click en el boton editar
    And cambiar descripcion "CAJA 01"
    And ingresar ip "192.168.1.1"
    And seleccionar estado "Vigente"
    And click en el boton guardar
    And validar mensaje "Registro actualizado correctamente"

######## MONEDA ########

  Scenario: CPF052 - Moneda/Visualizar lista de monedas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
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


  Scenario: CPF053 - Moneda/Registrar tipo de moneda
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And click en el boton nuevo
    And seleccionar codigo de moneda "DOP"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"


  Scenario: CPF054 - Moneda/Deshabilitar una moneda
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And click en el boton editar
    And seleccionar estado "Deshabilitado"
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"

######## COMPAÑIA ########

  Scenario: CPF055 - Compania/Visualizar lista de companias
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
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


  Scenario: CPF056 - Compania/Registrar una compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And click en el boton nuevo
    And ingresar nombre "ZAAABBBCCC"
    And seleccionar tipo de compania "AEROLINEA"
    And ingresar ruc "20589631563"
    And ingresar codigo aerolinea "DAC"
    And ingresar codigo iata "RTE"
    And ingresar codigo sap "5435342343"
    And ingresar codigo oaci "HJU"
    And ingresar codigo interno "592"
    And click en el boton agregar representante
    And ingresar nombre de representante "Roberto"
    And ingresar apellido de representante "Peralta"
    And ingresar tipo de documento "DNI"
    And ingresar numero de documento "74185299"
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


  Scenario: CPF057 - Compania/Modificar una compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And click en el boton editar compania
    And modificar nombre "ZZFREFFFFR"
    And seleccionar tipo de compania "AEROLINEA"
    And modificar ruc "2078965485"
    And modificar codigo aerolinea "aaa"
    And modificar codigo iata "bbb"
    And modificar codigo sap "442"
    And modificar codigo oaci "ddd"
    And modificar codigo interno "eee"
    And click en el boton editar representante
    And modificar nombre de representante "ModRoberto"
    And modificar apellido de representante "ModPeralta"
    And ingresar tipo de documento "DNI"
    And modificar numero de documento "72174569"
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


  Scenario: CPF058 - Compania/Deshabilitar una compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And click en el boton editar
    And seleccionar estado "DESHABILITADO"
    And click en el boton guardar
    And validar el mensaje "La compañía se actualizó correctamente"

######## MODALIDAD DE VENTA ########

  Scenario: CPF059 - Modalidad de venta/Visualizar lista de modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
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


  Scenario: CPF060 - Modalidad de venta/Registrar una modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton nuevo
    And seleccionar tipo de modalidad "Tipo Venta Masiva Credito"
    And ingresar descripcion "Venta Test"
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


  Scenario: CPF061 - Modalidad de venta/Modificar una modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton editar
    And seleccionar estado "Vigente"
    And cambiar descripcion "Pruebas"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"


  Scenario: CPF062 - Modalidad de venta/Modalidad de venta registrado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
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


  Scenario: CPF063 - Modalidad de venta/Deshabilitar una modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton editar modalidad
    And seleccionar estado "Deshabilitado"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"

######## TIPO DE TICKET ########

  Scenario: CPF064 - Tipo de ticket/Visualizar lista de tipo de ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion tipo de ticket
    And visualizar lista de "Lista de Tipos de Ticket"
    And validar columna "Codigo"
    And validar columna "Precio"
    And validar columna "Moneda"
    And validar columna "Estado"
    And validar columna "Fecha modificación"
    And validar columna "Usuario modificación"
    And click en ver mas campos
    And validar datos de "Tipo de Vuelo"
    And validar datos de "Tipo de Pasajero"
    And validar datos de "Tipo de transbordo"
    And validar columna "Acciones"


  Scenario: CPF065 - Tipo de ticket/Registrar un tipo de Ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
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


  Scenario: CPF066 - Tipo de ticket/Modificar un tipo de Ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion tipo de ticket
    And click en el boton editar
    And ingresar nombre de tipo ticket "Adulto Internacional Normal"
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"


  Scenario: CPF067 - Tipo de ticket/Deshabilitar un tipo de Ticket
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion tipo de ticket
    And click en el boton editar
    And seleccionar estado "Vigente"
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
