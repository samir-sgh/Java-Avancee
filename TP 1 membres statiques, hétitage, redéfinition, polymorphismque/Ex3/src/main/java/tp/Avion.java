package tp;

public class Avion extends Vehicule{
    private String compagnie;
    private int vitesseMax;

    public Avion() {
    }

    public Avion(String nom, double prix, String compagnie, int vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public String emettreSon() {
        return "L'avion fait un bruit de moteur puissant";
    }
    public String afficherInformations() {
        return super.afficherInformations() + '\'' +"compagnie='" + compagnie + '\'' + ", vitesseMax=" + vitesseMax;
    }
}
