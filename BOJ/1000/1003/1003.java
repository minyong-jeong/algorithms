import java.util.Scanner;

public class Main {
	static int zero;
	static int one;
	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		arr = new int[41][3];
		arr[0][0] = 1;
		arr[0][1] = 0;
		
		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			zero = 0;
			one = 0;
			fibonacci(num);
		
			System.out.println(zero + " " + one);
		}
	}
	
	public static int fibonacci(int n) {
		if (arr[n][0] + arr[n][1] != 0) {
			zero += arr[n][0];
			one += arr[n][1];
			return arr[n][2];
		}
		
		if (n == 0) {
			zero += 1;
			return 0;
		}
		else if (n == 1) {
			one += 1;
			return 1;
		}
		
		arr[n-1][2] = fibonacci(n-1);
		arr[n-1][0] = zero;
		arr[n-1][1] = one;
		zero += arr[n-2][0];
		one += arr[n-2][1];
		
		return arr[n-1][2] + arr[n-2][2];
	}
}
