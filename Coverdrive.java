import java.util.ArrayList;
import java.util.List;

public class Coverdrive {
    public static void main(String[] args) {
               List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(35);
        numbers.add(56);
        numbers.add(67);
        numbers.add(78);
        numbers.add(89);
        numbers.add(78);
        numbers.add(12);
        numbers.add(20);
        int key = 67;
        int index = linearSearch(numbers, key);

              if (index != -1) {
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            System.out.println("Key " + key + " not found in the list.");
        }
    }

       public static int linearSearch(List<Integer> list, int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                return i; 
            }
        }
        return -1;     }
}
