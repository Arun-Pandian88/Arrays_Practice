import java.util.Scanner;

public class Find_TheLargestElement {
    public static void main(String[] args) {
        System.out.println("Enter the Size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int max = 0;
        int secondMax=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {


               // if (arr[j] > max) {
                    //max = arr[j];
               // }
                if(max>arr[j]){
                    secondMax=arr[j];

                }
            }
        }

        //System.out.println(max);
        System.out.println(secondMax);
    }
}
