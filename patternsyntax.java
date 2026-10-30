
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String regex = sc.nextLine();

            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            } 
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}
