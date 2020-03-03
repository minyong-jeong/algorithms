import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	String[] arr = br.readLine().split(" ");
        	int result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        	if (result == 0)
        		break;
        	bw.write(result + "\n");
        }
        
        bw.flush();
	}
}
