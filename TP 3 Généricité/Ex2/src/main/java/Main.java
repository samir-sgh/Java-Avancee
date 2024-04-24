import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetierProduitImpl metierProduit = new MetierProduitImpl();
        while (true){
            System.out.println("Menu :");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter le programme.");
            System.out.print("Choix : ");
            int choix = sc.nextInt();

            switch (choix){
                case 1:
                    afficherListeProduits(metierProduit);
                    break;
                case 2:
                    rechercherProduitParId(sc, metierProduit);
                    break;
                case 3:
                    ajouterProduit(sc, metierProduit);
                    break;
                case 4:
                    supprimerProduit(sc, metierProduit);
                    break;
                case 5:
                    System.out.println("Merci d'avoir utilisé l'application.");
                    return;
                default:
                    System.out.println("Choix invalide.");

            }
        }
    }
    private static void afficherListeProduits(MetierProduitImpl metierProduit) {
        System.out.println("Liste des produits :");
        List<Produit> produits = metierProduit.getAll();
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }
    private static void rechercherProduitParId(Scanner sc, MetierProduitImpl metierProduit) {
        System.out.print("Entrez l'id du produit à rechercher : ");
        long id = sc.nextLong();
        Produit produit = metierProduit.findById(id);
        if (produit != null) {
            System.out.println("Produit trouvé : " + produit);
        } else {
            System.out.println("Produit non trouvé.");
        }
    }
    private static void ajouterProduit(Scanner sc, MetierProduitImpl metierProduit) {
        System.out.print("Entrez l'id du produit : ");
        long id = sc.nextLong();
        sc.nextLine(); // pour consommer la ligne vide restante après le nextLong()
        System.out.print("Entrez le nom du produit : ");
        String nom = sc.nextLine();
        System.out.print("Entrez la marque du produit : ");
        String marque = sc.nextLine();
        System.out.print("Entrez le prix du produit : ");
        double prix = sc.nextDouble();
        sc.nextLine(); // pour consommer la ligne vide restante après le nextDouble()
        System.out.print("Entrez la description du produit : ");
        String description = sc.nextLine();
        System.out.print("Entrez le nombre en stock du produit : ");
        int nombreEnStock = sc.nextInt();

        Produit produit = new Produit(id, nom, marque, prix, description, nombreEnStock);
        metierProduit.add(produit);
        System.out.println("Produit ajouté avec succès.");
    }
    private static void supprimerProduit(Scanner sc, MetierProduitImpl metierProduit) {
        System.out.print("Entrez l'id du produit à supprimer : ");
        long id = sc.nextLong();
        metierProduit.delete(id);
        System.out.println("Produit supprimé avec succès.");
    }
}
