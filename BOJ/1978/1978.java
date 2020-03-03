import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int n = Integer.parseInt(br.readLine());
      String[] arr = br.readLine().split(" ");
      
      int result = 0;
      for (int i = 0; i < n; i++) {
    	  int num = Integer.parseInt(arr[i]);
    	  if (isPrimeNumber(num))
    		  result++; 
      }
      
      bw.write(result + "\n");
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