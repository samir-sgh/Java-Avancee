public class DVD implements Empruntable{
    String titre;
    String realisateur;
    boolean emprunte;

    public DVD() {
    }

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunte = false;
    }

    @Override
    public void emprunter() {
        if (!emprunte) {
            emprunte = true;
            System.out.println("Le livre : "+titre +" qui realisé par : "+ realisateur + " a été emprunté.");
        } else {
            System.out.println("Le livre : "+titre +" qui realisé par : "+ realisateur + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (emprunte) {
            emprunte = false;
            System.out.println("DVD : "+titre +" qui realisé par : "+ realisateur + " a été retourné.");
        } else {
            System.out.println("DVD : "+titre +" qui realisé par : "+ realisateur + " est déjà disponible.");
        }
    }
    @Override
    public String toString() {
        return "DVD: " + titre + " - Réalisateur: " + realisateur;
    }
}

