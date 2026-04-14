import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<>(); // Almacena los vehículos registrados

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
                case 1 -> { // Allan
                }

                case 2 -> { // Felipe - Registrar furgón
                    registrarFurgon(sc, vehiculos);
                }

                case 3 -> { // Bruno
                }

                case 4 -> { // Dafne
                    System.out.println("\n==== LISTA DE VEHICULOS =====");
                    mostrarVehiculos(vehiculos);
                }

                case 5 -> { // Dante
                }

                case 6 -> { // Dante
                }

                case 7 -> { // Renato
                }

                case 8 -> {
                    System.out.println("Saliendo del sistema...");
                }

                default -> {
                    System.out.println("Opción inválida.");
                }
            }

        } while (opcion != 8);

        sc.close();
    } // <-- Aquí termina el public static void main

    // ==========================================
    // FUNCIONES (MÉTODOS FUERA DEL MAIN)
    // ==========================================

    // REGISTRAR FURGÓN - OPCIÓN 2 (De Felipe)
    public static void registrarFurgon(Scanner sc, List<Vehiculo> vehiculos) {
        System.out.println("\n--- REGISTRAR NUEVO FURGÓN ---");

        String patenteFurgon;
        boolean patenteDuplicada;

        // 1. Validar Patente
        do {
            patenteDuplicada = false;
            System.out.print("Ingrese la patente: ");
            patenteFurgon = sc.nextLine().trim();

            if (patenteFurgon.isEmpty()) {
                System.out.println("Error: La patente no puede estar vacía.");
            } else {
                for (Vehiculo v : vehiculos) {
                    if (v.getPatente().equalsIgnoreCase(patenteFurgon)) {
                        patenteDuplicada = true;
                        System.out.println("Error: La patente " + patenteFurgon + " ya está registrada.");
                        break;
                    }
                }
            }
        } while (patenteFurgon.isEmpty() || patenteDuplicada);

        // 2. Datos Generales
        System.out.print("Ingrese la marca: ");
        String marcaFurgon = sc.nextLine().trim();

        System.out.print("Ingrese el modelo: ");
        String modeloFurgon = sc.nextLine().trim();

        System.out.print("Ingrese la capacidad de carga (kg): ");
        double capacidadFurgon = sc.nextDouble();

        // 3. Dato exclusivo del Furgón (Volumen)
        double volumenFurgon;
        do {
            System.out.print("Ingrese el volumen interior (m³): ");
            volumenFurgon = sc.nextDouble();
            if (volumenFurgon <= 0) {
                System.out.println("Error: El volumen debe ser mayor a 0.");
            }
        } while (volumenFurgon <= 0);

        sc.nextLine(); // Limpiar el buffer

        // 4. Crear y guardar
        Furgon nuevoFurgon = new Furgon(patenteFurgon, marcaFurgon, modeloFurgon, capacidadFurgon, true, volumenFurgon);
        vehiculos.add(nuevoFurgon);

        System.out.println("¡Furgón registrado con éxito!");
    } // <-- Termina el método registrarFurgon

    // MOSTRAR VEHICULOS - OPCION 4 (De Dafne)
    public static void mostrarVehiculos(List<Vehiculo> vehiculos){
        if(vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados");
            return;
        }

        for(Vehiculo vehiculo : vehiculos){
            vehiculo.mostrarDetalle();
        }
    } // <-- Termina el método mostrarVehiculos

} // <--- ESTA ES LA ÚNICA LLAVE QUE CIERRA LA CLASE MAIN AL FINAL DE TODO