import java.util.ArrayList;
import java.util.List;

public class StorageGenerique<T>{
    private List<T> elements;

    public StorageGenerique() {
        this.elements = new ArrayList<T>();
    }

    public void addElement(T o){
        elements.add(o);
    }
    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }

    public void removeElement(int index){
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        }
    }
    public int getSize(){
        return elements.size();
    }
}
