// Clase Dispositivo
public class Dispositivo {
    // Atributos
    protected String marca;
    protected String modelo;

    // Constructor
    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método encender (será sobrescrito por las subclases)
    public void encender() {
        System.out.println("El dispositivo está encendido.");
    }

    // Métodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
