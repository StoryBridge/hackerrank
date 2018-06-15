import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WinningLotteryTicket2 {
	 static int[] tkts;
	    static long count = 0;
	    static final int[] intToBinary = {512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
	    static final String[] intToChar = {"0","1","2","3","4","5","6","7","8","9"};

	    public static void main(String[] args) {
	        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] tickets = new String[n];
	        for(int tickets_i = 0; tickets_i < n; tickets_i++){
	            tickets[tickets_i] = in.next();
	            int bit = 0; String str =tickets[tickets_i];
	            for(int i=0; i<10; i++){
	                if(str.contains(intToChar[i])){
	                    bit |= intToBinary[i];
	                }
	            }
	            if (map.containsKey(bit)){
	                map.put(bit,map.get(bit)+1); 
	            } else {
	                map.put(bit,1);
	            }
	        }
	        if(map.get(1023) != null){
	            int val = map.get(1023);
	            count += (val*(n-val));
	            for(int a=1; a<val; a++){
	                count+=a;
	            }
	            map.remove(1023);
	        }
	        Iterator i = map.entrySet().iterator();
	        while (i.hasNext()) {
	            Map.Entry<Integer, Integer> pi = (Map.Entry)i.next();
	            int k = pi.getKey();
	            int v = pi.getValue();
	            i.remove();
	            for(int j: map.keySet()){
	                if((k|j) == 1023){ count+= (v*map.get(j));}
	            }
	            
	        }
	        System.out.println(count);
	        in.close();
	    }
}
