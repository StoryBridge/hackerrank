package Exception;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
			System.out.println(Integer.parseInt(S));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bad String");
		}
    }
}
