// Clase Animal
public class Animal {
    // Atributos
    protected String nombre;
    protected int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método hacerSonido (será sobrescrito por las subclases)
    public void hacerSonido() {
        System.out.println("Este animal hace un sonido");
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}