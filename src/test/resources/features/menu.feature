Feature: Funcionalidad del menu principal
  #@reporte
  Scenario: CPF003 - Visualización del menu principal
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And visualizar modulo seguridad
    And visualizar modulo configuracion general
    And visualizar modulo mantenimiento
    And visualizar modulo operacion
    And visualizar modulo rehabilitacion
    And visualizar modulo consultas
    And visualizar modulo reportes
    And visualizar modulo alarmas
    And visualizar modulo ayuda