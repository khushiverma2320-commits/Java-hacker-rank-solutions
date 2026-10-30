
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);

        for (int i = 0; i < m; i++) {

            String operation = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            BitSet first = (a == 1) ? B1 : B2;
            BitSet second = (b == 1) ? B1 : B2;

            switch (operation) {

                case "AND":
                    first.and(second);
                    break;

                case "OR":
                    first.or(second);
                    break;

                case "XOR":
                    first.xor(second);
                    break;

                case "FLIP":
                    first.flip(b);
                    break;

                case "SET":
                    first.set(b);
                    break;
            }

            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }

        sc.close();
    }
}
