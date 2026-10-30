
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] tokens = s.split("[^a-zA-Z]+");

            System.out.println(tokens.length);

            for (String token : tokens) {
                System.out.println(token);
            }
        }

        sc.close();
    }
}
