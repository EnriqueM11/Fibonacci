package fibonacci;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        Manager manager = new Manager();
        manager.ejecutar();
       
        System.out.println("1. Imprimir números pares");
        System.out.println("2. Imprimir números impares");
        System.out.print("Seleccione una opción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                manager.imprimirArchivo("Nupares.txt");
                break;
            case 2:
                manager.imprimirArchivo("Nuimpares.txt");
                break;
            default:
                System.out.println("opcion no disponible");
        }

        scanner.close();
    }

}
