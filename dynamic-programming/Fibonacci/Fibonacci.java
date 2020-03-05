import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] fibonacci = new int[n + 1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= n; i++) {
        	fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        
        System.out.println(fibonacci[n]);
	}
	
}