// Clase Gato, que hereda de Animal
public class gato extends Animal {

    // Constructor
    public gato(String nombre, int edad) {
        super(nombre, edad); // Llama al constructor de la clase Animal
    }

    // Sobrescribir el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El gato dice: ¡Miau!");
    }
}