import Classes.Book;
import Classes.Person;

public class Main {
    public static void main(String[] args) {
        // Crear personas
        Person persona1 = new Person("Juan");
        Person persona2 = new Person("María");

        // Crear libros
        Book libro1 = new Book("Cien años de soledad");
        Book libro2 = new Book("Mil amores");

        // Asignar libros a personas
        persona1.agregarLibro(libro1);
        persona1.agregarLibro(libro2);
        persona2.agregarLibro(libro2);

        // Mostrar libros de cada persona
        System.out.println(persona1.getName() + " tiene los siguientes libros:");
        for (Book libro : persona1.getBooks()) {
            System.out.println("- " + libro.getTitle());
        }

        System.out.println(persona2.getName() + " tiene los siguientes libros:");
        for (Book libro : persona2.getBooks()) {
            System.out.println("- " + libro.getTitle());
        }

        // Mostrar personas que poseen un libro específico
        System.out.println("El libro '" + libro1.getTitle() + "' es poseído por:");
        for (Person persona : libro1.getOwners()) {
            System.out.println("- " + persona.getName());
        }

        System.out.println("El libro '" + libro2.getTitle() + "' es poseído por:");
        for (Person persona : libro2.getOwners()) {
            System.out.println("- " + persona.getName());
        }
    }
}