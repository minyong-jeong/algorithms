import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] medicine = new int[100];
		for (int i = 0; i < n; i++) {
			int type = scan.nextInt() - 1;
			medicine[type] = scan.nextInt();
		}
		
		int r = scan.nextInt();
		for (int i = 0; i < r; i++) {
			int numOfSymptom = scan.nextInt();
			String result = "";
			boolean died = false;
			for (int j = 0; j < numOfSymptom; j++) {
				int symptom = scan.nextInt() - 1;
				if (medicine[symptom] != 0) {
					result += medicine[symptom];
					if (j < numOfSymptom - 1)
						result += " ";
				} else {
					died = true;
				}
			}
			
			if (died) {
				System.out.println("YOU DIED");
			}
			else {
				System.out.println(result);
			}
		}
	}
	
}
