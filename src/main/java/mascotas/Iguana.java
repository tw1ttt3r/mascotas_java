package mascotas;

public class Iguana extends Mascota {
    public Iguana(String nombre, char genero, double peso, double largo) {
        super(nombre, genero, peso, largo);
    }

    @Override
    public String sonido() { return "..." ; }

    @Override
    public String comer() { return "Hojas"; }

    public String tomarSol() { return nombre + " toma el sol."; }
}
