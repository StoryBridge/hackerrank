package ArrayManipulation;

import java.io.*;
import java.util.Scanner;

public class Solution {

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
		// initialize arr
		long[] arr = new long[n];
		long max = 0;

//		for (int i = 0; i < queries.length; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(queries[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < queries.length; i++) {
			arr[queries[i][0]-1] += queries[i][2];
			arr[queries[i][1]-1] -= queries[i][2];
		}
		long sum = 0;
		
		for(int i=0; i< n; i++) {
			sum += arr[i];
			max = Math.max(max, sum);
					
		}
		
		
//		for (int i = 0; i < queries.length; i++) {
//			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
//				arr[j - 1] += queries[i][2];
//				if (max < arr[j - 1]) {
//					max = arr[j - 1];
//				}
//			}
//		}

		// for(int i= 0; i< arr.length; i++) {
		// System.out.print(arr[i] + " ");
		// }
		System.out.println(max);
		return max;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
			}
		}

		long result = arrayManipulation(n, queries);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
