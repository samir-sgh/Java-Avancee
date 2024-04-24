package tp;

public class Main {
    public static void main(String[] args) {
        Voiture v1= new Voiture("Mercedes",200000,2018,2024);
        Moto m1= new Moto("z1000",30000,"BMW",120);
        Avion a1=new Avion("flyEmirate",3200215,"Airbus",250);
        v1.emettreSon();
        System.out.println(v1.afficherInformations());
        System.out.println("*******************");
        m1.emettreSon();
        System.out.println(m1.afficherInformations());
        System.out.println("*******************");
        a1.emettreSon();
        System.out.println(a1.afficherInformations());
    }
}
