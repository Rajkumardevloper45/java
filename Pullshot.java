import java.util.LinkedList;

public class Pullshot {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

     
        if (!linkedList.isEmpty()) {
            String lastElement = linkedList.getLast();
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}
