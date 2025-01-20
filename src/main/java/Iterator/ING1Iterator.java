package Iterator;

import java.util.List;

public class ING1Iterator implements EtudiantIterator{
    private ClasseING1 classe=null;
    private int index=-1;


    public ING1Iterator(ClasseING1 classe){
        this.classe=classe;

    }

    public boolean hasNext() {
        if((index+1)<classe.getEtudiants().length){
            return true;
        }
        return false;
    }

    public Etudiant next() {
        if(hasNext()){
            return classe.getEtudiants()[++index];
        }
        return null;

    }
}
