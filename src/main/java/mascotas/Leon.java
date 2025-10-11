package mascotas;

public class Leon extends Mascota {
    public Leon(String nombre, char genero, double peso, double largo) {
        super(nombre, genero, peso, largo);
    }

    @Override
    public String sonido() { return "¡Rooaar!"; }

    @Override
    public String comer() { return "Carne"; }

    public String rugir() { return nombre + " ruge con fuerza."; }
}
