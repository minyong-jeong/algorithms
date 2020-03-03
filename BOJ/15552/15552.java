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
        	String[] str = br.readLine().split(" ");
            int num = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
            bw.write(num + "\n");
        }
        
        bw.flush();
	}
	
}
