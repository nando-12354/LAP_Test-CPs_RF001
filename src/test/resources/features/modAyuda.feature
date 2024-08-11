Feature: Funcionalidad del modulo Ayuda
  #@reporte
  Scenario: CPF311 - Visualizar documento de ayuda
    Given abre la ruta del aplicativo web
    And ingresa el usuario "fluyo"
    And ingresa la contrasena "fluyo987"
    And click en el boton iniciar sesion
    And ingresar al modulo ayuda
    And visualizar documento del "Sistema de Administración"