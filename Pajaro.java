// Clase Pajaro, que hereda de Animal
public class Pajaro extends Animal {

    // Constructor
    public Pajaro(String nombre, int edad) {
        super(nombre, edad); // Llama al constructor de la clase Animal
    }

    // Sobrescribir el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El pájaro dice: ¡Pío, pío!");
    }
}
