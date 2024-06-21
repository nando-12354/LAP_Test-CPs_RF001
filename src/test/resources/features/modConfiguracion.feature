Feature: Funcionalidad del modulo Configuracion General

  Scenario: CPF019 - Visualizar modulo configuracion general
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And visualizar la opcion parametros generales
    And visualizar la opcion lista de campos

######## PARAMETROS GENERALES ########

  Scenario: CPF020 - Parametros generales/Visualizar pantalla de parametros generales
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And visualizar lista de "Parámetros Generales"
    And validar configuracion de "ATRIBUTOS GENERALES"
    And validar configuracion de "CAJA TUUA"
    And validar configuracion de "COMPROBANTE SEAF"
    And validar configuracion de "ALARMAS"
    And validar configuracion de "ARCHIVAMIENTO"
    And validar configuracion de "IMPRESIÓN"
    And validar configuracion de "MODULO WEB ADMINISTRATIVO"
    And validar configuracion de "REHABILITACIÓN"
    And validar configuracion de "SEGURIDAD"
    And validar configuracion de "TUAA"
    And validar configuracion de "ESTADISTICO"
    And validar configuracion de "SERVICIO COMPAÑIA"
    And validar configuracion de "SERVICIO TASA CAMBIO"
    And validar configuracion de "SERVICIO VENCIMIENTO"
    And validar configuracion de "SERVICIO VUELO PROGRAMADO"
    And validar configuracion de "SERVICIO VUELO TEMPORADA"
    And validar configuracion de "SERVICIOS GENERALES"
    And validar configuracion de "ARCHIVO VENTAS"

  Scenario: CPF021 - Parametros generales/Visualizar configuracion atributos generales
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de atributos generales
    And visualizar la "CONFIGURACION ATRIBUTOS GENERALES"
    And visualizar el concepto "Activar Rehabilitación"
    And visualizar el concepto "Maximo de Tickets Emitidos Por Semana al Credito"
    And visualizar el concepto "Número Máximo Tickets Contingencia"
    And visualizar el concepto "Número Máximo Tickets para Venta"
    And visualizar el concepto "Número Mínimo de Tickets para Venta"
    And visualizar el concepto "Número Mínimo Tickets Contingencia"
    And visualizar el concepto "Numero RUC"
    And visualizar el concepto "Serie Contingencia Fin"
    And visualizar el concepto "Serie Contingencia Inicio"
    And visualizar el concepto "Serie Número Ticket Fin"
    And visualizar el concepto "Serie Número Ticket Inicio"

  Scenario: CPF022 - Parametros generales/Visualizar configuracion caja tuua
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de caja tuua
    And visualizar la "CONFIGURACION CAJA TUUA"
    And visualizar el concepto "Flag Cierre de Turno con Descuadre"
    And visualizar el concepto "Frecuencia de Visualizacion Tasa Cambio en Ventas"
    And visualizar el concepto "Tiempo Máximo de Inactividad en Segundos"
    And visualizar el limte maximo
    And visualizar el limte minimo

  Scenario: CPF023 - Parametros generales/Visualizar configuracion comprobante seae
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion comprobante seae
    And visualizar la "CONFIGURACION COMPROBANTE SEAE"
    And visualizar el concepto "Configuración Ruta Generación de Comprobante SEAE"

  Scenario: CPF024 - Parametros generales/Visualizar configuracion alarmas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de alarmas
    And visualizar la "CONFIGURACION DE ALARMAS"
    And visualizar el concepto "Configuración de Correo Electrónico"
    And visualizar el concepto "Rango de Tiempo en Horas para Monitorear Alarmas"

  Scenario: CPF025 - Parametros generales/Visualizar configuracion archivamiento
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de archivamiento
    And visualizar la "CONFIGURACION DEL ARCHIVAMIENTO"
    And visualizar el concepto "Configuracion de Conexion Ambiente Archivamiento"
    And visualizar el concepto "Delay de Meses de Archivamiento"

  Scenario: CPF026 - Parametros generales/Visualizar configuracion impresion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de impresion
    And visualizar la "CONFIGURACION IMPRESIÓN"
    And visualizar el concepto "Cantidad de Tickets procesados"
    And visualizar el concepto "Parametros de Impresion"

  Scenario: CPF027 - Parametros generales/Visualizar configuracion modulo web administrativo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de modulo web administrativo
    And visualizar la "CONFIGURACION MODULO WEB ADMINISTRATIVO"
    And visualizar el concepto "Limite de Exportacion a un archivo Excel"
    And visualizar el concepto "Limite de Rango de Fechas en Reportes"
    And visualizar el concepto "Tamaño Fila Grilla"
    And visualizar el concepto "Tiempo Máximo en Segundos de Inactividad en la Web"

  Scenario: CPF028 - Parametros generales/Visualizar configuracion rehabilitacion
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de rehabilitacion
    And visualizar la "CONFIGURACION REHABILITACIÓN"
    And visualizar el concepto "Activar Asociacion en Rehabilitación"
    And visualizar el concepto "Activar Consulta de Representante en Rehabilitación"
    And visualizar el concepto "Activar Ingreso de Vuelo en Rehabilitación"
    And visualizar el concepto "Guardar Proceso de Rehabilitación en Formato EXCEL"
    And visualizar el concepto "Limite Rehabilitaciones de BCBP"
    And visualizar el concepto "Limite Rehabilitaciones de TICKET"
    And visualizar el concepto "Máximo Rehabilitaciones"

  Scenario: CPF029 - Parametros generales/Visualizar configuracion seguridad
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de seguridad
    And visualizar la "CONFIGURACION SEGURIDAD"
    And visualizar el concepto "Clave de Desbloqueo del Admin"
    And visualizar el concepto "Días Fecha Vencimiento Clave"
    And visualizar el concepto "Días Fecha Vencimiento de Cuenta de Usuario"
    And visualizar el concepto "Longitud Máxima de Contraseña"
    And visualizar el concepto "Longitud Mínima de Contraseña"
    And visualizar el concepto "Número de Claves no Válidas del Historial"
    And visualizar el concepto "Número Intentos de Logeo"
    And visualizar el concepto "Umbral de Días para Aviso de Vencimiento de Clave de Usuario"

  Scenario: CPF030 - Parametros generales/Visualizar configuracion tuua
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de tuua
    And visualizar la "CONFIGURACION TUUA"
    And visualizar el concepto "Días para listado de BCBP en Conciliacion"
    And visualizar el concepto "Días Vencimiento Boarding Rehabilitado"
    And visualizar el concepto "Días Vencimiento Ticket"
    And visualizar el concepto "Días Vencimiento Ticket Rehabilitado"
    And visualizar el concepto "Diferencia en Dias de Fecha de Uso de BP Usados y sus Relacionados para la Conciliacion"
    And visualizar el concepto "Límite de Anulaciones por Proceso"
    And visualizar el concepto "Máximo Grilla"
    And visualizar el concepto "Número de Vuelo Default"

  Scenario: CPF031 - Parametros generales/Visualizar configuracion estadistico
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de estadistico
    And visualizar la configuracion "ESTADISTICO"
    And visualizar el concepto "Limite de dias para procesar datos"

  Scenario: CPF032 - Parametros generales/Visualizar configuracion servicio compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de servicio compania
    And visualizar la configuracion "SERVICIO COMPAÑÍA"
    And visualizar el concepto "Frecuencia Compañia"
    And visualizar el concepto "Nombre Metodo WS Compañia"
    And visualizar el concepto "Nombre Servicio WS Compañia"
    And visualizar el concepto "Protocolo Soap WS Compania"
    And visualizar el concepto "Ruta WS Compañia"

  Scenario: CPF033 - Parametros generales/Visualizar configuracion tasa de cambio
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de servicio tasa cambio
    And visualizar la configuracion "SERVICIO TASA CAMBIO"
    And visualizar el concepto "Flag Almacenar Log Tasa Cambio"
    And visualizar el concepto "Frecuencia de Ejecución del Servicio Control Programación Tasa de Cambio"
    And visualizar el concepto "Frecuencia Tasa Cambio de Programación en Segundos"
    And visualizar el concepto "Nombre Metodo WS Tasa Cambio"
    And visualizar el concepto "Nombre Servicio WS Tasa Cambio"
    And visualizar el concepto "Protocolo Soap WS Tasa Cambio"
    And visualizar el concepto "Ruta WS Tasa Cambio"

  Scenario: CPF034 - Parametros generales/Visualizar configuracion servicio vencimiento
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de servicio vencimiento
    And visualizar la configuracion "SERVICIO VENCIMIENTO"
    And visualizar el concepto "Frecuencia de Ejecución de Servicio Vencimiento Ticket"
    And visualizar el concepto "Frecuencia de Ejecucion del Servicio Vencimiento Boarding Rehabilitado"

  Scenario: CPF035 - Parametros generales/Visualizar configuracion servicio vuelo programado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de servicio vuelo programado
    And visualizar la configuracion "SERVICIO VUELO PROGRAMADO"
    And visualizar el concepto "Frecuencia Vuelo Programado	"
    And visualizar el concepto "Nombre Metodo WS Vuelo Programado"
    And visualizar el concepto "Nombre Servicio WS Vuelo Programado"
    And visualizar el concepto "Protocolo Soap WS Vuelo Programado"
    And visualizar el concepto "Ruta WS Vuelo Programado"

  Scenario: CPF036 - Parametros generales/Visualizar configuracion servicio vuelo temporada
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de servicio vuelo temporada
    And visualizar la configuracion "SERVICIO VUELO TEMPORADA"
    And visualizar el concepto "Frecuencia Vuelo Temporada"
    And visualizar el concepto "Nombre Metodo WS Vuelo Temporada"
    And visualizar el concepto "Nombre Servicio WS Vuelo Temporada"
    And visualizar el concepto "Protocolo Soap WS Vuelo Temporada"
    And visualizar el concepto "Ruta WS Vuelo Temporada"

  Scenario: CPF037 - Parametros generales/Visualizar configuracion servicio generales
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de servicios generales
    And visualizar la configuracion "SERVICIOS GENERALES"
    And visualizar el concepto "Frecuencia de Ejecución de Servicio Control Programacion Precio Ticket"
    And visualizar el concepto "Frecuencia de Ejecución de Servicio Vencimiento Clave de Usuario"
    And visualizar el concepto "Frecuencia de Ejecución de Servicio Vencimiento Permiso Usuario"
    And visualizar el concepto "Fecha Inicio de Consulta de SEAE"
    And visualizar el concepto "Número de Meses a Mantener"
    And visualizar el concepto "Periodo de vigencia de consulta de SEAE"

  Scenario: CPF038 - Parametros generales/Visualizar configuracion archivo ventas
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de archivo ventas
    And visualizar la "CONFIGURACION ARCHIVO VENTAS"
    And visualizar el concepto "Configuración Ruta Generación de Archivo de Ventas"
    And visualizar el concepto "Configuración Ruta Generación de Archivo de Ventas SFTP"
    And visualizar el concepto "Máximo Secuencial Archivo Ventas"
    And visualizar el concepto "Modo de envío de Archivos de Venta"
    And visualizar el concepto "Nombre de Archivo de Ventas"
    And visualizar el concepto "Separador de Campos Archivo de Venta"
    And visualizar el concepto "Sociedad"
    And visualizar el concepto "Organizacion"
    And visualizar el concepto "Canal de Distribucion"
    And visualizar el concepto "Sector"
    And visualizar el concepto "No de cliente"
    And visualizar el concepto "Clase de Documento"
    And visualizar el concepto "Tipo Documento"
    And visualizar el concepto "Status de Documento"
    And visualizar el concepto "Cliente Pago"

  Scenario: CPF039 - Parametros generales/Grabar configuracion de parametros generales
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion parametros generales
    And click en el boton ver configuracion de atributos generales
    And click en editar activar rehabilitacion
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar maximo ticket emitidos por semana al credito
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar numero maximo ticket contingencia
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar numero maximo ticket para venta
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar numero minimo ticket para venta
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar numero minimo ticket contingencia
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar numero ruc
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar serie contingencia fin
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar serie contingencia inicio
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar serie numero ticket fin
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"
    And click en editar serie numero ticket inicio
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"

