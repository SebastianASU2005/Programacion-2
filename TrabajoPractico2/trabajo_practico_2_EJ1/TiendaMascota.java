package TrabajoPractico2.trabajo_practico_2_EJ1;

import java.util.ArrayList;
import java.util.List;

public class TiendaMascota {


    private List<Animal> animales;  //DECLARO LISTA DE ANIMALES

    //CONSTRUCTOR DE TIENDAMASCOTA
    public TiendaMascota() { //CONSTRUCTOR TIENDA MASCOTA
        animales = new ArrayList<>();
    }

    public void addAnimal(Animal animal) { //METODO PARA AGREGAR UN ANIMAL
        animales.add(animal);
    }

    public void venderAnimal(String nombre) { //METODO PARA ELIMINAR ANIMAL

        Animal animalbucado = searchAnimal(nombre);

        if (animalbucado != null) {
            System.out.println("se vendio el animal: " + nombre);
            animales.remove(animalbucado);

        } else {
            System.out.println("no se encontro un animal con ese nombre");
        }


    }


    public void alimentarAnimal(String nombre) { //METODO PARA ALIMENTAR ANIMAL
        Animal animalbusccado = searchAnimal(nombre);

        if (animalbusccado != null) {
            animalbusccado.alimentar(nombre);
        } else {
            System.out.println(" no existe ese animal");
        }
    }

    public void listarAnimales() { //METODO PARA LISTAR ANIMALES
        System.out.println("animales de la tienda");
        for (Animal animal : animales) {
            System.out.println("nombre: " + animal.getNombre());
            System.out.println("tipo animal: " + animal.getTipoAnimal());
        }
    }

    public Animal searchAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                return animal;
            }
        }
        return null;
    }
}
