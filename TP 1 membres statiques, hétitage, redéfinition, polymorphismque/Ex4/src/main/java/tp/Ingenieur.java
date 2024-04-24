package tp;

public class Ingenieur extends Employe {
    private String specialiste;

    public Ingenieur() {
    }

    public Ingenieur(String nom, String prenom, String email, long telephone, int salaire, String specialiste) {
        super(nom, prenom, email, telephone, salaire);
        this.specialiste = specialiste;
    }

    @Override
    public double calculeSalaire() {
        double newSal= (salaire+(salaire*15)/100);
        return newSal;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", specialiste='" + specialiste
                ;
    }
}
