import java.util.function.ToDoubleFunction;

public class Employe {
    private String nom;
    private String departement;
     Double salaire;

    public Employe() {
    }

    public Employe(String nom, String departement, Double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }



    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public Double getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", departement='" + departement + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
