package conexion;

public interface DataB {
    String NOM_DB  = "almacen";
    String NOM_TABLA = "productos";
    String ID = "id";
    String NOMBRE = "nombre";
    String  DESCRIPCION = "descripcion";
    String CANTIDAD = "cantidad";
    String PRECIO = "precio";

    // ---------------------------------------

    String NOMBRE_TABLA_EMPLEADO = "empleados";
    String ID_EMPLEADO = "id";
    String NOMBRE_EMPLEADO = "nombre";
    String APELLIDO_EMPLEADO = "apellidos";
    String CORREO_EMPLEADO = "correo";

    // ---------------------------------------

    String NOM_TABLA_PEDIDO = "pedidos";
    String ID_PEDIDO = "id";
    String ID_PRODUCTO = "id_producto";
    String DESCRIPCION_PEDIDO = "descripcion";
    String PRECIO_TOTAL_PRODUCTO = "precio_total";

    // ---------------------------------------
    String NOM_TABLA_PRODUCTOS_FAV = "productos_fav";
    String ID_PRODUCTO_FAV = "id";
    String ID_id_PRODUCTO_FAV = "id_producto";

}
