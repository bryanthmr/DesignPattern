package PatronDeMethode;

import PatronDeMethode.Animal.AnimalPatron;
import PatronDeMethode.Animal.CanardPatron;
import PatronDeMethode.Animal.ChevalPatron;
import PatronDeMethode.Animal.MoutonPatron;

public class AnimalNormalFactoryPatron extends AnimalFactoryPatron {

    public AnimalPatron createCanard() {
        return new CanardPatron("Canard normal", "Jaune", 10, "Plume normale");
    }

    public AnimalPatron createMouton() {
        return new MoutonPatron("Mouton normal", "Blanc", 10, "Laine normale");
    }

    public AnimalPatron createCheval() {
        return new ChevalPatron("Cheval normal", "Brun", 10, "Crin normal");
    }
}
