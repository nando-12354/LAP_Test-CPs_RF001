Feature: Funcionalidad del modulo Reportes

  Scenario: CPF203 - Visualizar modulo reportes
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
    And visualizar la opcion "Extranet BP Mensual (Usados/Rehabilitados)"

######## Liquidacion Stickers ########

  Scenario: CPF204 - Liquidacion stickers/Visualizar pantalla de reporte de liquidacion de Stickers
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion stickers
    And visualizar pantalla de "Liquidación de Stickers"

  Scenario: CPF205 - Liquidacion stickers/Consultar reporte de liquidacion de Stickers
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

  Scenario: CPF206 - Liquidacion stickers/Exportar pdf de reporte liquidacion de Stickers
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

  Scenario: CPF207 - Liquidacion stickers/Exportar excel de reporte de liquidacion de Stickers
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

  Scenario: CPF208 - Liquidacion stickers/Imprimir reporte de liquidacion de Stickers
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

  Scenario: CPF209 - Resumen diario/Visualizar pantalla de reporte de resumen diario
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario
    And visualizar pantalla de "Resumen Diario"

  Scenario: CPF210 - Resumen diario/Consultar reporte de resumen diario
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

  Scenario: CPF211 - Resumen diario/Exportar pdf de reporte de resumen diario
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

  Scenario: CPF212 - Resumen diario/Exportar excel de reporte de resumen diario
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

### Solucionado
  Scenario: CPF213 - Resumen diario/Imprimir reporte de resumen diario
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

