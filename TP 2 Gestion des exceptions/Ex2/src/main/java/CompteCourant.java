public class CompteCourant extends CompteBancaire{
    private double decouvertAutorise;

    public CompteCourant(String numCompte, double solde, String nomTitulaire, double decouvertAutorise) {
        super(numCompte, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retrait(double montant) throws FondInsuffisantsException {
        if (solde - montant < -decouvertAutorise){
            throw new FondInsuffisantsException("Dépassement du découvert autorisé.");
        }
        super.retrait(montant);
    }
}
