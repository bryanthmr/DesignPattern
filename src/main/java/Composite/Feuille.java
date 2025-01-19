package Composite;

public class Feuille implements Composant{
    private String nom;

    public Feuille(String nom){
        this.nom=nom;
    }

    public void afficher(){
        System.out.println("Feuille: "+nom);
    }

    public void M1(){
        System.out.println("M1 de Feuille: "+nom);
    }
}