### Solucionado
  Scenario: CPF214 - Movimiento tickets contingencia/Visualizar pantalla de movimiento tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion movimiento tickets contingencia
    And visualizar pantalla de "Movimientos tickets contingencia"

  Scenario: CPF215 - Movimiento tickets contingencia/Consultar reporte de movimiento tickets contingencia
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

  Scenario: CPF216 - Movimiento tickets contingencia/Exportar pdf de reporte movimiento tickets contingencia
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

  Scenario: CPF217 - Movimiento tickets contingencia/Exportar excel de reporte movimiento tickets contingencia
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

  Scenario: CPF218 - Movimiento tickets contingencia/Imprimir reporte movimiento tickets contingencia
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

  Scenario: CPF219 - Stock Tickets Contingencia/Visualizar pantalla de stock tickets contingencia
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion stock tickets contingencia
    And visualizar pantalla de "Stock Tickets Contingencia"

  Scenario: CPF220 - Stock Tickets Contingencia/Consultar reporte de stock tickets contingencia
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

  Scenario: CPF221 - Stock Tickets Contingencia/Exportar pdf de reporte de stock tickets contingencia
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

  Scenario: CPF222 - Stock Tickets Contingencia/Exportar excel de reporte de stock tickets contingencia
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

  Scenario: CPF223 - Stock Tickets Contingencia/Imprimir reporte de stock tickets contingencia
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

  Scenario: CPF224 - Detalle por linea de vuelo/Visualizar pantalla de detalle por linea de vuelo
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle por linea de vuelo
    And visualizar pantalla de "Detalle Linea Vuelo"

    ### Solucionado
  Scenario: CPF225 - Detalle por linea de vuelo/Consultar reporte de detalle por linea de vuelo
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

  Scenario: CPF226 - Detalle por Linea de Vuelo/Exportar excel de reporte de detalle por linea de vuelo
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

  Scenario: CPF227 - Detalle por Linea de Vuelo/Imprimir reporte de detalle por linea de vuelo
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

  Scenario: CPF228 - Detalle por Linea de Vuelo/Imprimir resumen de reporte de detalle por linea de vuelo
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

  Scenario: CPF229 - BP leidos en el molinete/Visualizar pantalla de bp leidos en el molinete
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp leidos en el molinete
    And visualizar pantalla de "BP leidos en el Molinete"

    ### Solucionado
  Scenario: CPF230 - BP leidos en el molinete/Consultar reporte de bp leidos en el molinete
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

    ### Solucionado
  Scenario: CPF231 - BP leidos en el molinete/Exportar pdf de reporte de bp leidos en el molinete
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

    ### Solucionado
  Scenario: CPF232 - BP leidos en el molinete/Exportar excel de reporte de bp leidos en el molinete
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

    ### Solucionado
  Scenario: CPF233 - BP leidos en el molinete/Imprimir reporte de bp leidos en el molinete
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

  Scenario: CPF234 - Tickets vendidos al credito o al contado/Visualizar pantalla de tickets vendidos al credito o al contado
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vendidos al credito o al contado
    And visualizar pantalla de "Tickets Vendidos a Credito o al Contado"

  Scenario: CPF235 - Tickets vendidos al credito/Consultar reporte de tickets vendidos al credito o al contado
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

  Scenario: CPF236 - Tickets vendidos al credito o al contado/Exportar pdf de reporte de tickets vendidos al credito o al contado
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

  Scenario: CPF237 - Tickets vendidos al credito o al contado/Exportar excel de reporte de tickets vendidos al credito o al contado
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

  Scenario: CPF239 - Detalle compania/Visualizar pantalla de detalle compania
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion detalle compania
    And visualizar pantalla de "Detalle Compañia"

  Scenario: CPF240 - Detalle compania/Consultar reporte de detalle compania
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

  Scenario: CPF241 - Detalle compania/Exportar pdf de reporte de detalle compania
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

  Scenario: CPF242 - Detalle compania/Exportar excel de reporte de detalle compania
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

  Scenario: CPF243 - Detalle compania/Imprimir reporte de detalle compania
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

  Scenario: CPF244 - Tickets-BP usados por media hora, hora, dia o mes/Visualizar pantalla de tickets-bp usados por media hora, hora, dia o mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por media hora, hora, dia o mes
    And visualizar pantalla de "Tickets / BP Usados por Media Hora, Hora, Día o Mes"

  Scenario: CPF245 - Tickets-BP usados por media hora, hora, dia o mes/Consultar reporte de tickets-bp usados por media hora, hora, dia o mes
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

  Scenario: CPF246 - Tickets-BP usados por media hora, hora, dia o mes/Exportar pdf de reporte de tickets-bp usados por media hora, hora, dia o mes
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

  Scenario: CPF247 - Tickets-BP usados por media hora, hora, dia o mes/Exportar excel de reporte de tickets-bp usados por media hora, hora, dia o mes
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

  Scenario: CPF248 - Tickets-BP usados por media hora, hora, dia o mes/Imprimir reporte de tickets-bp usados por media hora, hora, dia o mes
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

  Scenario: CPF249 - Tickets-BP usados por dia, mes/Visualizar pantalla de tickets-bp usados por dia, mes
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets bp usados por dia mes
    And visualizar pantalla de "Tickets / BP Usados por Día - Mes"

  Scenario: CPF250 - Tickets-BP usados por dia, mes/Consultar reporte de tickets-bp usados por dia, mes
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

  Scenario: CPF251 - Tickets-BP usados por dia, mes/Exportar pdf de reporte de tickets-bp usados por dia, mes
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

  Scenario: CPF252 - Tickets-BP usados por dia, mes/Exportar excel de reporte de tickets-bp usados por dia, mes
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

  Scenario: CPF253 - Tickets-BP usados por dia, mes/Imprimir reporte de tickets-bp usados por dia, mes
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

  Scenario: CPF254 - Recaudacion mensual/Visualizar pantalla de recaudacion mensual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion recaudacion mensual
    And visualizar pantalla de "Recaudación Mensual"

  Scenario: CPF255 - Recaudacion mensual/Consultar reporte de recaudacion mensual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion recaudacion mensual
    And ingresar anio "2023"
    And click en el boton buscar

  Scenario: CPF256 - Recaudacion mensual/Exportar pdf de reporte de recaudacion mensual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion recaudacion mensual
    And ingresar anio "2023"
    And click en el boton buscar
    And click en el boton pdf

  Scenario: CPF257 - Recaudacion mensual/Exportar excel de reporte de recaudacion mensual
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion recaudacion mensual
    And ingresar anio "2023"
    And click en el boton buscar
    And click en el boton excel

  Scenario: CPF258 - Recaudacion mensual/Imprimir reporte de recaudacion mensual
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

  Scenario: CPF259 - Liquidacion venta/Visualizar pantalla de liquidacion venta
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion liquidacion venta
    And visualizar pantalla de "Liquidación Venta"

  Scenario: CPF260 - Liquidacion venta/Consultar reporte de liquidacion venta
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

  Scenario: CPF261 - Liquidacion venta/Exportar pdf de reporte de liquidacion venta
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

  Scenario: CPF262 - Liquidacion venta/Exportar excel de reporte de liquidacion venta
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

  Scenario: CPF263 - Liquidacion venta/Imprimir reporte de liquidacion venta
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

  Scenario: CPF264 - Tickets vencidos/Visualizar pantalla de tickets vencidos
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion tickets vencidos
    And visualizar pantalla de "Tickets Vencidos"

  Scenario: CPF265 - Tickets vencidos/Consultar reporte de tickets vencidos
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

  Scenario: CPF266 - Tickets vencidos/Exportar pdf de reporte de tickets vencidos
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

  Scenario: CPF267 - Tickets vencidos/Exportar excel de reporte de tickets vencidos
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

  Scenario: CPF268 - Tickets vencidos/Imprimir reporte de tickets vencidos
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

  Scenario: CPF269 - Cuadre stickers vendidos-bp usados/Visualizar pantalla de cuadre stickers vendidos-bp usados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion cuadre stickers vendidos-bp usados
    And visualizar pantalla de "Cuadre Stickers vendidos / BP usados"

  Scenario: CPF270 - Cuadre stickers vendidos-bp usados/Consultar reporte de cuadre stickers vendidos-bp usados
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

  Scenario: CPF271 - Cuadre stickers vendidos-bp usados/Exportar pdf de reporte de cuadre stickers vendidos-bp usados
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

  Scenario: CPF272 - Cuadre stickers vendidos-bp usados/Exportar excel de reporte de cuadre stickers vendidos-bp usados
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

  Scenario: CPF273 - Cuadre stickers vendidos-bp usados/Imprimir reporte de cuadre stickers vendidos-bp usados
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

  Scenario: CPF274 - Ticket-bp rehabilitados/Visualizar pantalla de ticket-bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion ticket bp rehabilitados
    And visualizar pantalla de "Ticket / BP Rehabilitados"

  Scenario: CPF275 - Ticket-bp rehabilitados/Consultar reporte de ticket-bp rehabilitados
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

  Scenario: CPF276 - Ticket-bp rehabilitados/Exportar pdf de reporte de ticket-bp rehabilitados
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

  Scenario: CPF277 - Ticket-bp rehabilitados/Exportar excel de reporte de ticket-bp rehabilitados
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

  Scenario: CPF278 - Ticket-bp rehabilitados/Imprimir reporte de ticket-bp rehabilitados
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

  Scenario: CPF279 - BP rehabilitados/Visualizar pantalla de bp rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion bp rehabilitados
    And visualizar pantalla de "BP Rehabilitados"

  Scenario: CPF280 - BP rehabilitados/Consultar reporte de bp rehabilitados
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

  Scenario: CPF281 - BP rehabilitados/Exportar pdf de reporte de bp rehabilitados
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

  ### Solucionado
  Scenario: CPF282 - BP rehabilitados/Exportar excel de reporte de bp rehabilitados
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

  ### Solucionado
  Scenario: CPF283 - BP rehabilitados/Imprimir reporte de bp rehabilitados
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

  Scenario: CPF284 - Resumen diario por turno/Visualizar pantalla de resumen diario por turno
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion resumen diario por turno
    And visualizar pantalla de "Resumen Diario por Turno"


  Scenario: CPF285 - Resumen diario por turno/Consultar reporte de resumen diario por turno
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


  Scenario: CPF286 - Resumen diario por turno/Exportar pdf de reporte de resumen diario por turno
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


  Scenario: CPF287 - Resumen diario por turno/Exportar excel de reporte de resumen diario por turno
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

  ### Solucionado
  Scenario: CPF288 - Resumen diario por turno/Imprimir reporte de resumen diario por turno
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

  Scenario: CPF289 - Extranet BP diarios usados-rehabilitados/Visualizar pantalla de extranet bp diarios usados-rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion extranet bp diarios usados rehabilitados
    And visualizar pantalla de "Extranet BP Diarios (Usados/Rehabilitados)"

  ### Solucionado
  Scenario: CPF290 - Extranet BP diarios usados-rehabilitados/Consultar reporte de extranet bp diarios usados-rehabilitados
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

  ### Solucionado
  Scenario: CPF291 - Extranet BP diarios usados-rehabilitados/Exportar excel reporte de extranet bp diarios usados-rehabilitados
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

    ######## Extranet BP Mensual (Usados/Rehabilitados) ########

  Scenario: CPF292 - Extranet BP mensual usados-rehabilitados/Visualizar pantalla de extranet bp mensual usados-rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion extranet bp mensual usados rehabilitados
    And visualizar pantalla de "Extranet BP Mensual (Usados/Rehabilitados)"

  ### Solucionado
  Scenario: CPF293 - Extranet BP mensual usados-rehabilitados/Consultar reporte de extranet bp mensual usados-rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion extranet bp mensual usados rehabilitados
    And seleccionar fecha desde "08/04/2022"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "10/04/2022"
    And ingresar hora hasta "230000"
    And seleccionar tipo transbordo "NORMAL"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar tipo persona "ADULTO"
    And seleccionar tipo vuelo "Todos"
    And seleccionar fecha de vuelo "11/04/2022"
    And ingresar numero de vuelo ""
    And click en el boton buscar
    And visualizar boarding pass usados
    And visualizar boarding pass rehabilitados
    And visualizar boarding pass anulados
    And visualizar resumen boarding neto

  ### Solucionado
  Scenario: CPF294 - Extranet BP mensual usados-rehabilitados/Exportar excel reporte de extranet bp mensual usados-rehabilitados
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo reportes
    And ingresar a la opcion extranet bp mensual usados rehabilitados
    And seleccionar fecha desde "08/04/2022"
    And ingresar hora desde "000000"
    And seleccionar fecha hasta "10/04/2022"
    And ingresar hora hasta "230000"
    And seleccionar tipo transbordo "NORMAL"
    And ingresar aerolinea "SKY AIRLINE PERU"
    And seleccionar tipo persona "ADULTO"
    And seleccionar tipo vuelo "Todos"
    And seleccionar fecha de vuelo "11/04/2022"
    And ingresar numero de vuelo ""
    And click en el boton buscar
    And visualizar boarding pass usados
    And visualizar boarding pass rehabilitados
    And visualizar boarding pass anulados
    And visualizar resumen boarding neto
    And click en el boton excel