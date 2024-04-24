public class Livre implements Empruntable {

    String titre;
    String auteur;
    boolean emprunte;

    public Livre() {
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.emprunte = false;
    }

    @Override
    public void emprunter() {
        if (!emprunte) {
            emprunte = true;
            System.out.println("Le livre : "+titre +" qui écrit par : "+ auteur+" a été emprunté.");
        } else {
            System.out.println("Le livre : "+titre +" qui écrit par : "+ auteur + " est déjà emprunté.");
        }
    }

    public void retourner() {
        if (emprunte) {
            emprunte = false;
            System.out.println("Le livre : "+titre +" qui écrit par : "+ auteur + " a été retourné.");
        } else {
            System.out.println("Le livre : "+titre +" qui écrit par : "+ auteur + " est déjà disponible.");
        }
    }
    public String toString() {
        return "Livre: " + titre + " - Auteur: " + auteur;
    }
}
