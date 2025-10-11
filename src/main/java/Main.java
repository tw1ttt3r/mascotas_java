package mascotas;

public class Main {
    public static void main(String[] args) {
        // Sin lista polimórfica: instanciación y uso individual de cada clase
        Perro perro = new Perro("Firulais", "Marrón", 3, 'M', 12.5, 0.8, "Labrador");
        System.out.println(perro.descripcion());
        System.out.println("Sonido: " + perro.sonido());
        System.out.println("Come: " + perro.comer());
        System.out.println(perro.traerPelota());
        System.out.println();

        Gato gato = new Gato("Mishi", "Blanco", 2, 'H', 4.1, 0.5, "Doméstico");
        System.out.println(gato.descripcion());
        System.out.println("Sonido: " + gato.sonido());
        System.out.println("Come: " + gato.comer());
        System.out.println(gato.afilarGarras());
        System.out.println();

        Perico perico = new Perico("Piolín", 'M', 0.12, 0.15);
        System.out.println(perico.descripcion());
        System.out.println("Sonido: " + perico.sonido());
        System.out.println("Come: " + perico.comer());
        System.out.println(perico.volar());
        System.out.println();

        Hamster hamster = new Hamster("Bola", 'H', 1, 0.09, 0.1);
        System.out.println(hamster.descripcion());
        System.out.println("Sonido: " + hamster.sonido());
        System.out.println("Come: " + hamster.comer());
        System.out.println(hamster.correrRueda());
        System.out.println();

        Iguana iguana = new Iguana("Draco", 'M', 1.2, 0.7);
        System.out.println(iguana.descripcion());
        System.out.println("Sonido: " + iguana.sonido());
        System.out.println("Come: " + iguana.comer());
        System.out.println(iguana.tomarSol());
        System.out.println();

        Serpiente serpiente = new Serpiente("Kaa", 'H', 4, 2.3, 1.1);
        System.out.println(serpiente.descripcion());
        System.out.println("Sonido: " + serpiente.sonido());
        System.out.println("Come: " + serpiente.comer());
        System.out.println(serpiente.reptar());
        System.out.println();

        Leon leon = new Leon("Simba", 'M', 190.0, 1.9);
        System.out.println(leon.descripcion());
        System.out.println("Sonido: " + leon.sonido());
        System.out.println("Come: " + leon.comer());
        System.out.println(leon.rugir());
        System.out.println();

        Lince lince = new Lince("Luna", 'H', 22.5, 0.9);
        System.out.println(lince.descripcion());
        System.out.println("Sonido: " + lince.sonido());
        System.out.println("Come: " + lince.comer());
        System.out.println(lince.saltar());
    }
}
