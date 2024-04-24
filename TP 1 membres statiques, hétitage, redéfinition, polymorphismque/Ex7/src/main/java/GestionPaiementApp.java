public class GestionPaiementApp {
    public static void main(String[] args) {
        Paypal p1=new Paypal(10000,3978,"sam@gmail.com");
        Commande c1=new Commande(1200,new CarteCredit(2500,1234,"2365 6745 4387 1276"));
        Commande c2=new Commande(300,p1);
        c1.processPayment();
        c2.processPayment();

    }
}
