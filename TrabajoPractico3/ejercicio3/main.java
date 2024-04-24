package TrabajoPractico3.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<String> dias = new ArrayList<>(7);

        //Crea una lista que contenga los días de la semana, luego:  Inserta en la posición 4 el elemento “Juernes”.

        for (int i = 0; i < 7; i++) {
            String dia;
            try {
                System.out.println("ingrese dia");
                dia = leer.next();
                dias.add(dia);
            } catch (Exception e) {
                System.out.println("se produjo un error");
            }
        }

        //	Muestra el contenido de las posiciones 3 y 4 de la lista.
        System.out.println("el dia 3 es: " + dias.get(2));
        System.out.println("el dia 4 es: " + dias.get(3));

        //	Muestra el primer elemento y el último de la lista.
        System.out.println("el primer elemento es: " + dias.get(0));
        System.out.println("el ultimo elemento es: " + dias.get(6));

        //	Elimina el elemento que contenga “Juernes” de la lista y comprueba que haya sido eliminado.
        boolean encontrado=false;
        for(String dia:dias){
            if(dia.equals("juernes")){
                encontrado=true;
                dias.remove(dia);
                System.out.println("el dia juernes fue eliminado");
                break;
            }

        }
        if(!encontrado){
            System.out.println("no se encontro el dia juernes");
        }

        //	Crea un iterador y muestras uno a uno los valores de la lista.
        for(String dia:dias){
            System.out.println(dia);
        }

        //	Busca si existe en la lista un elemento que se denomine “Lunes”. No importa si está en mayúscula o minúscula.
        boolean in=false;
        for(String dia:dias){
            if(dia.toUpperCase().equals("LUNES") || dia.toLowerCase().equals("lunes")){
                in=true;
                System.out.println("el dia Lunes se encontro");
                break;
            }
        }
        if(!in){
            System.out.println(" no se encontro");
        }

        //	Borra todos los elementos de la lista.
        for(String dia:dias){
            dias.remove(dia);
        }

    }


}
