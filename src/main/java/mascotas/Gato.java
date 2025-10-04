package mascotas;

public class Gato {
    String color = "";
    int edad = 0;
    String especie = "";
    char genero = ' ';
    String nombre = "";
    double peso = 0.0;
    double lng = 0.0;

    Gato(String nombre, String color, int edad, char genero, double peso, double lng) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.lng = lng;
    }

    void comer() {}

    void pasear() {}

    void atacar() {}

    void dormir() {}

    void maullar() {}

}
