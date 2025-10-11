package mascotas;

public abstract class Mascota {
    protected String nombre;
    protected char genero;
    protected double peso;
    protected double largo;

    public Mascota(String nombre, char genero, double peso, double largo) {
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.largo = largo;
    }

    public String getNombre() { return nombre; }
    public char getGenero() { return genero; }
    public double getPeso() { return peso; }
    public double getLargo() { return largo; }

    public abstract String sonido();
    public abstract String comer();

    public String descripcion() {
        return getClass().getSimpleName() + " {nombre='" + nombre + "', genero=" + genero + ", peso=" + peso + ", largo=" + largo + "}";
    }
}
