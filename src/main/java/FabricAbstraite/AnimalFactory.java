package FabricAbstraite;

import FabricAbstraite.Animal.Animal;

public interface AnimalFactory {



    public Animal createCanard();
    public Animal createMouton();
    public Animal createCheval();


}
