public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val<0) throw new NombreNegatifException("La Valeur est negative", val);
        this.val = val;
    }
    public void decremnter() throws NombreNegatifException{
        if (val == 0) throw new NombreNegatifException("la valeur est null", val);
        val--;
    }

}
