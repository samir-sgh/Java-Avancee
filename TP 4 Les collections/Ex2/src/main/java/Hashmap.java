
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<String,Double> etudiant = new HashMap<String,Double>();

        //Insérer des notes des étudiants.
        etudiant.put("sam",15.0);
        etudiant.put("sgh",19.0);
        etudiant.put("oo",12.0);
        etudiant.put("etud1",10.0);

        // Afficher la liste des notes
        System.out.println("Liste des notes des étudiants :");
        etudiant.forEach((nom, note) -> System.out.println(nom + " : " + note));
        System.out.println("**********************");

        //Augmenter la note d’un étudiant.
        etudiant.replace("sam",15.0,20.0);
        System.out.println(etudiant);
        System.out.println("**********************");

        // Afficher la liste des notes
        System.out.println("Liste des notes des étudiants :");
        etudiant.forEach((nom, note) -> System.out.println(nom + " : " + note));
        System.out.println("**********************");

        //Supprimer la note d’un étudiant.
        etudiant.remove("oo");
        System.out.println(etudiant);
        System.out.println("**********************");

        // Afficher la liste des notes
        System.out.println("Liste des notes des étudiants :");
        etudiant.forEach((nom, note) -> System.out.println(nom + " : " + note));
        System.out.println("**********************");

        //Afficher la taille du map.
        System.out.println(etudiant.size());
        System.out.println("**********************");

        // Afficher la liste des notes
        System.out.println("Liste des notes des étudiants :");
        etudiant.forEach((nom, note) -> System.out.println(nom + " : " + note));
        System.out.println("**********************");

        //Afficher la note moyenne, max et min.
        double somme = 0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double moyenne = somme/etudiant.size();

        for (double note : etudiant.values()){
            somme+=note;
            max= Math.max(max, note);
            min = Math.min(min,note);
        }
        System.out.println("Note moyenne : "+ moyenne);
        System.out.println("Note maximale : "+ max);
        System.out.println("Note minimale : "+ min);
        System.out.println("**********************");

        // Afficher la liste des notes
        System.out.println("Liste des notes des étudiants :");
        etudiant.forEach((nom, note) -> System.out.println(nom + " : " + note));
        System.out.println("**********************");

        //Vérifier s’il y a une note égale à 20.
        System.out.println(etudiant.containsValue(20.0));
        System.out.println("**********************");

        // Afficher la liste des notes
        System.out.println("Liste des notes des étudiants :");
        etudiant.forEach((nom, note) -> System.out.println(nom + " : " + note));
        System.out.println("**********************");


    }

}
