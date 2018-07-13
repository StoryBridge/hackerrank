package RunningTimeandComplexity;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
	  while (times-- > 0) {
		int num = sc.nextInt();
		System.out.println(primeChecker(num) == true ? "Not prime" : "Prime");
		}
	}

	public static boolean primeChecker(Integer num) {
		boolean primeChecker = false;
		for (int i = 2; i <= num / i; i++) {
			if (num % i == 0) {
				primeChecker = true;
			}
		}
		return primeChecker;
	}
}
