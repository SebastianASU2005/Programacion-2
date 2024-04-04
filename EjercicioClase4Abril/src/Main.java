import Classes.Circulo;
import Classes.Cuadrado;
import ClassesJuegoRol.Guerrero;
import ClassesJuegoRol.Mago;
import ClassesJuegoRol.Picaro;

public class Main {
    public static void main(String[] args) {


        //Ejercicio 1
        Circulo c1=new Circulo(12);
        Cuadrado cuadrado1=new Cuadrado(3);
        c1.dibujar();
        System.out.println("El area del circulo es: "+c1.calcularArea());
        cuadrado1.dibujar();
        cuadrado1.rotar();
        System.out.println("El area del cuadrado es: "+cuadrado1.calcularArea());


        //Ejercicio 2
        Guerrero g1=new Guerrero(5,100,15,"Hercules",3,2);
        Mago m1=new Mago(5,100,15,"Merlin",3,20);
        Picaro p1=new Picaro(5,100,15,"Snake",3,20);
        //todos los comando interacciones del guerrero
        m1.defender(g1.atacar());
        p1.defender(g1.atacar());
        g1.defender(m1.atacar());
        g1.defender(p1.atacar());
        //todos los comando interacciones del mago
        g1.defender(m1.atacar());
        p1.defender(m1.atacar());
        m1.defender(g1.atacar());
        m1.defender(p1.atacar());
        //todos los comando interacciones del picaro
        g1.defender(p1.atacar());
        m1.defender(p1.atacar());
        p1.defender(g1.atacar());
        p1.defender(m1.atacar());
        //Su vida restante
        System.out.println("Vida guerreo= "+g1.getHp());
        System.out.println("Vida mago= "+m1.getHp());
        System.out.println("Vida picaro= "+p1.getHp());
    }
}