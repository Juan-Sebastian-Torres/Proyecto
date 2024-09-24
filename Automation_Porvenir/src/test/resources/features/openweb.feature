#author: Juan Sebastian Torres Rincon
# language: es
Característica: Gestión de productos en la categoría Agradecimientos

  Antecedentes:
    Dado que estoy en la página principal de la tienda floristeria

  @successful
  Escenario: Productos categoría agradecimientos
    Cuando selecciono la categoría Agradecimientos
    Entonces se visualizarán los productos para esta categoría

  @successful
  Escenario: Añadir dos productos de la categoría Agradecimientos al carrito de compras
    Cuando de clic en la opción Añadir al carrito
    Entonces el producto se agregará al carrito de compras

  @successful
  Escenario: Validar que los productos se muestran correctamente en la opción Carro
    Cuando de clic en la opción “CARRO”
    Entonces se deberán visualizar los productos agregados
