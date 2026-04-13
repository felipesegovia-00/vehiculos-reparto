import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<>();// Almacena los vehículos registrados

        int opcion;

        do {
            System.out.println("========================================");
            System.out.println("=== SISTEMA DE VEHÍCULOS DE REPARTO ===");
            System.out.println("========================================");
            System.out.println("1. Registrar camión");
            System.out.println("2. Registrar furgón");
            System.out.println("3. Registrar moto de reparto");
            System.out.println("4. Mostrar todos los vehiculos");
            System.out.println("5. Mostrar vehículos disponibles");
            System.out.println("6. Marcar vehículo como no disponible");
            System.out.println("7. Mostrar reporte general");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {// Allan

                }
                case 2 -> { // Felipe

                }
                case 3 -> {// Bruno

                }
                case 4 -> {// Dafne

                }
                case 5 -> {// Dante

                }
                case 6 -> {// Dante

                }
                case 7 ->{// Renato
                }
            }

        } while (opcion != 8);

        sc.close();
    }
}