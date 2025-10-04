package mascotas;

public class Gato extends Mascota {
    String color = "";
    int edad = 0;
    String especie = "";

    Gato(String nombre, String color, int edad, char genero, double peso, double lng) {
        super(nombre, genero, peso, lng);
        // new Mascota();
        this.color = color;
        this.edad = edad;
    }

    void comer() {}

    void pasear() {}

    void atacar() {}

    void dormir() {}

    void maullar() {}

}
