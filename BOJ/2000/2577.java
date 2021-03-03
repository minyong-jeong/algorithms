import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 1;
		for (int i = 0; i < 3; i++) {
			num = num * scan.nextInt();
		}
		
		int[] result = new int[10];
		while (num > 0) {
			result[num%10]++;
			num /= 10;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(result[i]);
		}
	}
}
