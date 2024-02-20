

class BienService {
    private BienRepository bienRepository = new BienRepository();
    private ZoneService zoneService = new ZoneService();

    public void ajouterBien(String reference, String description, double prix) {
        Bien nouveauBien = new Bien(reference, description, prix);
        List<Zone> zones = zoneService.listerZones();
        if (!zones.isEmpty()) {
            System.out.println("Choisissez la zone pour le bien:");
            int choixZone = new Scanner(System.in).nextInt();
            if (choixZone > 0 && choixZone <= zones.size()) {
                Zone zoneChoisie = zones.get(choixZone - 1);
                nouveauBien.setZone(zoneChoisie);
                bienRepository.save(nouveauBien);
                System.out.println("Bien ajouté avec succès.");
            } else {
                System.out.println("Choix de zone invalide.");
            }
        } else {
            System.out.println("Aucune zone disponible. Veuillez créer une zone d'abord.");
        }
    }

    public void listerBiens() {
        List<Bien> biens = bienRepository.getAll();
        for (Bien bien : biens) {
            System.out.println("Bien - ID: " + bien.getId() + ", Référence: " + bien.getReference() +
                    ", Description: " + bien.getDescription() + ", Prix: " + bien.getPrix() +
                    ", Zone: " + bien.getZone().getNomZone());
        }
    }
}
