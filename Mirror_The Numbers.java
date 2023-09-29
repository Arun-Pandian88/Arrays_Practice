import java.util.Arrays;
import java.util.Scanner;

public class Mirror_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            array[size - 1] = array.length;
            array[size - 1] = array[0];
            array[size - 2] = array.length;
            array[size - 2] = array[1];

            System.out.print(array[i]);
        }
    }
}

















