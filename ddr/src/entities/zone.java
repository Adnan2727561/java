import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Entities
class Zone {
    private static int compteurId = 1;
    private int id;
    private String nomZone;

    public Zone(String nomZone) {
        this.id = compteurId++;
        this.nomZone = nomZone;
    }

    public int getId() {
        return id;
    }

    public String getNomZone() {
        return nomZone;
    }
}


