package Singleton;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleAPI singleAPI)) return false;
        return Objects.equals(attribut, singleAPI.attribut);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(attribut);
    }
}
