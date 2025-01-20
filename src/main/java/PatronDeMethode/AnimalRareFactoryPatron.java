package PatronDeMethode;

import PatronDeMethode.Animal.AnimalPatron;
import PatronDeMethode.Animal.CanardPatron;
import PatronDeMethode.Animal.ChevalPatron;
import PatronDeMethode.Animal.MoutonPatron;

public class AnimalRareFactoryPatron extends AnimalFactoryPatron {

    public AnimalPatron createCanard() {
        return new CanardPatron("Canard rare", "Doré", 999, "Plume rare");
    }


    public AnimalPatron createMouton() {
        return new MoutonPatron("Mouton rare", "Doré", 999, "Laine rare");
    }


    public AnimalPatron createCheval() {
        return new ChevalPatron("Cheval rare", "Doré",999, "Crin rare");
    }

}
