package PatronDeMethode;

import PatronDeMethode.Animal.AnimalPatron;

import java.util.ArrayList;
import java.util.List;

public abstract class AnimalFactoryPatron {

    //Patron de méthode pour créer une ferme
    public final List<AnimalPatron> createFerme(){;
        List<AnimalPatron> ferme= new ArrayList<AnimalPatron>();

        ferme.add(createCanard());
        ferme.add(createMouton());
        ferme.add(createCheval());


        return ferme;

    }


    public abstract AnimalPatron createCanard();
    public abstract AnimalPatron createMouton();
    public abstract AnimalPatron createCheval();


}
