
package RegExPatternsandIntrotoDatabases;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		ArrayList<String> dataList = new ArrayList<String>();

		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];
			String emailID = firstNameEmailID[1];

			String golbang2 = "@";
			String mail = emailID.split(golbang2)[1];
			if (isValidEmail(emailID) && mail.contains("gmail.com")) {
				dataList.add(firstName);
			}

		}
		Collections.sort(dataList);
		for (String string : dataList) {
			System.out.println(string);
		}
		scanner.close();

	}

	public static boolean isValidEmail(String email) {
		boolean err = false;
		String regex = "^[\\w-\\+]+(\\[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		if (m.matches()) {
			err = true;
		}
		return err;
	}
}
