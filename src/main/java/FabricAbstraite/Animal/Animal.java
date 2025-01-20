package FabricAbstraite.Animal;

public abstract class Animal {
    private String nom;
    private String couleur;
    private int vitesse;


    public Animal(String nom, String couleur, int vitesse) {
        this.nom = nom;
        this.couleur = couleur;
        this.vitesse = vitesse;
    }

    public abstract void crier();

    public void manger(){
        System.out.println(nom + " mange");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}
