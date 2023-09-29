import java.util.Scanner;

public class nth_LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) { // find the min value
                    min = arr[j];
                    minIndex = j;
                }
            }
            // swaping
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
            System.out.println(arr[i] + " ");
        }
        //user input
        System.out.println("enter the n value");
        int n = input.nextInt();
        System.out.println(arr[n - 1]);
    }
}






