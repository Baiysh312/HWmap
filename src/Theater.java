import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater < A , B extends Person >{

    private Map < A , B [] > array;

    public Map<A, B[]> getArray() {
        return array;
    }

    public void setArray(Map<A, B[]> array) {
        this.array = array;
    }

    public Theater() {
        array= new HashMap<>();
    }

    public void addArr(A type, B[] arr) {
        array.put(type, arr);
    }

    public void checkTickets(){
        for (Map.Entry<A , B[]> entry : array.entrySet()) {
            System.out.println("Key "+entry.getKey());
            for (B pers :entry.getValue()) {
                pers.Info();
            }
        }
    }


}