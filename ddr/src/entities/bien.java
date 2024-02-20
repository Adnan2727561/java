import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Bien {
    private static int compteurId = 1;
    private int id;
    private String reference;
    private String description;
    private double prix;
    private Zone zone;

    public Bien(String reference, String description, double prix) {
        this.id = compteurId++;
        this.reference = reference;
        this.description = description;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}