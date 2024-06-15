Feature: Funcionalidad del modulo Mantenimiento

  Scenario: CPF045 - Visualizar modulo mantenimiento
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And visualizar la opcion estacion de punto de venta
    And visualizar la opcion moneda
    And visualizar la opcion compania
    And visualizar la opcion modalidad de venta
    And visualizar la opcion tipo de ticket

######## ESTACION DE PUNTO DE VENTA ########

  Scenario: CPF046 - Estacion de punto de venta/Visualizar estacion de punto de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion estacion de punto de venta
    And visualizar lista de "Estación de punto de venta"

  Scenario: CPF047 - Estacion de punto de venta/Registrar estacion de punto de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion estacion de punto de venta
    And click en el boton nuevo
    And ingresar descripcion "CAJA IDE"
    And ingresar ip "192.168.1.99"
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
    And ingresar descripcion "CAJA IDE"
    And ingresar ip "600.500.400.300"
    And click en el boton guardar
    And validar alerta "IP Fuera de rango"
    And validar aviso "Debe ingresar un ip entre 1 y 255"
    And click en el boton aceptar

  Scenario: CPF049 - Estacion de punto de venta/Registrar con ip ya registrada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion estacion de punto de venta
    And click en el boton nuevo
    And ingresar descripcion "CAJA IDE"
    And ingresar ip "91.44.66.44"
    And click en el boton guardar
    #And validar alerta "Titulo Informativo"
    #And validar aviso "La dirección IP ya se encuentra registrada"

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
    And ingresar descripcion "CAJA edit"
    And ingresar ip "112.113.114.115"
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
    #And validar mensaje ""

  Scenario Outline: CPF053 - Moneda/Registrar tipo de moneda
    Given abre la ruta del aplicativo web
    And ingresa el usuario "<usuario>"
    And ingresa la contrasena "<clave>"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And click en el boton nuevo
    And seleccionar codigo de moneda "<codigo>"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"
    Examples:
      | usuario | clave    | codigo |
      | fluyo   | fluyo987 | HKD    |
      | fluyo   | fluyo987 | JPY    |
      | fluyo   | fluyo987 | NOK    |
      | fluyo   | fluyo987 | NZD    |
      | fluyo   | fluyo987 | RUB    |
      | fluyo   | fluyo987 | SGD    |

  Scenario: CPF054 - Moneda/Deshabilitar una moneda
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion moneda
    And click en el boton editar
    And seleccionar estado "Vigente"
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

  Scenario: CPF056 - Compania/Registrar una compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And click en el boton nuevo
    And ingresar nombre "zCompGen01"
    And seleccionar tipo de compania "BANCO"
    And ingresar ruc "2078965485"
    And ingresar codigo aerolinea "aaa"
    And ingresar codigo iata "bbb"
    And ingresar codigo sap "ccc"
    And ingresar codigo oaci "ddd"
    And ingresar codigo interno "eee"
    And click en el boton agregar
    And ingresar nombre de representante "Testing"
    And ingresar apellido de representante "IDE"
    And seleccionar tipo de documento "DNI"
    And ingresar numero de documento "72178877"
    And ingresar cargo "Analista"
    And seleccionar permisos "si"
    And click en el boton guardar
    And validar mensaje "Representante registrado correctamente"
    And seleccionar venta normal "si"
    And click en el boton editar
    And seleccionar activar rehabilitacion "si"
    And seleccionar numero maximo de ticket para venta "si"
    And seleccionar numero minimo de ticket para venta "si"
    And click en el boton guardar
    And seleccionar bcbp "si"
    And click en el boton editar
    And seleccionar activar rehabilitacion "si"
    And seleccionar serie numero ticket fin "si"
    And seleccionar serie numero ticket inicio "si"
    And click en el boton guardar
    And seleccionar venta masiva contado "si"
    And seleccionar venta masiva credito "si"
    And click en el boton guardar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""

  Scenario: CPF057 - Compania/Modificar una compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion compania
    And click en el boton nuevo
    And ingresar nombre ""
    And seleccionar tipo de compania
    And ingresar ruc
    And ingresar codigo aerolinea
    And ingresar codigo iata
    And ingresar codigo sap
    And ingresar codigo oaci
    And ingresar codigo interno
    And click en el boton agregar
    And ingresar nombre "Selenium"
    And ingresar apellido "IDE"
    And seleccionar tipo de documento
    And ingresar numero de documento
    And ingresar cargo
    And seleccionar permisos "si"
    And click en el boton guardar
    And validar mensaje "Representante registrado correctamente"
    And click en el boton guardar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""

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
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""

######## MODALIDAD DE VENTA ########

  Scenario: CPF059 - Modalidad de venta/Visualizar lista de modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And visualizar lista de "Modalidades de Venta"

  Scenario: CPF060 - Modalidad de venta/Registrar una modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton nuevo
    #And seleccionar tipo de modalidad "Tipo Venta Normal"
    And ingresar descripcion "Testing"
    And click en el boton agregar atributos
    And seleccionar activar rehabilitacion "si"
    And seleccionar maximo de tickets emitidos por semana al credito "si"
    And seleccionar numero maximo tickets para venta "si"
    And seleccionar numero minimo tickets para venta "si"
    And seleccionar serie numero ticket fin "si"
    And seleccionar serie numero ticket inicio "si"
    And click en el boton guardar
    And seleccionar tipo ticket "T01 ( ADULTO INTERNACIONAL NORMAL )"
    #And click en el boton agregar
    And seleccionar activar rehabilitacion "si"
    And seleccionar maximo de tickets emitidos por semana al credito "si"
    And seleccionar numero maximo tickets para venta "si"
    And seleccionar numero minimo tickets para venta "si"
    #And click en el boton guardar
    #And click en el boton guardar
    #And validar alerta de confirmacion ""
    #And click en el boton aceptar
    #And validar mensaje ""

  Scenario: CPF061 - Modalidad de venta/Modificar una modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton editar
    And seleccionar estado "Vigente"
    And ingresar descripcion "Pruebas"
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
    And seleccionar tipo de modalidad
    And ingresar descripcion
    And click en el boton agregar
    And seleccionar activar rehabilitacion "si"
    And seleccionar maximo de tickets emitidos por semana al credito "si"
    And seleccionar numero maximo tickets para venta "si"
    And seleccionar numero minimo tickets para venta "si"
    And seleccionar serie numero ticket fin "si"
    And seleccionar serie numero ticket inicio "si"
    And click en el boton guardar
    And seleccionar tipo de ticket
    And click en el boton agregar
    And seleccionar activar rehabilitacion "si"
    And seleccionar maximo de tickets emitidos por semana al credito "si"
    And seleccionar numero maximo tickets para venta "si"
    And seleccionar numero minimo tickets para venta "si"
    And click en el boton guardar
    And click en el boton guardar
    And validar alerta de confirmacion ""
    And click en el boton aceptar
    And validar mensaje ""

  Scenario: CPF063 - Modalidad de venta/Deshabilitar una modalidad de venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo mantenimiento
    And ingresar a la opcion modalidad de venta
    And click en el boton editar
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
    And seleccionar tipo de vuelo "INTERNACIONAL"
    And seleccionar tipo de transbordo "TRANSFERENCIA"
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
    And ingresar nombre de tipo ticket "Selenium editado"
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
