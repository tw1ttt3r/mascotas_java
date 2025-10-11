package mascotas;

public class Hamster extends Mascota {
    private int edad;

    public Hamster(String nombre, char genero, int edad, double peso, double largo) {
        super(nombre, genero, peso, largo);
        this.edad = edad;
    }

    @Override
    public String sonido() { return "Squeak"; }

    @Override
    public String comer() { return "Granos"; }

    public String correrRueda() { return nombre + " corre en la rueda."; }
}
