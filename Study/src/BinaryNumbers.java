import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinaryNumbers {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();
	        
	        int count = 1;
	        int rem = 0;
	        int chk = 0;
	        ArrayList<Integer> arr = new ArrayList<>(); 
	        while(n>0) {
	        	rem = n%2;
	        	n = n/2;
	        	if(rem > 0 & chk == 1) {
	        		count++;
	        	}
	        	if(rem == 1) {
	        		chk = 1;
	        	}
	        	else {
	        		chk=0;
	        		arr.add(count);
	        		count = 1;
	        	}
	        	System.out.println("rem: "+ rem+" "+ " chk: "+ chk + " count: "+ count);
	        }
	        arr.add(count);
	        System.out.println(Collections.max(arr));
	        //System.out.println(count);
	        
	        
	    }
}
