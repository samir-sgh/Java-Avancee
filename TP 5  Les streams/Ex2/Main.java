import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Employe em1=new Employe("samir","sghiri",10000.0);
        Employe em2=new Employe("med","sgh",15550.0);
        Employe em3= new Employe("anas","Kada",25000.0);
        Employe em4= new Employe("yassine","haraz",12000.0);
        ArrayList<Employe> employee=new ArrayList<>();
        employee.add(em1);
        employee.add(em2);
        employee.add(em3);
        employee.add(em4);
        //Utiliser mapToDouble et sum pour calculer la somme totale des salaires de tous les employés.
        double newList=employee.stream().mapToDouble(Employe::getSalaire).sum();
        System.out.println("La somme est: " + newList);
        System.out.println("************************");
        //Utiliser sorted pour trier la liste des employés par ordre alphabétique du nom.
        List<Employe> sortList=employee.stream().sorted(Comparator.comparing(Employe::getNom)).collect(Collectors.toList());
        System.out.println(sortList);
        System.out.println("************************");
        //Utiliser min pour trouver l'employé avec le salaire le plus bas.
        Employe minList=employee.stream().min(Comparator.comparing(Employe::getSalaire)).orElse(null);
        System.out.println(minList);
        System.out.println("************************");
        //Utiliser filter pour obtenir la liste des employés ayant un salaire supérieur à une valeur donnée.
        Scanner sc=new Scanner(System.in);
        System.out.println("Saisir la valeur: ");
        int d= sc.nextInt();
        List<Employe> empList = employee.stream().filter(s->s.getSalaire() > d).collect(Collectors.toList());
        System.out.println(empList);
        System.out.println("************************");
        //Utilisez reduce pour trouver l'employé avec le salaire le plus élevé dans l'ensemble de l'entreprise.
        Employe redList= employee.stream().reduce((f,g)->f.getSalaire()>g.getSalaire() ? f :g).orElse(null);
        System.out.println(redList);
        System.out.println("************************");
        //Utilisez reduce pour concaténer les noms de tous les employés
        String concatList=employee.stream().map(Employe::getNom).reduce((s1, s2) -> s1+" "+s2).orElse("");
        System.out.println(concatList);

    }
}
