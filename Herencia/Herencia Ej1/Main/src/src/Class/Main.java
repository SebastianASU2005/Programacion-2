package Class;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      Vehicle v1=new Vehicle();
      Auto a1=new Auto("Rojo",4,200,2500);
      Bicicleta b1=new Bicicleta("Azul",2,"Urbana");
      Motocicleta m1= new Motocicleta("Negro",2,"Deportiva",180,1500);
      Camioneta c1=new Camioneta("Gris",4,200,2000,500);
        ArrayList<Vehicle>lista=new ArrayList<>();
        lista.add(a1);
        lista.add(b1);
        lista.add(c1);
        lista.add(m1);
        //Catalogar(lista);
        Catalogar2(lista,0);
    }
    public static void Catalogar2(ArrayList<Vehicle> lista,int ruedas) {
        int cont=0;
        for (Vehicle tre:lista) {
            if (tre.getRuedas()==ruedas){
            System.out.println("Clase: "+tre.getClass().getSimpleName());
            System.out.println("Atributos: ");
            System.out.println(tre);
            System.out.println("-----------------------");
            cont+=1;
            }


        }
        System.out.println("Se han encontrado "+cont+" Vehiculos con la ruedas que se deseo buscar");
    }
    public static void Catalogar(ArrayList<Vehicle> lista) {
        for (Vehicle tre:lista) {
            System.out.println("Clase: "+tre.getClass().getSimpleName());
            System.out.println("Atributos: ");
            System.out.println(tre);
            System.out.println("-----------------------");


        }
    }
    }
