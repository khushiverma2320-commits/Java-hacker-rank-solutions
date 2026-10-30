import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return solve(0, leap, game);
    }

    public static boolean solve(int i, int leap, int[] game) {

        // If we reach or cross the end, we win
        if (i >= game.length) {
            return true;
        }

        // If current cell contains 1, we cannot move
        if (i < 0 || game[i] == 1) {
            return false;
        }

        // Mark visited cell
        game[i] = 1;

        // Try all three possible moves
        return solve(i + leap, leap, game)
            || solve(i + 1, leap, game)
            || solve(i - 1, leap, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();

        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];

            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }

        scan.close();
    }
}
