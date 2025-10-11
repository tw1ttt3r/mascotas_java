package mascotas;

public class Lince extends Mascota {
    public Lince(String nombre, char genero, double peso, double largo) {
        super(nombre, genero, peso, largo);
    }

    @Override
    public String sonido() { return "Grr"; }

    @Override
    public String comer() { return "Aves y roedores"; }

    public String saltar() { return nombre + " salta ágilmente."; }
}
