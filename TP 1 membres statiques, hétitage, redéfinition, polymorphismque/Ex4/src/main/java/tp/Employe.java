package tp;

public abstract class Employe {
     private String nom;
    private String prenom;
    private String email;
    private long telephone;
    protected int salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, String email, long telephone, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public abstract double calculeSalaire();

    @Override
    public String toString() {
         return "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", salaire=" + calculeSalaire();

    }
}
