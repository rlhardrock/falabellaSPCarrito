#language: es

Requisito: Buscar un articulo indicando la cantidad deseada y enviarlo al carrito de compras
  Como   director de diseño de habitat
  Quiero buscar articulos generales via web en Falabella
  Para   adquirir productos a traves de el carrito de compras

  @BuscarAgregarCarritoExito
  Escenario: Busqueda de producto con envio al carrito
    Dado      abro la pagina web Falabella
    Cuando    busco el producto deseado confirmando sus detalles
    Y         envio al carrito de compras la cantidad necesitada
    Entonces  visualizo el carro de compras con el producto en cantidad
