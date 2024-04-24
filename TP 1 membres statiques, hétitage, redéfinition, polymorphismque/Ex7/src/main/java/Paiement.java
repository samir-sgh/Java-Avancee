public class Paiement {
    private double montant;
    private int numeroTransaction;

    public Paiement(double montant, int numeroTransaction) {
        this.montant = montant;
        this.numeroTransaction = numeroTransaction;
    }

    public void effectuerPaiement(double montant){};

}
