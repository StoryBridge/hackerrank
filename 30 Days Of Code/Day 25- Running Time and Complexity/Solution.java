package RunningTimeandComplexity;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int val = sc.nextInt();

			for(int i=2; i<=val/i; i++){
			    if(val%i==0) val=1;
			}

			System.out.println(val==1?"Not prime":"Prime");
		}

	}
}
