import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		String str = scan.nextLine();
		long sum = 0;
		int num = 0;
		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <='9') {
				num = (num * 10) + (c -'0');
				if (i == n-1)
					sum += num;
			} else {
				if (num != 0) {
					sum += num;
					num = 0;
				}
			}
		}
		
		System.out.println(sum);
	}
	
}
