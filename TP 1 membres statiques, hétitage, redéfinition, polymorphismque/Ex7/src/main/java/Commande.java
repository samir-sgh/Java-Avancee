public class Commande {
    private double montant;
    private Paiement paiementMethode;

    public Commande(double montant, Paiement paiementMethode) {
        this.montant = montant;
        this.paiementMethode = paiementMethode;
    }

    public void processPayment(){
        paiementMethode.effectuerPaiement(montant);
    };

}
