public class Furgon extends Vehiculo {

    // Dato exclusivo del furgón
    private double volumenInterior;

    // Constructor con los datos de Vehiculo + el dato de Furgon
    public Furgon(String patente, String marca, String modelo, double capacidadCarga, boolean disponible, double volumenInterior) {
        super(patente, marca, modelo, capacidadCarga, disponible);
        this.volumenInterior = volumenInterior;
    }

    // Getter y Setter
    public double getVolumenInterior() {
        return volumenInterior;
    }

    public void setVolumenInterior(double volumenInterior) {
        this.volumenInterior = volumenInterior;
    }

    // Muestra la información del furgón en consola
    @Override
    public void mostrarDetalle() {
        System.out.println("┌─── FURGÓN ───────────────────────────────────────");
        System.out.println("│  Patente       : " + getPatente());
        System.out.println("│  Marca/Modelo  : " + getMarca() + " " + getModelo());
        System.out.println("│  Cap. de Carga : " + getCapacidadCarga() + " kg");
        System.out.println("│  Vol. Interior : " + volumenInterior + " m³");
        System.out.println("│  Estado        : " + (isDisponible() ? "Disponible" : "No disponible"));
        System.out.println("└──────────────────────────────────────────────────");
    }
}