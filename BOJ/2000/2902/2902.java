import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] str = br.readLine().toCharArray();
        for (int i = 0; i < str.length; i++) {
        	if (str[i] >= 'A' && str[i] <='Z')
        		bw.write(str[i]);
        }
        bw.write('\n');
        bw.flush();
	}
}
