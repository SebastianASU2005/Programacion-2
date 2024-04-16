package TrabajoPractico2.trabajo_practico_2_EJ1;

public class Main {
    public static void main(String[] args) {
        TiendaMascota tienda = new TiendaMascota();
        Perro perro = new Perro("Mora", 2, 0, "callejero", true);
        Gato gato = new Gato("Milton", 10, 0, "negro", true);
        Ave ave = new Ave("Fifi", 2, 0, "banco", true);
        Pez pez = new Pez("Raul", 1, 0, "callejero", true);
        tienda.addAnimal(perro);
        tienda.addAnimal(gato);
        tienda.addAnimal(ave);
        tienda.addAnimal(pez);
        System.out.println("LISTA DE ANIMALES");
        tienda.listarAnimales();
        System.out.println("------------------");
        tienda.venderAnimal("Raul");
        tienda.alimentarAnimal("Milton");
        System.out.println("-------------------");
        System.out.println("NUEVA LISTA DE ANIMALES");
        tienda.listarAnimales();
    }
}
