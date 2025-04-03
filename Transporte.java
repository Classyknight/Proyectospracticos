// Clase Transporte
public class Transporte {
    // Atributos
    protected int velocidadMaxima;  // en km/h
    protected int capacidad;        // número de personas

    // Constructor
    public Transporte(int velocidadMaxima, int capacidad) {
        this.velocidadMaxima = velocidadMaxima;
        this.capacidad = capacidad;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Capacidad: " + capacidad + " personas");
    }

    // Métodos getters y setters
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
