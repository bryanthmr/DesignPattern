package FabricAbstraite;

import FabricAbstraite.Animal.Animal;
import FabricAbstraite.Animal.Canard;
import FabricAbstraite.Animal.Cheval;
import FabricAbstraite.Animal.Mouton;

public class AnimalRareFactory implements AnimalFactory {

    public Animal createCanard() {
        return new Canard("Canard rare", "Doré", 999, "Plume rare");
    }


    public Animal createMouton() {
        return new Mouton("Mouton rare", "Doré", 999, "Laine rare");
    }


    public Animal createCheval() {
        return new Cheval("Cheval rare", "Doré",999, "Crin rare");
    }

}
