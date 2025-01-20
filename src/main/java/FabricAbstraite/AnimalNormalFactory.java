package FabricAbstraite;

import FabricAbstraite.Animal.Animal;
import FabricAbstraite.Animal.Canard;
import FabricAbstraite.Animal.Cheval;
import FabricAbstraite.Animal.Mouton;

public class AnimalNormalFactory implements AnimalFactory {

    public Animal createCanard() {
        return new Canard("Canard normal", "Jaune", 10, "Plume normale");
    }

    public Animal createMouton() {
        return new Mouton("Mouton normal", "Blanc", 10, "Laine normale");
    }

    public Animal createCheval() {
        return new Cheval("Cheval normal", "Brun", 10, "Crin normal");
    }
}
