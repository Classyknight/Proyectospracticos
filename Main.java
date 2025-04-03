// Clase Main para probar el código
public class Main {
    public static void main(String[] args) {
        // Crear objetos de los diferentes animales
        Animal gato = new gato("Tom", 3);
        Animal pajaro = new Pajaro("Piolin", 2);

        // Hacer que los animales emitan sonidos
        gato.hacerSonido(); // Debería decir "El gato dice: ¡Miau!"
        pajaro.hacerSonido(); // Debería decir "El pájaro dice: ¡Pío, pío!"
    }
}
