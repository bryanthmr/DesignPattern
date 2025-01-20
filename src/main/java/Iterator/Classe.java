package Iterator;

public interface Classe {

    public static Classe createClasse(String type) {
        switch (type) {
            case "ING1":
                return new ClasseING1();
            case "ING2":
                return new ClasseING2();
            default:
                return null;
        }
    }

    public void addEtudiant(Etudiant etudiant);
    public void removeEtudiant(Etudiant etudiant);

}
