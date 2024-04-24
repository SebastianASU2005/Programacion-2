package TrabajoPractico3.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private double nota;


    public Alumno() {
    }

    public Alumno(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "nombre: "+nombre+" edad: "+edad+" nota: "+nota;
    }
}
