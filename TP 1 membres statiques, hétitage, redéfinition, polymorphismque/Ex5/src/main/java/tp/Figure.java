package tp;

public abstract class Figure {
    protected String nom;

    public Figure() {
    }

    public Figure(String nom) {
        this.nom = nom;
    }

    abstract double calculerAire();
    abstract double calculerPerimetre();
    abstract String afficherDetails();

}
