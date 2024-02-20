
class BienRepository {
    private List<Bien> biens = new ArrayList<>();

    public void save(Bien bien) {
        biens.add(bien);
    }

    public List<Bien> getAll() {
        return biens;
    }
}
