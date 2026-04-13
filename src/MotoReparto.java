public class MotoReparto extends Vehiculo {

    // Dato exclusivo de la moto, los otros vehículos no lo tienen
    private boolean tieneCajaTermica;

    // Aquí se crean los datos de la moto
    // super() le manda los datos comunes a la clase Vehiculo
    public MotoReparto(String patente, String marca, String modelo, double capacidadCarga, boolean tieneCajaTermica) {
        super(patente, marca, modelo, capacidadCarga);
        this.tieneCajaTermica = tieneCajaTermica;
    }

    // Para leer si tiene caja térmica
    public boolean isTieneCajaTermica() {
        return tieneCajaTermica;
    }

    // Para cambiar si tiene caja térmica
    public void setTieneCajaTermica(boolean tieneCajaTermica) {
        this.tieneCajaTermica = tieneCajaTermica;
    }

    // Muestra la información de la moto en consola
    @Override
    public void mostrarDetalle() {
        System.out.println("┌─── MOTO DE REPARTO ─────────────────────────");
        System.out.println("│  Patente       : " + getPatente());
        System.out.println("│  Marca/Modelo  : " + getMarca() + " " + getModelo());
        System.out.println("│  Cap. de Carga : " + getCapacidadCarga() + " kg");
        System.out.println("│  Caja Térmica  : " + (tieneCajaTermica ? "Sí" : "No"));
        System.out.println("│  Estado        : " + estadoDisponibilidad());
        System.out.println("└──────────────────────────────────────────────────");
    }

    // Calcula cuánto combustible consume la moto
    // Las motos consumen menos que camiones y furgones
    @Override
    public double calcularConsumoEstimado() {
        return 3.0 + (getCapacidadCarga() * 0.1);
    }
}