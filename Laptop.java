// Clase Laptop, que hereda de Dispositivo
public class Laptop extends Dispositivo {

    // Constructor
    public Laptop(String marca, String modelo) {
        super(marca, modelo); // Llamada al constructor de la clase Dispositivo
    }

    // Sobrescribir el método encender
    @Override
    public void encender() {
        System.out.println("La laptop " + marca + " modelo " + modelo + " está encendida.");
    }
}
