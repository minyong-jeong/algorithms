import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
        	String[] arr = br.readLine().split(" ");
        	int n = Integer.parseInt(arr[0]);
        	String result = "";
        	for (int j = 0; j < arr[1].length(); j++) {
        		for (int k = 0; k < n; k++)
        			result += arr[1].charAt(j);
        	}
        	
        	bw.write(result + "\n");
        }
		bw.flush();
		bw.close();
	}
}