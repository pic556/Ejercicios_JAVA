package modulo3_java_w2;



import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cu = new Cuenta();

        cu = cu.crearCuenta();
        System.out.println(cu.sacarDatos());

        int opcion;
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cu.ingresar();
                    break;
                case 2:
                    cu.retirar();
                    break;
                case 3:
                    System.out.println(cu.consultarSaldo());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            }
        } while (opcion != 0);
    }
}
