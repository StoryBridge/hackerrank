package scope;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		// TODO Auto-generated constructor stub
		this.elements = a;
	}

	public void computeDifference() {
		// TODO Auto-generated method stub
		int temp = 0;
		maximumDifference = temp;
		for (int i = 0; i < elements.length - 1; i++) {
			for (int j = 1; j < elements.length; j++) {
				temp = Math.abs(elements[i] - elements[j]);
				if (temp > maximumDifference) {
					maximumDifference = temp;
				}
			}

		}
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
