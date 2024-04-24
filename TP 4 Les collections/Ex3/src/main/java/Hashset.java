import java.util.HashSet;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        Set groupeA=new HashSet();
        Set groupeB=new HashSet();

        String A[]= {"sam","sgh","mm","SS"};
        String B[]={"BB","WW","JJ","SS","mm"};

        //Ajouter des noms des étudiants à chaque HashSet.
        groupeA.addAll(Arrays.asList(A));
        groupeB.addAll(Arrays.asList(B));


        //Afficher l’intersection des deux HashSets.
        groupeA.retainAll(groupeB);
        System.out.println("l’intersection entre groupeA et groupeB est : ");
        System.out.println(groupeA);

        //Afficher l’union des deux HashSets.
        groupeA.addAll(groupeB);
        System.out.println("L'union entre groupeA et groupeB est: ");
        System.out.println(groupeA);
    }
}
