# language: es
Característica: Gestión de productos en la categoría Agradecimientos


  Escenario: Productos categoría agradecimientos
    Dado que estoy en la página principal de la tienda floristeria
    Cuando selecciono la categoría Agradecimientos
    Entonces se visualizarán los productos para esta categoría


  Escenario: Añadir dos productos de la categoría Agradecimientos al carrito de compras
    Dado que estoy en la categoría Agradecimientos
    Cuando de clic en la opción Añadir al carrito
    Entonces el producto se agregará al carrito de compras

  @successful
  Escenario: Validar que los productos se muestran correctamente en la opción Carro
    Dado que he agregado los productos de la categoría Agradecimientos al carrito
    Cuando de clic en la opción “CARRO”
    Entonces se deberán visualizar los productos agregados
