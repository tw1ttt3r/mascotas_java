package mascotas;

public class Lince {

    private String nombre = "";
    private String especie = "";
    private String nombreCientifico = "";
    private char genero = ' ';
    private int edad = 0;
    private double peso = 0.0;
    private double longitud = 0.0;

    public Lince(String nombre, String especie, String nombreCientifico, char genero, int edad, double peso, double longitud) {
        this.nombre = nombre;
        this.especie = especie;
        this.nombreCientifico = nombreCientifico;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.longitud = longitud;
    }

    public void cazar(){}

    public void saltar(){}

    public void dormir(){}

    public  void comer(){}

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nombre Cientifico: " + nombreCientifico);
        System.out.println("Genero: " + genero);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Longitud: " + longitud);
    }
}
