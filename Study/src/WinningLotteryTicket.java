import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WinningLotteryTicket {
	// Complete the winningLotteryTicket function below.
	static long winningLotteryTicket(String[] tickets) {	
		long startTime = System.nanoTime();
		long result = 0;
//		String check;
		int check;
		boolean sum;
		int tLength = tickets.length;
		int checkLen;
		for (int i = 0; i < tLength; i++) {			
			for (int j = i+1; j < tLength; j++) {
				//String check = tickets[i] +", "+ tickets[j];
//				check = tickets[i] + tickets[j];
				check = Integer.parseInt(tickets[i] + tickets[j]);
				sum = true;
				//System.out.println(check);				

//				if (check.indexOf(String.valueOf(0)) < 0
//						| check.indexOf(String.valueOf(1)) < 0
//						| check.indexOf(String.valueOf(2)) < 0
//						| check.indexOf(String.valueOf(3)) < 0
//						| check.indexOf(String.valueOf(4)) < 0
//						| check.indexOf(String.valueOf(5)) < 0
//						| check.indexOf(String.valueOf(6)) < 0
//						| check.indexOf(String.valueOf(7)) < 0
//						| check.indexOf(String.valueOf(8)) < 0
//						| check.indexOf(String.valueOf(9)) < 0
//						
//						) {
//				sum = false;						
//			}
//				for (int j2 = 0; j2 < 10; j2++) {
//					if (check.indexOf(String.valueOf(j2)) < 0) {
//						sum = false;						
//					}
//				}
				if (sum) {
					result++;
					sum = true;
				}					
			}
		}
		System.out.println(result);
		long endTime = System.nanoTime();
		System.out.println((endTime-startTime)/10000);
		return result;	
		
		
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] tickets = new String[n];

		for (int i = 0; i < n; i++) {
			String ticketsItem = scanner.nextLine();
			tickets[i] = ticketsItem;
		}

		long result = winningLotteryTicket(tickets);

		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}
}
