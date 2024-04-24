package tp;

public class main {
    public static void main(String[] args) {
        Figure c1= new Cercle("Cercle1",15);
        System.out.println(c1.afficherDetails());
        Rectangle r1= new Rectangle("Rec1",100,200);
        System.out.println(r1.afficherDetails());
    }
}
