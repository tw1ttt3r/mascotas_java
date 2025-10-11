package mascotas;

// Clase refactorizada con herencia
public class Perro extends Mascota {
    private String color;
    private int edad;
    private String raza;

    public Perro(String nombre, String color, int edad, char genero, double peso, double largo, String raza) {
        super(nombre, genero, peso, largo);
        this.color = color;
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public String sonido() { return "Guau"; }

    @Override
    public String comer() { return "Croquetas"; }

    public String traerPelota() { return nombre + " trae la pelota."; }
}
