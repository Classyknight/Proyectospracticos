// Clase Telefono, que hereda de Dispositivo
public class Telefono extends Dispositivo {

    // Constructor
    public Telefono(String marca, String modelo) {
        super(marca, modelo); // Llamada al constructor de la clase Dispositivo
    }

    // Sobrescribir el método encender
    @Override
    public void encender() {
        System.out.println("El teléfono " + marca + " modelo " + modelo + " está encendido.");
    }
}
