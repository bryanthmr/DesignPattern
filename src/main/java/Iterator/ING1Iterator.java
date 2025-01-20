package Iterator;

public class ING1Iterator implements EtudiantIterator{
    ClasseING1 classe=null;

    public ING1Iterator(ClasseING1 classe){
        this.classe=classe;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Etudiant next() {
        return null;
    }
}
