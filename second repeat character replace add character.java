import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        StringBuilder builder = new StringBuilder();
        char[] ch = name.toCharArray();
        char search = 'a';
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (search == name.charAt(i)) {
                count++;
            }
        }
        if (count == 2) {

        }
        System.out.println("a :" + " " + count);


    }

}



