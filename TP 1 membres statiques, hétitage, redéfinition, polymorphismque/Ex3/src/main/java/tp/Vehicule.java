package tp;


public class Vehicule {
    private String nom;
    private double prix;

    public Vehicule() {
    }

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String emettreSon(){
        return "Le vehicule un con inconnu.";
    }

    public String afficherInformations() {
        return  "nom='" + nom + '\'' + ", prix=" + prix;
    }

}
