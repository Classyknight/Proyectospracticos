// Clase Main para probar el código
public class Main {
    public static void main(String[] args) {
        // Crear objetos de los diferentes tipos de transporte
        Transporte bicicleta = new Bicicleta(30, 1);  // Velocidad máxima 30 km/h, capacidad 1 persona
        Transporte moto = new Moto(120, 2);  // Velocidad máxima 120 km/h, capacidad 2 personas

        // Mostrar la información de los vehículos
        System.out.println("Información de la bicicleta:");
        bicicleta.mostrarInfo();
        System.out.println();

        System.out.println("Información de la moto:");
        moto.mostrarInfo();
    }
}
