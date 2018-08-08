package NewYearChaos;

import java.util.Scanner;

public class Solution {
	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int length = q.length; // ex) 5
		int bribe = 0; // 뇌물 횟수
		int dif = 0;
		boolean checkChaotic = false;

		// q - initList check
		for (int i = 0; i < length; i++) {
			dif = q[i] - (i+1);
			if (dif > 2) {
				checkChaotic = true;

			} else if (dif > 0) {
				bribe += dif;
			}
		}
		
		// print 
		if (checkChaotic == true) {
			System.out.println("Too chaotic");
		} else {
			System.out.println(bribe);
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}
}
