import java.util.*;
import java.util.stream.Collectors;

public class TpStreams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sam","sgh","dev","infok","ana","chams");
        //Filtrer les mots qui contiennent la lettre "a".
        List<String> aList= list.stream().filter((s)->s.contains("a")).collect(Collectors.toList());
        System.out.println(aList);
        System.out.println("******************************");
        //Filtrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son inverse.
        List<String>  twoList= list.stream().filter(n->n.length()>3).map(n->new StringBuilder(n).reverse().toString()).collect(Collectors.toList());
        System.out.println(twoList);
        System.out.println("******************************");
        //Filtrer les chaînes qui contiennent la lettre "e" et aplatir chaque chaîne en une liste de ses caractères.
        List<Character> troisList = list.stream().filter(k->k.contains("k")).flatMap(k->k.chars().mapToObj(f->(char)f)).collect(Collectors.toList());
        System.out.println(troisList);
        System.out.println("******************************");
        //Transformer chaque chaîne en sa version en majuscules.
        List<String> majsList = list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
        System.out.println(majsList);
        System.out.println("******************************");
        //Convertir chaque chaîne en sa longueur:
        List<Integer> longList = list.stream().map(a->a.length()).collect(Collectors.toList());
        System.out.println(longList);
        System.out.println("******************************");
        //Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en une seule liste de caractères.
        List<Character> trsList = list.stream().flatMap(d->d.chars().mapToObj(a->(char)a)).collect(Collectors.toList());
        System.out.println(trsList);
        System.out.println("******************************");
        //À partir d'une liste de mots, transformer chaque nom en une chaîne de la forme "Nom - Index" où l'index représente la position du nom dans la liste.
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i) + " - " + i);
        }
        System.out.println(newList);
    }
}
