import Adaptateur.*;
import FabricAbstraite.Animal.Animal;
import FabricMethod.*;
import PatronDeMethode.*;
import PatronDeMethode.Animal.*;
import Singleton.SingleAPI;
import Strategy.*;
import Facade.Controller.*;
import Singleton.View.*;
import Observable.*;
import Composite.*;
import FabricAbstraite.*;
import Iterator.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        testAdaptateur();
        testFabricMethod();
        testStrategy();
        testFacade();
        testSingleton();
        testObserver();
        testComposite();
        testFabricAbstraite();
        testPatronDeMethode();
        testIterator();
    }

    public static void testIterator(){
        Classe classe1 = Classe.createClasse("ING1");
        Classe classe2 = Classe.createClasse("ING2");

        Etudiant[] etudiants = new Etudiant[3];
        etudiants[0] = new Etudiant("Matue","Amine",0);
        etudiants[1] = new Etudiant("Tonton","ChatGPT",1);
        etudiants[2] = new Etudiant("Fred","Tony",2);

        classe1.addEtudiant(etudiants[0]);
        classe1.addEtudiant(etudiants[1]);
        classe1.addEtudiant(etudiants[2]);

        Etudiant etudiant1 = new Etudiant("Watson", "Jane",0);
        Etudiant etudiant2 = new Etudiant("Sparrow", "Jack",1);
        Etudiant etudiant3 = new Etudiant("Carter", "Jim",2);

        classe2.addEtudiant(etudiant1);
        classe2.addEtudiant(etudiant2);
        classe2.addEtudiant(etudiant3);


        EtudiantIterator iterator1 = EtudiantIterator.createIterator(classe1);
        EtudiantIterator iterator2 = EtudiantIterator.createIterator(classe2);

        System.out.println("\n-----------------Iterator-----------------");
        System.out.println("\nClasse 1");

        while (iterator1.hasNext()) {
            Etudiant etudiant = iterator1.next();
            System.out.println(etudiant.getNom()+" "+etudiant.getPrenom());
        }
        System.out.println("\nClasse 2");
        while (iterator2.hasNext()) {
            Etudiant etudiant = iterator2.next();
            System.out.println(etudiant.getNom()+" "+etudiant.getPrenom());
        }


    }

    public static void testPatronDeMethode(){
        AnimalFactoryPatron animalRareFactory = new AnimalRareFactoryPatron();
        AnimalFactoryPatron animalNormalFactory = new AnimalNormalFactoryPatron();

        List<AnimalPatron> fermeRare= animalRareFactory.createFerme();
        List<AnimalPatron> fermeNormal= animalNormalFactory.createFerme();

        System.out.println("\n-----------------PatronDeMethode-----------------");
        System.out.println("Création d'une ferme");
        List<AnimalPatron> ferme=new ArrayList<>(fermeNormal);
        ferme.addAll(fermeRare);

        for (AnimalPatron animal : ferme) {
            System.out.println(animal.getNom());
            animal.crier();
        }

    }

    public static void testFabricAbstraite(){
        AnimalFactory animalRareFactory = new AnimalRareFactory();
        AnimalFactory animalNormalFactory = new AnimalNormalFactory();

        Animal canardRare = animalRareFactory.createCanard();
        Animal moutonRare = animalRareFactory.createMouton();
        Animal chevalRare = animalRareFactory.createCheval();

        Animal canardNormal = animalNormalFactory.createCanard();
        Animal moutonNormal = animalNormalFactory.createMouton();
        Animal chevalNormal = animalNormalFactory.createCheval();

        List<Animal> animaux = List.of(canardRare, moutonRare, chevalRare, canardNormal, moutonNormal, chevalNormal);

        System.out.println("\n-----------------FabricAbstraite-----------------");
        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
            animal.crier();
        }


    }

    public static void testComposite(){
        Composant racine = new Composite("Racine");
        Composant branche1 = new Composite("Branche1");
        Composant branche2 = new Composite("Branche2");
        Composant feuille1 = new Feuille("Feuille1");
        Composant feuille2 = new Feuille("Feuille2");
        Composant feuille3 = new Feuille("Feuille3");
        Composant feuille4 = new Feuille("Feuille4");

        ((Composite)racine).addComponent(branche1);
        ((Composite)racine).addComponent(branche2);
        ((Composite)branche1).addComponent(feuille1);
        ((Composite)branche1).addComponent(feuille2);
        ((Composite)branche2).addComponent(feuille3);
        ((Composite)branche2).addComponent(feuille4);

        System.out.println("\n-----------------Composite-----------------");
        racine.afficher();


    }

    public static void testObserver(){
        CanardObserve canardJaune = new CanardObserve("Canard1", "Jaune");
        CompteurCanard compteur = new CompteurCanard();
        LoggerCanard logger = new LoggerCanard();

        canardJaune.addObserver(compteur);
        canardJaune.addObserver(logger);

        System.out.println("\n-----------------Observer-----------------");
        System.out.println("CanardJaune: il va crier");
        canardJaune.crier();

    }
    public static void testSingleton(){
        System.out.println("\n-----------------Singleton-----------------");
        ViewA.MA();
        ViewB.MB();
        ViewC.MC();
        SingleAPI api=SingleAPI.getInstance();
        System.out.println("Main: Attribut API --> "+api.attribut);
    }

    public static void testFacade(){
        API apiDev = API.createAPI("Dev");
        API apiProd = API.createAPI("Prod");

        System.out.println("\n-----------------Facade-----------------");
        apiDev.m1();
        apiDev.m2();
        apiDev.m3();

        apiProd.m1();
        apiProd.m2();
        apiProd.m3();
    }
    public static void testStrategy(){
        GuerrierCanard soldat = new GuerrierCanard("Soldat", TypeGuerrier.SOLDAT);
        GuerrierCanard tank = new GuerrierCanard("Tank", TypeGuerrier.TANK);
        GuerrierCanard mage = new GuerrierCanard("Mage", TypeGuerrier.MAGE);

        GuerrierCanard[] guerriers = {soldat, tank, mage};

        System.out.println("\n-----------------Strategy-----------------");
        for (GuerrierCanard guerrier : guerriers) {
            System.out.println(guerrier.getNom());
            guerrier.attaquer();
            guerrier.defendre();
            guerrier.utiliser();
        }

    }

    public static void testFabricMethod(){
        CanardPlastique canardJaune = CanardPlastique.createCanard("Jaune");
        CanardPlastique canardColvert = CanardPlastique.createCanard("Colvert");

        CanardPlastique[] canards = {canardJaune, canardColvert};
        System.out.println("\n-----------------FabricMethod-----------------");
        for (CanardPlastique canard : canards) {
            canard.voler();
            canard.nager();
            canard.doCoinCoin();
        }
    }
    public static void testAdaptateur() {
        Canard canardJaune = new CanardJaune();
        Canard canardColvert = new Colvert();
        Canard canardConverter3000 = new CanardConverter3000();
        Canard canardConverter5000 = new CanardConverter5000();

        Canard[] canards = {canardJaune, canardColvert, canardConverter3000, canardConverter5000};
        System.out.println("\n-----------------Adaptateur-----------------");
        for (Canard canard : canards) {
            canard.voler();
            canard.nager();
            canard.doCoinCoin();
        }
    }

}
