// Clase Moto, que hereda de Transporte
public class Moto extends Transporte {

    // Constructor
    public Moto(int velocidadMaxima, int capacidad) {
        super(velocidadMaxima, capacidad);  // Llama al constructor de la clase Transporte
    }

    // Sobrescribir el método mostrarInfo
    @Override
    public void mostrarInfo() {
        System.out.println("Moto:");
        super.mostrarInfo();  // Llama al método de la clase padre (Transporte)
    }
}
