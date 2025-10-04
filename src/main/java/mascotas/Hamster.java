package mascotas;

public class Hamster {
    String color = "";
    int edad = 0;
    String raza = "";
    char genero = ' ';
    String nombre = "";
    double peso = 0.0;
    double longitud = 0.0;

    public Hamster(String nombre, String raza, char genero, int edad, double peso, double longitud) {
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.longitud = longitud;
    }

    public void comer() {
    }

    public void correr() {
    }

    public void dormir() {
    }

    public void beber() {
    }


    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Longitud: " + longitud);
    }
}