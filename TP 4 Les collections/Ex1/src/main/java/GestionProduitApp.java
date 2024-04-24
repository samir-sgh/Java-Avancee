import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProduitApp {

    private static void afficherProduits(List<Produit> produits) {
        for (int i=0; i<produits.size();i++){
            System.out.println(produits.get(i));
        }
//        for (Produit produit : produits) {
//            System.out.println(produits.get(produit));
//        }
    }

    public static void main(String[] args) {
        List<Produit> produits=new ArrayList<Produit>();
        Scanner sc = new Scanner(System.in);

        // Ajouter des produits
        produits.add(new Produit(1,"p1",10.0));
        produits.add(new Produit(2,"p2",20.0));
        produits.add(new Produit(3,"p3",30.0));


//        System.out.println("Liste des produits avant suppression :");
//        System.out.println(produits);

        // Supprimer un produit par indice
        System.out.print("Indice du produit pour supprimer : ");
        int indSup = sc.nextInt();
        if (indSup >= 0 && indSup < produits.size()) {
            produits.remove(indSup);
        } else {
            System.out.println("Indice invalide.");
        }

        // Afficher la liste des produits
        System.out.println("Liste des produits après suppression :");
        afficherProduits(produits);

        // Modifier un produit par indice
        System.out.print("Indice du produit à modifier : ");
        int indMod = sc.nextInt();
        if (indMod>=0 && indMod<produits.size()) {
            Produit proMod = produits.get(indMod);
            System.out.println("Saiasir votre nouvelle nom: ");
            String nvNom = sc.next();
            proMod.setNom(nvNom);
            System.out.println("Saiasir votre nouvelle prix: ");
            double nvPrix = sc.nextDouble();
            proMod.setPrix(nvPrix);
        }else {
            System.out.println("Indice non trouver.");
        }
        // Afficher la liste des produits
        System.out.println("Liste des produits après suppression :");
        afficherProduits(produits);

        // Rechercher un produit par nom
        System.out.println("Nom de produit a rechrcher: ");
        String prdRechercher = sc.next();
        for (Produit prodt: produits) {
            if (prodt.getNom().equalsIgnoreCase(prdRechercher)){
                System.out.println("Produit Trouve : " + prodt);
                break;
            }else {
                System.out.println("Produit non trouve");
                break;
            }
        }

    }

}
