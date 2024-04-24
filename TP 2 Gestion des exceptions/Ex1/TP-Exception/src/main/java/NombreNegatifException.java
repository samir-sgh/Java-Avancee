public class NombreNegatifException extends Exception{
    private int valErronee;
    public NombreNegatifException(String msg, int valErronee){
        super(msg);
        this.valErronee = valErronee;
    }

    public int getValErronee() {
        return valErronee;
    }
}
