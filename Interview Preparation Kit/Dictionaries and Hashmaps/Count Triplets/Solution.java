package CountTriplets;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

		// Hashmap sort by key
		List<Long> hmList = new ArrayList<Long>(hm.keySet());
		Collections.sort(hmList);

		for (int i = 0; i < hmList.size() - 2; i++) {
			// check to constrains key
			// System.out.println(hmList.get(i));
			if (hmList.get(i) * r == hmList.get(i + 1) && hmList.get(i + 1) * r == hmList.get(i + 2)) {
				count = count + hm.get(hmList.get(i)) * hm.get(hmList.get(i + 1)) * hm.get(hmList.get(i + 2));
			}
		}
		System.out.println(hmList);
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
