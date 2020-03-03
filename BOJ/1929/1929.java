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
      
      String[] arr = br.readLine().split(" ");
      int num1 = Integer.parseInt(arr[0]);
      int num2 = Integer.parseInt(arr[1]);
      
      boolean[] primeArr = new boolean[num2 + 1];
      Arrays.fill(primeArr, true);
      primeArr[0] = false;
      primeArr[1] = false;
      for (int i = 2; (i*i) <= num2; i++) {
    	  if (primeArr[i]) {
    		  for (int j = i*i; j <=num2; j += i) {
    			  primeArr[j] = false;
    		  }
    	  }
      }
      
      for (int i = num1; i <= num2; i++) {
    	  if (primeArr[i])
    		  bw.write(i + "\n");
      }
      
      bw.flush();
   }
}