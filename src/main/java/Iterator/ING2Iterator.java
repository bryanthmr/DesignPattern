package Iterator;

public class ING2Iterator implements EtudiantIterator{
    private ClasseING2 classe=null;
    private int index=-1;

    public ING2Iterator(ClasseING2 classe){
        this.classe=classe;
    }

    @Override
    public boolean hasNext() {
        if((index+1)<classe.getEtudiants().size()){
            return true;
        }
        return false;
    }

    @Override
    public Etudiant next() {
        if(this.hasNext()){
            return classe.getEtudiants().get(++index);
        }
        return null;
    }
}
