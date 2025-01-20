package PatronDeMethode.Animal;

public class ChevalPatron extends AnimalPatron {
    private String TypeCrin;

    public ChevalPatron(String nom, String couleur, int vitesse, String TypeCrin) {
        super(nom, couleur, vitesse);
        this.TypeCrin = TypeCrin;
    }

    @Override
    public void crier() {
        System.out.println("HUHUHUHUHUUUUUUUUUUUUUUUUUUUUU");
    }

    public String getTypeCrin() {
        return TypeCrin;
    }

    public void setTypeCrin(String typeCrin) {
        TypeCrin = typeCrin;
    }
}
