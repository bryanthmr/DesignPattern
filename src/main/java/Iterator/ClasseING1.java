package Iterator;

public class ClasseING1 implements Classe {
    Etudiant[] etudiants;


    public Etudiant[] getEtudiants() {
        return etudiants;
    }
    public void addEtudiant(Etudiant etudiant) {
        if(etudiants == null) {
            etudiants = new Etudiant[1];
            etudiants[0] = etudiant;
            return;
        }
        Etudiant[] newEtudiants = new Etudiant[etudiants.length + 1];
        for (int i = 0; i < etudiants.length; i++) {
            newEtudiants[i] = etudiants[i];
        }
        newEtudiants[etudiants.length] = etudiant;
        etudiants = newEtudiants;
    }
    public void removeEtudiant(Etudiant etudiant) {
        if(etudiants == null) {
            return;
        }
        Etudiant[] newEtudiants = new Etudiant[etudiants.length - 1];
        for (int i = 0; i < etudiants.length; i++) {
            if (etudiants[i] != etudiant) {
                newEtudiants[i] = etudiants[i];
            }
        }
        etudiants = newEtudiants;
    }





}
