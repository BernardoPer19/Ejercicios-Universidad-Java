
/**
-Consultar el inventario para ver qué productos están disponibles.
-Actualizar la cantidad de un producto cuando alguien lo compra o cuando llega más stock.
-Actualmente, la tienda opera de manera manual, lo que le genera errores frecuentes y pérdida de tiempo.
Lo que necesitas hacer:

-Crea una clase Producto con atributos encapsulados: codigo, nombre, precio y cantidad.
-Usa un constructor para inicializar los productos y métodos para obtener y modificar el stock.
-Diseña una clase Tienda que gestione un array de productos.
-Implementa métodos en Tienda para:
-Agregar productos nuevos.
-Listar todos los productos disponibles.
-Actualizar el stock de un producto por su código.

 */

public class Tienda{
    private Producto[] productos;
    private int contador;

    public Tienda(int capacidad) {
        this.productos = new Producto[capacidad];
        this.contador = 0;
    }

    public boolean agregarProd(Producto prod){
        if(contador< productos.length){
            productos[contador] = prod;
            contador++;
            return true;
        }else{
            System.out.print("no se añadiuo el prod");
            return false;
        }

    }

    public void  ListarProductos (){
        if(contador == 0){
            System.out.print("nada");
        }else{
            for(int i = 0; i < contador; i++){
                Producto prod = productos[i];
                System.out.println("Código: " + prod.getCodigo() +
                    ", Nombre: " + prod.getNombre() +
                    ", Precio: " + prod.getPrecio() +
                    ", Stock: " + prod.getStock());
            }
        }

    }

}