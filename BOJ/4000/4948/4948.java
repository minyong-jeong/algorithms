import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      while(true) {
    	  int num = Integer.parseInt(br.readLine());
    	  if (num == 0)
    		  break;
    	  
    	  int result = 0;
    	  int start = num;
    	  int end = num * 2;
    	  
    	  boolean[] primeArr = new boolean[end + 1];
    	  Arrays.fill(primeArr, true);
    	  primeArr[0] = false;
    	  primeArr[1] = false;
    	  for (int i = 2; i*i <= end; i++) {
    		  if (primeArr[i]) {
    			  for (int j = i*i; j <= end; j += i) {
    				  primeArr[j] = false;
    			  }
    		  }
    	  }
    	  
    	  for (int i = start + 1; i <= end; i++) {
    		  if (primeArr[i])
    			  result++;
    	  }
    	  
    	  bw.write(result + "\n");
      }
      
      bw.flush();
   }
}