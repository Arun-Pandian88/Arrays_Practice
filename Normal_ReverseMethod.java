import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        for(int i=numbers.length();i>=1;i--){
            System.out.println(i+" ");
        }
    }
}
