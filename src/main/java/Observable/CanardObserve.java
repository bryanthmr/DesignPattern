package Observable;

import java.util.ArrayList;
import java.util.List;


public class CanardObserve {
    private String nom;
    private String couleur;


    List<Observer> observers;

    public CanardObserve(String nom, String couleur){
        this.nom=nom;
        this.couleur=couleur;
        observers=new ArrayList<Observer>();

    }
    public void crier(){
        notifierAll();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifierAll(){
        for (Observer observer : observers) {
            observer.log();
        }
    }
}
