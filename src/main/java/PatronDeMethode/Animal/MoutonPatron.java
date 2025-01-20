package PatronDeMethode.Animal;

public class MoutonPatron extends AnimalPatron {
    private String TypeLaine;

    public MoutonPatron(String nom, String couleur, int vitesse, String TypeLaine) {
        super(nom, couleur, vitesse);
        this.TypeLaine = TypeLaine;
    }

    @Override
    public void crier() {
        System.out.println("Behhhhhhhhhhhh");
    }

    public String getTypeLaine() {
        return TypeLaine;
    }

    public void setTypeLaine(String typeLaine) {
        TypeLaine = typeLaine;
    }
}
