public class CompteBancaire {
    private String numCompte;
    protected double solde;
    private String nomTitulaire;

    public CompteBancaire(String numCompte, double solde, String nomTitulaire) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }
    public void depot(double montant){
        solde+=montant;
    }
    public void retrait(double montant) throws FondInsuffisantsException{
        if (montant >solde) throw new FondInsuffisantsException("Solde insuffisant pour effectuer le retrait.");
        solde-=montant;
    }
    public void afficherDuSolde(){
        System.out.println("Votre Solde est : " + solde);
    }
    public void transferArgent(CompteBancaire dest,double montant) throws FondInsuffisantsException, CompteInexistantException {

            if (montant >solde){
                throw new FondInsuffisantsException("Solde insuffisant pour effectuer le retrait.");
            }
            if (dest == null) {
                throw new CompteInexistantException("Compte destinataire inexistent");
            }
            solde-=montant;
            dest.solde+=montant;
    }



}
