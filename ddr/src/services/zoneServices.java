class ZoneService {
    private ZoneRepository zoneRepository = new ZoneRepository();

    public void creerZone(String nomZone) {
        Zone nouvelleZone = new Zone(nomZone);
        zoneRepository.save(nouvelleZone);
        System.out.println("Zone créée avec succès.");
    }

    public void listerZones() {
        List<Zone> zones = zoneRepository.getAll();
        for (Zone zone : zones) {
            System.out.println("Zone - ID: " + zone.getId() + ", Nom: " + zone.getNomZone());
        }
    }
}