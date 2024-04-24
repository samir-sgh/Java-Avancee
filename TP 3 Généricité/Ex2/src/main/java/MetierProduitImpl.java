import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>{
    private List<Produit> produits = new ArrayList<Produit>();
    //List<T> elements;
    public void add(Produit o) {
        produits.add(o);
    }

    public List<Produit> getAll() {
        return produits;
    }
    public Produit findById(long id) {
        for (Produit prod: produits) {
            if (prod.getId() == id){
                return prod;
            }
        }
        return null;
    }

    public void delete(long id) {
        Produit produitToRemove = null;
        for (Produit prod: produits) {
            if (prod.getId() == id){
                produitToRemove = prod;
                break;
            }
        }
        if (produitToRemove != null){
            produits.remove(produitToRemove);
        }
    }
}
