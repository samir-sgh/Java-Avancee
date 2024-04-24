package tp;

public class Cercle extends Figure{
    double rayon;

    public Cercle() {
    }

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    @Override
    double calculerAire() {
        double a = Math.pow(rayon, 2) * Math.PI;
        return a ;
    }

    @Override
    double calculerPerimetre() {
        double p = 2 * rayon * Math.PI;
        return p;
    }

    @Override
    public String afficherDetails() {
        return "Le nom est : " + nom + ", Le rayon est : " + rayon
                + ", l'aire est : " + calculerAire()
                + ", Le perimetre est : " + calculerPerimetre();
    }
}
