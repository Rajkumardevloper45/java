import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();

        
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(9);

       
        System.out.println("ArrayList before sorting: " + arrayList);

      
        Collections.sort(arrayList);

       
        System.out.println("ArrayList after sorting: " + arrayList);
    }
}
