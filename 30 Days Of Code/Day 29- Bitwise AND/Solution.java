package BitwiseAND;

import java.util.Scanner;

public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]);

			int k = Integer.parseInt(nk[1]);
			Find find = new Find(n, k);
			find.possibleValue();
			System.out.println(find.max());
		}

		scanner.close();
	}
}

class Find {
	private int n;
	private int k;
	private int temp;
	private int max = 0;

	Find(int n, int k) {
		this.n = n;
		this.k = k;
	}

	public void possibleValue() {
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				temp = i & j;
				if (temp < k & temp > max) {
					max = temp;
				}
			}

		}
	}

	public int max() {
		return max;
	}

}