######## LISTA DE CAMPOS ########

  Scenario: CPF040 - Lista de campos/Visualizar lista de campos registrados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion lista de campos
    And visualizar lista de "Lista de campos"
    And validar columna "Campo"
    And validar columna "Código"
    And validar columna "Código asociado"
    And validar columna "Descripción valor"
    And validar columna "Fecha modificación"
    And validar columna "Usuario modificación"
    And validar columna "Acciones"

  Scenario: CPF041 - Lista de campos/Registrar nuevo campo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion lista de campos
    And click en el boton nuevo
    And ingresar nombre del campo "Test101"
    And ingresar codigo del campo asociado "998"
    And ingresar codigo "112"
    And ingresar descripcion "Test101"
    And click en el boton guardar
    And validar mensaje "Registro agregado correctamente"

  Scenario: CPF042 - Lista de campos/Ver detalle de lista de campo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion lista de campos
    And click en el boton editar
    And validar nombre del campo "campestre"
    And validar codigo del campo "101"
    And validar codigo del campo asociado "100"

  Scenario: CPF043 - Lista de campos/Editar lista de campo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion lista de campos
    And click en el boton editar
    And editar descripcion del valor "Test102"
    And click en el boton guardar
    And validar mensaje "Registro modificado correctamente"

  Scenario: CPF044 - Lista de campos/Eliminar lista de campo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo configuracion general
    And ingresar a la opcion lista de campos
    And click en el boton eliminar
    And validar alerta de confirmacion "¿Está seguro de realizar esta acción?"
    And validar mensaje "Lista de campo eliminado correctamente"