
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    private static List<Vehiculo> vehiculos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
<<<<<<< main
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
                    registrarCamion(sc, vehiculos);
                }
                case 2 -> { // Felipe

                }
                case 3 -> {// Bruno
                    registrarMoto(sc, vehiculos);
                }
                case 4 -> {// Dafne
                    System.out.println("\n==== LISTA DE VEHICULOS =====");
                    mostrarVehiculos(vehiculos);

                }
                case 5 -> {// Dante

                }
                case 6 -> {// Dante

                }
                case 7 ->{// Renato
=======
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
>>>>>>> main
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

<<<<<<< main
    // Funciones
    public static void registrarCamion(Scanner sc, List<Vehiculo> vehiculos) {
  
    // pedir patente 
    System.out.println("Ingrese la patente:");
    String patente = sc.nextLine().trim();
    // Pedir marca
    System.out.print("Ingrese marca: ");
    String marca = sc.nextLine().trim();
    // Pedir modelo
    System.out.print("Ingrese modelo: ");
    String modelo = sc.nextLine().trim();
    // pedir capacidad
    System.out.println("Ingrese la capacidad de carga (kg): ");
    Double capacidad = sc.nextDouble();
    if (capacidad > 0 ) {
        System.out.println("");
    } else {
        System.out.println("La cantidad de carga que llevas no puede ser negativa.");
    }
    // pedir ejes
    int ejes = 0;
    System.out.println("Ingrese la cantidad de ejes de su vehiculo: ");
    ejes = sc.nextInt();
    if (ejes > 1 ) {
        System.out.println("");
    } else { 
        System.out.println("Cantidad de ejes erronea, debes ingresar ejes mayor a 1.");
    }


    System.out.println( "informacion del camion registrado: " + patente + " | " + marca + " | " + modelo + " | " + capacidad + "kg | " + ejes + " ejes" );

}

    public static void registrarMoto(Scanner sc, List<Vehiculo> vehiculos) {
         // pedir patente 
    System.out.println("Ingrese la patente:");
    String patente = sc.nextLine().trim();
    // Pedir marca
    System.out.print("Ingrese marca: ");
    String marca = sc.nextLine().trim();
    // Pedir modelo
    System.out.print("Ingrese modelo: ");
    String modelo = sc.nextLine().trim();
    // pedir caja termica
    System.out.println("Tiene caja termina S/N: ");
    String ct = sc.nextLine().trim().toUpperCase();
    boolean tieneCaja = ct.equals("S");

    System.out.println( "informacion de la moto registrada: " + patente + " | " + marca + " | " + modelo + " | " + tieneCaja );

}

}
=======
    }


>>>>>>> main
