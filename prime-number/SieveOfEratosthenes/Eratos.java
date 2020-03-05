import java.util.Scanner;
import java.util.Arrays;

public class Eratos {

   public static void main(String[] args) {
     	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      
      	if (n <= 1)
    		return;
      
		boolean[] primeArr = new boolean[n+1];
	  	Arrays.fill(primeArr, true);
	  	primeArr[0] = false;
	  	primeArr[1] = false;
	  	for (int i = 2; i*i <= n; i++) {
		  	if (primeArr[i]) {
			  	for (int j = i*i; j <= n; j += i) {
				  	primeArr[j] = false;
			  	}
		  	}
	  	}
	  
	  	for (int i = 0; i <= n; i++) {
		  	if (primeArr[i])
			  	System.out.println(i);
	  	}
	}

}