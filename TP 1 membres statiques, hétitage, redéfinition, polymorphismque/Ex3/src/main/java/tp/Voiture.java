package tp;

public class Voiture extends Vehicule {
    private int modele;
    private int annee;

    public Voiture() {
    }

    public Voiture(String nom, double prix, int modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    public int getModele() {
        return modele;
    }

    public void setModele(int modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String emettreSon(){
        return "La voiture vrombit";
    }
    public String afficherInformations() {
        return super.afficherInformations() + '\'' +", modele='" + modele + '\'' + ", annee=" + annee;
    }
}
