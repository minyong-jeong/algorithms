import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int start = Integer.parseInt(br.readLine());
      int end = Integer.parseInt(br.readLine());
      int result = 0;
      int min = -1;
      for (int i = start; i <= end; i++) {
    	  if (isPrimeNumber(i)) {
    		  if (min == -1)
    			  min = i;
    		  result += i;
    	  }
      }
      
      if (min == -1)
    	  bw.write("-1\n");
      else {
    	  bw.write(result + "\n");
    	  bw.write(min + "\n");
      }
      bw.flush();
   }
   
   public static boolean isPrimeNumber(int num) {
	   int last = num / 2;
	   if (num <= 1) 
		   return false;
	   
	   for(int i = 2; i <= last; i++) {
		   if ((num%i) == 0)
			   return false;
	   }
	   
	   return true;
   }
}