import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] table = new int[n+1];
		
		table[1] = 0;
		for (int i = 2; i <= n; i++) {
			int d2, d3;
			int min = 10000001;
			
			min = table[i-1] + 1;
			
			if (i % 2 == 0) {
				d2 = table[i/2] + 1;
				if (d2 < min) min = d2;
			}
			
			if (i % 3 == 0) {
				d3 = table[i/3] + 1;
				if (d3 < min) min = d3;
			}
			
			table[i] = min;
		}
		
		System.out.println(table[n]);
	}
}
