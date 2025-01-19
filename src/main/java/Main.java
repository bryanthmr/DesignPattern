import Adaptateur.*;
import FabricMethod.*;
import Singleton.SingleAPI;
import Strategy.*;
import Facade.Controller.*;
import Singleton.View.*;
import Observable.*;
import Composite.*;


public class Main {
    public static void main(String[] args) {
        testAdaptateur();
        testFabricMethod();
        testStrategy();
        testFacade();
        testSingleton();
        testObserver();
        testComposite();
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
