package tp;

public class Manager extends Employe{
    private String servise;

    public Manager() {
    }
    public Manager(String nom, String prenom, String email, long telephone, int salaire, String servise) {
        super(nom, prenom, email, telephone, salaire);
        this.servise = servise;
    }

    @Override
    public double calculeSalaire() {
        double newSal = ( salaire + ( salaire * 25 )/ 100 );
        return newSal;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", servise='" + servise;
    }
}
