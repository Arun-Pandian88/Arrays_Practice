import java.util.Scanner;

public class GetNumber_FromUser_Array {
    public static void main(String[] args) {
        System.out.println("Enthe array size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array Element");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
