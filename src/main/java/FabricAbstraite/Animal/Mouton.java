package FabricAbstraite.Animal;

public class Mouton extends Animal {
    private String TypeLaine;

    public Mouton(String nom, String couleur, int vitesse, String TypeLaine) {
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
