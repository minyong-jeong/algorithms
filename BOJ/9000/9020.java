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
      
      boolean[] primeArr = new boolean[10001];
	  Arrays.fill(primeArr, true);
	  primeArr[0] = false;
	  primeArr[1] = false;
	  for (int i = 2; i*i <= 10000; i++) {
		  if (primeArr[i]) {
			  for (int j = i*i; j <= 10000; j += i) {
				  primeArr[j] = false;
			  }
		  }
	  }
	  
	  int n = Integer.parseInt(br.readLine());
	  int num1 = 0;
	  int num2 = 0;
	  for (int i = 0; i < n; i++) {
		  int num = Integer.parseInt(br.readLine());
		  for (int j = 2; j <= num/2; j++) {
			  if (primeArr[j] && primeArr[num-j]) {
				  num1 = j;
				  num2 = num-j;
			  }
		  }
		  bw.write(num1 + " " + num2 + "\n");
	  }
      bw.flush();
   }
}