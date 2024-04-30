package Classes;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private int code;
    private String tittle;
    private Facility facility;
    private List<Athlete> participates;

    public Test() {
    }

    public Test(int code, String tittle,Facility facility,List<Athlete> participates) {
        this.code = code;
        this.tittle = tittle;
        this.facility = facility;
        this.participates=participates;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<Athlete> getParticipates() {
        return participates;
    }

    public void setParticipates(List<Athlete> participates) {
        this.participates = participates;
    }

    @Override
    public String toString() {
        return "Test{" +
                "code=" + code +
                ", tittle='" + tittle + '\'' +
                ", facility=" + facility +
                ", participates=" + participates +
                '}';
    }
}
