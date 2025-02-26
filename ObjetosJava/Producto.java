/**
El dueño de la tienda "ElectroGadgets" enfrenta dificultades para gestionar su inventario de productos electrónicos. Quiere llevar un registro digital de los productos disponibles, pero necesita que el sistema le permita:

-Agregar productos nuevos a medida que llegan.
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
public class Producto{
    private  int  codigo;
    private String nombre;
    private double precio;
    private int cantidad;
    private int stock;

    public Producto(String nombre ,int cantidad , int codigo ,double precio ){

        this.nombre = nombre;
        this.cantidad =cantidad;
        this.codigo = codigo;
        this.precio = precio;
        stock = 100;

    }

    //!métodos para obtener y modificar el stock.
    public int  getProductos (){
        return stock;
    }
    
    
    
    
    public int getCodigo(){
    
        return codigo;
    
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public int getStock (){
        return stock;
    }

}