package mirea__lab__11;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public class Pupil {
    private String name;
    private double GPA;

    public Pupil(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }
}

