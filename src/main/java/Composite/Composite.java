package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Composant{
    private List<Composant> composants;
    private String nom;

    public Composite(String nom){
        this.nom=nom;
        composants=new ArrayList<Composant>();
    }

    public void addComponent(Composant composant){
        composants.add(composant);
    }

    public void removeComponent(Composant composant){
        composants.remove(composant);
    }

    public void afficher(){
        System.out.println("Composite: "+nom);
        for (Composant composant : composants) {
            composant.afficher();
        }
    }

    public void M1(){
        System.out.println("M1 de Composite: "+nom);
    }
}
