public class CompteEpargne extends CompteBancaire{
    private double tauxInteret;

    public CompteEpargne(String numCompte, double solde, String nomTitulaire, double tauxInteret) {
        super(numCompte, solde, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }
    public void calculerInterets(){
        double inter = solde * tauxInteret/ 100;
        solde+=inter;
        System.out.println("Intérêts calculés : " + inter + " euros");
    }
}
