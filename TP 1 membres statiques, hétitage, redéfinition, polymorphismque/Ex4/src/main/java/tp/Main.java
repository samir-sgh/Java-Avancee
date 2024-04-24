package tp;

public class Main {
    public static void main(String[] args) {
        Ingenieur in=new Ingenieur("sam","sgh","sam@gmail.com",06532542,25000,"info");
        System.out.println(in.toString());
        Manager mn1= new Manager("mm","ss","ss.mm@gmail.com",065231452,100000,"tech");
        System.out.println(mn1.toString());
    }
}