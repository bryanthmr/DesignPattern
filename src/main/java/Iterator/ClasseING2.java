package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ClasseING2 implements Classe{
    List<Etudiant> etudiants = new ArrayList<>();

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void addEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
    }

    public void removeEtudiant(Etudiant etudiant) {
        this.etudiants.remove(etudiant);
    }



}
