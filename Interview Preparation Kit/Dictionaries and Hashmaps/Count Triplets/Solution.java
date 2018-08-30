package CountTriplets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {
	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
		// Key is value, value is counter
		HashMap<Long, Integer> hm = new HashMap<>();
		int count = 0;

		for (Long long1 : arr) {
			// If there isn't key, make hashmap
			if (!hm.containsKey(long1)) {
				hm.put(long1, 1);
			} else {
				int value = hm.get(long1);
				hm.put(long1, value + 1);
			}
		}

		if (r == 1) {
			// 1 1 1 1 1 1
			//
			// 3 -> 1
			// 4 -> 3
			// 5 -> 6
			// 6 -> 10
			//

			return 0;
		}

		// System.out.println(hm.keySet());
		// System.out.println(hm.values());
		for (Long long1 : hm.keySet()) {
			if (hm.containsKey(long1 * r) && hm.containsKey(long1 * r * r)) {
				long plus = hm.get(long1) * hm.get(long1 * r) * hm.get(long1 * r * r);
				count += plus;
			}
		}

		System.out.println(count);
		return count;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		List<Long> arr = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextLong());
		}
		long ans = countTriplets(arr, r);
	}
}
