public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel ent = new EntierNaturel(10);
            //System.out.println(ent.getVal());
            ent.setVal(-5);
        } catch (NombreNegatifException e){
            System.out.println("Erreur : " + e.getMessage());
            System.out.println("La valeur Erronee : "+ e.getValErronee() );
        }
    }
}
