// Clase Bicicleta, que hereda de Transporte
public class Bicicleta extends Transporte {

    // Constructor
    public Bicicleta(int velocidadMaxima, int capacidad) {
        super(velocidadMaxima, capacidad);  // Llama al constructor de la clase Transporte
    }

    // Sobrescribir el método mostrarInfo
    @Override
    public void mostrarInfo() {
        System.out.println("Bicicleta:");
        super.mostrarInfo();  // Llama al método de la clase padre (Transporte)
    }
}
