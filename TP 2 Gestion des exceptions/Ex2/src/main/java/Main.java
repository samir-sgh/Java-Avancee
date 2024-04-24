import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> listeComptes = new ArrayList<>();

        CompteBancaire c1 = new CompteBancaire("321422",20000,"sam1");
        CompteBancaire c2 = new CompteBancaire("542234",50000,"sam2");
        CompteBancaire c3 = new CompteBancaire("123412",10000,"sam3");
        listeComptes.add(c1);
        listeComptes.add(c2);
        listeComptes.add(c3);
        listeComptes.remove(0);
        try{
            c3.transferArgent(c1,1000);
        }catch (FondInsuffisantsException e){
            System.out.println("Erreur : "+ e.getMessage());
        }catch (CompteInexistantException e){
            System.out.println("Erreur : "+ e.getMessage());
        }
        for (CompteBancaire compte: listeComptes) {
            compte.afficherDuSolde();
        }
    }
}
