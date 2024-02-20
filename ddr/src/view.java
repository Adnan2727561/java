class ZoneView {
    
}

class BienView {
   
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZoneService zoneService = new ZoneService();
        BienService bienService = new BienService();

        int choix;
        do {
            System.out.println("Menu:");
            System.out.println("1-Créer une Zone");
            System.out.println("2-Lister les Zones");
            System.out.println("3-Ajouter un bien et lui associer une zone");
            System.out.println("4-Lister les biens en affichant le nom de la zone");
            System.out.println("5-Quitter");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Entrez le nom de la zone:");
                    String nomZone = scanner.next();
                    zoneService.creerZone(nomZone);
                    break;
                case 2:
                    zoneService.listerZones();
                    break;
                case 3:
                    System.out.println("Entrez la référence du bien:");
                    String reference = scanner.next();
                    System.out.println("Entrez la description du bien:");
                    String description = scanner.next();
                    System.out.println("Entrez le prix du bien:");
                    double prix = scanner.nextDouble();
                    bienService.ajouterBien(reference, description, prix);
                    break;
                case 4:
                    bienService.listerBiens();
                    break;
                case 5:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir un nombre de 1 à 5.");
                    break;
            }
        } while (choix!=5);
    }
}