import java.util.*;

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
                        registrarCamion(sc, vehiculos);
                    }
                    case 2 -> { // Felipe
                        registrarFurgon(sc, vehiculos);
                    }
                    case 3 -> {// Bruno
                        registrarMoto(sc, vehiculos);
                    }
                    case 4 -> {// Dafne
                        mostrarVehiculos(vehiculos);

                    }
                    case 5 -> {// Dante
                        listarVehiculos(vehiculos);
                    }
                    case 6 -> {// Dante
                        marcarNoDisponible(sc, vehiculos);
                    }
                    case 7 ->{// Renato
                    }
                }

            } while (opcion != 8);
            sc.close();
        }


        // FUNCIONES

        // OPCION 1 - REGISTRAR CAMION
        public static void registrarCamion(Scanner sc, List<Vehiculo> vehiculos) {
            System.out.println("\n--- REGISTRAR NUEVO CAMIÓN--------");
            String patente;
            boolean patenteDuplicada;

            // VALIDAR PATENTE
            do {
                patenteDuplicada = false;
                System.out.println("Ingrese la patente:");
                patente = sc.nextLine().trim();

                if (patente.isEmpty()) {
                    System.out.println("Error: La patente no puede estar vacía.");
                } else {
                    for (Vehiculo v : vehiculos) {
                        if (v.getPatente().equalsIgnoreCase(patente)) {
                            patenteDuplicada = true;
                            System.out.println("Error: La patente ya está registrada.");
                            break;
                        }
                    }
                }
            } while (patente.isEmpty() || patenteDuplicada);

            System.out.print("Ingrese marca: ");
            String marca = sc.nextLine().trim();

            System.out.print("Ingrese modelo: ");
            String modelo = sc.nextLine().trim();

            // VALIDAR CAPACIDAD
            double capacidad;
            do {
                System.out.print("Ingrese la capacidad de carga (kg): ");
                capacidad = sc.nextDouble();
                if (capacidad <= 0) {
                    System.out.println("Error: Debe ser mayor a 0.");
                }
            } while (capacidad <= 0);

            // VALIDAR EJES
            int ejes;
            do {
                System.out.print("Ingrese la cantidad de ejes: ");
                ejes = sc.nextInt();
                if (ejes <= 1) {
                    System.out.println("Error: Debe ser mayor a 1.");
                }
            } while (ejes <= 1);

            sc.nextLine();

            Camion camion = new Camion(patente, marca, modelo, capacidad, true, ejes);
            vehiculos.add(camion);

            System.out.println("Camión registrado correctamente.");
        }

        // OPCION 2 - REGISTRAR FURGON
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

      
      
        // OPCION 3 - REGISTRAR MOTO REPARTO
        public static void registrarMoto(Scanner sc, List<Vehiculo> vehiculos) {
            System.out.println("\n--- REGISTRAR NUEVO MOTO REPARTO");
            String patente;
            boolean patenteDuplicada;

            // VALIDAR PATENTE
            do {
                patenteDuplicada = false;
                System.out.print("Ingrese la patente:");
                patente = sc.nextLine().trim();

                if (patente.isEmpty()) {
                    System.out.println("Error: La patente no puede estar vacía.");
                } else {
                    for (Vehiculo v : vehiculos) {
                        if (v.getPatente().equalsIgnoreCase(patente)) {
                            patenteDuplicada = true;
                            System.out.println("Error: La patente ya está registrada.");
                            break;
                        }
                    }
                }
            } while (patente.isEmpty() || patenteDuplicada);

            System.out.print("Ingrese marca: ");
            String marca = sc.nextLine().trim();

            System.out.print("Ingrese modelo: ");
            String modelo = sc.nextLine().trim();

            // VALIDAR CAPACIDAD (opcional pero mejor)
            double capacidad;
            do {
                System.out.print("Ingrese capacidad de carga (kg): ");
                capacidad = sc.nextDouble();
                if (capacidad < 0) {
                    System.out.println("Error: No puede ser negativa.");
                }
            } while (capacidad < 0);

            sc.nextLine();

            System.out.print("Tiene caja térmica S/N: ");
            String ct = sc.nextLine().trim().toUpperCase();
            boolean tieneCaja = ct.equals("S");

            MotoReparto moto = new MotoReparto(patente, marca, modelo, capacidad, true, tieneCaja);
            vehiculos.add(moto);

            System.out.println("Moto registrada correctamente.");
        }
      
      
      
        // OPCION 4 - MOSTRAR VEHICULOS
        public static void mostrarVehiculos(List<Vehiculo> vehiculos){
            System.out.println("\n---------- LISTA DE VEHICULOS ----------");
            if(vehiculos.isEmpty()){
                System.out.println("No hay vehiculos registrados");
                return;
            }

            for(Vehiculo vehiculo : vehiculos){
                vehiculo.mostrarDetalle();
            }
        }
      
      

        // OPCION 5 - MOSTRAR VEHICULOS DISPONIBLES
        private static void listarVehiculos(List<Vehiculo> vehiculos){
            System.out.println("\n---------- LISTA DE VEHICULOS DISPONIBLES ----------");
            if(vehiculos.isEmpty()){
                System.out.println("No hay vehiculos registrados.");
                return;
            }

            System.out.println("\n---Listado de Vehiculos ---");

            boolean hayDisponibles = false;

            for (Vehiculo v : vehiculos){
                if (v.isDisponible()){
                    v.mostrarDetalle();
                    hayDisponibles = true;
                }
            }

            if (!hayDisponibles){
                System.out.println("No hay vehiculos disponibles.");
            }
        }


        // OPCION 6 - MARCAR VEHICULO COMO NO DISPONIBLE
        private static void marcarNoDisponible(Scanner sc, List<Vehiculo> vehiculos) {

            System.out.println("Ingrese la patente del vehículo: ");
            String patente = sc.nextLine().trim();

            if (patente.isEmpty()) {
                System.out.println("Error: La patente no puede estar vacía.");
                return;
            }

            for (Vehiculo v : vehiculos) {
                if (v.getPatente().equalsIgnoreCase(patente)) {

                    if (!v.isDisponible()) {
                        System.out.println("El vehículo ya está marcado como no disponible.");
                        return;
                    }

                    v.setDisponible(false);
                    System.out.println("El vehículo con patente " + patente + " ahora no está disponible.");
                    return;
                }
            }

            System.out.println("Error: No se encontró un vehículo con esa patente.");
        }

    }