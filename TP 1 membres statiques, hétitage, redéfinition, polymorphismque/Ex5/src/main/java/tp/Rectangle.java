package tp;

public class Rectangle extends Figure {

    double longeur;
    double largeur;

    public Rectangle() {
    }

    public Rectangle(String nom, double longeur, double largeur) {
        super(nom);
        this.longeur = longeur;
        this.largeur = largeur;
    }

    @Override
    double calculerAire() {
        return longeur * largeur;
    }

    @Override
    double calculerPerimetre() {
        return (2 *(longeur + largeur));
    }

    @Override
    public String afficherDetails() {
        return "Le nom est : " + nom +'\''+ ", Le longeur est : " + longeur
                +", Le largeur est : " + largeur
                + ", l'aire est : " + calculerAire()
                + ", Le perimetre est : " + calculerPerimetre();
    }
}
