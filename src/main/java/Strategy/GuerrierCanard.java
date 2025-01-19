package Strategy;

import Strategy.Attaque.*;
import Strategy.Defendre.*;
import Strategy.Utiliser.*;

public class GuerrierCanard {
    private String nom;
    private TypeGuerrier type;
    private Attaque attaque;
    private Defendre defendre;
    private Utiliser utiliser;

    public GuerrierCanard(String nom,TypeGuerrier type){
        this.nom = nom;
        this.type = type;
        switch (type){
            case SOLDAT:
                attaque = new AttaqueEpee();
                defendre = new DefendreEpee();
                utiliser = new UtiliserPotionAttaque();
                break;
            case TANK:
                attaque = new AttaqueBouclier();
                defendre = new DefendreBouclier();
                utiliser = new UtiliserPotionSoin();
                break;
            case MAGE:
                attaque = new AttaqueMagie();
                defendre = new DefendreMagie();
                utiliser = new UtiliserPotionMana();
                break;
        }

    }

    public void attaquer(){
        attaque.faire();
    }

    public void defendre(){
        defendre.faire();
    }

    public void utiliser(){
        utiliser.faire();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeGuerrier getType() {
        return type;
    }

    public void setType(TypeGuerrier type) {
        this.type = type;
    }
}
