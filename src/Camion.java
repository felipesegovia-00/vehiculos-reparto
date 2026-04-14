public class Camion extends Vehiculo {

    private int ejes;

    public Camion(String patente, String marca, String modelo,
                  double capacidadCarga, boolean disponible, int ejes) {

        super(patente, marca, modelo, capacidadCarga, disponible);
        this.ejes = ejes;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("┌─── CAMION ─────────────────────────");
        System.out.println("│  Patente       : " + getPatente());
        System.out.println("│  Marca/Modelo  : " + getMarca() + " " + getModelo());
        System.out.println("│  Cap. de Carga : " + getCapacidadCarga() + " kg");
        System.out.println("│  Ejes          : " + ejes );
        System.out.println("│  Disponible    : " + (isDisponible() ? "Sí" : "No"));
        System.out.println("└──────────────────────────────────────────────────");
    }
}