public class GestionBibliotheque {
    public static void main(String[] args) {
        Livre l1 = new Livre("Harry Potter", "Rowling");
        DVD d1 = new DVD("Inception", "Christopher Nolan");
        Utilisateur util1 = new Utilisateur("samir");

        util1.emprunterObjet(l1);
        util1.emprunterObjet(d1);
        System.out.println("************************");
        l1.retourner();
        d1.retourner();
    }
}
