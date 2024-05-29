import java.util.Arrays;

public class Strightdrive {
    public static void main(String[] args) {
                int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};

                System.out.println("Original Array: " + Arrays.toString(numbers));

       
        Arrays.sort(numbers);

                System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
