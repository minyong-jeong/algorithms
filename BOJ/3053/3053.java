import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		double result1 = r * r * Math.PI;
		double result2 = r*r*2;
		
		System.out.printf("%6f\n", result1);
		System.out.printf("%6f\n", result2);
	}
	
}