package tp;

public class Compte {
    private String numero;
    private static int nbCompte;
    private double solde;

    public Compte() {
        this.numero = "";
        this.solde= 0.0;
        nbCompte++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    void deposer(double montant){
        solde+=montant;
    }

    void retirer(double montant){
        if (montant<=solde){
            solde-=montant;
        }else {
            System.out.println("Votre solde est insuffisant");
        }
    }

    public void afficherCompteInfo() {
            System.out.println("Compte{" +
                    "numero=" + numero +
                    ", nbCompte='" + nbCompte + '\'' +
                    ", solde=" + solde +
                    '}');
    }

    public  void  afficherNbComptes(){

        System.out.println("Nombre de compte est: "+ nbCompte);
    }

    public static void main(String[] args) {
        Compte c1 = new Compte();
        Compte c2 = new Compte();
        Compte c3 = new Compte();
        c1.setNumero("123456");
        c1.setSolde(50000);
        c1.deposer(10000);
        c1.retirer(2500);
        c1.afficherCompteInfo();
        System.out.println("**********************");
        c2.setNumero("6589");
        c2.setSolde(20000);
        c2.deposer(5000);
        c2.retirer(1500);
        c2.afficherCompteInfo();
        System.out.println("**********************");
        c3.setNumero("123456");
        c3.setSolde(50000);
        c3.deposer(10000);
        c3.retirer(2500);
        c3.afficherCompteInfo();
    }

}
