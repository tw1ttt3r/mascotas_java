package mascotas;

public class Gato extends Mascota {
    private String color;
    private int edad;
    private String especie;

    public Gato(String nombre, String color, int edad, char genero, double peso, double largo, String especie) {
        super(nombre, genero, peso, largo);
        this.color = color;
        this.edad = edad;
        this.especie = especie;
    }

    @Override
    public String sonido() { return "Miau"; }

    @Override
    public String comer() { return "Pescado"; }

    public String afilarGarras() { return nombre + " afila sus garras."; }
}
