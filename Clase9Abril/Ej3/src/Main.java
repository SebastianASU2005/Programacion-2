import Classes.Department;
import Classes.Employe;

public class Main {
    public static void main(String[] args) {

        Employe empleado1 = new Employe("Juan", "Gerente");
        Employe empleado2 = new Employe("María", "Analista");
        Employe empleado3 = new Employe("Pedro", "Desarrollador");

        // Crear departamentos
        Department departamentoTI = new Department("Tecnologías de la Información");
        Department departamentoRRHH = new Department("Recursos Humanos");

        // Asignar empleados a departamentos
        departamentoTI.agregarEmpleado(empleado1);
        departamentoTI.agregarEmpleado(empleado2);
        departamentoTI.agregarEmpleado(empleado3);

        departamentoRRHH.agregarEmpleado(empleado2);

        // Mostrar empleados de cada departamento
        System.out.println("Empleados del departamento de " + departamentoTI.getName() + ":");
        for (Employe empleado : departamentoTI.getEmployeList()) {
            System.out.println("- " + empleado.getName() + " (" + empleado.getCharge() + ")");
        }

        System.out.println("\nEmpleados del departamento de " + departamentoRRHH.getName() + ":");
        for (Employe empleado : departamentoRRHH.getEmployeList()) {
            System.out.println("- " + empleado.getName() + " (" + empleado.getCharge() + ")");
        }
    }
}