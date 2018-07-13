package NestedLogic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Solution {
	public static void main(String[] args) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		// input date
		// 9 6 2015
		// 6 6 2015
		Scanner sc = new Scanner(System.in);
		Integer acDate = sc.nextInt();
		Integer acMon = sc.nextInt();
		Integer acYear = sc.nextInt();

		Integer exDate = sc.nextInt();
		Integer exMon = sc.nextInt();
		Integer exYear = sc.nextInt();

		int difDate = acDate - exDate;
		int difMon = acMon - exMon;
		int difYear = acYear - exYear;
		System.out.println("difdate = " + difDate);
		System.out.println("difMon = " + difMon);
		System.out.println("difYear = " + difYear);
		if(difYear<0) {
			System.out.println(0);
		}else if (difYear > 0 ) {
			System.out.println(10000);
		}else if (difMon > 0 ) {
			System.out.println(difMon* 500);
		}else if(difDate> 0 ) {
			System.out.println(difDate * 15);
		}else {
			System.out.println(0);
		}
		
		 System.out.println( (difYear<0)?0
                 : (difYear>0)?10000
                 : (difMon>0)?difMon*500
                 : (difDate>0)?difDate*15
                 : 0);

	}
}
