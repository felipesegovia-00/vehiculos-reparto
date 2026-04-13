
// Clase abstracta que define el modelo general de un vehículo
// abstract = no se puede instanciar directamente, solo las clases hijas
public abstract class Vehiculo {
    // ATRIBUTOS = propiedades/características del vehículo
    // private = solo accessible dentro de esta clase, se usan getters/setters para acceder desde fuera
    
    private String patente; 
    private String marca; 
    private String modelo; 
    private Double capacidadCarga; 
    private boolean disponible; 


    // CONSTRUCTOR - Se ejecuta cuando se crea un objeto de la clase
    
    public Vehiculo( String patente, String marca, String modelo, Double capacidadCarga, boolean disponible ) {
        // "this" = se refiere al objeto actual (diferencia entre el parámetro y el atributo)
        // Asigna cada parámetro recibido a su respectivo atributo
        this.patente = patente; // El patente que pasamos como parámetro se guarda en el atributo patente
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.disponible = disponible;
    }
    
    // GETTERS (métodos para OBTENER/LEER los valores de los atributos)
    // No reciben parámetros, solo devuelven el valor del atributo
    public String getPatente() { return patente; } 
    public String getMarca() { return marca; }  
    public String getModelo() { return modelo; } 
    public Double getCapacidadCarga() { return capacidadCarga; }
    public boolean isDisponible() { return disponible; }

    // SETTERS métodos para MODIFICAR/ESCRIBIR los valores de los atributos
    // Reciben un parámetro nuevo y validan antes de asignar
    
    public void setPatente(String patente) {
        // Valida que el patente no sea null (nulo) Y que no esté vacio
        if (patente != null && !patente.trim().isEmpty()) {
            // Si la validación es correcta, asigna el nuevo valor
            this.patente = patente;
        }
    }

    // Setter para la disponibilidad 
    public void setDisponible(boolean disponible) {
        this.disponible = disponible; // Solo asigna el nuevo valor de disponibilidad
    }

    
    // MÉTODO para mostrar toda la información del vehículo de forma legible
    public void mostrarDetalle() {
        
        System.out.println("Patente: " + patente + " | Marca: " + marca +
                " | Modelo: " + modelo + " | Carga: " + capacidadCarga +
                "kg | Disponible: " + (disponible ? "Sí" : "No"));
    }

}
