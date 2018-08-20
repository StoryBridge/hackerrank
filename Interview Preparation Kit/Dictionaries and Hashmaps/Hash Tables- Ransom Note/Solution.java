import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length; i++) {
            if (map.get(magazine[i]) != null) {
                map.put(magazine[i], map.get(magazine[i]) + 1);
            } else {
                map.put(magazine[i], 1);
            }
        }
        int checker = 1;
        for (int i = 0; i < note.length; i++) {
            if (map.get(note[i]) == null) {
                checker = checker * 0;
                break;
            } else if (map.get(note[i]) >= 1) {
                map.put(note[i], map.get(note[i]) - 1);
                checker = checker * 1;
            } else {
                checker = checker * 0;
            }
        }
        System.out.println(checker == 1 ? "Yes" : "No");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
