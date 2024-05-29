import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
              LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(30);
        linkedList.add(50);
        linkedList.add(30);

               System.out.println("LinkedList: " + linkedList);

               int elementToFind = 30;
        int firstIndex = linkedList.indexOf(elementToFind);

        if (firstIndex != -1) {
            System.out.println("First occurrence of " + elementToFind + " is at index: " + firstIndex);
        } else {
            System.out.println(elementToFind + " is not found in the LinkedList.");
        }

               int lastIndex = linkedList.lastIndexOf(elementToFind);

        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + elementToFind + " is at index: " + lastIndex);
        } else {
            System.out.println(elementToFind + " is not found in the LinkedList.");
        }
    }
}
