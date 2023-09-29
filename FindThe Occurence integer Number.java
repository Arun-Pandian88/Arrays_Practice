import java.util.Scanner;

public class FindTheOccurenceTheInteger {
    public static void main(String[] args) {
        System.out.println("Enter the Size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int count = 0;
        System.out.println("Enter the Find of Number");
        int repeatValue=input.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == repeatValue) {
                count++;
            }
        }
        System.out.println("Occurence Integer");
        System.out.println(count);
    }
}
