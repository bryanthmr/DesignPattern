package FabricAbstraite.Animal;

public class Canard extends Animal {
    private String TypePlume;

    public Canard(String nom, String couleur, int vitesse,String TypePlume) {
        super(nom, couleur, vitesse);
        this.TypePlume = TypePlume;
    }

    @Override
    public void crier() {
        System.out.println("Coin coin");
    }

    public String getTypePlume() {
        return TypePlume;
    }

    public void setTypePlume(String typePlume) {
        TypePlume = typePlume;
    }
}
