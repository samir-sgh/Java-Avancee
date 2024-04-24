package tp;
public class Main {
    public static void main(String[] args) {
        Auteur a1 = new Auteur("samir","sghiri","samir@gmail.com","0629956868",33,01122);
        Adherent ad1= new Adherent("sam","sgh","sam@gmail.com","256325",25,1002);
        Livre l1= new Livre(12325,"povre",a1);
        System.out.println(ad1);
        System.out.println(l1);

    }
}