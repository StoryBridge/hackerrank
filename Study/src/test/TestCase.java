package test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	void test() {		
		fail("Not yet implemented");
		
		 int i =4;
		 double d = 4.0;
		 String s = "HackerRank";
		 int secInt;
       double secDoub;
       String secStr;
       Scanner scan = new Scanner(System.in);

       secInt = scan.nextInt();
       secDoub = scan.nextDouble();
       secStr = scan.nextLine();
       System.out.println(secInt + i);
       System.out.println(secDoub + d);
       //System.out.print(s);
       System.out.println(secStr);
	}

}
