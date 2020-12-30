import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = scan.readLine().split(" ");
		
		int result = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].isEmpty())
				result--;
		}
		
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}