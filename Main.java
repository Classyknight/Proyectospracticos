// Clase Main para probar el código
public class Main {
    public static void main(String[] args) {
        // Crear objetos de los diferentes dispositivos
        Dispositivo telefono = new Telefono("Samsung", "Galaxy S23");
        Dispositivo laptop = new Laptop("Dell", "XPS 15");

        // Encender los dispositivos
        telefono.encender(); // Debería decir "El teléfono Samsung modelo Galaxy S23 está encendido."
        laptop.encender();   // Debería decir "La laptop Dell modelo XPS 15 está encendida."
    }
}
