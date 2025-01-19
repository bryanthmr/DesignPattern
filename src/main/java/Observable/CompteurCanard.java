package Observable;

public class CompteurCanard implements Observer {
    private int nbCri=0;

    public void log(){
        nbCri++;
        System.out.println("CompteurCanard: Le canard a crié "+nbCri+" fois");
    }
}
