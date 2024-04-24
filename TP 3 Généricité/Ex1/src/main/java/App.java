public class App {
    public static void main(String[] args) {
        StorageGenerique<Integer> stockageIntegers = new StorageGenerique<Integer>();
        stockageIntegers.addElement(10);
        stockageIntegers.addElement(20);
        stockageIntegers.addElement(11);
        System.out.println("Taille du Stockage : "+ stockageIntegers.getSize());
        System.out.println("Element a l'index 1 : "+ stockageIntegers.getElement(1));
        stockageIntegers.removeElement(0);
        System.out.println("Taille du Stockage : "+ stockageIntegers.getSize());
        System.out.println("**************************************");
        StorageGenerique<String> stockageString = new StorageGenerique<String>();
        stockageString.addElement("sam");
        stockageString.addElement("sgh");
        stockageString.addElement("enset");
        System.out.println("Taille du Stockage : "+ stockageString.getSize());
        System.out.println("Element a l'index 2 : "+ stockageString.getElement(2));
        stockageString.removeElement(0);
        System.out.println("Taille du Stockage : "+ stockageString.getSize());
    }
}
