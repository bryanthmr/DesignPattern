package Iterator;

import java.util.HashMap;
import java.util.Map;

public class ClasseING1 implements Classe {
    Map<Integer,Etudiant> etudiants = new HashMap<>();
    public Map<Integer, Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Map<Integer, Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public void addEtudiant(Etudiant etudiant){
        etudiants.put(etudiant.getNumEtudiant(),etudiant);
    }

    public void removeEtudiant(Etudiant etudiant){
        etudiants.remove(etudiant.getNumEtudiant());
    }

    public void etudierAll(){
        for (Map.Entry<Integer, Etudiant> entry : etudiants.entrySet()) {
            entry.getValue().etudier();
        }
    }


}
