public class Iguana {

    // Atributos
    private String color;
    private double longitud; // en metros
    private boolean tienePapada;
    private boolean esHerbivora;

    // Constructor
    public Iguana(String color, double longitud, boolean tienePapada, boolean esHerbivora) {
        this.color = color;
        this.longitud = longitud;
        this.tienePapada = tienePapada;
        this.esHerbivora = esHerbivora;
    }

    // Acciones
    public void trepar() {
        System.out.println("La iguana trepa ágilmente por los árboles.");
    }

    public void defenderse() {
        System.out.println("La iguana usa su cola como látigo para defenderse.");
    }

    public void camuflarse() {
        System.out.println("La iguana se camufla con su entorno.");
    }

    public void tomarSol() {
        System.out.println("La iguana toma el sol para regular su temperatura.");
    }

    // Getters y Setters (opcional)
}
