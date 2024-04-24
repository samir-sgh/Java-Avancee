package tp;

public class Livre extends Auteur {
    private int ISBN;
    private String unTitre;
    private Auteur unAuteur;

    public Livre(int ISBN, String unTitre, Auteur unAuteur) {
        this.ISBN = ISBN;
        this.unTitre = unTitre;
        this.unAuteur = unAuteur;
    }
//    public Livre(String nom, String prenom, String email, String tel, int age, int numAuteur, int ISBN, String unTitre, String unAuteur) {
//        super(nom, prenom, email, tel, age, numAuteur);
//        this.ISBN=ISBN;
//        this.unTitre=unTitre;
//        this.unAuteur=unAuteur;
//    }

    @Override
    public String toString() {
        return "Livre{" +
                "ISBN=" + ISBN +
                ", unTitre='" + unTitre + '\'' +
                ", unAuteur='" + unAuteur.toString()+
                '}';
    }
}
