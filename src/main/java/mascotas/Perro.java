/// Clase por Eduardo M
package mascotas;

public class Perro {
    String color = "";
    int edad = 0;
    String raza = "";
    char genero = ' ';
    String nombre = "";
    double peso = 0.0;
    double lng = 0.0;

    Perro(String nombre, String color, int edad, char genero, double peso, double lng) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.lng = lng;
    }
    System.out.println("nombre"+nombre);
    System.out.println("color"+color);
    System.out.println("edad"+edad);
    System.out.println("genero"+genero);
    System.out.println("peso"+peso);
    System.out.println("plng"+peso);

}