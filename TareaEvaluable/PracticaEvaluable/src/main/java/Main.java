import conexion.GestorDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorDB gestordb = new GestorDB();
        gestordb.llamarConexion();
        //gestordb.tablaProductos();


        //gestordb.tablaProductos();
        //gestordb.agregarEmpleado();
        //gestordb.agregarPedido();
        //gestordb.mostrarProducto();
        //gestordb.mostrarPedidos();
        //gestordb.mostrarEmpleados();
        //gestordb.productosFavoritos();


        Scanner teclado = new Scanner(System.in);
        int option = 0;
        boolean salir = false;

        do {
            System.out.println("========== MENU ========== ");
            System.out.println("1. Agregar empleado: ");
            System.out.println("2. Agregar pedido: ");
            System.out.println("3. Mostrar producto: ");
            System.out.println("4. Mostrar pedidos: ");
            System.out.println("5. Mostrar empleados: ");
            System.out.println("6. Salir del programa.");
            System.out.println("==========================");
            System.out.println("Elije una de las siguientes opciones: ");

            option = teclado.nextInt();
            teclado.nextLine();

            switch (option) {
                case 1:
                    gestordb.agregarEmpleado();
                    break;
                case 2:
                    gestordb.agregarPedido();
                    break;
                case 3:
                    gestordb.mostrarProductos();
                    break;
                case 4:
                    gestordb.mostrarPedidos();
                    break;
                case 5:
                    gestordb.mostrarEmpleados();
                    break;
                case 6:
                    System.out.println("Has salido del programa");
                    salir = true;
                    break;
                default:
                    System.out.println("Elige una opcion entre el 1 y el 5");
                    break;
            }
        } while(!salir);
    }
}
