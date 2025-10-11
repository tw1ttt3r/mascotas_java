package mascotas;

public class Perico extends Mascota {
    public Perico(String nombre, char genero, double peso, double largo) {
        super(nombre, genero, peso, largo);
    }

    @Override
    public String sonido() { return "Pío"; }

    @Override
    public String comer() { return "Semillas"; }

    public String volar() { return nombre + " está volando."; }
}
