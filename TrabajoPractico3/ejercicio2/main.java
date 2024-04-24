package TrabajoPractico3.ejercicio2;

public class main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Paulo");
        Empleado empleado2= new Empleado("Pedro");

        empleado1.asignarSupervisor(empleado2);
        System.out.println("El supervisor de: "+empleado1.getName()+" es: "+ empleado1.obtenerNameSupervisor());
    }
}
