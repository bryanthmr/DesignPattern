package Iterator;

public class Etudiant {

    private String nom;
    private String prenom;
    private int numEtudiant;


    public Etudiant(String nom, String prenom, int numEtudiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.numEtudiant = numEtudiant;
    }

    public void etudier(){
        System.out.println(nom + " " + prenom + " etudie");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
