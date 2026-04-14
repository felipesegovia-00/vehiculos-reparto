
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    private static List<Vehiculo> vehiculos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            try {
                System.out.println("\n=== SISTEMA DE VEHÍCULOS DE REPARTO ===");
                System.out.println("1. Registrar camión");
                System.out.println("2. Registrar furgón");
                System.out.println("3. Registrar moto de reparto");
                System.out.println("4. Mostrar todos los vehículos");
                System.out.println("5. Mostrar vehículos disponibles");
                System.out.println("6. Marcar vehículo como no disponible");
                System.out.println("7. Mostrar reporte general");
                System.out.println("8. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1 -> {}
                    case 2 -> {}
                    case 3 -> {}
                    case 4 -> {
                        System.out.println("\n==== LISTA DE VEHICULOS =====");
                        mostrarVehiculos(vehiculos);
                    }
                    case 5 -> listarVehiculos();
                    case 6 -> marcarNoDisponible();
                    case 7 -> {}
                    case 8 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("❌ Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: Debe ingresar un número para la opción.");
            }
        } while (opcion != 8);
    }

    // MOSTRAR VEHICULOS - OPCION 4
    public static void mostrarVehiculos(List<Vehiculo> vehiculos){
        if(vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados");
            return;
        }

        for(Vehiculo vehiculo : vehiculos){
            vehiculo.mostrarDetalle();
        }
    }

    private static void listarVehiculos(){
        if(vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados.");
            return;
        }
        System.out.println("\n---Listado de Vehiculos ---");
        for (Vehiculo v : vehiculos){
            if (v.isDisponible()){
                v.mostrarDetalle(); //Polimorfismo cada hijo responde a su manera
            }
        }
    }
    private static void marcarNoDisponible(){
        System.out.println("Ingrese la patente del vehiculo: ");
        String patente = sc.nextLine();
        for (Vehiculo v: vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patente)){
                v.setDisponible(false); //Uso del setter
                System.out.println("El vehiculo con patente " + patente + " ahora no esta disponible.");
                return;
            }
        }
        System.out.println("Error: No se encontro un vehiculo con esa patente.");
    }

    }


