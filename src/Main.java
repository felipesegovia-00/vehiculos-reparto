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
                        System.out.println("\n==== LISTA DE VEHICULOS =====");
                        mostrarVehiculos(vehiculos);

                    }
                    case 5 -> {// Dante
                        listarVehiculos();
                    }
                    case 6 -> {// Dante
                        marcarNoDisponible();
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

      
      
        // OPCION 3 - REGISTRAR MOTOR REPARTO
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
      
      
      
        // OPCION 4 - MOSTRAR VEHICULOS
        public static void mostrarVehiculos(List<Vehiculo> vehiculos){
            if(vehiculos.isEmpty()){
                System.out.println("No hay vehiculos registrados");
                return;
            }

            for(Vehiculo vehiculo : vehiculos){
                vehiculo.mostrarDetalle();
            }
        }
      
      

        // OPCION 5
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
      

        // OPCION 6
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