package TrabajoPractico3.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList<>();
        Alumno alu;
        while (true) {
            alu = new Alumno();
            System.out.print("ingrese nombre del alumno ( o escriba fin para terminar)");
            alu.setNombre(leer.next());

            if (alu.getNombre().equals("fin")) {
                break;
            }  try {
                System.out.print("Ingrese edad: ");
                alu.setEdad(leer.nextInt());

                System.out.print("Ingrese nota: ");
                alu.setNota(leer.nextDouble());

                alumnos.add(alu);
            } catch (Exception e) {
                System.out.println("Error: Por favor, ingrese un valor válido para la edad o la nota.");
                leer.next(); // Limpiar el buffer del scanner
            }

        }

        double sum = 0;
        double cont=0;
        System.out.println("lista alumnos:");
        for (Alumno alum : alumnos) {
            System.out.println(alum);
            cont++;
            sum=sum+alum.getNota();
        }
        double prom=sum/cont;
        System.out.println("el promedio de las notas es: "+prom);

        String res;
        String alum;
        while(true){
            System.out.println("desea buscar un alumno?");
            res= leer.next();

            if(res.equals("si")){
                System.out.println("que alumno quiere buscar?");
                alum= leer.next();

                for(Alumno alums:alumnos){
                    if(alums.getNombre().equals(alum)){
                        System.out.println(alums);
                    }
                }
            }else{
                break;
            }
        }




    }
}
