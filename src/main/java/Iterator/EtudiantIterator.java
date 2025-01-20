package Iterator;

public interface EtudiantIterator {

    public static EtudiantIterator createIterator(Classe c){
        if(c instanceof ClasseING1){
            return new ING1Iterator((ClasseING1) c);
        }else if(c instanceof ClasseING2){
            return new ING2Iterator((ClasseING2) c);
        }
        return null;

    }

    public boolean hasNext();
    public Etudiant next();

}
