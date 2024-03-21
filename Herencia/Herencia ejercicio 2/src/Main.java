import Clases.Pajaro;
import Clases.Perro;
import Clases.Pez;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Pedro","Macho",2,"Sharpei","Domado");
        Pajaro pajaro = new Pajaro("Juana","Hembra",4,"Guacamayo","Sedoso");
        Pez pez = new Pez("Chen","Macho",1,"Goldeen","Drosal");
        perro.Informacion();
        pajaro.Informacion();
        pez.Informacion();


    }
}