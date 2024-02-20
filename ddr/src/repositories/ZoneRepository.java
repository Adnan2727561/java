class ZoneRepository {
    private List<Zone> zones = new ArrayList<>();

    public void save(Zone zone) {
        zones.add(zone);
    }

    public List<Zone> getAll() {
        return zones;
    }
}
