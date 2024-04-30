package Classes;

import java.util.ArrayList;
import java.util.List;

public class NationalTeam {
    private String colour;
    private String country;
    private List<Athlete> belong;

    public NationalTeam() {
    }

    public NationalTeam(String colour, String country) {
        this.colour = colour;
        this.country = country;
        this.belong = new ArrayList<>();
    }
    public void agregarAtleta(Athlete atleta) {
        belong.add(atleta);
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Athlete> getAthletes() {
        return belong;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.belong = athletes;
    }
}
