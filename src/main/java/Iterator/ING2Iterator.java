package Iterator;

public class ING2Iterator implements EtudiantIterator{
    ClasseING2 classe=null;
    int index=0;

    public ING2Iterator(ClasseING2 classe){
        this.classe=classe;
    }

    @Override
    public boolean hasNext() {
        if(index<classe.getEtudiants().size()){
            return true;
        }
        return false;
    }

    @Override
    public Etudiant next() {
        if(this.hasNext()){
            return classe.getEtudiants().get(index++);
        }
        return null;
    }
}
