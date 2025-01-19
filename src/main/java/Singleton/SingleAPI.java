package Singleton;

public class SingleAPI {

    private static SingleAPI instance = null;

    public String attribut;

    private SingleAPI(String attribut) {
        System.out.println("API: Constructor");
        instance = this;
        this.attribut=attribut;
    }

    public void setAttribut(String attribut) {
        this.attribut = attribut;
    }
    public static SingleAPI getInstance() {
        if (instance == null) {
            instance = new SingleAPI("attribut D'une API Crée via le getInstance");
        }
        return instance;
    }

    public void M1() {
        System.out.println("API singletonnée: M1");
    }

}
