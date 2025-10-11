package mascotas;

public class Serpiente extends Mascota {
    private int edad;

    public Serpiente(String nombre, char genero, int edad, double peso, double largo) {
        super(nombre, genero, peso, largo);
        this.edad = edad;
    }

    @Override
    public String sonido() { return "Sss"; }

    @Override
    public String comer() { return "Roedores"; }

    public String reptar() { return nombre + " repta silenciosamente."; }
}
