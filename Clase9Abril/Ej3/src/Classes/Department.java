package Classes;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employe> employeList;

    public Department(String name) {
        this.name = name;
        this.employeList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void agregarEmpleado(Employe empleado) {
        employeList.add(empleado);
    }

    public List<Employe> getEmployeList() {
        return employeList;
    }
}
