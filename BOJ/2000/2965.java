import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		int k1 = Integer.parseInt(arr[0]);
		int k2 = Integer.parseInt(arr[1]);
		int k3 = Integer.parseInt(arr[2]);
		
		int result = Math.max(k2 - k1, k3 - k2) - 1;
		bw.write(result + "\n");
		bw.flush();
	}
	
}