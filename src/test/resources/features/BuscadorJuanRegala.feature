Feature: HU-001 Buscador JuanRegala
  Yo como usuario de JuanRegala
  Quiero buscar en el buscador un producto
  Para ver el producto en la pagina

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de JuanRegala con la url <Url>
    When busco el producto en el buscador
    Then podre ver el producto en pantalla

    Examples:
    | Escenario                                             | Url                       |
    | Buscar palabra en el buscador de JuanRegala exitoso   | https://juanregala.com.co/ |