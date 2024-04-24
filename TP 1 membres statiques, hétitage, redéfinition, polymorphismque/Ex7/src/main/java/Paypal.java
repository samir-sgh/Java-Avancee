public class Paypal extends Paiement{
    private String email;

    public Paypal(double montant, int numeroTransaction, String email) {
        super(montant, numeroTransaction);
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant){
        System.out.println("Paiement effectué par paypal pour un montant de " + montant + " EUR.");
    };
}
