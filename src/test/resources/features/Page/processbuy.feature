Feature: Compra de productos

  Yo como usuario
  Quiero añadir uno o varios producto al carrito de compras
  Para realizar una compra en el aplicativo
  @TestPage


  @AddProduct
  Scenario: Agregar un producto al carrito desde la pagina de detalles
    Given que he accedido a la pagina de detalles del producto
    When se anada un producto
    Then el producto deberia ser agregado al carrito

  @VerifyNameProduct
  Scenario:Verificar los nombres del producto
    Given que he accedido a la pagina de detalles del producto
    When Visualiza la informacion del producto
    Then deberia poder ver el nombre correctos del producto

    @VerifyCar
  Scenario: Verificar que el carrito esta vacio al ingresar por primera vez a la pagina
    Given que el usuario se encuentra en la pagina de inicio
    When el usuario va al carrito
    Then el carrito deberia estar vacio


  @VerifyColor
  Scenario: Verificar que aparezca el color del producto
    Given que he accedido a la pagina de detalles del producto
    When Visualiza la informacion del producto
    Then deberia poder ver el color del producto


  @ProductPrice
  Scenario: Verificar el precio del producto
    Given que he accedido a la pagina de detalles del producto
    When Visualiza la informacion del producto
    Then Revisa el precio del producto






